// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.implementation.aad.security.jwt;

import com.azure.spring.cloud.autoconfigure.implementation.aad.jwk.TestJwks;
import com.azure.spring.cloud.autoconfigure.implementation.aad.security.AadJwtClientAuthenticationParametersConverter;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.oauth2.client.endpoint.OAuth2ClientCredentialsGrantRequest;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.OAuth2AuthorizationException;
import org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames;
import org.springframework.security.oauth2.jose.jws.SignatureAlgorithm;
import org.springframework.util.MultiValueMap;

import java.text.ParseException;
import java.util.Collections;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.springframework.security.oauth2.core.AuthorizationGrantType.CLIENT_CREDENTIALS;
import static org.springframework.security.oauth2.core.ClientAuthenticationMethod.CLIENT_SECRET_JWT;
import static org.springframework.security.oauth2.core.ClientAuthenticationMethod.PRIVATE_KEY_JWT;

class AadJwtClientAuthenticationParametersConverterTests {

    private Function<ClientRegistration, JWK> jwkResolver;

    private AadJwtClientAuthenticationParametersConverter<OAuth2ClientCredentialsGrantRequest> converter;

    @BeforeEach
    @SuppressWarnings("unchecked")
    public void setup() {
        this.jwkResolver = mock(Function.class);
        this.converter = new AadJwtClientAuthenticationParametersConverter<>(this.jwkResolver);
    }

    @Test
    void convertNull() {
        ClientRegistration clientRegistration = ClientRegistration
            .withRegistrationId("test")
            .clientId("test")
            .clientSecret("test-secret")
            .clientAuthenticationMethod(CLIENT_SECRET_JWT)
            .authorizationGrantType(CLIENT_CREDENTIALS)
            .tokenUri("http://localhost/token")
            .build();

        OAuth2ClientCredentialsGrantRequest clientCredentialsGrantRequest =
            new OAuth2ClientCredentialsGrantRequest(clientRegistration);
        assertNull(this.converter.convert(clientCredentialsGrantRequest));
    }

    @Test
    void resolveNullJwkThenThrowOAuth2AuthorizationException() {
        ClientRegistration clientRegistration = ClientRegistration
            .withRegistrationId("test")
            .clientId("test")
            .clientSecret("test-secret")
            .clientAuthenticationMethod(PRIVATE_KEY_JWT)
            .authorizationGrantType(CLIENT_CREDENTIALS)
            .tokenUri("http://localhost/token")
            .build();

        OAuth2ClientCredentialsGrantRequest clientCredentialsGrantRequest =
            new OAuth2ClientCredentialsGrantRequest(clientRegistration);
        assertThatExceptionOfType(OAuth2AuthorizationException.class)
            .isThrownBy(() -> this.converter.convert(clientCredentialsGrantRequest))
            .withMessage("[invalid_key] Failed to resolve JWK signing key for client registration 'test'.");
    }

    @Test
    @SuppressWarnings("deprecation")
    void testAssertion() throws ParseException {
        RSAKey rsaJwk = spy(TestJwks.DEFAULT_RSA_JWK);
        given(this.jwkResolver.apply(any())).willReturn(rsaJwk);
        given(rsaJwk.getX509CertThumbprint()).willReturn(new Base64URL("dGVzdA"));

        ClientRegistration clientRegistration = ClientRegistration
            .withRegistrationId("test")
            .clientId("test")
            .clientSecret("test-secret")
            .clientAuthenticationMethod(PRIVATE_KEY_JWT)
            .authorizationGrantType(CLIENT_CREDENTIALS)
            .tokenUri("http://localhost/token")
            .build();

        OAuth2ClientCredentialsGrantRequest clientCredentialsGrantRequest =
            new OAuth2ClientCredentialsGrantRequest(clientRegistration);
        MultiValueMap<String, String> parameters = this.converter.convert(clientCredentialsGrantRequest);

        assertThat(parameters.getFirst(OAuth2ParameterNames.CLIENT_ASSERTION_TYPE))
            .isEqualTo("urn:ietf:params:oauth:client-assertion-type:jwt-bearer");
        String encodedJws = parameters.getFirst(OAuth2ParameterNames.CLIENT_ASSERTION);
        assertThat(encodedJws).isNotNull();

        JWT jwt = JWTParser.parse(encodedJws);

        JWSHeader header = (JWSHeader) jwt.getHeader();
        assertThat(header.getAlgorithm().getName()).isEqualTo(SignatureAlgorithm.RS256.getName());
        assertThat(jwt.getJWTClaimsSet().getIssuer().equals(clientRegistration.getClientId()));
        assertThat(jwt.getJWTClaimsSet().getSubject()).isEqualTo(clientRegistration.getClientId());
        assertThat(jwt.getJWTClaimsSet().getAudience())
            .isEqualTo(Collections.singletonList(clientRegistration.getProviderDetails().getTokenUri()));
        assertThat(jwt.getJWTClaimsSet().getJWTID()).isNotNull();
        assertThat(jwt.getJWTClaimsSet().getIssueTime()).isNotNull();
        assertThat(jwt.getJWTClaimsSet().getExpirationTime()).isNotNull();
    }
}

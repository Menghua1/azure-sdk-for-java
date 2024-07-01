// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document;

import com.azure.ai.translation.document.implementation.MultipartFormDataHelper;
import com.azure.ai.translation.document.implementation.SingleDocumentTranslationClientImpl;
import com.azure.ai.translation.document.models.DocumentTranslateContent;
import com.azure.ai.translation.document.models.GlossaryFileDetails;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import java.util.stream.Collectors;

/**
 * Initializes a new instance of the synchronous SingleDocumentTranslationClient type.
 */
@ServiceClient(builder = SingleDocumentTranslationClientBuilder.class)
public final class SingleDocumentTranslationClient {

    @Generated
    private final SingleDocumentTranslationClientImpl serviceClient;

    /**
     * Initializes an instance of SingleDocumentTranslationClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    SingleDocumentTranslationClient(SingleDocumentTranslationClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Submit a single document translation request to the Document Translation service
     *
     * Use this API to submit a single translation request to the Document Translation Service.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>sourceLanguage</td><td>String</td><td>No</td><td>Specifies source language of the input document.
     * If this parameter isn't specified, automatic language detection is applied to determine the source language.
     * For example if the source document is written in English, then use sourceLanguage=en</td></tr>
     * <tr><td>category</td><td>String</td><td>No</td><td>A string specifying the category (domain) of the translation.
     * This parameter is used to get translations
     * from a customized system built with Custom Translator. Add the Category ID from your Custom Translator
     * project details to this parameter to use your deployed customized system. Default value is: general.</td></tr>
     * <tr><td>allowFallback</td><td>Boolean</td><td>No</td><td>Specifies that the service is allowed to fall back to a
     * general system when a custom system doesn't exist.
     * Possible values are: true (default) or false.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     *
     * @param targetLanguage Specifies the language of the output document.
     * The target language must be one of the supported languages included in the translation scope.
     * For example if you want to translate the document in German language, then use targetLanguage=de.
     * @param documentTranslateContent Document Translate Request Content.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BinaryData> documentTranslateWithResponse(String targetLanguage, BinaryData documentTranslateContent,
        RequestOptions requestOptions) {
        // Protocol API requires serialization of parts with content-disposition and data, as operation
        // 'documentTranslate' is 'multipart/form-data'
        return this.serviceClient.documentTranslateWithResponse(targetLanguage, documentTranslateContent,
            requestOptions);
    }

    /**
     * Submit a single document translation request to the Document Translation service
     *
     * Use this API to submit a single translation request to the Document Translation Service.
     *
     * @param targetLanguage Specifies the language of the output document.
     * The target language must be one of the supported languages included in the translation scope.
     * For example if you want to translate the document in German language, then use targetLanguage=de.
     * @param documentTranslateContent Document Translate Request Content.
     * @param sourceLanguage Specifies source language of the input document.
     * If this parameter isn't specified, automatic language detection is applied to determine the source language.
     * For example if the source document is written in English, then use sourceLanguage=en.
     * @param category A string specifying the category (domain) of the translation. This parameter is used to get
     * translations
     * from a customized system built with Custom Translator. Add the Category ID from your Custom Translator
     * project details to this parameter to use your deployed customized system. Default value is: general.
     * @param allowFallback Specifies that the service is allowed to fall back to a general system when a custom system
     * doesn't exist.
     * Possible values are: true (default) or false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData documentTranslate(String targetLanguage, DocumentTranslateContent documentTranslateContent,
        String sourceLanguage, String category, Boolean allowFallback) {
        // Generated convenience method for documentTranslateWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (sourceLanguage != null) {
            requestOptions.addQueryParam("sourceLanguage", sourceLanguage, false);
        }
        if (category != null) {
            requestOptions.addQueryParam("category", category, false);
        }
        if (allowFallback != null) {
            requestOptions.addQueryParam("allowFallback", String.valueOf(allowFallback), false);
        }
        return documentTranslateWithResponse(targetLanguage,
            new MultipartFormDataHelper(requestOptions)
                .serializeFileField("document", documentTranslateContent.getDocument().getContent(),
                    documentTranslateContent.getDocument().getContentType(),
                    documentTranslateContent.getDocument().getFilename())
                .serializeFileFields("glossary",
                    documentTranslateContent.getGlossary() == null
                        ? null
                        : documentTranslateContent.getGlossary()
                            .stream()
                            .map(GlossaryFileDetails::getContent)
                            .collect(Collectors.toList()),
                    documentTranslateContent.getGlossary() == null
                        ? null
                        : documentTranslateContent.getGlossary()
                            .stream()
                            .map(GlossaryFileDetails::getContentType)
                            .collect(Collectors.toList()),
                    documentTranslateContent.getGlossary() == null
                        ? null
                        : documentTranslateContent.getGlossary()
                            .stream()
                            .map(GlossaryFileDetails::getFilename)
                            .collect(Collectors.toList()))
                .end()
                .getRequestBody(),
            requestOptions).getValue();
    }

    /**
     * Submit a single document translation request to the Document Translation service
     *
     * Use this API to submit a single translation request to the Document Translation Service.
     *
     * @param targetLanguage Specifies the language of the output document.
     * The target language must be one of the supported languages included in the translation scope.
     * For example if you want to translate the document in German language, then use targetLanguage=de.
     * @param documentTranslateContent Document Translate Request Content.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData documentTranslate(String targetLanguage, DocumentTranslateContent documentTranslateContent) {
        // Generated convenience method for documentTranslateWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return documentTranslateWithResponse(targetLanguage,
            new MultipartFormDataHelper(requestOptions)
                .serializeFileField("document", documentTranslateContent.getDocument().getContent(),
                    documentTranslateContent.getDocument().getContentType(),
                    documentTranslateContent.getDocument().getFilename())
                .serializeFileFields("glossary",
                    documentTranslateContent.getGlossary() == null
                        ? null
                        : documentTranslateContent.getGlossary()
                            .stream()
                            .map(GlossaryFileDetails::getContent)
                            .collect(Collectors.toList()),
                    documentTranslateContent.getGlossary() == null
                        ? null
                        : documentTranslateContent.getGlossary()
                            .stream()
                            .map(GlossaryFileDetails::getContentType)
                            .collect(Collectors.toList()),
                    documentTranslateContent.getGlossary() == null
                        ? null
                        : documentTranslateContent.getGlossary()
                            .stream()
                            .map(GlossaryFileDetails::getFilename)
                            .collect(Collectors.toList()))
                .end()
                .getRequestBody(),
            requestOptions).getValue();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.repository.support;

import com.azure.spring.data.cosmos.common.TestConstants;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.azure.spring.data.cosmos.domain.Address;
import com.azure.spring.data.cosmos.domain.LongIdDomain;
import com.azure.spring.data.cosmos.domain.Person;
import com.azure.spring.data.cosmos.domain.Student;
import com.azure.spring.data.cosmos.domain.UUIDIdDomain;
import org.junit.Test;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class CosmosEntityInformationUnitTest {
    private static final String ID = "entity_info_test_id";
    private static final String FIRST_NAME = "first name";
    private static final String LAST_NAME = "last name";
    private static final List<String> HOBBIES = TestConstants.HOBBIES;
    private static final List<Address> ADDRESSES = TestConstants.ADDRESSES;

    @Test
    public void testGetId() {
        final Person testPerson = new Person(ID, FIRST_NAME, LAST_NAME, HOBBIES, ADDRESSES);
        final CosmosEntityInformation<Person, String> entityInformation =
                new CosmosEntityInformation<Person, String>(Person.class);

        final String idField = entityInformation.getId(testPerson);

        assertThat(idField).isEqualTo(testPerson.getId());
    }

    @Test
    public void testGetIdType() {
        final CosmosEntityInformation<Person, String> entityInformation =
                new CosmosEntityInformation<Person, String>(Person.class);

        final Class<?> idType = entityInformation.getIdType();
        assertThat(idType.getSimpleName()).isEqualTo(String.class.getSimpleName());
    }

    @Test
    public void testGetContainerName() {
        final CosmosEntityInformation<Person, String> entityInformation =
                new CosmosEntityInformation<Person, String>(Person.class);

        final String containerName = entityInformation.getContainerName();
        assertThat(containerName).isEqualTo(Person.class.getSimpleName());
    }

    @Test
    public void testCustomContainerName() {
        final CosmosEntityInformation<VersionedVolunteer, String> entityInformation =
                new CosmosEntityInformation<VersionedVolunteer, String>(VersionedVolunteer.class);

        final String containerName = entityInformation.getContainerName();
        assertThat(containerName).isEqualTo("testContainer");
    }

    @Test
    public void testGetPartitionKeyPath() {
        final CosmosEntityInformation<VolunteerWithPartitionKey, String> entityInformation =
                new CosmosEntityInformation<>(VolunteerWithPartitionKey.class);

        final String partitionKeyName = entityInformation.getPartitionKeyPath();
        assertThat(partitionKeyName).isEqualTo("/name");
    }

    @Test
    public void testNullPartitionKeyPath() {
        final CosmosEntityInformation<Volunteer, String> entityInformation =
                new CosmosEntityInformation<>(Volunteer.class);

        final String partitionKeyName = entityInformation.getPartitionKeyPath();
        assertThat(partitionKeyName).isEqualTo("/null");
    }

    @Test
    public void testCustomPartitionKeyPath() {
        final CosmosEntityInformation<VolunteerWithCustomPartitionKey, String> entityInformation =
                new CosmosEntityInformation<>(VolunteerWithCustomPartitionKey.class);

        final String partitionKeyName = entityInformation.getPartitionKeyPath();
        assertThat(partitionKeyName).isEqualTo("/vol_name");
    }

    @Test
    public void testPartitionKeyPathAnnotation() {
        final CosmosEntityInformation<VolunteerWithPartitionKeyPath, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKeyPath.class);

        final String partitionKeyPath = entityInformation.getPartitionKeyPath();
        assertThat(partitionKeyPath).isEqualTo("/volunteerWithPartitionKey/name");
    }

    @Test
    public void testPartitionKeyPathAndPartitionKeyAnnotation() {
        final CosmosEntityInformation<VolunteerWithPartitionKeyPathAndPartitionKey, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKeyPathAndPartitionKey.class);

        final String partitionKeyPath = entityInformation.getPartitionKeyPath();
        assertThat(partitionKeyPath).isEqualTo("/name");
    }

    @Test
    public void testGetPartitionKeyName() {
        final CosmosEntityInformation<VolunteerWithPartitionKey, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKey.class);

        final String partitionKeyName = entityInformation.getPartitionKeyFieldName();
        assertThat(partitionKeyName).isEqualTo("name");
    }

    @Test
    public void testNullPartitionKeyName() {
        final CosmosEntityInformation<Volunteer, String> entityInformation =
            new CosmosEntityInformation<>(Volunteer.class);

        final String partitionKeyName = entityInformation.getPartitionKeyFieldName();
        assertThat(partitionKeyName).isEqualTo(null);
    }

    @Test
    public void testCustomPartitionKeyName() {
        final CosmosEntityInformation<VolunteerWithCustomPartitionKey, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithCustomPartitionKey.class);

        final String partitionKeyName = entityInformation.getPartitionKeyFieldName();
        assertThat(partitionKeyName).isEqualTo("name");
    }

    @Test
    public void testPartitionKeyPathAnnotationGetFieldName() {
        final CosmosEntityInformation<VolunteerWithPartitionKeyPath, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKeyPath.class);

        final String partitionKeyPath = entityInformation.getPartitionKeyFieldName();
        assertThat(partitionKeyPath).isEqualTo("volunteerWithPartitionKey.name");
    }

    @Test
    public void testPartitionKeyPathAndPartitionKeyAnnotationGetFieldName() {
        final CosmosEntityInformation<VolunteerWithPartitionKeyPathAndPartitionKey, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKeyPathAndPartitionKey.class);

        final String partitionKeyPath = entityInformation.getPartitionKeyFieldName();
        assertThat(partitionKeyPath).isEqualTo("name");
    }

    @Test
    public void testGetPartitionKeyValue() {
        final CosmosEntityInformation<VolunteerWithPartitionKey, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKey.class);

        VolunteerWithPartitionKey entity = new VolunteerWithPartitionKey();
        entity.setName("MyName");

        final String partitionKeyName = String.valueOf(entityInformation.getPartitionKeyFieldValue(entity));
        assertThat(partitionKeyName).isEqualTo("MyName");
    }

    @Test
    public void testPartitionKeyPathAnnotationGetFieldValue() {
        final CosmosEntityInformation<VolunteerWithPartitionKeyPath, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKeyPath.class);

        VolunteerWithPartitionKeyPath entity = new VolunteerWithPartitionKeyPath();
        VolunteerWithPartitionKey nestedEntity = new VolunteerWithPartitionKey();
        nestedEntity.setName("NestedMyName");
        entity.setVolunteerWithPartitionKey(nestedEntity);

        final String partitionKeyPath = String.valueOf(entityInformation.getPartitionKeyFieldValue(entity));
        assertThat(partitionKeyPath).isEqualTo("NestedMyName");
    }

    @Test
    public void testPartitionKeyPathAndPartitionKeyAnnotationGetFieldValue() {
        final CosmosEntityInformation<VolunteerWithPartitionKeyPathAndPartitionKey, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithPartitionKeyPathAndPartitionKey.class);

        VolunteerWithPartitionKeyPathAndPartitionKey entity = new VolunteerWithPartitionKeyPathAndPartitionKey();
        entity.setName("ActualName");
        VolunteerWithPartitionKey nestedEntity = new VolunteerWithPartitionKey();
        nestedEntity.setName("NestedMyName");
        entity.setVolunteerWithPartitionKey(nestedEntity);

        final String partitionKeyPath = String.valueOf(entityInformation.getPartitionKeyFieldValue(entity));
        assertThat(partitionKeyPath).isEqualTo("ActualName");
    }

    @Test
    public void testHierarchicalPartitionKeyPathsGetPartitionKeyPath() {
        final CosmosEntityInformation<VolunteerWithHierarchicalPartitionKeyPaths, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithHierarchicalPartitionKeyPaths.class);

        final String partitionKeyPath = entityInformation.getPartitionKeyPath();
        assertThat(partitionKeyPath).isEqualTo("/id, /firstName, /lastName");
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testHierarchicalPartitionKeyPathsGetPartitionKeyFieldValue() {
        final CosmosEntityInformation<VolunteerWithHierarchicalPartitionKeyPaths, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithHierarchicalPartitionKeyPaths.class);

        VolunteerWithHierarchicalPartitionKeyPaths entity = new VolunteerWithHierarchicalPartitionKeyPaths("id_1",
            "John", "Smith", "12345");
        final Object partitionKeyFieldValue = entityInformation.getPartitionKeyFieldValue(entity);
        assertThat(partitionKeyFieldValue).isInstanceOf(ArrayList.class);
        ArrayList<Object> pkValues = (ArrayList<Object>)partitionKeyFieldValue;
        assertThat(pkValues.size()).isEqualTo(3);
        assertThat(pkValues.get(0)).isEqualTo("id_1");
        assertThat(pkValues.get(1)).isEqualTo("John");
        assertThat(pkValues.get(2)).isEqualTo("Smith");
    }

    @Test
    public void testHierarchicalPartitionKeyPathsGetPartitionKeyFieldName() {
        final CosmosEntityInformation<VolunteerWithHierarchicalPartitionKeyPaths, String> entityInformation =
            new CosmosEntityInformation<>(VolunteerWithHierarchicalPartitionKeyPaths.class);

        final String partitionKeyPath = entityInformation.getPartitionKeyFieldName();
        assertThat(partitionKeyPath).isEqualTo("id, firstName, lastName");
    }

    @Test
    public void testVersionedEntity() {
        final CosmosEntityInformation<VersionedVolunteer, String> entityInformation =
                new CosmosEntityInformation<VersionedVolunteer, String>(VersionedVolunteer.class);

        final boolean isVersioned = entityInformation.isVersioned();
        assertThat(isVersioned).isTrue();
    }

    @Test
    public void testEntityShouldNotBeVersionedWithWrongType() {
        final CosmosEntityInformation<WrongVersionType, String> entityInformation =
                new CosmosEntityInformation<WrongVersionType, String>(WrongVersionType.class);

        final boolean isVersioned = entityInformation.isVersioned();
        assertThat(isVersioned).isFalse();
    }

    @Test
    public void testEntityShouldBeVersionedIfUsingAnnotationOnAStringField() {
        final CosmosEntityInformation<VersionFieldDifferentName, String> entityInformation =
                new CosmosEntityInformation<VersionFieldDifferentName, String>(VersionFieldDifferentName.class);
        final boolean isVersioned = entityInformation.isVersioned();
        assertThat(isVersioned).isTrue();
    }

    @Test
    public void testNonVersionedEntity() {
        final CosmosEntityInformation<Student, String> entityInformation =
                new CosmosEntityInformation<Student, String>(Student.class);

        final boolean isVersioned = entityInformation.isVersioned();
        assertThat(isVersioned).isFalse();
    }

    @Container(containerName = "testContainer")
    private static class Volunteer {
        String id;
        String name;
    }

    @Container
    private static class VolunteerWithCustomPartitionKey {
        private String id;
        @PartitionKey("vol_name")
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Container
    private static class VolunteerWithPartitionKey {
        private String id;
        @PartitionKey
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Container(partitionKeyPath = "/volunteerWithPartitionKey/name")
    private static class VolunteerWithPartitionKeyPath {
        private String id;
        private String name;
        private VolunteerWithPartitionKey volunteerWithPartitionKey;

        public void setVolunteerWithPartitionKey(VolunteerWithPartitionKey volunteerWithPartitionKey) {
            this.volunteerWithPartitionKey = volunteerWithPartitionKey;
        }
    }

    @Container(partitionKeyPath = "/volunteerWithPartitionKey/name")
    private static class VolunteerWithPartitionKeyPathAndPartitionKey {
        private String id;
        @PartitionKey
        private String name;
        private VolunteerWithPartitionKey volunteerWithPartitionKey;

        public void setVolunteerWithPartitionKey(VolunteerWithPartitionKey volunteerWithPartitionKey) {
            this.volunteerWithPartitionKey = volunteerWithPartitionKey;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Container(hierarchicalPartitionKeyPaths = {"/id", "/firstName", "/lastName"})
    private static class VolunteerWithHierarchicalPartitionKeyPaths {
        private String id;
        private String firstName;
        private String lastName;
        private String zipcode;

        VolunteerWithHierarchicalPartitionKeyPaths(String id, String firstName, String lastName, String zipcode) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.zipcode = zipcode;
        }
    }

    @Container(containerName = "testContainer")
    private static class VersionedVolunteer {
        private String id;
        private String name;
        @Version
        private String _etag;

        VersionedVolunteer() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String get_etag() {
            return _etag;
        }

        public void set_etag(String _etag) {
            this._etag = _etag;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            VersionedVolunteer that = (VersionedVolunteer) o;
            return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(_etag, that._etag);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, _etag);
        }

        @Override
        public String toString() {
            return "VersionedVolunteer{"
                + "id='"
                + id
                + '\''
                + ", name='"
                + name
                + '\''
                + ", _etag='"
                + _etag
                + '\''
                + '}';
        }
    }

    @Container
    private static class WrongVersionType {
        private String id;
        private String name;
        private long _etag;

        WrongVersionType() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long get_etag() {
            return _etag;
        }

        public void set_etag(long _etag) {
            this._etag = _etag;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            WrongVersionType that = (WrongVersionType) o;
            return _etag == that._etag
                && Objects.equals(id, that.id)
                && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, _etag);
        }

        @Override
        public String toString() {
            return "WrongVersionType{"
                + "id='"
                + id
                + '\''
                + ", name='"
                + name
                + '\''
                + ", _etag="
                + _etag
                + '}';
        }
    }

    @Container
    private static class VersionFieldDifferentName {
        private String id;
        private String name;
        @Version
        private String version;

        VersionFieldDifferentName() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            VersionFieldDifferentName that = (VersionFieldDifferentName) o;
            return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(version, that.version);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, version);
        }

        @Override
        public String toString() {
            return "VersionFieldDifferentName{"
                + "id='"
                + id
                + '\''
                + ", name='"
                + name
                + '\''
                + ", version='"
                + version
                + '\''
                + '}';
        }
    }

    @Test
    public void testGetIdFieldWithUUIDType() {
        final CosmosEntityInformation<UUIDIdDomain, UUID> entityInformation =
            new CosmosEntityInformation<>(UUIDIdDomain.class);
        assertThat(entityInformation.getIdField().getType().equals(UUID.class)).isTrue();
    }

    @Test
    public void testUUIDIdTypeSerialization() {
        final UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        assertThat(uuid).isEqualTo(UUID.fromString(s));
        String lowerCase = s.toLowerCase();
        String upperCase = s.toUpperCase();
        assertThat(uuid).isEqualTo(UUID.fromString(lowerCase));
        assertThat(uuid).isEqualTo(UUID.fromString(upperCase));
        assertThat(UUID.fromString(upperCase).toString()).isEqualTo(UUID.fromString(lowerCase).toString());
    }

    @Test
    public void testGetIdFieldWithLongType() {
        final CosmosEntityInformation<LongIdDomain, Long> entityInformation =
            new CosmosEntityInformation<>(LongIdDomain.class);
        assertThat(entityInformation.getIdField().getType().equals(Long.class)).isTrue();
    }

    @Test
    public void testGetIdFieldWithBasicType() {
        final CosmosEntityInformation<BasicLongIdDomain, Long> entityInformation =
            new CosmosEntityInformation<>(BasicLongIdDomain.class);
        assertThat(entityInformation.getIdField().getType().equals(long.class)).isTrue();
    }

    @Container
    class BasicLongIdDomain {

        @Id
        private long number;

        private String name;

        BasicLongIdDomain(long number, String name) {
            this.number = number;
            this.name = name;
        }

        BasicLongIdDomain() {
        }

        public long getNumber() {
            return number;
        }

        public void setNumber(Long number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            BasicLongIdDomain that = (BasicLongIdDomain) o;
            return Objects.equals(number, that.number)
                && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, name);
        }

        @Override
        public String toString() {
            return "BasicLongIdDomain{"
                + "number="
                + number
                + ", name='"
                + name
                + '\''
                + '}';
        }
    }
}

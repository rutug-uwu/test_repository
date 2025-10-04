package iteration1;

import generators.RandomData;
import models.CreateUserRequest;
import models.CreateUserResponse;
import models.UserRole;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import requests.skeleton.Endpoint;
import requests.skeleton.requesters.CrudRequester;
import requests.skeleton.requesters.ValidatedCrudRequester;
import specs.RequestSpecs;
import specs.ResponseSpecs;

import java.util.stream.Stream;

public class CreateUserTest extends BaseTest {

    @Test
    public void adminCanCreateUserWithCorrectData() {
        CreateUserRequest createUserRequest = CreateUserRequest.builder()
                .username(RandomData.getUsername())
                .password(RandomData.getPassword())
                .role(UserRole.USER.toString())
                .build();

        CreateUserResponse createUserResponse = new ValidatedCrudRequester<CreateUserResponse>(
                RequestSpecs.adminSpec(),
                Endpoint.ADMIN_USER,
                ResponseSpecs.entityWasCreated())
                .post(createUserRequest);

        softly.assertThat(createUserRequest.getUsername()).isEqualTo(createUserResponse.getUsername()); // настраиваем и используем мягкие ассерты
        softly.assertThat(createUserRequest.getPassword()).isNotEqualTo(createUserResponse.getPassword());
        softly.assertThat(createUserRequest.getRole()).isEqualTo(createUserResponse.getRole());


//        given()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .header("Authorization", "Basic YWRtaW46YWRtaW4=")
//                .body("""
//                        {
//                            "username": "kate2052",
//                            "password": "Kate2000#",
//                            "role": "USER"
//                          }
//                        """)
//                .post("http://localhost:4111/api/v1/admin/users")
//                .then()
//                .assertThat()
//                .statusCode(HttpStatus.SC_CREATED)
//                .body("username", Matchers.equalTo("kate2051"))
//                .body("password", Matchers.not(Matchers.equalTo("kate2001")))
//                .body("role", Matchers.equalTo("USER"));
    }

    static Stream<Arguments> userInvalidData() {
        return Stream.of(
                //username field validation
                Arguments.of("   ", "Password33$", "USER", "username", "Username cannot be blank"),
                Arguments.of("ab", "Password33$", "USER", "username", "Username must be between 3 and 15 characters")
        );
    }

    @MethodSource("userInvalidData")
    @ParameterizedTest
    public void adminCanNotCreateUserWithInvalidData(String username, String password, String role, String errorKey, String errorText) {
        CreateUserRequest createUserRequest = CreateUserRequest.builder()
                .username(username)
                .password(password)
                .role(role)
                .build();

        new CrudRequester(
                RequestSpecs.adminSpec(),
                Endpoint.ADMIN_USER,
                ResponseSpecs.requestReturnsBadRequest(errorKey, errorText))
                .post(createUserRequest);
    }
}

package iteration1;

import models.LoginUserRequest;
import org.junit.jupiter.api.Test;
import requests.skeleton.Endpoint;
import requests.skeleton.requesters.CrudRequester;
import specs.RequestSpecs;
import specs.ResponseSpecs;

public class LoginUserTest {

    @Test
    public void adminCanGenerateAuthTokenTest() {
        LoginUserRequest userRequest = LoginUserRequest.builder()
                .username("admin")
                .password("admin")
                .build();

        new CrudRequester(
                RequestSpecs.unauthSpec(),
                Endpoint.LOGIN,
                ResponseSpecs.requestReturnsOK())
                .post(userRequest)
                .header("Authorization", "Basic YWRtaW46YWRtaW4=");
    }
}

package iteration1;

import generators.RandomData;
import models.CreateAccountResponse;
import models.CreateUserRequest;
import models.UserRole;
import org.junit.jupiter.api.Test;
import requests.skeleton.Endpoint;
import requests.skeleton.requesters.CrudRequester;
import requests.skeleton.requesters.ValidatedCrudRequester;
import specs.RequestSpecs;
import specs.ResponseSpecs;

import java.util.List;

public class CreateAccountTest extends BaseTest {

    @Test
    public void UserCanCreateAccountTest() {
        CreateUserRequest userRequest = CreateUserRequest.builder()
                .username(RandomData.getUsername())
                .password(RandomData.getPassword())
                .role(UserRole.USER.toString())
                .build();

        //Создаем юзера
        new CrudRequester(
                RequestSpecs.adminSpec(),
                Endpoint.ADMIN_USER,
                ResponseSpecs.entityWasCreated())
                .post(userRequest);


        //Получаем токен юзера и создаем счет/аккаунт
        String accNumber = new CrudRequester(
                RequestSpecs.authAsUser(userRequest.getUsername(), userRequest.getPassword()),
                Endpoint.CREATE_ACCOUNTS,
                ResponseSpecs.entityWasCreated())
                .post(null)
                .extract()
                .path("accountNumber");

        //запрашиваем все аккаунты пользователя и проверяем, что наш аккаунт там
        List<CreateAccountResponse> createAccountResponse = new ValidatedCrudRequester<CreateAccountResponse>(
                RequestSpecs.authAsUser(userRequest.getUsername(), userRequest.getPassword()),
                Endpoint.GET_ACCOUNTS,
                ResponseSpecs.requestReturnsOK())
                .get(CreateAccountResponse.class);

        softly.assertThat(createAccountResponse)
                .extracting(CreateAccountResponse::getAccountNumber)
                .contains(accNumber);
    }
}

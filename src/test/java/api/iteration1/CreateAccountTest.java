package api.iteration1;

import api.models.CreateAccountResponse;
import api.models.CreateUserRequest;
import org.junit.jupiter.api.Test;
import api.requests.skeleton.Endpoint;
import api.requests.skeleton.requesters.CrudRequester;
import api.requests.skeleton.requesters.ValidatedCrudRequester;
import api.requests.steps.AdminSteps;
import api.specs.RequestSpecs;
import api.specs.ResponseSpecs;

import java.util.List;

public class CreateAccountTest extends BaseTest {

    @Test
    public void UserCanCreateAccountTest() {
//        CreateUserRequest userRequest = CreateUserRequest.builder()
//                .username(RandomData.getUsername())
//                .password(RandomData.getPassword())
//                .role(UserRole.USER.toString())
//                .build();
//
//        //Создаем юзера
//        new CrudRequester(
//                RequestSpecs.adminSpec(),
//                Endpoint.CREATE_USER,
//                ResponseSpecs.entityWasCreated())
//                .post(userRequest);

        CreateUserRequest userRequest = AdminSteps.createUser();


        //Получаем токен юзера и создаем счет/аккаунт
        String accNumber = new CrudRequester(
                RequestSpecs.authAsUser(userRequest.getUsername(), userRequest.getPassword()),
                Endpoint.CREATE_ACCOUNT,
                ResponseSpecs.entityWasCreated())
                .post(null)
                .extract()
                .path("accountNumber");

        //запрашиваем все аккаунты пользователя и проверяем, что наш аккаунт там
        List<CreateAccountResponse> createAccountResponse = new ValidatedCrudRequester<CreateAccountResponse>(
                RequestSpecs.authAsUser(userRequest.getUsername(), userRequest.getPassword()),
                Endpoint.GET_CUSTOMER_ACCOUNTS,
                ResponseSpecs.requestReturnsOK())
                .get(CreateAccountResponse.class);

        softly.assertThat(createAccountResponse)
                .extracting(CreateAccountResponse::getAccountNumber)
                .contains(accNumber);
    }
}

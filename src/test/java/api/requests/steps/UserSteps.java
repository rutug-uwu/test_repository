package api.requests.steps;

//import models.DepositUserAccountRequest;

import api.models.AccountResponse;
import api.models.CreateAccountResponse;
import api.models.CreateUserResponse;
import api.requests.skeleton.Endpoint;
import api.requests.skeleton.requesters.CrudRequester;
import api.requests.skeleton.requesters.ValidatedCrudRequester;
import api.specs.RequestSpecs;
import api.specs.ResponseSpecs;

import java.util.List;

public class UserSteps {
    private String username;
    private String password;


    public UserSteps(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static int createAccount(String username, String password) {
        return new CrudRequester(
                RequestSpecs.authAsUser(username, password),
                Endpoint.CREATE_ACCOUNT,
                ResponseSpecs.entityWasCreated())
                .post(null)
                .extract()
                .path("id");
    }

//    public static void depositAccount(String username, String password, int id, double amount) {
//        new CrudRequester(
//                RequestSpecs.authAsUser(username, password),
//                Endpoint.ACCOUNTS_DEPOSIT,
//                ResponseSpecs.requestReturnsOK())
//                .post(DepositUserAccountRequest.builder().id(id).balance(amount).build());
//    }

    public List<CreateAccountResponse> getAllAccounts() {
        return new ValidatedCrudRequester<CreateAccountResponse>(
                RequestSpecs.authAsUser(username, password),
                Endpoint.GET_CUSTOMER_ACCOUNTS,
                ResponseSpecs.requestReturnsOK()).getAll(CreateAccountResponse[].class);
    }
}

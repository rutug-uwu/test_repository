package api.requests.skeleton;

import api.models.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Endpoint {
    ADMIN_USER(
         "/admin/users",
            CreateUserRequest.class,
            CreateUserResponse.class
    ),

    LOGIN("/auth/login",
            LoginUserRequest.class,
            LoginUserResponse.class),

    CREATE_ACCOUNT(
            "/accounts",
            BaseModel.class,
            CreateAccountResponse.class
    ),

    GET_CUSTOMER_ACCOUNTS(
            "/customer/accounts",
            BaseModel.class,
            CreateAccountResponse.class
    );

    private final String url;
    private final Class<? extends BaseModel> requestModel;
    private final Class<? extends BaseModel> responseModel;
}

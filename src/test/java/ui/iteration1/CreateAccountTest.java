package ui.iteration1;

import api.models.CreateUserResponse;
import api.requests.steps.UserSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import api.models.CreateAccountResponse;
import api.models.CreateUserRequest;
import api.models.LoginUserRequest;
import common.annotations.UserSession;
import common.storage.SessionStorage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;
import api.requests.skeleton.Endpoint;
import api.requests.skeleton.requesters.CrudRequester;
import api.requests.steps.AdminSteps;
import api.specs.RequestSpecs;
import api.specs.ResponseSpecs;
import ui.pages.BankAlerts;
import ui.pages.UserDashboard;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class CreateAccountTest extends BaseUiTest{

    @Test
    @UserSession
    public void userCanCreateAccountTest() {
        // ШАГИ ПО НАСТРОЙКЕ ОКРУЖЕНИЯ
        // Шаг 1: Админ логинится в банке
        // Шаг 2: Админ создает юзера
//        CreateUserRequest user = AdminSteps.createUser();

        // Шаг 3: Юзер логинится в банке
        // Подшаг внутри шага 3: Делаем апи запрос для получения токена юзера
//        String userAuthHeader = new CrudRequester(
//                RequestSpecs.unauthSpec(),
//                Endpoint.LOGIN,
//                ResponseSpecs.requestReturnsOK())
//                .post(LoginUserRequest.builder().username(user.getUsername()).password(user.getPassword()).build())
//                .extract()
//                .header("Authorization");


        // Подшаг внутри шага 3: запускаем базовую страницу сайта, чтобы просто появилась возможность добавить токен в localStorage браузера
//        Selenide.open("/");
//        // Подшаг внутри шага 3: добавляем токен юзера в локал стораж
//        executeJavaScript("localStorage.setItem('authToken', arguments[0]);", userAuthHeader);
        // открываем нужную часть сайта с токеном юзера
//        authAsUser(user.getUsername(),user.getPassword());
//        Selenide.open("/dashboard");

        // ШАГИ ТЕСТА
        // Шаг 4: Юзер создает счет\аккаунт
//        $(Selectors.byText("➕ Create New Account")).click();
        new UserDashboard().open().createNewAccount();

        List<CreateAccountResponse> createdAccounts = SessionStorage.getSteps().getAllAccounts();

        assertThat(createdAccounts).hasSize(1);
        //ШАГ 5: Проверка, что аккаунт создан на UI
//        Alert alert = switchTo().alert();
//        String alertText = alert.getText();
//        assertThat(alertText).contains("✅ New Account Created! Account Number:");
//        alert.accept();
//
//        Pattern pattern = Pattern.compile("Account Number: (\\w+)");
//        Matcher matcher = pattern.matcher(alertText);
//        matcher.find();
//
//        String createdAccNumber = matcher.group(1);
        new UserDashboard().checkAlertMessageAndAccept
                (BankAlerts.NEW_ACCOUNT_CREATED.getMessage() + createdAccounts.get(0).getAccountNumber());

        // Шаг 6: Проверка, что аккаунт создан на API
//        CreateAccountResponse[] existingUserAccounts = given()
//                .spec(RequestSpecs.authAsUser(user.getUsername(), user.getPassword()))
//                .get("http://localhost:4111/api/v1/customer/accounts")
//                .then().assertThat()
//                .extract().as(CreateAccountResponse[].class);
        assertThat(createdAccounts.get(0).getBalance()).isZero();

    }
}

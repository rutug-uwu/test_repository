package ui.iteration1;

import api.generators.RandomModelGenerator;
import api.models.CreateUserRequest;
import api.models.CreateUserResponse;
import api.requests.steps.AdminSteps;
import api.specs.RequestSpecs;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import common.annotations.AdminSession;
import common.extensions.AdminSessionExtension;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Alert;
import ui.pages.AdminPanel;
import ui.pages.BankAlerts;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ui.pages.BankAlerts.USERNAME_MUST_BE_BETWEEN_3_AND_15_CHARACTERS;

public class CreateUserTest extends BaseUiTest {

    @Test
    @AdminSession
    public void adminCanCreateUserTest() {
        // ШАГ 1: админ залогинился в банке
//        CreateUserRequest admin = CreateUserRequest.getAdmin();
//
//        authAsUser(admin.getUsername(), admin.getPassword());
//        open("/login");
//        $(Selectors.byAttribute("placeholder", "Username")).setValue(admin.getUsername());
//        $(Selectors.byAttribute("placeholder", "Password")).setValue(admin.getPassword());
//        $("button").click();
//
//        $(Selectors.byText("Admin Panel")).shouldBe(Condition.visible);

        // ШАГ 2: админ создает юзера в банке
        CreateUserRequest newUser = RandomModelGenerator.generate(CreateUserRequest.class);

        new AdminPanel().open().createUser(newUser.getUsername(), newUser.getPassword()).checkAlertMessageAndAccept(BankAlerts.USER_CREATED_SUCCESSFULLY.getMessage())
                .getAllUsers().findBy(Condition.exactText(newUser.getUsername() + "\nUSER")).shouldBe(Condition.visible);

//        $(Selectors.byAttribute("placeholder", "Username")).setValue(newUser.getUsername());
//        $(Selectors.byAttribute("placeholder", "Password")).setValue(newUser.getPassword());
//        $(Selectors.byText("Add User")).click();

        // ШАГ 3: проверка, что алерт "User created successfully!" появился
//        Alert alert = switchTo().alert();
//        assertEquals("✅ User created successfully!", alert.getText());
//        alert.accept();

        //ШАГ 4: проверка, что юзер отображается на UI
//        ElementsCollection allUsersFromDashboard = $(Selectors.byText("All Users")).parent().findAll("li");
//        allUsersFromDashboard.findBy(Condition.exactText(newUser.getUsername() + "\nUSER")).shouldBe(Condition.visible);

        //ШАГ 5: проверка, что юзер создан на API
//        CreateUserResponse[] users = given()
//                .spec(RequestSpecs.adminSpec())
//                .get("http://localhost:4111/api/v1/admin/users")
//                .then()
//                .assertThat()
//                .statusCode(HttpStatus.SC_OK)
//                .extract().as(CreateUserResponse[].class);


        CreateUserResponse createdUser = AdminSteps.getAllUsers().stream()
                .filter(user -> user.getUsername().equals(newUser.getUsername()))
                .findFirst().get();

        assertEquals(newUser.getUsername(), createdUser.getUsername());
    }

    @Test
    @AdminSession //JUnit Extension
    //@UserSession() //JUnit Extension
    public void adminCannotCreateUserWithInvalidDataTest() {
        // ШАГ 1: админ залогинился в банке
//        CreateUserRequest admin = CreateUserRequest.getAdmin();
//        authAsUser(admin.getUsername(), admin.getPassword());

        // ШАГ 2: админ создает юзера в банке
        CreateUserRequest newUser = RandomModelGenerator.generate(CreateUserRequest.class);
        newUser.setUsername("a");

        new AdminPanel().open().createUser(newUser.getUsername(), newUser.getPassword())
                .checkAlertMessageAndAccept(USERNAME_MUST_BE_BETWEEN_3_AND_15_CHARACTERS.getMessage())
                .getAllUsers().findBy(Condition.exactText(newUser.getUsername() + "\nUSER")).shouldNotBe(Condition.exist);

        // ШАГ 3: проверка, что алер "Username must be between 3 and 15 characters" появился
//        Alert alert = switchTo().alert();
//        assertThat(alert.getText()).contains("Username must be between 3 and 15 characters");
//        alert.accept();

        //ШАГ 4: проверка, что юзер не отображается на UI
//        ElementsCollection allUsersFromDashboard = $(Selectors.byText("All Users")).parent().findAll("li");
//        allUsersFromDashboard.findBy(Condition.exactText(newUser.getUsername() + "\nUSER")).shouldNotBe(Condition.exist);

        //ШАГ 5: проверка, что юзер не создан на API
        long usersWithSameUsernameAsNewUser = AdminSteps.getAllUsers().stream().filter(user -> user.getUsername().equals(newUser.getUsername())).count();

        assertThat(usersWithSameUsernameAsNewUser).isZero();
    }
}

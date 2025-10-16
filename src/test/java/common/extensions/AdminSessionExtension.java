package common.extensions;

import api.models.CreateUserRequest;
import common.annotations.AdminSession;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import ui.pages.BasePage;

public class AdminSessionExtension implements BeforeEachCallback {
    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        // Шаг 1: Проверка наличия у теста аннотации AdminSession
        AdminSession annotation = extensionContext.getRequiredTestMethod().getAnnotation(AdminSession.class);

        if (annotation != null) { // Шаг 2: Если есть, то добавляем в localStorage токен админа
            BasePage.authAsUser(CreateUserRequest.getAdmin().getUsername(), CreateUserRequest.getAdmin().getPassword());
        }
    }
}

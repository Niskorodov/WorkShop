package org.example;

import com.codeborne.selenide.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.ui.BaseUITest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.*;

public class SimpleUITest extends BaseUITest {

    @Test
    public void userCanNotCreateAccountWithNameAndSurnameOnly() {
        // Открытие страницы регистрации
        open("https://parabank.parasoft.com/parabank/register.htm");

        // Ввод имени и фамилии
        $("#customer\\.firstName").setValue("Дмитрий");
        $("#customer\\.lastName").setValue("Юрьевич");

        // Нажатие на кнопку регистрации
        $x("//input[@value='Register']").click();

        // Проверки сообщений об ошибке
        checkError("#customer\\.address\\.street\\.errors", "Address is required.");
        checkError("#customer\\.address\\.city\\.errors", "City is required.");
        checkError("#customer\\.address\\.state\\.errors", "State is required.");
        checkError("#customer\\.address\\.zipCode\\.errors", "Zip Code is required.");
        checkError("#customer\\.ssn\\.errors", "Social Security Number is required.");
        checkError("#customer\\.username\\.errors", "Username is required.");
        checkError("#customer\\.password\\.errors", "Password is required.");
        checkError("#repeatedPassword\\.errors", "Password confirmation is required.");
    }

    private void checkError(String selector, String expectedText) {
        $(selector).shouldHave(Condition.exactText(expectedText));
    }
}
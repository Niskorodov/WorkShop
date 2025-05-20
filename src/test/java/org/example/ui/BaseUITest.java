package org.example.ui;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseUITest {

    @BeforeAll
    static void setupBrowser() {
        WebDriverManager.chromedriver().setup();

        Configuration.browser = "chrome";
        Configuration.timeout = 5000;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        Configuration.browserCapabilities = options;
    }
}

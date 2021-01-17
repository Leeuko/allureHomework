package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://otus.ru/";

    @Step("Open N11 Step...")
    public HomePage goToN11() {
        driver.get(baseURL);
        return this;
    }

    @Step("Go to Login Page Step...")
    public LoginPage goToLoginPage() {
        Objects.Logon(driver).click();
        return new LoginPage(driver);
    }
}
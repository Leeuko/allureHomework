package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By errorMessageUsernameXpath = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
    By errorMessagePasswordXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");

    @Step("Login Step with username: {0}, password: {1}, for method: {method} step...")
    public LoginPage loginToN11(String username, String password) {
        Objects.LoginBox(driver).sendKeys(username);
        Objects.PassBox(driver).sendKeys(password);
        Objects.SubmitButton(driver).click();
        return this;
    }

    @Step("Verify verifyLoginPassword: {0} step...")
    public LoginPage verifyLoginPassword(String expectedText) {
        waitVisibility(errorMessagePasswordXpath);
        Assert.assertEquals(readText(errorMessagePasswordXpath), expectedText);
        return this;
    }
}
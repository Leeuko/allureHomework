package tests;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Listeners.TestListener;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Login Tests")
public class LoginTests extends BaseTest {

    String wrongUsername = "email@gmail.com";
    String wrongPassword = "Pass123";

    @Test (priority = 0, description="Invalid Login Scenario with wrong username and password.")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Login test with wrong username and wrong password.")
    @Story("Invalid username and password login test")
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {
        homePage
                .goToN11()
                .goToLoginPage()
                .loginToN11(wrongUsername, wrongPassword)
                .verifyLoginPassword("Wrong login/password used");
    }

    @Test (priority = 1, description="Invalid Login Scenario with empty username and password.")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Description: Login test with empty username and empty password.")
    @Story("Empty username and password login test")
    public void invalidLoginTest_EmptyUserEmptyPassword () {
        homePage
                .goToN11()
                .goToLoginPage()
                .loginToN11(" ", " ");
    }
}
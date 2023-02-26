package co.com.prueba.saucedemo.steps;

import co.com.prueba.saucedemo.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {
    private LoginPage loginPage;




    @Step
    public void goToSaucedemoWebPage() {
        loginPage.open();
    }

    @Step
    public void userEnterCredentials(String username, String password) {

        loginPage.textBoxUsername.sendKeys(username);
        loginPage.textBoxPassword.sendKeys(password);
        loginPage.btnLogin.submit();


    }

    @Step
    public void validateUrl(String url) {
        Assert.assertEquals(loginPage.resultUrl(), url);
    }
}
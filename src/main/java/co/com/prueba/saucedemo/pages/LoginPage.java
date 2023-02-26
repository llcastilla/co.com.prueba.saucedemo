package co.com.prueba.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public WebElementFacade textBoxUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElementFacade textBoxPassword;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    public WebElementFacade btnLogin;

    public String resultUrl() {
        return getDriver().getCurrentUrl();
    }
}

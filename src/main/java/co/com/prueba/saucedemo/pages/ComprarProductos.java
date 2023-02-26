package co.com.prueba.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class ComprarProductos extends PageObject {


        @FindBy(xpath = "//*[@id=\"checkout\"]")
        public WebElementFacade btnComprar;


}

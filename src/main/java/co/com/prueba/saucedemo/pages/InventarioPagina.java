package co.com.prueba.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InventarioPagina extends PageObject {

    @FindBy(xpath = "//*[@class=\"btn btn_primary btn_small btn_inventory\"]")
    WebElementFacade btnAddToCart;


    public void addToCart() {
        btnAddToCart.click();
    }
}

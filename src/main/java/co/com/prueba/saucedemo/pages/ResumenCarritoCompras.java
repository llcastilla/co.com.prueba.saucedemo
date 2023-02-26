package co.com.prueba.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class ResumenCarritoCompras extends PageObject {

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]")
    WebElementFacade elementInShoppingCart;


    public String exist() {
        if(elementInShoppingCart.getText().isEmpty()){
            return elementInShoppingCart.getText();
        }else return "null";
    }



}

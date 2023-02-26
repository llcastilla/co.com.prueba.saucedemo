package co.com.prueba.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class VerificarInformacion extends PageObject {


    @FindBy(xpath = "//*[@id=\"first-name\"]")
    public WebElementFacade nombre;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    public WebElementFacade apellido;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    public WebElementFacade codigoPostal;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    public WebElementFacade continuar;

    @FindBy(xpath = "//*[@id=\"finish\"]")
    public WebElementFacade finalizarCompra;

    @FindBy(xpath = "//*[@class=\"complete-header\"]")
    public WebElementFacade check;

    @FindBy(xpath = "//*[@id=\"back-to-products\"]")
    public WebElementFacade regresarMenu;




}

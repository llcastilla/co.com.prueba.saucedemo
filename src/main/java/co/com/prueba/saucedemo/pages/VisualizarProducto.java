package co.com.prueba.saucedemo.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.NotFoundException;

import java.util.List;


public class VisualizarProducto extends PageObject {
    @FindBy(xpath = "//*[@class=\"inventory_list\"]")

    List<WebElementFacade> productos;

    public void escogerProducto() {
        try{
            int numeroAleatorio = RandomUtils.nextInt(1,productos.size());
            WebElementFacade anchor = find(By.xpath("//*[@id=\"inventory_container\"]/div/div["+numeroAleatorio+"]/div[2]/div[1]/a"));
            anchor.click();

        }catch (NotFoundException elementException){
            elementException.printStackTrace();
        }
    }
}

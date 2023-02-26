package co.com.prueba.saucedemo.steps;

import co.com.prueba.saucedemo.pages.*;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ProductoCarritoComprasStep {

    VisualizarProducto visualizarProducto;
    InventarioPagina item;
    ResumenCarritoCompras itemInCart;
    ComprarProductos comprarProductos;
    VerificarInformacion verificar;

    @Step
    public void escogerProductoAleatorio() {
        visualizarProducto.escogerProducto();
    }

    @Step
    public void agregarProductoCarritoCompras() {
        item.addToCart();
    }

    @Step
    public void irCarritoDeCompras() {
        itemInCart.open();
    }

    @Step
    public void validarCarritoCompras() {
        itemInCart.exist();
    }

    @Step
    public void comprar() {
        comprarProductos.btnComprar.click();
    }

    @Step
    public void verificarInfo(String nombre, String apellido, String codigoPostal) {
        verificar.nombre.sendKeys(nombre);
        verificar.apellido.sendKeys(apellido);
        verificar.codigoPostal.sendKeys(codigoPostal);
        verificar.continuar.click();
    }

    @Step
    public void finalizar() {

        verificar.finalizarCompra.click();
        assertThat(verificar.check.isCurrentlyVisible(), is(true));


    }
    @Step
    public void menu() {
        verificar.regresarMenu.click();
    }
}

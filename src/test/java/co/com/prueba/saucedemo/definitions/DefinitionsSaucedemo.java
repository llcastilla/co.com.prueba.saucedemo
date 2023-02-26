package co.com.prueba.saucedemo.definitions;


import co.com.prueba.saucedemo.steps.LoginPageSteps;
import co.com.prueba.saucedemo.steps.ProductoCarritoComprasStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DefinitionsSaucedemo {
    @Steps
    LoginPageSteps loginSteps;


    @Given("el usuario desea ingresar a la pagina web para comprar algunos productos de la pagina")
    public void elUsuarioDeseaIngresarALaPaginaWebParaComprarAlgunosProductosDeLaPagina() {
        loginSteps.goToSaucedemoWebPage();

    }


    @When("el usuario ingresa con el username {string} and password {string}")
    public void elUsuarioIngresaConElUsernameAndPassword(String username, String password) {
        loginSteps.userEnterCredentials(username, password);

    }

    @Then("usuario ingresa a la pagina de forma exitosa {string}")
    public void usuarioIngresaALaPaginaDeFormaExitosa(String page) {
        loginSteps.validateUrl(page);
    }


    /**
     * Test para agregar los productos al carrito de compras
     */

    @Steps
    ProductoCarritoComprasStep productoCarritoComprasStep;

    @Given("el usuario desea comprar algunos productos")
    public void elUsuarioDeseaComprarAlgunosProductos() {
        loginSteps.goToSaucedemoWebPage();

    }

    @And("ingresando con el username {string} and password {string}")
    public void ingresandoConElUsernameAndPassword(String username, String password) {

        loginSteps.userEnterCredentials(username, password);

    }


    @When("El usuario agrega los producto al carrito de compras")
    public void elUsuarioAgregaLosProductoAlCarritoDeCompras() {
        productoCarritoComprasStep.escogerProductoAleatorio();
        productoCarritoComprasStep.agregarProductoCarritoCompras();

    }

    @And("procede a realizar el pago")
    public void procedeARealizarElPago() {
        productoCarritoComprasStep.irCarritoDeCompras();
        productoCarritoComprasStep.validarCarritoCompras();
        productoCarritoComprasStep.comprar();

    }


    @And("Ingresa los datos personales nombre {string} apellido {string} codigo postal {string}")
    public void ingresaLosDatosPersonalesNombreApellidoCodigoPostal(String nombre, String apellido, String codigoPostal) {
        productoCarritoComprasStep.verificarInfo(nombre, apellido, codigoPostal);

    }

    @Then("Sistema procesa la informacion y envia mensaje")
    public void sistemaProcesaLaInformacionYEnviaMensaje() {
        productoCarritoComprasStep.finalizar();
        productoCarritoComprasStep.menu();
    }


}


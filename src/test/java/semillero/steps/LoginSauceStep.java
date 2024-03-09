package semillero.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import semillero.BaseTest;
import semillero.pages.SauceCartPages;
import semillero.pages.SauceHomePages;
import semillero.pages.SauceLoginPages;

public class LoginSauceStep extends BaseTest {


    private SauceLoginPages sauceLoginPage;
    private SauceHomePages sauceHomePages;
    private SauceCartPages sauceCartPages;

    public LoginSauceStep() {  // metodo para iniciarlizar objectos
        this.sauceLoginPage = new SauceLoginPages(driver);
        this.sauceHomePages = new SauceHomePages(driver);
        this.sauceCartPages=new SauceCartPages(driver);

    }




    @Given("Abrir pagina sauce")
    public void abrirPaginaSauce() {
        sauceLoginPage.abrirLoginSauce();
    }


    @When("Ingreso de datos para login: usename {string} y password {string}")
    public void ingresoDeDatosParaLoginUsenameYPassword(String usename, String password) {
        sauceLoginPage.IngresoCampos(usename, password);
    }

    @Then("Se valida el login exitosamente")
    public void seValidaElLogin() {
        sauceLoginPage.validarInicio();
    }
    //Buy shirt  // Scenario 1

    @Given("El usuario encuentra un producto")
    public void elUsuarioEncuentraUnProducto() {
        sauceHomePages.encuentraProducto();
    }
    
    
    @When("Agrega al carrito el producto")
    public void agregaAlCarritoElProducto() {
        sauceHomePages.agregarAlCarrito();
    }


    @Then("Remueve el producto del carrito")
    public void remueveElProductoDelCarrito() {
        sauceCartPages.removerDelCarrito();
        
    }

    @And("Valida que no se visualice el producto en el carrito")
    public void validaQueNoSeVisualiceElProductoEnElCarrito() {
        sauceCartPages.noVisualizarProducto();
    }
}

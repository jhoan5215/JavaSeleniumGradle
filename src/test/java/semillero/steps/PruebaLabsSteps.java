package semillero.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import semillero.BaseTest;
import semillero.pages.PruebaLabsPage;

public class PruebaLabsSteps extends BaseTest {
    private PruebaLabsPage sauceLabsPage;

    public PruebaLabsSteps() {
        sauceLabsPage = new PruebaLabsPage(driver);
    }

    @Given("El usuario está en la página de Sauce Labs")
    public void el_usuario_esta_en_la_pagina_de_labs() {
        sauceLabsPage.openSauce();
    }

    @When("ingresa usuario {string}")
    public void ingresa_usuario(String userTerm) {
        sauceLabsPage.UserSauce(userTerm);
    }

    @When("ingresa Contraseña {string}")
    public void ingresa_contraseña(String passTerm) {
        sauceLabsPage.PassSauce(passTerm);
    }

    @Then("Dar click en el boton login")
    public void dar_click_en_el_boton_login() {
        sauceLabsPage.BottonLoginSauce();
    }

    @After()
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @And("validar el inicio")
    public void validar_El_Inicio() {
        sauceLabsPage.validarInicioSauce();
    }
}
package semillero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginPages {
    private WebDriver driver;
 //--------Instans variables -------
    private By txtUsername = By.id("user-name");
    private By txtPassword = By.id("password");
    private By btnLogin = By.id("login-button");

    private By inicio = By.className("shopping_cart_link");


    //---------------------------------------------------
    public SauceLoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirLoginSauce(){
        driver.get("https://www.saucedemo.com/");
    }

    public void IngresoCampos(String username, String password){
        driver.findElement(txtUsername).sendKeys(username);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLogin).submit();
    }

    public void validarInicio(){
        driver.findElement(inicio).isDisplayed();
    }

    // Buy shirt








}

package semillero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceCartPages {

    public SauceCartPages(WebDriver driver) {
        this.driver = driver;
    }


    private WebDriver driver; //Creacion de la variable driver

    private By cartItemns = By.className("title");
    private By btnRemove = By.id("remove-sauce-labs-bolt-t-shirt");
    private By inicio = By.className("shopping_cart_link");
    private By producto = By.className("inventory_item_name");




    public void removerDelCarrito(){ // funcion simple
        driver.findElement(inicio).click();
        driver.findElement(cartItemns).isDisplayed();
        driver.findElement(btnRemove).click();

    }





    public void noVisualizarProducto() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean elementoNoPresente = wait.until(ExpectedConditions.invisibilityOfElementLocated(producto)); // validacion con un boolean variable

        // Realizar la aserción
        if (elementoNoPresente) {
            System.out.println("El elemento no está presente en la página." + elementoNoPresente); //testeando el boolean
        } else {
            System.out.println("El elemento está presente en la página.");
        }

    }


}

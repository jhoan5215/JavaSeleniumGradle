package semillero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SauceHomePages {

    public SauceHomePages(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By producto = By.className("inventory_item_name");
    private By btnShirtBlack =By.id("add-to-cart-sauce-labs-bolt-t-shirt");




    public void encuentraProducto()  {
        if (!driver.findElements(producto).isEmpty() && driver.findElement(producto).isDisplayed()) {
            System.out.println("El "+producto+" se encuentra disponible");

        } else {
            System.out.println("El "+producto+" no se encuentra disponible");
        }
    }


    public void agregarAlCarrito() {
        if (driver.findElement(btnShirtBlack).isDisplayed()) {
            driver.findElement(btnShirtBlack).click();
            System.out.println("El producto se agrego correctamente al carrito");
            //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //  validar waits
        } else {
            System.out.println("El producto no se agrego  correctamente");
        }
    }

}

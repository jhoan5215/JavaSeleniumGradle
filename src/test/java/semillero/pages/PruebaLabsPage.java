package semillero.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PruebaLabsPage {
    public PruebaLabsPage() {
    }

    private final By User = By.id("user-name");
    private final By Pass = By.id("password");

    private final By Login = By.id("login-button");


    private final By inicio =new By.ByLinkText("Sauce Labs Onesie");
    WebDriver driver = null;

    public PruebaLabsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSauce() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    public void UserSauce(String userTerm) {
        driver.findElement(User).sendKeys(userTerm);
    }

    public void PassSauce(String passTerm) {
        driver.findElement(Pass).sendKeys(passTerm);
    }

    public void BottonLoginSauce() {
        driver.findElement(Login).submit();
    }

    //ingresamos al login

    public void validarInicioSauce() {
        // verifico si la lista no está vacía con el operador !
        if (!driver.findElements(inicio).isEmpty() && driver.findElement(inicio).isDisplayed()) {
            System.out.println("La camisa se encuentra disponible");
        } else {
            System.out.println("La camisa no se encuentra disponible");
        }
    }
}
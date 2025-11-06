import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTests {

    @Test
    public void validLogin() {
        WebDriver driver= DriverFactory.getDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }
}

package GlobalSqa.Steps;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conexion {

    private WebDriver driver;

    @Before
    @Step
    public WebDriver openBrower() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/registration-login-example/#/register");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return this.driver;

    }
}

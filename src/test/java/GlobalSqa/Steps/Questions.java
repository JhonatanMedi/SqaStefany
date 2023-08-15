package GlobalSqa.Steps;

import net.serenitybdd.core.annotations.findby.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Questions {

    private WebDriver driver;

    public Questions(WebDriver driver) {
        this.driver = driver;
    }


    public void validateUserRegister() {
        String assertUser = driver.findElement(By.xpath("//div[@class= 'ng-binding ng-scope alert alert-success']")).getText();
        Assert.assertEquals("Registration successful", assertUser);
    }

    public void timeSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebDriver closedBrower() {
        driver.close();
        return this.driver;
    }
}
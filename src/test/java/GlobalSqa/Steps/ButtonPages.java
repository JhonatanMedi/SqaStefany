package GlobalSqa.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

    @FindBy(how = How.XPATH, using = "//div//button[text()= 'Register']")
    private WebElement btnRegister;

    public ButtonPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void btnRegister() {
        this.btnRegister.isDisplayed();
        this.btnRegister.click();
    }

}

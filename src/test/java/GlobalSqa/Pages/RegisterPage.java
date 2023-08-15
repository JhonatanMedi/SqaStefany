package GlobalSqa.Pages;

import GlobalSqa.Steps.ButtonPages;
import GlobalSqa.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private ButtonPages buttonPages;

    private Questions questions;

    @FindBy(how = How.ID, using = "firstName")
    private WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement txtLastName;

    @FindBy(how = How.ID, using = "username")
    private WebElement txtUserName;

    @FindBy(how = How.ID, using = "password")
    private WebElement txtPassword;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    public void fillOutRegister(String firstName, String lastName, String userName, String password) {
        this.txtFirstName.sendKeys(firstName);
        this.txtLastName.sendKeys(lastName);
        this.txtUserName.sendKeys(userName);
        this.txtPassword.sendKeys(password);
        this.buttonPages.btnRegister();
    }

    public void validateCreateUser() {
        this.questions.timeSecond(1);
        this.questions.validateUserRegister();
        this.questions.closedBrower();
    }
}

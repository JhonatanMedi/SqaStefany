package GlobalSqa.Definitions;

import GlobalSqa.Pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import GlobalSqa.Steps.Conexion;
import io.cucumber.java.en.Given;

public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private RegisterPage registerPage = new RegisterPage(driver);


    @Given("^the user open brower$")
    public void openBrower() {
        this.conexion = new Conexion();
        this.driver = this.conexion.openBrower();
    }

    @When("^the user fill out first name (.*) last name (.*) user (.*) password (.*)$")
    public void fillOutRegister(String firstName, String lastName, String userName, String password) {
        this.registerPage = new RegisterPage(driver);
        this.registerPage.fillOutRegister(firstName, lastName, userName, password);
    }

    @Then("^the user validates that the registration was successful$")
    public void validateCreateUser() {
        this.registerPage = new RegisterPage(driver);
        this.registerPage.validateCreateUser();
    }
}
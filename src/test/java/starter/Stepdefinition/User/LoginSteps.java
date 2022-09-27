package starter.Stepdefinition.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("Given I opened the LinkedIn site")
    public void givenIOpenedTheLinkedInSite() {
        System.out.println("Given I opened the LinkedIn site");
    }

    @When("I didn't enter my email and password")
    public void iDidnTEnterMyEmailAndPassword() {
        System.out.println("I didn't enter my email and password");
    }

    @And("I clicked the login button")
    public void iClickedTheLoginButton() {
        System.out.println("I clicked the login button");
    }

    @Then("I can't log in")
    public void iCanTLogIn() {
        System.out.println("I can't log in");
    }

    @And("an error message appears")
    public void anErrorMessageAppears() {
        System.out.println("an error message appears");
    }

    @Given("I opened the LinkedIn site")
    public void iOpenedTheLinkedInSite() {
        System.out.println("I opened the LinkedIn site");
    }

    @When("I input valid email and did not input my password")
    public void iInputValidEmailAndDidNotInputMyPassword() {
        System.out.println("null password");
    }

    @Then("Then I can't log in")
    public void thenICanTLogIn() {
        System.out.println("Then I can't log in");
    }

    @When("I input valid email and valid password")
    public void iInputValidEmailAndValidPassword() {

    }

    @Then("Then I can log in")
    public void thenICanLogIn() {
    }

    @When("I input valid password")
    public void iInputValidPassword() {
    }

    @When("I input invalid email and invalid password")
    public void iInputInvalidEmailAndInvalidPassword() {
    }

    @When("I input valid password and invalid password")
    public void iInputValidPasswordAndInvalidPassword() {
    }

    @When("I click the field login with google")
    public void iClickTheFieldLoginWithGoogle() {
    }

    @And("I choose the google acount")
    public void iChooseTheGoogleAcount() {
    }

    @Then("I can log in")
    public void iCanLogIn() {
    }

    @When("I click the field login with apple")
    public void iClickTheFieldLoginWithApple() {
    }

    @And("I input my apple ID")
    public void iInputMyAppleID() {
    }

    @And("I input my password")
    public void iInputMyPassword() {
    }
}

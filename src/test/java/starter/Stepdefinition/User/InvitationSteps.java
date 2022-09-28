package starter.Stepdefinition.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvitationSteps {
    @And("I go to my network menu")
    public void iGoToMyNetworkMenu() {
        System.out.println("go to my network");
    }

    @When("I clicking follow in the people recommendations that appear")
    public void iClickingFollowInThePeopleRecommendationsThatAppear() {
        System.out.println("I clicking follow in the people recommendations that appear");
    }

    @Then("I can send her message")
    public void iCanSendHerMessage() {
        System.out.println("can send message");
    }

    @And("I go to connection field")
    public void iGoToConnectionField() {
        System.out.println("go to connection field");
    }

    @When("I clicking connection in the people recommendations that appear")
    public void iClickingConnectionInThePeopleRecommendationsThatAppear() {
        System.out.println("I clicking connection in the people recommendations that appear");
    }

    @Then("I interaction with the person receiving the connection")
    public void iInteractionWithThePersonReceivingTheConnection() {
        System.out.println("I interaction with the person receiving the connection");
    }

    @And("I click group on the connection field")
    public void iClickGroupOnTheConnectionField() {
        System.out.println("I click group on the connection field");
    }

    @When("I clicking connection in the group recommendations that appear")
    public void iClickingConnectionInTheGroupRecommendationsThatAppear() {
        System.out.println("I clicking connection in the group recommendations that appear");
    }

    @Then("I following that group")
    public void iFollowingThatGroup() {
        System.out.println("i following that group");
    }
}

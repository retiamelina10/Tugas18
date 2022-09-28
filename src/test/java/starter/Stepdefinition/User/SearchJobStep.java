package starter.Stepdefinition.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchJobStep {
    @Given("I have to logged")
    public void iHaveToLogged() {
        System.out.println("I have to logged");
    }

    @And("I go to job menu")
    public void iGoToJBMenu() {
        System.out.println("go to job menu");
    }

    @When("I clicked show all in the recommendations section for you")
    public void iClickedShowAllInTheRecommendationsSectionForYou() {
        System.out.println("clicked show all");
    }

    @Then("I can saw jobs that match what I put in my profile")
    public void iCanSawJobsThatMatchWhatIPutInMyProfile() {
        System.out.println("I can saw jobs that match what I put in my profile");
    }

    @And("I go to job menu")
    public void igoToJobMenu() {
        System.out.println("go to job menu");
    }

    @When("I go to remote job opportunity")
    public void iGoToRemoteJobOpportunity() {
        System.out.println("go to remote job opportunity");
    }

    @And("I clicked show all")
    public void iClickedShowAll() {
        System.out.println("and clicked show all");
    }

    @Then("I can saw jobs that are far away")
    public void iCanSawJobsThatAreFarAway() {
        System.out.println("I can saw jobs that are far away");
    }

    @And("I go to job menu")
    public void iGoToJobMenu() {
        System.out.println("go to job menu");
    }

    @When("I go to another jobs")
    public void iGoToAnotherJobs() {
        System.out.println("go to another jobs");
    }

    @Then("I can saw another recommendation jobs")
    public void iCanSawAnotherRecommendationJobs() {
        System.out.println("can saw another recommendation jobs");
    }

    @When("I go to search bar")
    public void iGoToSearchBar() {
        System.out.println("go to search bar");
    }

    @And("I input keywords about the job what to search for")
    public void iInputKeywordsAboutTheJobWhatToSearchFor() {
        System.out.println("input keywords about the job what to search for");
    }

    @Then("I can see various jobs related to the keywords entered")
    public void iCanSeeVariousJobsRelatedToTheKeywordsEntered() {
        System.out.println("can see various jobs related to the keywords entered");
    }

    @When("I go to search bar on dashboard")
    public void iGoToSearchBarOnDashboard() {
        System.out.println("go to search bar on dashboard");
    }
}

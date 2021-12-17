package au.com.carsguide.steps;

import au.com.carsguide.pages.CarSearchPage;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.ResultCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuySell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new  HomePage().selectCars();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String message)  {
        String actualMessage = new CarSearchPage().verifySearchPage();
        Assert.assertEquals(message,actualMessage);
       // A.assertEquals("You are not on Search Page", message, actualMessage);

    }




    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new CarSearchPage().selectMake(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)
    {
     new CarSearchPage().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)  {
        new CarSearchPage().selectLocation(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
        new CarSearchPage().selectPrice(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new CarSearchPage().clickOnFindMyNextCare();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String seeMake)  {
        new ResultCarSearchPage().verifyRelevantMakesInResult(seeMake);

    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new HomePage().selectUsedCar();
    }


}

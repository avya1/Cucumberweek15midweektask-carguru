package au.com.carsguide.steps;

import au.com.carsguide.pages.CarDealersPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FindDealers {
    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new HomePage().mouseHoverOnBuySellAndSelectFindADealer();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
      new CarDealersPage().setVerifyCarDealerPage();
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealers)  {
       new CarDealersPage().findDealersName(dealers);
    }
}

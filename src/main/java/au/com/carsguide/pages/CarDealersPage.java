package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CarDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='dealer-title']")
    WebElement verifyCarDealerPage;//exp=Find a Car Dealership Near You
    @CacheLookup
    @FindBy(xpath = "//a[@data-gtm-category='dealer search']")
    List<WebElement> dealersName;
    public void setVerifyCarDealerPage(){

    }
    public void findDealersName(String dealer){
      /*  for( ;dealersName.getText().equals(dealer);){
            Assert.assertEquals(dealer,dealersName.getText());
        }

       */
        for (WebElement element:dealersName
             ) {
            if(dealersName.contains(dealer)){
                System.out.println("right way");
            }

        }

    }
}

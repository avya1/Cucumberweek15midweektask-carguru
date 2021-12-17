package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class CarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarSearchPage.class.getName());

    public CarSearchPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css= "div[class='heading main-heading item-ad-wrapper '] h1")
    WebElement messageDisplay;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement make;
    @CacheLookup
    @FindBy(id="models")
    WebElement models;
    @CacheLookup
    @FindBy(id="locations")
    WebElement location;
    @CacheLookup
    @FindBy(id="priceTo")
    WebElement price;
    @CacheLookup
    @FindBy(id="search-submit")
    WebElement findMyNextCarTab;
    public String  verifySearchPage() {

        String text = getTextFromElement(messageDisplay);
        log.info("You are on Car Search Page"+ text);
        return text;

    }

    public void selectModel(String model){
        selectByVisibleTextFromDropDown(models,model);
    }
    public void selectMake(String make){
        selectByVisibleTextFromDropDown(this.make,make);
    }
    public void selectLocation(String location){
        selectByVisibleTextFromDropDown(this.location,location);
    }
    public void selectPrice(String amount){
        selectByVisibleTextFromDropDown(price,amount);

    }
    public  void clickOnFindMyNextCare()
    {
        clickOnElement(findMyNextCarTab);
    }


}

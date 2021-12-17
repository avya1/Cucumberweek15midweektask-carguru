package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ResultCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultCarSearchPage.class.getName());

    public ResultCarSearchPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement result;
    @CacheLookup
    @FindBy(xpath = "//span[text()='We did find these cars that almost match your criteria']")
    WebElement ifNoElementMatch;

    public void verifyRelevantMakesInResult(String make){
        String actual=result.getText();
        if(actual.contains(make)) {
            Assert.assertTrue(actual.contains(make), make);
        }else {
            String expected="We did find these cars that almost match your criteria";
            String actualMsg=ifNoElementMatch.getText();
            Assert.assertEquals(expected,actualMsg);
        }


    }

}

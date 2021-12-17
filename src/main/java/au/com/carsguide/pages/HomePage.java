package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'buy + sell')]")
    WebElement buySell;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Used') and @data-gtm-label='sub nav used cars search']")
    WebElement usedCar;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer' )]")
    WebElement findDealer;
    public void mouseHoverOnBuySellAndSelectFindADealer(){
        log.info("Mouse hover on : " + buySell.toString()+" And click on :"+findDealer.toString());
        mHoverAndClick(buySell,findDealer);

    }
    public void mouseHoverOnBuySell(){
        mouseHoverToElement(buySell);
    }
    public void selectCars(){
        mouseHoverToElementAndClick(searchCars);
    }
    public void selectUsedCar(){
        mouseHoverToElementAndClick(usedCar);
    }
    public void selectFindADealer(){
        mouseHoverToElementAndClick(findDealer);
    }



}

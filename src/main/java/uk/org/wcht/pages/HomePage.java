package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[@class='home-carousel__down-arrow js-to-content']")
    WebElement _downArrowButton;

    @FindBy(xpath = "//div[@class='grid-column']//h1")
    WebElement _betterHomesText;

    public void clickOnDownArrowButton() {
        Reporter.log(" Click on down arrow button " + _downArrowButton.toString() + "<br>");
        clickOnElement(_downArrowButton);
        log.info(" Click on down arrow button " + _downArrowButton.toString());
    }

    public void verifyBetterHomesText(String verifyText) {
        Reporter.log(" Verify text:" + verifyText + " is displayed " + _betterHomesText.toString() + "<br>");
        verifyTextAssertMethod(_betterHomesText, verifyText);
        log.info(" Verify text:" + verifyText + " is displayed " + _betterHomesText.toString());
    }

}

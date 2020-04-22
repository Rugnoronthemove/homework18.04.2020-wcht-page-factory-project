package uk.org.wcht.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class TestCase extends TestBase {

    HomePage homePage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
    }

    @Test(groups = {"Regression", "Smoke", "Sanity"})
    public void verifyScrollDownHomePageViaDownArrowButton() {
        //click on down arrow button
        homePage.clickOnDownArrowButton();
        //verify text on HomePage
        homePage.verifyBetterHomesText("Better homes, friendlier communities – together");
    }

}

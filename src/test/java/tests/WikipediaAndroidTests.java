package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.WikipediaSteps;


@DisplayName("Wikipedia Android Tests")
public class WikipediaAndroidTests extends BaseTest {

    @Test
    @DisplayName("Getting started test")
    void searchTest() {
        new WikipediaSteps()
                .checkFirstPage()
                .clickContinue()
                .checkSecondPage()
                .clickContinue()
                .checkThirdPage()
                .clickContinue()
                .checkFourthPage()
                .getStarted()
                .searchFieldShouldAppear();
    }
}
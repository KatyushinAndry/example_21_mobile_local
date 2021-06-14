package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.WikiSteps;


@DisplayName("Wikipedia Android Tests")
public class WikiTests extends BaseTest {

    @Test
    @DisplayName("Getting started test")
    void searchTest() {
        new WikiSteps()
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
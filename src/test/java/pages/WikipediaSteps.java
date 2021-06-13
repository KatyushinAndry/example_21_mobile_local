package pages;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.$;
import static pages.TestData.*;


public class WikipediaSteps {

    @Step("Click 'Continue'")
    public WikipediaSteps clickContinue() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikipediaSteps checkFirstPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(firstPageText));
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikipediaSteps checkSecondPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(secondPageText));
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikipediaSteps checkThirdPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(thirdPageText));
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikipediaSteps checkFourthPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(fourthPageText));
        return this;
    }

    @Step("Click 'Get started'")
    public WikipediaSteps getStarted() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        return this;
    }

    @Step("Field 'Search Wikipedia' should appear")
    public WikipediaSteps searchFieldShouldAppear() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).should(Condition.appear);
        return this;
    }
}
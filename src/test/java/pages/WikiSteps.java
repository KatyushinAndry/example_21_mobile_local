package pages;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.$;
import static testData.TestData.*;


public class WikiSteps {

    @Step("Click 'Continue'")
    public WikiSteps clickContinue() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikiSteps checkFirstPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(firstPageText));
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikiSteps checkSecondPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(secondPageText));
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikiSteps checkThirdPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(thirdPageText));
        return this;
    }
    @Step("Check 'First Page of Getting Started'")
    public WikiSteps checkFourthPage() {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(fourthPageText));
        return this;
    }

    @Step("Click 'Get started'")
    public WikiSteps getStarted() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        return this;
    }

    @Step("Field 'Search Wikipedia' should appear")
    public WikiSteps searchFieldShouldAppear() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).should(Condition.appear);
        return this;
    }
}
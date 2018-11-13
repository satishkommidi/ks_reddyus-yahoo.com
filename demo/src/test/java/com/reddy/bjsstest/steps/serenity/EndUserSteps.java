package com.reddy.bjsstest.steps.serenity;

import com.reddy.bjsstest.pages.AutomationPage;
import com.reddy.bjsstest.pages.DictionaryPage;

import com.reddy.bjsstest.pages.ProductDetailPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;
    AutomationPage automationPage;
    ProductDetailPage productPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        automationPage.clickOnFirstResult();
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }


    @Step
    public void is_on_automation_page() {
        automationPage.open();
    }

    @Step
    public void looks_for1(String term) {
        enters1(term);
        starts_search1();
    }
    @Step
    public void change_Size(String newSize) {
        productPage.changeTheSize(newSize);
    }
    @Step
    public void add_to_cart_continue_shopping() {
        productPage.readPriceAndAddToCart();
        productPage.continueShopping();
    }
    @Step
    public void enters1(String keyword) {
        automationPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search1() {
        automationPage.lookup_terms();
    }

    @Step
    public void should_see_definition1(String definition) {
        automationPage.clickOnFirstResult();
    }

    @Step
    public void add_to_cart_checkout_shopping() {
        productPage.readPriceAndAddToCart();
        productPage.proceedWithCheckout();

    }
}
package com.reddy.bjsstest.steps.serenity;

import com.reddy.bjsstest.pages.AutomationPage;

import com.reddy.bjsstest.pages.ProductDetailPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    AutomationPage automationPage;
    ProductDetailPage productPage;


    @Step
    public void should_see_definition(String definition) {
        automationPage.clickOnFirstResult();
    }

    @Step
    public void is_on_automation_page() {
        automationPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
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
    public void enters(String keyword) {
        automationPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
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

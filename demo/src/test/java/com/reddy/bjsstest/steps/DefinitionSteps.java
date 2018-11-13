package com.reddy.bjsstest.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.reddy.bjsstest.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps reddy;

   @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        reddy.is_the_home_page();
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        reddy.looks_for(word);
    }

    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        reddy.should_see_definition(definition);
    }

    // new steps
    @Given("the user is on the Automation home page")
    public void givenTheUserIsOnTheAutomationHomePage() {
        reddy.is_on_automation_page();
    }

    @When("the user looks up for dress key '(.*)'")
    public void whenTheUserLooksUpForTheKey(String word) {
        reddy.looks_for1(word);
    }


    @Then("they should see the product '(.*)'")
    public void thenTheyShouldSeeTheProduct(String definition) {
        reddy.should_see_definition1(definition);
    }

    @When("the user changes the size to '(.*)'")
    public void whenTheUserChagnesTheSize(String newSize) {
        reddy.change_Size(newSize);
    }

    @Then("the user adds product to cart remember order amount and continue shopping")
    public void thenTheUserAddsORderToCart() {
        reddy.add_to_cart_continue_shopping() ;

    }

    @Then("the user adds product to cart remember order amount and proceed to checkout")
    public void thenTheUserAddsORderToCartAndCheckout() {
        reddy.add_to_cart_checkout_shopping() ;

    }

}

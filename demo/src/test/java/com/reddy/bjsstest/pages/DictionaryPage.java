package com.reddy.bjsstest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://automationpractice.com/")
public class DictionaryPage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    @FindBy(css="div.product-image-container a.quick-view")
    private WebElementFacade firstSearchResult;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public void clickOnFirstSearchResult() {
      //  try {
       //     Thread.sleep(10000);
      //  }
       // catch(InterruptedException e) {e.printStackTrace();}

        firstSearchResult.click();
    }
}
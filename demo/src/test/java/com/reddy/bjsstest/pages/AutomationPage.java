package com.reddy.bjsstest.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.stubs.KeyboardStub;
import org.openqa.selenium.interactions.Keyboard;

@DefaultUrl("http://automationpractice.com/")
public class AutomationPage extends PageObject {

    @FindBy(id="search_query_top")
    private WebElementFacade searchInput;

    @FindBy(css="button.btn.btn-default.button-search")
    private WebElementFacade searchButton;

 //   @FindBy(css="a.quick-view")
    @FindBy(css="a.product_img_link")
    private WebElementFacade firstSearchResult;

    @FindBy(id= "group_1")
    private WebElementFacade fieLDSet;

    public void enter_keywords(String keyword) {

        searchInput.typeAndEnter(keyword);
    }

    public void lookup_terms() {
    	searchButton.click();
    }

    public void clickOnFirstResult() {
       firstSearchResult.click();  }

    public void changeTheSize(String newSize) {
      //     fieLDSet.click();
     //   getDriver().findElement(By.css("fieldset label:contains(\"Size\")")).click();
        fieLDSet.click();
       getDriver().findElement(
               By.xpath("//select[@id='group_1']/option[contains(@title,'"+newSize+"']")).click();

    }
}
package com.reddy.bjsstest.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.stubs.KeyboardStub;
import org.openqa.selenium.interactions.Keyboard;
import org.junit.Assert;

/**
 * Created by reddy on 11/11/2018.
 */
public class ProductDetailPage extends PageObject {
    @FindBy(id= "uniform-group_1")
    private WebElementFacade fieLDSet;

    @FindBy(css= "#group_1 option[title=\"M\"]")
    private WebElementFacade selectMediumSize;

    @FindBy(id= "our_price_display")
    private WebElementFacade readPrice;

    @FindBy(css= "p#add_to_cart > button")
    private WebElementFacade addToCartButton;

    @FindBy(css= "span.continue.btn")
    private WebElementFacade continueShoppingButton;

    @FindBy(css= "a.btn[title=\"Proceed to checkout\"]")
    private WebElementFacade proceedCheckoutButton;

    @FindBy(css= "span.ajax_cart_quantity")
    private WebElementFacade totalItemsInTheCart;

    @FindBy(css= "span.ajax_block_products_total")
    private WebElementFacade totalItemsCost;

    @FindBy(css= "span.ajax_cart_shipping_cost")
    private WebElementFacade totalShippingCost;

    @FindBy(css= "span.ajax_block_cart_total")
    private WebElementFacade totalBillingAmount;

    public void changeTheSize(String newSize) {
        //     fieLDSet.click();
        //   getDriver().findElement(By.css("fieldset label:contains(\"Size\")")).click();
   //     fieLDSet.click();
        selectMediumSize.click();

    }
    public void readPriceAndAddToCart() {
        String price = readPrice.getText();
        System.out.println("Price Read::" + price);
        addToCartButton.click();
    }
    public void continueShopping() {
//    continueShoppingButton.waitUntilClickable();
    continueShoppingButton.click();
    }

    public void proceedWithCheckout() {
        String strTotalItemsCost = totalItemsCost.getText();
//        totalShippingCost.waitUntilVisible();
//        String strTotalShippingCost = totalShippingCost.getText();
        String strTotalBillingAmount = totalBillingAmount.getText();
        System.out.println("strTotalItemsCost:" + strTotalItemsCost + "strTotalShippingCost+ strTotalShippingCost"  + "strTotalBillingAmount" + strTotalBillingAmount);
        proceedCheckoutButton.click();
    }

    public void validateItemCount(String count) {
        String totalItems = totalItemsInTheCart.getText();
        Assert.assertEquals(count,totalItems,"Asserting totalItemsCount");
     }
    public void validateItemCost(String itemsCost) {
        String strTotalItemsCost = totalItemsCost.getText();
        Assert.assertEquals(itemsCost,totalItemsCost,"Asserting totalItemsCost");
    }
    public void validateShippingCost(String shippingCost) {
        String strTotalShippingCost = totalShippingCost.getText();
        Assert.assertEquals(strTotalShippingCost,shippingCost,"Asserting shippingCost");
    }
    public void validateBillingAmount(String billingCost) {
        String strTotalBillingAmount = totalBillingAmount.getText();
        Assert.assertEquals(strTotalBillingAmount,billingCost,"Asserting billingCost");
    }
}

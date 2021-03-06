package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import java.util.List;
import java.util.Random;

public class StoreCategoryPage extends StorePageBase {

    public final String TITTLE_BLOCK_CSS_SELECTOR ="#layered_block_left > p";
    public final String PRODUCT_BLOCK_CSS_SELECTOR="#center_column > ul > li> div > div.right-block > h5 > a";

    public final List<WebElement> products = getWebElements(By.cssSelector(PRODUCT_BLOCK_CSS_SELECTOR));

    public StoreCategoryPage(RemoteWebDriver driver){
        super(driver);
        this.url ="";
    }

    public void verifyPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(TITTLE_BLOCK_CSS_SELECTOR)), "no se pudo encontrar la pagina");
    }

    public void clickProduct(){
        Random productSelected = new Random();
        clickElement(products.get(productSelected.nextInt(products.size())));
    }

}

package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StorePageBase extends PageBaseWeb {

    public StorePageBase(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "http://www.automationpractice.com/";
    }


}
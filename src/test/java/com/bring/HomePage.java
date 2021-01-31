package com.bring;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends base{
    MobileElement buttonAddContact = (MobileElement) driver.findElementById("com.android.contacts:id/add_contact_button");

    public void clickAddContact(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(buttonAddContact));
        buttonAddContact.click();
    }
}

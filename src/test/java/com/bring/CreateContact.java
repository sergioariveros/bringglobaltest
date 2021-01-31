package com.bring;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CreateContact extends base{

    MobileElement iconPhoto = (MobileElement) driver.findElementById("com.android.contacts:id/photo_icon");
    MobileElement txtFirstName = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.android.contacts:id/editors']/android.widget.EditText[1]");
    MobileElement txtLastName = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.android.contacts:id/editors']/android.widget.EditText[2]");
    MobileElement txtPhoneNumber = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.android.contacts:id/editors']/android.widget.EditText");
    MobileElement cmbChangeTo1 = (MobileElement) driver.findElementByXPath("(//android.widget.Spinner[@content-desc=\"Phone\"])[1]");
    MobileElement txtMobileNumber = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.android.contacts:id/editors']/android.widget.EditText");
    //MobileElement cmbChangeTo2 = (MobileElement) driver.findElementByXPath("(//android.widget.Spinner[@content-desc=\"Phone\"])[2]");
    MobileElement txtEmail = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.android.contacts:id/editors']/android.widget.EditText");
    MobileElement cmbChangeTo3 = (MobileElement) driver.findElementByXPath("(//android.widget.Spinner[@content-desc=\"Email\"])[1]");
    MobileElement buttonSave = (MobileElement) driver.findElementById("com.android.contacts:id/editor_menu_save_button");
    MobileElement buttonEdit = (MobileElement) driver.findElementByAccessibilityId("Edit");



    public void clickEditContact(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(buttonEdit));
        buttonEdit.click();
    }

    public void clickPhotoIcon(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(iconPhoto));
        iconPhoto.click();
    }

    public void chooseImportPhoto(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        MobileElement frameImportPhoto = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Choose photo']");
        wait.until(ExpectedConditions.visibilityOf(frameImportPhoto));
        frameImportPhoto.click();
    }

    public void selectImage(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        MobileElement imgFirst = (MobileElement) driver.findElementByXPath("com.google.android.apps.photos:id/image");
        wait.until(ExpectedConditions.visibilityOf(imgFirst));
        imgFirst.click();
        MobileElement photo = (MobileElement) driver.findElementByAccessibilityId("Photo taken on Jan 30, 2021 7:49:32 PM");
        photo.click();
        MobileElement buttonConfirmPhoto = (MobileElement) driver.findElementById("com.google.android.apps.photos:id/cpe_save_button");
        buttonConfirmPhoto.click();
    }

    public void addPhoto(){
        clickPhotoIcon();
        chooseImportPhoto();
        selectImage();
    }

    public void populateData(String FirstName, String LastName, String MobileNumber, String ChangeTo1, String PhoneNumber, String ChangeTo2, String email, String ChangeTo3){
        txtFirstName.clear();
        txtFirstName.sendKeys(FirstName);
        txtLastName.clear();
        txtLastName.sendKeys(LastName);
        txtMobileNumber.clear();
        txtMobileNumber.sendKeys(MobileNumber);
        Select dropdown = new Select(cmbChangeTo1);
        dropdown.selectByVisibleText(ChangeTo1);
        txtPhoneNumber.clear();
        txtPhoneNumber.sendKeys(PhoneNumber);
        // Select dropdown2 = new Select(cmbChangeTo2);
        // dropdown2.selectByVisibleText(ChangeTo2);
        txtEmail.clear();
        txtEmail.sendKeys(email);
        Select dropdown3 = new Select(cmbChangeTo3);
        dropdown3.selectByVisibleText(ChangeTo3);
        buttonSave.click();
    }

    public void populateEditData(String FirstName){
        txtFirstName.clear();
        txtFirstName.sendKeys(FirstName);
        buttonSave.click();
    }

    public String getFirstName(){
        return txtFirstName.getText();
    }

    public boolean isFormVisible(){
        return txtFirstName.isDisplayed();
    }

    public boolean isEditButtonVisible(){
        return buttonEdit.isDisplayed();
    }
}

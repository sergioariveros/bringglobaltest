package com.steps;

import com.bring.HomePage;
import com.bring.base;
import com.bring.CreateContact;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CreateUpdateSteps {


    @Given("^I enter to the application$")
    public void i_enter_to_the_application() {
        base baseAppium = new base();
        try {
            baseAppium.init();
        } catch (Exception e) {
            System.out.println("Error connecting to Appium Service. Error :" + e.getMessage());
        }
    }

   @When("^I click in add new contact$")
    public void i_click_in_add_new_contact() throws Throwable {
       HomePage homePageInstance = new HomePage();
       homePageInstance.clickAddContact();
    }

    @When("^I click in edit contact$")
    public void i_click_in_edit_contact() throws Throwable {
        CreateContact createPageInstance = new CreateContact();
        createPageInstance.clickEditContact();
    }

    @When("^I add the photo$")
    public void i_click_in_icon_photo() throws Throwable {
        CreateContact createPageInstance = new CreateContact();
        createPageInstance.addPhoto();
    }

    @When("^I enter the information required to create a contact$")
    public void i_enter_the_information_required_to_create_a_contact(DataTable table) {
        CreateContact createPageInstance = new CreateContact();
        List<List<String>> data = table.raw();
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        createPageInstance.populateData(data.get(0).toString(),data.get(1).toString(),data.get(2).toString(),data.get(3).toString(),data.get(4).toString(),data.get(5).toString(),data.get(6).toString() ,data.get(7).toString());
    }

    @When("^I enter all the information required to edit contact$")
    public void i_enter_all_the_information_required_to_edit_contact(DataTable table) {
        CreateContact createPageInstance = new CreateContact();
        List<List<String>> data = table.raw();
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        createPageInstance.populateEditData(data.get(0).toString());
    }
    @Then("^I see form to create a contact$")
    public void i_see_form_to_create_a_contact() {
        CreateContact createPageInstance = new CreateContact();
        Assert.assertTrue(createPageInstance.isFormVisible());
    }

    @Then("^I validate the contact is created$")
    public void i_validate_the_contact_is_created() {
        CreateContact createPageInstance = new CreateContact();
        Assert.assertTrue(createPageInstance.isEditButtonVisible());
    }

    @Then("^I validate the contact is updated$")
    public void i_validate_the_contact_is_updated() {
        CreateContact createPageInstance = new CreateContact();
        Assert.assertEquals(createPageInstance.getFirstName(), "Bring Global");
    }

    @After
    public void close() {
        base baseAppium = new base();
        baseAppium.tearDown();
    }
}

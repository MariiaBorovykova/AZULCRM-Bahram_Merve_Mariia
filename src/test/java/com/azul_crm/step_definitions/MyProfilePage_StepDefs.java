package com.azul_crm.step_definitions;

import com.azul_crm.pages.MyProfilePage;
import com.azul_crm.utilities.BrowserUtils;
import com.azul_crm.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyProfilePage_StepDefs extends MyProfilePage {


    @Then("user click on {string} button")
    public void user_click_on_button(String option) {
        for (WebElement eachWebElement : optionsUnderProfileNameListOfWebEl) {
            try {
                if (eachWebElement.getText().contains(option)) {
                    BrowserUtils.waitForClickablility(eachWebElement,20);
                    eachWebElement.click();
                }
            }
            catch (StaleElementReferenceException e) {
            // Element reference became stale, retry locating the element
            System.out.println("StaleElementReferenceException occurred, retrying...");
        }

        }

    }


    @Then("user should land on the My Profile page")
    public void user_should_land_on_the_my_profile_page() {

        BrowserUtils.verifyURLContains("/company/personal/user/");

    }

    @Then("user should see following options on My Profile page")
    public void user_should_see_following_options_on_my_profile_page(List<String> expectedMenuOptions) {
       List<String> actualMenuOptions = BrowserUtils.getElementsText(profileMenuOptionsListWebElem);
        System.out.println("expectedMenuOptions = " + expectedMenuOptions);
        System.out.println("actualMenuOptions = " + actualMenuOptions);
        Assert.assertEquals(expectedMenuOptions, actualMenuOptions);
    }

    @Then("user should see relevant {string} under the General tab")
    public void user_should_see_relevant_under_the_general_tab(String userName) {
        String expectedUserName = ConfigurationReader.getProperty(userName);
        String actualUserName = contactInformationUserName.getText();
        if (userName.equalsIgnoreCase("Helpdesk user")) {
            expectedUserName = ConfigurationReader.getProperty("helpdesk_username");

        } else if (userName.equalsIgnoreCase("Marketing user")) {
            expectedUserName = ConfigurationReader.getProperty("marketing_username");

        } else if (userName.equalsIgnoreCase("HR user")) {
            expectedUserName = ConfigurationReader.getProperty("hr_username");

        }
        System.out.println("expectedUserName = " + expectedUserName);
        System.out.println("actualUserName = " + actualUserName);
        Assert.assertEquals(expectedUserName, actualUserName);
    }

}

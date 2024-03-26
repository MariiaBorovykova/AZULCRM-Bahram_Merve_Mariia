package com.azul_crm.step_definitions;

import com.azul_crm.pages.PollModulePage;
import com.azul_crm.utilities.BrowserUtils;
import com.azul_crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class UploadToAppreciation_StepDefs extends PollModulePage {

    @Then("user click on {string}")
    public void user_click_on(String titleAttribute) {
        BrowserUtils.waitFor(2);
        getWebElementUsingTitleAttribute(titleAttribute).click();
    }


    @Then("user upload the {string}")
    public void user_upload_the(String fileName) {
        uploadFile(fileName);

    }


    @Then("user can see created post with {string} name")
    public void user_can_see_created_post_with_file_name(String expectedFileName) {
        if(expectedFileName.contains(".docx") || expectedFileName.contains(".pdf") || expectedFileName.contains(".txt")) {
            BrowserUtils.waitFor(2);
            String fileName = lastCreatedPostWithFile.getText();
            String firstPartOfFileName = fileName.substring(0, 5);
            Assert.assertTrue(expectedFileName.contains(firstPartOfFileName));
        } else {
            BrowserUtils.waitFor(2);
            Assert.assertTrue(lastCreatedPostWithPicture.getAttribute("alt").contains(expectedFileName.substring(expectedFileName.length()-4)));
        }
    }




    @Then("user click on Insert in text button")
    public void user_click_on_insert_in_text_button() {
        BrowserUtils.clickWithTimeOut(insertInText,1);
    }



    @Then("user click on Delete from text button")
    public void user_click_on_delete_from_text_button() {
        BrowserUtils.clickWithTimeOut(removeFromText, 1);
    }
}

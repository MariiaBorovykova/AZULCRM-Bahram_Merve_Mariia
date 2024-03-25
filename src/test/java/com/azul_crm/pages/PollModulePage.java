package com.azul_crm.pages;

import com.azul_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollModulePage extends BasePage{

    public PollModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "bx-editor-iframe")
    public WebElement pollIframe;

    @FindBy(tagName = "body")
    public WebElement textFieldIframe;

    @FindBy(xpath = "//span[@id='feed-add-post-destination-item']/span")
    public List<WebElement> deliveryBox;
    @FindBy(css = ".feed-add-post-del-but")
    public List<WebElement> closeAllDeliveryButton;
    @FindBy(xpath = "(//div[@id='post-buttons-bottom'])[1]/span")
    public List<WebElement> postButtonsBottom;

    @FindBy(css = "#question_0")
    public WebElement questionBox;
    @FindBy(css = "#answer_0__0_")
    public WebElement answer1Box;
    @FindBy(css = "#answer_0__1_")
    public WebElement answer2Box;
    @FindBy(id = "multi_0")
    public WebElement multipleChoiceCheckbox;
    @FindBy(css = ".vote-new-question-link.addq")
    public WebElement addQuestionLink;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;
    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;
    @FindBy(css = ".feed-add-error")
    public WebElement errorMessage;
    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesButton;
    @FindBy(xpath = "//span[@title='Click to insert file']")
    public WebElement clickToInsertFileLink;

    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInText;
    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeFromText;


    public  WebElement getWebElementUsingTitleAttribute(String titleAttribute){

        for (WebElement eachWebEl : postButtonsBottom) {
            if (eachWebEl.getAttribute("title").equals(titleAttribute)){
                return eachWebEl;
            }
        }

         return null;
    }

    public void uploadFile(String fileName) {
        String fileSeparator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + fileSeparator + "src/test/resources/files" + fileSeparator + fileName;
        uploadFilesAndImagesButton.sendKeys(path);

    }


}

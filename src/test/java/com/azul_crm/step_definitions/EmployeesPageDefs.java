package com.azul_crm.step_definitions;

import com.azul_crm.pages.CompanyStructurePage;
import com.azul_crm.utilities.BrowserUtils;
import com.azul_crm.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesPageDefs {
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    @Then("the user views the following modules in the Employees page")
    public void the_user_views_the_following_modules_in_the_employees_page(List<String> expectedmodules) {



        List<WebElement> elementList = Driver.getDriver().findElements(By.xpath("//span[@class='main-buttons-item-text-title']"));
        List<String> elementsString = BrowserUtils.getElementsText(elementList);
       Assert.assertEquals(elementsString,expectedmodules);
        System.out.println(expectedmodules);
        System.out.println(elementsString);




    }
}

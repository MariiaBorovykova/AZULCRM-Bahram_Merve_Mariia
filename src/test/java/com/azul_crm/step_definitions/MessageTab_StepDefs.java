package com.azul_crm.step_definitions;

import com.azul_crm.pages.PollModulePage;
import io.cucumber.java.en.Then;

public class MessageTab_StepDefs extends PollModulePage {


    @Then("user click Message tab")
    public void user_click_message_tab() {
        messageModule.click();
    }
}

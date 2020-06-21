package com.softwaretest.automation.lizhen.steps.stepdef;

import com.softwaretest.automation.lizhen.steps.steplib.SearchSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class SearchStepDef {

    @Steps
    SearchSteps searchSteps;


    @Given("^user go to bai du page$")
    public void userGoToBaiDuPage() {

        System.out.println("sssss");
        searchSteps.enterSearchPage();

    }

    @And("^user input (.*)$")
    public void userInputKeyword(String keyword) {
        System.out.println(keyword);
    }
}

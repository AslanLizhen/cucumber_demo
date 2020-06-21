package com.softwaretest.automation.lizhen.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {

    public void enterSearchPage() {
        getDriver().navigate().to("https://www.baidu.com/");
        getDriver().findElement(By.xpath("//input[@id='kw']"));

    }




}

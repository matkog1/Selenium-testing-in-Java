package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage  extends FormsPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    private By checkBox = By.id("hobbies-checkbox-1");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void selectCheckBox(){
        scrollToElementJS(checkBox);
        clickJS(checkBox);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        clickJS(submitButton);
    }

    public boolean isCheckboxSelected(){
        return find(checkBox).isSelected();
    }

    public void FillPracticeForm(){
        WebElement firstName = find(By.id("firstName"));
        WebElement lastName = find(By.id("lastName"));
        WebElement phoneNumber = find(By.id("userNumber"));

        firstName.sendKeys("TestName");
        lastName.sendKeys("TestName");
        phoneNumber.sendKeys("0999999999");
    }
}

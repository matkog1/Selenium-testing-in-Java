package part3_4.com.demoqa.test.part3.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FillPracticeFormTest extends BaseTest {

    @Test
    public void FillPracticeForm(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        formsPage.selectCheckBox();
        formsPage.FillPracticeForm();
        formsPage.clickSubmitButton();
    }
}

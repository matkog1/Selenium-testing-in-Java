package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckBox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.selectCheckBox();

        boolean isCheckBoxSelected = formsPage.isCheckboxSelected();
        Assert.assertTrue(isCheckBoxSelected,"Checkbox not selected");
    }
}

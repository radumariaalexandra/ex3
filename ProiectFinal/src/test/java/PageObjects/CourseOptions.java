package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptions {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[1]/label")
    private WebElement submitItem1;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement submitButtonNext;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsText;


    public CourseOptions(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setSubmitItem1(){submitItem1.click();}

    public void setSubmitButtonNext(){submitButtonNext.click();}
    public String courseOptionText(){return courseOptionsText.getText();}

}

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Success {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement succesText;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement returnToHomePage;

    public Success(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public String succesText(){return succesText.getText();}
    public void setReturnToHomePage(){returnToHomePage.click();}
}

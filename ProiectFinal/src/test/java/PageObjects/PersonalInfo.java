package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement inputFirstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement inputLastName;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement inputUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement inputConfirmPassword;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement elementSubmitButtonNext;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInfoText;

    public PersonalInfo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputFirstName(String string){
        inputFirstName.sendKeys(string);
    }
    public void inputLastName(String string){inputLastName.sendKeys(string);}
    public void inputUsername(String string){inputUsername.sendKeys(string);}
    public void inputPassword(String string){inputPassword.sendKeys(string);}
    public void inputConfirmPassword(String string){inputConfirmPassword.sendKeys(string);}
    public WebElement clickNextButtonWithAllFieldsImputed(){elementSubmitButtonNext.click();
        return null;
    }
    public void fillInPersonalInfoWithValidData(){
        inputFirstName("Alexandra");
        inputLastName("Radu");
        inputUsername("alexandraradu");
        inputPassword("rma01061985");
        inputConfirmPassword("rma01061985");
        clickNextButtonWithAllFieldsImputed();

    }
    public String personalInfoText(){return personalInfoText.getText();}




}

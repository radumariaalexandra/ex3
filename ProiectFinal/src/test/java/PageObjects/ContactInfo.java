package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfo {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement inputPhone;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement inputCountry;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement inputCity;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement inputPostCode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement ContactInfo;


    public ContactInfo(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void inputEmail(String string){ inputEmail.sendKeys(string);}
    public void inputPhone(String string){ inputPhone.sendKeys(string);}
    public void inputCountry(String string){inputCountry.sendKeys(string);}
    public void inputCity(String string){inputCity.sendKeys(string);}
    public void inputPostCode(String string){inputPostCode.sendKeys(string);}
    public void setClickNextButton(){clickNextButton.click();}

    public void fillInContactInfoValidData(){
        inputEmail ("testarerma@gmail.ro");
        inputPhone("0765130000");
        inputCountry("RO");
        inputCity("BRASOV");
        inputPostCode("51400");
        setClickNextButton();
    }
    public String getContactInfo(){
        return ContactInfo.getText();
    }

}

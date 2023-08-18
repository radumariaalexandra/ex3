package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInfo {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement inputCardHolderName;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement inputCardNumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement inputCVC;

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement inputMonth;
    @FindBy(xpath = "//*[@id=\"month\"]/option[7]")
    private WebElement selectMonth;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement inputYear;
    @FindBy(xpath = "//*[@id=\"year\"]/option[3]")
    private WebElement selectYear;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement submittNext;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement Success;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInfoText;


    public PaymentInfo(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setInputCardHolderName(String string){inputCardHolderName.sendKeys(string);}
    public void setInputCardNumber(String string){inputCardNumber.sendKeys(string);}
    public void setInputCVC(String string){inputCVC.sendKeys(string);}
    public void setInputMonth(){inputMonth.click();}
    public void setSelectMonth(){selectMonth.click();}
    public void setInputYear(){inputYear.click();}
    public void setSelectYear(){selectYear.click();}
    public void setSubmittNext(){submittNext.click();}
    public void setSuccess(String string){Success.sendKeys(string);}
    public String paymentInfoText(){return paymentInfoText.getText();}
    public void fillInPaymentInfo(){
    setInputCardHolderName("Maria");
    setInputCardNumber("4585");
    setInputCVC("252");
    setSelectMonth();
    setSelectYear();
    setSubmittNext();
    }
}


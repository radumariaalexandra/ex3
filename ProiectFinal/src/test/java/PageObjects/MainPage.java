package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement elementSumitButtonStartTheEnrollment;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement elementSubmitButtonQuestions;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement elementSubmitButtonReadMore;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement elementSubmitButtonVirtualReadMore;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/p")
    private WebElement virtualHeader;
    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement frequentlyAskQuestions;
    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement softwareTestingCourse;


    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void inputValueInEmailField(String string){
        inputEmailField.sendKeys(string);
    }
    public void clickOnSubmitButton(){
        elementSubmitButton.click();
    }
    public void clickOnElementClickButtonStartTheEnrollment(){
        elementSumitButtonStartTheEnrollment.click();
    }
    public void clickOnElementButtonQuestions(){
        elementSubmitButtonQuestions.click();
    }
    public void clickOnElementButtonReadMore(){
        elementSubmitButtonReadMore.click();
    }
    public WebElement getVirtualHeader(){
        return virtualHeader;
    }
    public void clickOnVirtualReadMoreButton(){
        elementSubmitButtonVirtualReadMore.click();
    }
    public String getFrequentlyAskQuestionsText(){return frequentlyAskQuestions.getText();}
    public String setSoftwareTestingCourse(){return softwareTestingCourse.getText();}
}

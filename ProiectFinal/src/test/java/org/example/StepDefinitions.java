package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {

    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;
    PersonalInfo personalInfo;
    ContactInfo contactInfo;
    CourseOptions courseOptions;
    PaymentInfo paymentInfo;
    Success success;

    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        personalInfo = new PersonalInfo(driver);
        contactInfo = new ContactInfo(driver);
        courseOptions = new CourseOptions(driver);
        paymentInfo = new PaymentInfo(driver);
        success = new Success(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///D:/QA%20Software%20Tester/Testing-Env-master/index.html");
    }

    @When("the email value of {string} is inputted")
    public void input_email_to_field(String string){
        mainPage.inputValueInEmailField(string);

    }
    @When("the submit button is clicked")
    public void click_submit_button(){
        mainPage.clickOnSubmitButton();
    }

    @When("the enrollment button is clicked")
    public void click_enrollment(){
        mainPage.clickOnElementClickButtonStartTheEnrollment();

    }
    @When("the question button is clicked")
    public void click_questions(){
        mainPage.clickOnElementButtonQuestions();
    }
    @When("the Virtual Read More button is clicked")
    public void click_virtual_read_more(){
        mainPage.clickOnVirtualReadMoreButton();
    }

    @When("the read more Learn Selenium is clicked")
    public void click_read_more(){
        mainPage.clickOnElementButtonReadMore();
    }

    // clasa PersonalInfo

    @Given("I am on Personal Info page")
    public void i_am_on_personal_info_page(){
        driver.get("file:///D:/QA%20Software%20Tester/Testing-Env-master/routes/enrollment.html");
    }
    @When("the First Name {string} is filed")
    public void input_first_name(String string){
        personalInfo.inputFirstName(string);
    }
    @When("the Last Name {string} is filed")
    public void input_last_name(String string){
        personalInfo.inputLastName(string);
    }
    @When("the Username {string} is filed")
    public void input_username(String string){
        personalInfo.inputUsername(string);
    }
    @When("the Password {string} is filed")
    public void input_password(String string){
        personalInfo.inputPassword(string);
    }
    @When("the Confirm Password {string} is filed")
    public void input_confirm_password(String string){
        personalInfo.inputConfirmPassword(string);
    }
    @When("click next button")
    public void click_next_button(){
        personalInfo.clickNextButtonWithAllFieldsImputed();
    }

    //clasa contact info

    @Given("I am on Contact Info page")
    public void i_am_on_contact_info_page(){
        driver.get("file:///D:/QA%20Software%20Tester/Testing-Env-master/routes/enrollment.html");
        personalInfo.fillInPersonalInfoWithValidData();
    }
    @When("the Email {string} is filled")
    public void input_email(String string) {
        contactInfo.inputEmail(string);
    }

    @When("the Phone {string} is filled")
    public void input_phone(String string){
        contactInfo.inputPhone(string);
    }

    @When("the Country {string} is filled")
    public void input_country(String string){
        contactInfo.inputCountry(string);
    }
    @When("the City {string} is filled")
    public void input_city(String string){
        contactInfo.inputCity(string);
    }
    @When("the Post Code {string} is filled")
    public void input_post_code(String string){
        contactInfo.inputPostCode(string);
    }
    @When("All Contact Info data are filled")
    public void input_all_contact_info_data_are_filled(){
        contactInfo.fillInContactInfoValidData();
    }
    @When("I click Next Button")
    public void input_next_button(){
        contactInfo.setClickNextButton();
    }

    //course options

    @Given("I am o Course Options page")
    public void i_am_on_course_options_page(){
        driver.get("file:///D:/QA%20Software%20Tester/Testing-Env-master/routes/enrollment.html");
        personalInfo.fillInPersonalInfoWithValidData();
        contactInfo.fillInContactInfoValidData();
    }
    @When("I select Item 1")
    public void input_select_item1(){courseOptions.setSubmitItem1();}
    @When("I click the next button, without selecting any item from the options")
    public void iClickTheNextButtonWithoutSelectingAnyItemFromTheOptions() {
        courseOptions.setSubmitButtonNext();
    }

    @When("I click Next buton")
    public void input_click_next_button(){courseOptions.setSubmitButtonNext();}

    //payment info
    @Given("I am on Payment Info")
    public void i_am_on_payment_info_page(){
        driver.get("file:///D:/QA%20Software%20Tester/Testing-Env-master/routes/enrollment.html");
        personalInfo.fillInPersonalInfoWithValidData();
        contactInfo.fillInContactInfoValidData();
        courseOptions.setSubmitButtonNext();}

    @When("I fill Card holder name {string}")
    public void i_fill_card_holder_name(String string){paymentInfo.setInputCardHolderName(string);}
    @When("I fill Card Number {string}")
    public void i_fill_card_number(String string){paymentInfo.setInputCardNumber(string);}
    @When("I fill CVC {string}")
    public void i_fill_cvc(String string){paymentInfo.setInputCVC(string);}
    @When("I click month")
    public void i_click_month(){paymentInfo.setInputMonth();}
    @When("I select month from list")
    public void i_select_month_from_list(){paymentInfo.setSelectMonth();}

    @When("I click year")
    public void i_click_year(){paymentInfo.setInputYear();}
    @When("I select year from list")
    public void i_select_year_from_list(){paymentInfo.setSelectYear();}
    @When("I click Next")
    public void i_click_next(){paymentInfo.setSubmittNext();}


    @Then("a pop-up for newsletter appears")
    public void aPopUpForNewsletterAppears() {driver.switchTo().alert().accept();
    }

    @Then("no pop-up for newsletter appears")
    public void noPopUpForNewsletterAppears() {driver.switchTo().alert().accept();
    }
    @Then("the {string} page is open")
    public void thePageIsOpen(String string) {Assertions.assertEquals(string, driver.getTitle());
    }
    @Then("scroll to {string}")
    public void scrollTo(String string) {Assertions.assertEquals(string, mainPage.getFrequentlyAskQuestionsText());
    }

    @Then("the {string} page opens")
    public void thePageOpens(String string) {Assertions.assertEquals(string, driver.getTitle());
    }

    @Then("the contact information page is open")
    public void theContactInformationPageIsOpen() {
        Assertions.assertEquals("Contact information", contactInfo.getContactInfo());
    }

    @Then("the course options page is open")
    public void theCourseOptionsPageIsOpen() {Assertions.assertEquals("Course Option",courseOptions.courseOptionText());
    }

    @Then("the payment information page is open")
    public void thePaymentInformationPageIsOpen() {Assertions.assertEquals("Payment Information", paymentInfo.paymentInfoText());
    }

    @Then("the succes page is open")
    public void theSuccesPageIsOpen() {Assertions.assertEquals("Success",success.succesText());
    }

    @Then("I remain on personal Info page")
    public void iRemainOnPersonalInfoPage() {Assertions.assertEquals("Personal Info",personalInfo.personalInfoText());
    }


    @Then("the payment information page is not open")
    public void thePaymentInformationPageIsNotOpen() {Assertions.assertEquals("Course optiuns",courseOptions.courseOptionText());
    }

    @Then("the succes page is not open")
    public void theSuccesPageIsNotOpen() {Assertions.assertEquals("Payment Info",paymentInfo.paymentInfoText());
    }
    @Given("I am on Success page")
    public void i_am_on_succes_page(){
        driver.get("file:///D:/QA%20Software%20Tester/Testing-Env-master/routes/enrollment.html");
        personalInfo.fillInPersonalInfoWithValidData();
        contactInfo.fillInContactInfoValidData();
        courseOptions.setSubmitButtonNext();
        paymentInfo.fillInPaymentInfo();
    }

    @When("I click Return to home")
    public void iClickReturnToHome() {success.setReturnToHomePage();
    }

    @Then("the main page open")
    public void theMainPageOpen() {Assertions.assertEquals("Software Testing Course",driver.getTitle());
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}

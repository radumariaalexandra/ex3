Feature: An example

  Scenario: Valid email US
    Given I am on the main page
    When the email value of "tester@test.com" is inputted
    And the submit button is clicked
    Then a pop-up for newsletter appears

 Scenario:Valid email RO
   Given I am on the main page
   When the email value of "tester@test.ro" is inputted
   And the submit button is clicked
   Then a pop-up for newsletter appears

  Scenario: Negativ over character limit
    Given I am on the main page
    When the email value of "AAAaaaaaaaa" is inputted
    And the submit button is clicked
    Then no pop-up for newsletter appears

  Scenario: Working button Enrollment
    Given I am on the main page
    When the enrollment button is clicked
    Then the "Software Testing | Enrollment" page is open

  Scenario: Working button Questions
    Given I am on the main page
    When the question button is clicked
    Then scroll to "Frequently Asked Questions"

  Scenario: Working button Read More Learn Selenium
    Given I am on the main page
    When the read more Learn Selenium is clicked
    Then the "Learn Selenium" page opens

   Scenario:Working button Virtual Read More
     Given I am on the main page
     When the Virtual Read More button is clicked
     Then the "Virtual" page opens


    Scenario: input all fields on Personal Info
      Given I am on Personal Info page
      And the First Name "Maria" is filed
      And the Last Name "Radu" is filed
      And the Username "mariaqatest" is filed
      And the Password "testqa243" is filed
      And the Confirm Password "testqa243" is filed
      And click next button
      Then the contact information page is open

     Scenario: input invalid data on Personal Info
       Given I am on Personal Info page
       And the First Name "105468" is filed
       * the Last Name "5478" is filed
       * the Username "test2023" is filed
       * the Password "testare2023" is filed
       * the Confirm Password "test" is filed
       * click next button
       Then I remain on personal Info page


    Scenario: all fields  filled on Contact Info
      Given I am on Contact Info page
      And All Contact Info data are filled
      And I click Next Button
      Then the course options page is open

    Scenario: Select Item1
      Given I am o Course Options page
      And I select Item 1
      And I click Next Button
      Then the payment information page is open

  Scenario: Without Selecting any Item
    Given I am o Course Options page
    And I click the next button, without selecting any item from the options
    Then the payment information page is not open


    Scenario: Filling all fields on Payment Info
      Given I am on Payment Info
      And I fill Card holder name "ALLLE"
      And I fill Card Number "1254"
      And I fill CVC "552"
      And I click month
      And I select month from list
      And I click year
      And I select year from list
      And I click Next
      Then the succes page is open

  Scenario:Empty fields on Payment Info
    Given I am on Payment Info
    And I fill Card holder name ""
    And I fill Card Number ""
    And I fill CVC ""
    And I click month
    And I select month from list
    And I click year
    And I select year from list
    And I click Next
    Then the succes page is not open

   Scenario: Valid return home button
     Given I am on Success page
     And I click Return to home
     Then the main page open






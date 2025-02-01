Feature: Student Registration Page Test Cases
  This is Student Registration Page related test cases

  @reg @form_valid_data
  Scenario: Valid form submission with all correct inputs - 001
    Given Load UI
    Then Enter the First name as Indika
    Then Enter the Last name as senarathna
    Then Enter the Email as indika@gmail.com
    Then Select Gender as Male
    Then Enter Mobile number as 0777656566
    Then Select Date of Birth as 1 Jan 2000
    Then Select Subject as English
    Then Select Hobby as Sports
    Then Upload a Picture as C:\Users\indik\OneDrive\Documents\DemoQA\images\user.jpg
    Then Enter the Current Address as colombo,sri lanka
    Then Select State as Uttar Pradesh
    Then Select City as Agra
    Then Click the submit button
    And Verify the success message as Thanks for submitting the form

  @reg @form_without_mandatory_fields
  Scenario: Form submission with mandatory fields left blank - 002
    Given Load UI
    Then Enter the Email as indika@gmail.com
    Then Select Date of Birth as 1 Jan 2000
    Then Select Subject as English
    Then Select Hobby as Sports
    Then Upload a Picture as C:\Users\indik\OneDrive\Documents\DemoQA\images\user.jpg
    Then Enter the Current Address as colombo,sri lanka
    Then Select State as Uttar Pradesh
    Then Select City as Agra
    Then Click the submit button
    And Verify the success message as Thanks for submitting the form

  @reg @form_invalid_email
  Scenario: Invalid email format validation - 003
    Given Load UI
    Then Enter the First name as Indika
    Then Enter the Last name as senarathna
    Then Enter the Email as indikagmail.com
    Then Select Gender as Male
    Then Enter Mobile number as 0777656566
    Then Select Date of Birth as 1 Jan 2000
    Then Select Subject as English
    Then Select Hobby as Sports
    Then Upload a Picture as C:\Users\indik\OneDrive\Documents\DemoQA\images\user.jpg
    Then Enter the Current Address as colombo,sri lanka
    Then Select State as Uttar Pradesh
    Then Select City as Agra
    Then Click the submit button
    And Verify the success message as Thanks for submitting the form









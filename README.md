# QA Automation Case Study - Logistics Application

## Overview
This repository contains automation scripts for registering and logging into a logistics company's application. However, due to the inability to bypass reCAPTCHA, the implementation remains incomplete.

## Test Scenarios

### Scenario: User Registration
1. Verify that the Case Study registration page has opened.
2. Navigate to "fakeMailAddress" to obtain an email address.
3. Navigate back to "caseStudyRegisterUrl".
4. Enter the first name in the First Name input field.
5. Enter the last name in the Last Name input field.
6. Select a country code from the Country select menu.
7. Enter a mobile number in the Mobile Number input field.
8. Enter a company name in the Company Name input field.
9. Enter an email address in the Email Address input field.
10. Select a title from the Title select menu.
11. Enter and confirm a password in the corresponding input fields.
12. Check the Terms of Service and Privacy Policy checkbox field.
13. Click the Agree & Signup button.
14. Navigate to "fakeMailAddress" to retrieve the received code.
15. Extract the confirmation code from the inbox.
16. Navigate back to "caseStudyRegisterUrl".
17. Enter the confirmation code in the pop-up.
18. Click the OK button.
19. Quit the browser.
20. When Enter numbers and symbols to the First Name input field.
21. Then Verify that First Name input field is empty
22. And Quit the browser.
23. When Enter numbers and symbols to the Last Name input field.
24. Then Verify that Last Name input field is empty
25. And Quit the browser.
26. When Enter characters and symbols to the Mobile Number input field.
27. Then Verify that Mobile Number input field is empty
28. And Quit the browser.
29. When Enter password to the Password Input field.
30. And Enter different password to the Confirm Password input field.
31. Then Verify that a warning appear below the Confirm Password Input field.
32. And Quit the browser.

## Technology Stack
- **Programming Language**: Java (Version 19)
- **Automation Framework**: Selenium with Cucumber

## Dependencies
To run this automation test, the following dependencies are required:

- **Java 11**
- **Selenium 4.24.0**
- **WebDriverManager (latest version)**
- **Cucumber-Java 7.18.1**
- **Cucumber-JUnit 7.18.1**
- **JUnit 4.13.1**
- **JavaFaker 1.0.2** (for generating random names and other input fields)

## Email Service
For retrieving email verification codes, a fake email service is used: [mail.tm](https://mail.tm/en/)

## Reporting
This project uses Cucumber for reporting. The test results are stored in the following location:
```
target/html-reports/
```
Additionally, when an error occurs, a screenshot is taken and saved in:
```
target/screenshots/
```
The screenshots are named with a timestamp for better tracking.

## Browser Configuration
This test script can be executed in different browsers by modifying the `browser` field in the `configuration.properties` file. Supported browsers:
```
chrome, firefox, safari, edge
```

## Running the Tests
To execute the tests, use the following command:
```sh
mvn test
```

---

This README provides an overview of the automation case study, dependencies, execution steps, and reporting. If you have any further questions or need modifications, feel free to update this document!

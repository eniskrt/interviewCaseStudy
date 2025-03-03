# QA Automation Case Study - Logistics Application

## Overview
This repository contains automation scripts for registering and logging into a logistics company's application. However, due to the inability to bypass reCAPTCHA, the implementation remains incomplete.

## Test Scenarios

### Scenario: User Registration
1. Verify that the Case Study registration page has opened.
2. Navigate to "fakeMailAddress" to obtain an email address.
3. Navigate back to "caseStudyRegisterUrl".
4. Enter the first name in the First Name input field.
5. Verify that the Agree & Signup button is disabled.
6. Enter the last name in the Last Name input field.
7. Verify that the Agree & Signup button is disabled.
8. Select a country code from the Country select menu.
9. Verify that the Agree & Signup button is disabled.
10. Enter a mobile number in the Mobile Number input field.
11. Verify that the Agree & Signup button is disabled.
12. Enter a company name in the Company Name input field.
13. Verify that the Agree & Signup button is disabled.
14. Enter an email address in the Email Address input field.
15. Verify that the Agree & Signup button is disabled.
16. Select a title from the Title select menu.
17. Verify that the Agree & Signup button is disabled.
18. Enter and confirm a password in the corresponding input fields.
19. Check the Terms of Service and Privacy Policy checkbox field.
20. Click the Agree & Signup button.
21. Navigate to "fakeMailAddress" to retrieve the received code.
22. Extract the confirmation code from the inbox.
23. Navigate back to "caseStudyRegisterUrl".
24. Enter the confirmation code in the pop-up.
25. Click the OK button.
26. Quit the browser.

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

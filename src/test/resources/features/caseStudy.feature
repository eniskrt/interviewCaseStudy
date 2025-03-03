@CaseStudy
  Feature: tAutomationCaseStudy

    Background:
      Given Navigate to "caseStudyRegisterUrl" address.

    Scenario: The user should register to Case Study.
      Then Verify that the Case Study register page has opened.
      And Navigate to "fakeMailAddress" for take email address.
      When Navigate to "caseStudyRegisterUrl" address again.
      And Enter first name to the First Name input field.
      And Enter last name to the Last Name input field.
      When Select country code from the Country select menu.
      And Enter mobile number to the Mobile Number input field.
      And Enter company name to the Company Name input field.
      And Enter email address to the email address input field.
      And Select title from the Title select menu.
      And Enter password and confirm password to the related input field.
      When Check the Terms of Service and Privacy Policy checkbox field.
      Then Click the Agree & Signup button.

            #I couldn't bypass Cloudflare's automation protection, and based on my research, it is not possible with Selenium.
            # Therefore, I couldn't create the following test methods.
      #When Navigate to "fakeMailAddress" address to take the received code.
      #And Take the confirmation code from inbox.
      #When Navigate to "caseStudyRegisterUrl" address again.
      #And Enter the confirmation code to pop-up.
      #Then Click the Ok button.
      #And Verify
      And Quit the browser.

    Scenario: First Name Input field shouldn't accept number character.
      When Enter numbers and symbols to the First Name input field.
      Then Verify that First Name input field is empty
      And Quit the browser.


    Scenario: Last Name Input field shouldn't accept number character.
      When Enter numbers and symbols to the Last Name input field.
      Then Verify that Last Name input field is empty
      And Quit the browser.

    Scenario: Mobile Number Input field shouldn't accept alphabetical and symbols character.
      When Enter characters and symbols to the Mobile Number input field.
      Then Verify that Mobile Number input field is empty
      And Quit the browser.

    Scenario: Password and Confirm password should be the same.
      When Enter password to the Password Input field.
      And Enter different password to the Confirm Password input field.
      Then Verify that a warning appear below the Confirm Password Input field.
      And Quit the browser.
@CaseStudy
  Feature: tAutomationCaseStudy

    Background:
      Given Navigate to "caseStudyRegisterUrl" address.

    Scenario: The user should register to Case Study.
      Then Verify that the Case Study register page has opened.
      And Navigate to "fakeMailAddress" for take email address.
      When Navigate to "caseStudyRegisterUrl" address again.
      And Enter first name to the First Name input field.
      Then Verify that Agree & Signup button is disabled.
      And Enter last name to the Last Name input field.
      Then Verify that Agree & Signup button is disabled.
      When Select country code from the Country select menu.
      Then Verify that Agree & Signup button is disabled.
      And Enter mobile number to the Mobile Number input field.
      Then Verify that Agree & Signup button is disabled.
      And Enter company name to the Company Name input field.
      Then Verify that Agree & Signup button is disabled.
      And Enter email address to the email address input field.
      Then Verify that Agree & Signup button is disabled.
      And Select title from the Title select menu.
      Then Verify that Agree & Signup button is disabled.
      And Enter password and confirm password to the related input field.
      When Check the Terms of Service and Privacy Policy checkbox field.
          #I couldn't bypass Cloudflare's automation protection, and based on my research, it is not possible with Selenium.
          # Therefore, I couldn't create the following test methods.
      Then Click the Agree & Signup button.
      When Navigate to "fakeMailAddress" address to take the received code.
      And Take the confirmation code from inbox.
      When Navigate to "caseStudyRegisterUrl" address again.
      And Enter the confirmation code to pop-up.
      Then Click the Ok button.
      And Verify
      And Quit the browser.
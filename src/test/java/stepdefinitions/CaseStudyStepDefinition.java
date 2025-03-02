package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.CaseStudyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CaseStudyStepDefinition {

    CaseStudyPage caseStudyPage = new CaseStudyPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    String fakeEmail;
    String fakeEmailHandle;
    String caseStudyPageHandle;
    String validPassword = "Aa123456%";

    @Given("Navigate to {string} address.")
    public void navigateToAddress(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("caseStudyRegisterUrl"));
        ReusableMethods.wait(10);
    }

    @Then("Verify that the Case Study register page has opened.")
    public void verifyTheCaseStudyPageOpened() {
        String expectedText = "Forceget";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedText));
    }

    @Then("Navigate to {string} for take email address.")
    public void takeEmailAddress(String fakeMailAddress) {
        caseStudyPageHandle = Driver.getDriver().getWindowHandle();

        ReusableMethods.openNewTab();
        ReusableMethods.changeTab();
        Driver.getDriver().get(ConfigReader.getProperty(fakeMailAddress));
        ReusableMethods.wait(10);
        String fakeEmailHandle = Driver.getDriver().getWindowHandle();
        caseStudyPage.tempMailAddressText.click();
        caseStudyPage.tempMailAddressText.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        fakeEmail = ReusableMethods.takeTheSelectedText();
    }

    @When("Navigate to {string} address again.")
    public void navigateToAddressAgain(String caseStudyRegisterUrl) {
        Driver.getDriver().switchTo().window(caseStudyPageHandle);
    }

    @Then("Enter first name to the First Name input field.")
    public void enterFirstName() {
        caseStudyPage.firstNameInput.sendKeys(faker.name().firstName());
    }

    @Then("Verify that Agree & Signup button is disabled.")
    public void verifyAgreeSignupButtonDisabled() {
        Assert.assertTrue(caseStudyPage.agreeAndSignupButton.isDisplayed());
    }

    @Then("Enter last name to the Last Name input field.")
    public void enterLastName() {
        caseStudyPage.lastNameInput.sendKeys(faker.name().lastName());
    }

    @When("Select country code from the Country select menu.")
    public void selectCountryCode() {
        caseStudyPage.countryCodeSelectMenu.click();
        ReusableMethods.wait(2);
        caseStudyPage.countryCodeSelectMenuOptionList.get((int) (Math.random() * caseStudyPage.countryCodeSelectMenuOptionList.size())).click();
        ReusableMethods.wait(3);
    }

    @Then("Enter mobile number to the Mobile Number input field.")
    public void enterMobileNumber() {
        caseStudyPage.phoneNumberInput.sendKeys(faker.phoneNumber().cellPhone());
    }

    @Then("Enter company name to the Company Name input field.")
    public void enterCompanyName() {
        caseStudyPage.companyNameInput.sendKeys(faker.company().name());
    }
    @Then("Enter email address to the email address input field.")
    public void enterEmailAddress() {
        caseStudyPage.emailInput.sendKeys(fakeEmail);
    }
    @Then("Select title from the Title select menu.")
    public void selectTitle() {
        caseStudyPage.titleSelectMenu.click();
        ReusableMethods.wait(2);
        caseStudyPage.titleSelectMenuOptionList.get((int)(Math.random() * caseStudyPage.titleSelectMenuOptionList.size())).click();
    }

    @Then("Enter password and confirm password to the related input field.")
    public void enterPassword() {
        actions.click(caseStudyPage.emailInput)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(validPassword)
                .sendKeys(Keys.TAB)
                .sendKeys(validPassword)
                .perform();
    }

    @When("Check the Terms of Service and Privacy Policy checkbox field.")
    public void checkTheTermsOfServiceAndPrivacyPolicyCheckbox() {
        actions.click(caseStudyPage.termsOfPolicyCheckBox).perform();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        ReusableMethods.wait(5);
    }

    @Then("Click the Agree & Signup button.")
    public void clickAgreeAndSignupButton() {
        caseStudyPage.agreeAndSignupButton.click();
    }

    @When("Navigate to {string} address to take the received code.")
    public void navigateToFakeEmailAddressAgain(String fakeMailAddress) {
        Driver.getDriver().switchTo().window(fakeEmailHandle);
        ReusableMethods.wait(5);
    }

    @When("Take the confirmation code from inbox.")
    public void takeTheConfirmationCodeFromInbox() {
        jse.executeScript("arguments[0].click();", caseStudyPage.tempmailRefleshButton);
        ReusableMethods.wait(2);
        jse.executeScript("arguments[0].click();", caseStudyPage.tempmailFirstEmail);
        ReusableMethods.wait(2);
    }
    @When("Enter the confirmation code to pop-up.")
    public void enterTheConfirmationCodeToPopup() {

    }
    @Then("Click the Ok button.")
    public void clickTheOkButton() {

    }
    @Then("Verify")
    public void verify() {

    }

    @And("Quit the browser.")
    public void quitBrowser() {
        Driver.quitDriver();
    }
}

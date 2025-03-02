package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CaseStudyPage {

    public CaseStudyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //AgreAndSignupButton
    @FindBy(xpath = "/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/button")
    public WebElement agreeAndSignupButton;

    //FirstNameInput
    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    //LastNameInput
    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    //PhoneNumberInput
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberInput;

    //CompanyNameInput
    @FindBy(id = "companyName")
    public WebElement companyNameInput;

    //EmailInput
    @FindBy(xpath = "//input[@placeholder='E-mail']")
    public WebElement emailInput;

    //TitleSelectMenu
    @FindBy(xpath = "/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[3]/nz-form-item/nz-form-control/div/div/nz-select/nz-select-top-control")
    public WebElement titleSelectMenu;

    //CountryCodeSelectMenu
    @FindBy(xpath = "/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[1]/nz-form-item[1]/nz-form-control/div/div/nz-input-group/forceget-country-dropdown/nz-select/nz-select-top-control")
    public WebElement countryCodeSelectMenu;

    //TitleSelectMenuOptions
    @FindBy(tagName = "nz-option-item")
    public List<WebElement> titleSelectMenuOptionList;

    //CountryCodeSelectMenuOptions
    @FindBy(xpath = "//div[@class='cdk-virtual-scroll-content-wrapper']//nz-option-item")
    public List<WebElement> countryCodeSelectMenuOptionList;

    //TermsOfPolicyCheckBox
    @FindBy(xpath = "//span[@class='checkbox-box']")
    public WebElement termsOfPolicyCheckBox;

    //PasswordInput
    @FindBy(xpath = "/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[4]/nz-form-item/nz-form-control/div/div/nz-input-group")
    public WebElement passwordInput;

    //ConfirmPasswordInput
    @FindBy(xpath = "/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[5]/nz-form-item/nz-form-control/div/div/nz-input-group")
    public WebElement confirmPasswordInput;

    //TermsOfPolicyModalAcceptButton
    @FindBy(xpath = "//*[@id='cdk-overlay-1']/nz-modal-container/div/div/div[3]/div/button/span")
    public WebElement termsOfPolicyModalAcceptButton;

    //TempMailAddressText
    @FindBy(xpath = "//input[@id='Dont_use_WEB_use_API_OK']")
    public WebElement tempMailAddressText;

    //TempMailDismissButton
    @FindBy(xpath = "//*[@id='dismiss-button']")
    public WebElement tempmailDismissButton;

    //TempMailRefreshButton
    @FindBy(xpath = "//*[text()=' Refresh']")
    public WebElement tempmailRefleshButton;

    //TempMailFirstEmail
    @FindBy(xpath = "//*[@id='__nuxt']/div/div[2]/main/div[2]/div[2]/ul/li/a/div")
    public WebElement tempmailFirstEmail;

    //fake mail sitesi  mail kutusu "Verify Account"
    @FindBy(xpath = "//*[text()='Verify Account']")
    public WebElement fakemail_verifyAccount;

    //fake mail sitesi  mail kutusu "Reset Password"
    @FindBy(xpath = "//*[text()='Reset Password']")
    public WebElement fakemail_resetPasword;

    //fake mail sitesi  iframe
    @FindBy(xpath = "//iframe[@class='w-full']")
    public WebElement fakemail_iframe;
}

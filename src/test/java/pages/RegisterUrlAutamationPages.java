package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterUrlAutamationPages {
    public RegisterUrlAutamationPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Signup")
    public WebElement signupButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupText;


    @FindBy(name= "name")
    public WebElement nameBox;

    @FindBy (xpath = "(//*[@name=\"email\"])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement radioButon;

    @FindBy(xpath = "(//*[@type= 'submit'])[2]")
    public WebElement accountCreatSignupButton;

    @FindBy(xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement createAccountPageVerification;

    @FindBy(id= "uniform-id_gender1")
    public WebElement genderBox;

    @FindBy(id= "password")
    public WebElement passwordBox;

    @FindBy(id="days")
    public WebElement dayDropdown;

    @FindBy(id="months")
    public WebElement monthDropdown;

    @FindBy(id="years")
    public WebElement yearDropdown;

    @FindBy(xpath = "//*[@id=\"newsletter\"]")
    public WebElement newsletterSignupBox;

    @FindBy(id="optin")
    public WebElement specialOfferBox;

    @FindBy(id="first_name")
    public WebElement firstNameBox;

    @FindBy(id="last_name")
    public WebElement lastNameBox;

    @FindBy(id= "company")
    public WebElement companyBox;

    @FindBy(id="address1")
    public WebElement addressBox;

    @FindBy(id="country")
    public WebElement countryDropdown;

    @FindBy(id="state")
    public WebElement stateBox;

    @FindBy(id="city")
    public WebElement cityBox;

    @FindBy(id="zipcode")
    public WebElement zipcodeBox;

    @FindBy(id="mobile_number")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "//*[@type='submit'][1]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;
}

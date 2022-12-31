package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterUrlAutamationPages;
import utilities.Driver;

public class RegsiterUserStepDefinitions {

    RegisterUrlAutamationPages registerUrlAutamationPages = new RegisterUrlAutamationPages();

    @Given("l'utilisateur va sur la page automation_url.")
    public void l_utilisateur_va_sur_la_page_automation_url() {
        Driver.getDriver().get("https://www.automationexercise.com/");

    }
    @Given("ana sayfanin gorunur oldugunu test eder")
    public void ana_sayfanin_gorunur_oldugunu_test_eder() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", actualTitle);

    }
    @Then("kullanici signup-login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() {

        registerUrlAutamationPages.signupButton.click();

    }
    @Then("kullanici New user Signup! in gorunur oldugunu test eder")
    public void kullanici_new_user_signup_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(registerUrlAutamationPages.signupText.isDisplayed());

    }

    @Given("kullanici olarak isim ve maili girer")
    public void kullanici_olarak_isim_ve_maili_girer() {

        registerUrlAutamationPages.nameBox.sendKeys("Ahmet");
        registerUrlAutamationPages.emailBox.sendKeys("kosanahmet244@gmail.com");

    }
    @Given("signup butonuna tiklar")
    public void signup_butonuna_tiklar() {
        registerUrlAutamationPages.accountCreatSignupButton.click();
        registerUrlAutamationPages.radioButon.click();

    }
    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder")
    public void acilan_sayfada_enter_account_information_yazisinn_gorunur_oldugunu_test_eder() {
        //Assert.assertTrue(mainPageFunctionalities.createAccountPageVerification.isDisplayed());
        Assert.assertTrue(registerUrlAutamationPages.createAccountPageVerification.isDisplayed());

    }
    @Then("kullanici ayrintilari \\(birinci bolum) doldurur")
    public void kullanici_ayrintilari_birinci_bolum_doldurur() throws InterruptedException {
        registerUrlAutamationPages.genderBox.click();
        registerUrlAutamationPages.passwordBox.sendKeys("12345");
        Driver.selectByIndex(registerUrlAutamationPages.dayDropdown,4);
        Driver.selectByIndex(registerUrlAutamationPages.monthDropdown,5);
        Driver.selectByIndex(registerUrlAutamationPages.yearDropdown, 25);

    }
    @Then("kullanici Sign up for our newsletter! checkbox ini secer")
    public void kullanici_sign_up_for_our_newsletter_checkbox_ini_secer() {
        registerUrlAutamationPages.newsletterSignupBox.click();

    }
    @Then("kullanici Receive special offers from our partners! checkbox ini secer")
    public void kullanici_receive_special_offers_from_our_partners_checkbox_ini_secer() {
        registerUrlAutamationPages.specialOfferBox.click();

    }
    @Then("kullanici ayrintilari \\(ikinci bolum) doldurur")
    public void kullanici_ayrintilari_ikinci_bolum_doldurur() {
        registerUrlAutamationPages.firstNameBox.sendKeys("Ahmet");
        registerUrlAutamationPages.lastNameBox.sendKeys("KOSAN");
        registerUrlAutamationPages.companyBox.sendKeys("Belgique");
        registerUrlAutamationPages.addressBox.sendKeys("Avenue Elisabeth 966 Verviers/BELGIQUE");
        Driver.selectByIndex(registerUrlAutamationPages.countryDropdown,2);
        registerUrlAutamationPages.stateBox.sendKeys("Avenue Elisabeth");
        registerUrlAutamationPages.cityBox.sendKeys("Verviers");
        registerUrlAutamationPages.zipcodeBox.sendKeys("4800");
        registerUrlAutamationPages.mobileNumberBox.sendKeys("+32470434015");

    }
    @Then("kullanici Create Account butonuna tiklar")
    public void kullanici_create_account_butonuna_tiklar() {
        registerUrlAutamationPages.createAccountButton.click();

    }
    @Then("kullanici hesabin olustugunu dogrular")
    public void kullanici_hesabin_olustugunu_dogrular() {
        Assert.assertTrue(registerUrlAutamationPages.accountCreatedText.isDisplayed());

    }


}

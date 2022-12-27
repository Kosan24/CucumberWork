package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class WebUniversityStepDefiniyions {
    WebUniversityPages webUniversityPages=new WebUniversityPages();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get("https://webdriveruniversity.com/");
    }
    @Given("Login portala kadar asagi iner")
    public void login_portala_kadar_asagi_iner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Given("Login portal'a tiklar")
    public void login_portal_a_tiklar() {
        webUniversityPages.webUniversityLoginPortal.click();

    }
    @Then("Acilan diger windowa gecer")
    public void acilan_diger_windowa_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");

    }
    @Then("{string} ve {string} kutularina deger yazdirin")
    public void ve_kutularina_deger_yazdirin(String username, String password) {
        System.out.println(Driver.getDriver().getTitle());
        webUniversityPages.webUniversityUserNameBox.sendKeys(username);
        webUniversityPages.webUniversityPasswordBox.sendKeys(password);

    }
    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
        webUniversityPages.webUniversityLoginButon.click();

    }
    @Then("Popup'ta cikan yazinin\"validation failed\"oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder(String popUpYazi) {

      String alertYazisi= Driver.getDriver().switchTo().alert().getText();
        System.out.println(alertYazisi);
        Assert.assertEquals(popUpYazi,alertYazisi);

    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow("WebdriverUniversity.com ");

    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle= "WebdriverUniversity.com ";

        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int arg0) {

    }
}

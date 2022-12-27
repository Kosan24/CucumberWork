package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonBelgiquePages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonBelgiqueStepDefinitions {

    AmazonBelgiquePages amazonBelgiquePages=new AmazonBelgiquePages();

    @Given("l'utilisateur va sur la page AmazonBelgiqueUrl.")
    public void l_utilisateur_va_sur_la_page() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonBelgiqueUrl"));
        amazonBelgiquePages.langueAccept.click();
        amazonBelgiquePages.cookieAcceptButon.click();

    }
    @Given("recherche Samsung S20")
    public void recherche_samsung_s20() {
        //Driver.getDriver().get(ConfigReader.getProperty("AmazonBelgiqueUrl"));
        //amazonBelgiquePages.langueAccept.click();
        //amazonBelgiquePages.cookieAcceptButon.click();
        amazonBelgiquePages.BarreDeRecherche.sendKeys("Samsung S20" + Keys.ENTER);

    }
    @Then("les test dont les resultat Samsung S20")
    public void les_test_dont_les_resultat_samsung_s20() {
        String elementResult=amazonBelgiquePages.elementTexteResultat.getText();
        Assert.assertTrue(elementResult.contains("Samsung S20"));

    }
    @Given("recherche iphone {int} promax")
    public void recherche_iphone_promax(Integer int1) {
        amazonBelgiquePages.BarreDeRecherche.sendKeys("iphone 14 promax" + Keys.ENTER);

    }
    @Then("les test dont les resultat iphone {int} promax")
    public void les_test_dont_les_resultat_iphone_promax(Integer int1) {

    }
    @Given("recherche Machine et Cafe")
    public void recherche_machine_et_cafe() {

    }
    @Then("les test dont les resultat Machibe et Cafe")
    public void les_test_dont_les_resultat_machibe_et_cafe() {

    }

}

package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPages amazonPages=new AmazonPages();

    @Given("l'utilisateur va sur la page amazon.")
    public void l_utilisateur_va_sur_la_page_amazon() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));

    }
    @Given("recherche iPhone")
    public void recherche_i_phone() {
        amazonPages.BarreDeRecherche.sendKeys("iPhone" + Keys.ENTER);

    }
    @Then("les tests dont les résultats incluent l'iPhone")
    public void les_tests_dont_les_résultats_incluent_l_i_phone() {
        String textResultatStr =  amazonPages.élémentTexteRésultat.getText();
        Assert.assertTrue(textResultatStr.contains("iPhone"));

    }
    @Given("recherche tea pot")
    public void recherche_tea_pot() {
        amazonPages.BarreDeRecherche.sendKeys("tea pot" + Keys.ENTER);

    }
    @Then("les tests dont les résultats incluent tea pot")
    public void les_tests_dont_les_résultats_incluent_tea_pot() {
        String textResultatStr =  amazonPages.élémentTexteRésultat.getText();
        Assert.assertTrue(textResultatStr.contains("tea pot"));

    }
    @Given("recherche flower")
    public void recherche_flower() {
        amazonPages.BarreDeRecherche.sendKeys("flower" + Keys.ENTER);

    }
    @Then("les tests dont les résultats incluent flower")
    public void les_tests_dont_les_résultats_incluent_flower() {
        String textResultatStr =  amazonPages.élémentTexteRésultat.getText();
        Assert.assertTrue(textResultatStr.contains("flower"));

    }
    @Given("recherche {string}")
    public void recherche(String motRecherche) {
        amazonPages.BarreDeRecherche.sendKeys(motRecherche + Keys.ENTER);

    }
    @Then("les tests dont les résultats incluent {string}")
    public void les_tests_dont_les_résultats_incluent(String motRecherche) {
        String textResultatStr =  amazonPages.élémentTexteRésultat.getText();
        Assert.assertTrue(textResultatStr.contains(motRecherche));

    }

    @And("fermePage")
    public void fermepage() {
        Driver.closeDriver();
    }

    @Given("l'utilisateur va sur la page {string}.")
    public void lUtilisateurVaSurLaPage(String urlDemande) {
        Driver.getDriver().get(ConfigReader.getProperty(urlDemande));
    }
}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSearch1StepDefinitions {

    AmazonSearch1StepDefinitions amazonSearch1StepDefinitions = new AmazonSearch1StepDefinitions();

    @Given("l'utilisateur va sur la page Amazon.")
    public void l_utilisateur_va_sur_la_page_amazon() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl1"));
    }
    @Given("ecrire Machine a Cafe")
    public void ecrire_machine_a_cafe() {


    }
    @Then("teste que les résultats sont une machine a cafe")
    public void teste_que_les_résultats_sont_une_machine_a_cafe() {

    }
}

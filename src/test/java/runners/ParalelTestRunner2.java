package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports2.html",
                "json:target/json-reports/Pcucumber2.json",
                "junit:target/xml-report/Pcucumber2.xml"}, //RAPORLAMA
        features = "src/test/resourcess/features", //Features nerde bulacagimizi
        glue = "stepdefinitions",    // Java komutlarini nerede arayacagimiz
        tags = "@paralel2", // Hangi seneryolari calistiracagimizi belirtiyor
        dryRun = false

)

public class ParalelTestRunner2 {
}
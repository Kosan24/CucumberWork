package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports1.html",
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"}, //RAPORLAMA
        features = "src/test/resourcess/features", //Features nerde bulacagimizi
        glue = "stepdefinitions",    // Java komutlarini nerede arayacagimiz
        tags = "@paralel1", // Hangi seneryolari calistiracagimizi belirtiyor
        dryRun = false

)

public class ParalelTestRunner1 {
}
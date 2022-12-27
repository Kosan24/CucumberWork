package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPages2;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuruStepDefinitions {

    DemoGuruPages2 demoGuruPages2=new DemoGuruPages2();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslikStrr) {

//        demoGuruPages2.cookiesKabulEtButonu.click();

    //    Driver.getDriver().switchTo().frame(demoGuruPages2.iframe);

        List<WebElement> baslikWebElementListesii= demoGuruPages2.baslikWebelementListesii;
        List<String> baslikStringListesii= ReusableMethods.getElementsText(baslikWebElementListesii);
        int istenenSutunIndexii=baslikStringListesii.indexOf(istenenBaslikStrr);

       List<WebElement> istenenSutunWebElementListesi= demoGuruPages2.sutunListesiGetirr(istenenSutunIndexii);
       List<String> istenenSutunStrList = ReusableMethods.getElementsText(istenenSutunWebElementListesi);
        System.out.println(istenenBaslikStrr +"Sutunundaki elementler \n"+istenenSutunStrList);

    }

}

package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGru99StepDefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();


    @Given("{string}, sutunundaki tum degerler yazdirir")
    public void sutunundaki_tum_degerler_yazdirir(String istenenBAslikStr) {

        demoGuruPage.cookiesKabulEtButonu.click();

        Driver.getDriver().switchTo().frame(demoGuruPage.iframe);

       List<WebElement>baslikWebElementListesi= demoGuruPage.baslikWebElementListesi;

       List<String>baslikStringListesi= ReusableMethods.getElementsText(baslikWebElementListesi);

       int istenenSutunIndexi = baslikStringListesi.indexOf(istenenBAslikStr);

       List<WebElement> istenenSutunWebElementListesi= demoGuruPage.sutunListesiGetir(istenenSutunIndexi);

       List<String> isneneSutunStrList = ReusableMethods.getElementsText(istenenSutunWebElementListesi);
        System.out.println(istenenBAslikStr+"Sutunundaki elementler \n"+isneneSutunStrList);

    }
}

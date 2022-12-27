package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPages2 {
    public DemoGuruPages2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"save\"]/span[1]/div/span")
    public WebElement cookiesKabulEtButonu;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikWebelementListesii;

    @FindBy(xpath = "//iframe[@class='faktor-iframe-wrapper']")
    public WebElement iframe;



    public List<WebElement> sutunListesiGetirr(int index){

        String dinamikXpathh="//tbody//tr//td["+(index+1)+"]";

        List<WebElement> istenenSutunWebElementlerii=Driver.getDriver().findElements(By.xpath(dinamikXpathh));
        return istenenSutunWebElementlerii;
    }

}

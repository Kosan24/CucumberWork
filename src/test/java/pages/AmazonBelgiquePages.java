package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonBelgiquePages {
    public AmazonBelgiquePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"redir-overlay\"]/div[3]/a[1]/span")
    public WebElement langueAccept;

    @FindBy(xpath = "//*[@id=\"sp-cc-accept\"]")
    public WebElement cookieAcceptButon;

    @FindBy(id="twotabsearchtextbox")
    public WebElement BarreDeRecherche;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement elementTexteResultat;
}

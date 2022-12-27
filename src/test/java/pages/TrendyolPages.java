package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPages {

    public TrendyolPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement cookiesKabulTrendyol;

    @FindBy(xpath = "//*[@id=\"header-wrapper\"]/div/div[2]/div[3]/div/span")
    public WebElement signinLinki;

    @FindBy(xpath = "//*[@id=\"emaillogin\"]")
    public WebElement emailKutusuTextBox;

    @FindBy(xpath = "//*[@id=\"error-box-wrapper\"]/span[2]")
    public WebElement invalidEmailTextYazisiElementi;

}

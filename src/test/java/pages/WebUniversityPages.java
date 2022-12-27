package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPages {

     public WebUniversityPages(){
         PageFactory.initElements(Driver.getDriver(),this);
     }

     @FindBy(xpath = "//*[@id=\"login-portal\"]/div/div[1]/h1")
     public WebElement webUniversityLoginPortal;

     @FindBy(xpath = "//*[@id=\"text\"]")
    public WebElement webUniversityUserNameBox;

     @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement webUniversityPasswordBox;

     @FindBy(xpath = "//*[@id=\"login-button\"]")
    public WebElement webUniversityLoginButon;
}

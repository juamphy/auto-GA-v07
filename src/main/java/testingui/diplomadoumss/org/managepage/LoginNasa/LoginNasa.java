package testingui.diplomadoumss.org.managepage.LoginNasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class LoginNasa extends BasePage {
    @FindBy(xpath = "//div[@id='toc']//ul[@id='tocify-header1']//li[@class='tocify-item']//a")
    private WebElement nasaApiLink;


    @FindBy(xpath = "//div[@id='toc']//ul[@id='tocify-header1']//li[@class='tocify-item']//a")
    private WebElement nasaApiLink2;


    @FindBy(xpath = "//div[@id='toc']//ul[@id='tocify-header8']//li[@class='tocify-item']//a")
    private WebElement earthClick;

    public LoginNasa clickNasaApiLink(){
        clickWebElement(nasaApiLink);
        return  this;
    }

    public LoginNasa clickNasaApiLink2(){
        clickWebElement(nasaApiLink2);
        return  this;
    }

    public LoginNasa earthClickMenu(){
        avoidToUse(2000);
        clickWebElement(earthClick);
        return  this;
    }
}

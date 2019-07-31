package testingui.diplomadoumss.org.managepage.dasboardnasa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

public class DasboardNasa  extends BasePage {

        //@FindBy(xpath="//*[@href='https://api.nasa.gov/']")
        //private WebElement loadPage;
        @FindBy(xpath="//li/a[contains(text(),'NASA API Listing')]")
         private WebElement selectClickNasaApi;
        @FindBy(xpath="//ul//li/a[contains(text(),'NASA API Listing')]']")
         private WebElement selectSecondclick;
        @FindBy(xpath="//li/a[contains(text(),'Earth')]")
        private WebElement selectEarth;
        @FindBy(xpath="//li/a[contains(text(),'Imagery')]")
        private WebElement selectImagery;
        // @Find(xpath="//code[contains(text(),'')]")
        //private WebElement selectTextGet;
    public DasboardNasa(){

        Event.avoidToUse(3);

    }
    public DasboardNasa loadDashboardNasa(){
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());
        return new DasboardNasa();
    }

    public DasboardNasa clickObtionNasaApi(){
        Event.avoidToUse(2);
        Event.clickWebElement(selectClickNasaApi);
        return this;
    }
    public DasboardNasa clickSecondDashboard(){
        Event.avoidToUse(2);
        Event.clickWebElement(selectSecondclick);
        return this;
    }
    public DasboardNasa clickEarhDashboard(){
        Event.avoidToUse(2);
        Event.clickWebElement(selectEarth);
        return this;

    }
    public DasboardNasa cliclkImageryDahboard(){
        Event.avoidToUse(2);
        Event.clickWebElement(selectImagery);
        return this;
    }




}

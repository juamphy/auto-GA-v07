package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.Cars;
import testingui.diplomadoumss.org.managepage.leftPanel.Extras;
import testingui.diplomadoumss.org.managepage.leftPanel.Hotels;

public class Dashboard extends BasePage {
    @FindBy(xpath = "//*[@href='#Cars']")
    private WebElement clickCarsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement clickCars;

    @FindBy(xpath = "//*[@href='#Hotels']")
    private WebElement clickSelectHotel;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/hotels/extras']")
    private WebElement clickSelectExtras;

     @FindBy(css ="[class*='xcrud-in-new-window'][data-task*='print'] ")
     private WebElement clickSelectPrint;

    @FindBy(css ="[class*='xcrud-in-new-window'][data-task*='csv'] ")
    private WebElement clickSelectExport;


    @FindBy(css ="[class*='xcrud-action'][data-task*='create'] ")
    private WebElement clickButtonAdd;




    public Dashboard(){
        Event.avoidToUse(10000);
    }


    public Extras clickCardPrint(){
        Event.clickWebElement(clickSelectPrint);
        return new Extras();
    }
    public Extras selectButtonPrint(){
        return clickCardPrint();
    }

    public Extras ClickCardExport(){
        Event.clickWebElement(clickSelectExport);
        return new Extras();
    }

    public Hotels clickHotel()
    {

        Event.clickWebElement(clickSelectHotel);
        Event.clickWebElement(clickSelectExtras);
        return new Hotels();
    }
    public Hotels setterLeftPanel(){
        return clickHotel();

    }


    public Cars clickCarsSelected() {
        Event.clickWebElement(clickCarsSelected);
        Event.clickWebElement(clickCars);
        return new Cars();
    }

    public Cars setLeftPanel() {
        return  clickCarsSelected();
    }

}

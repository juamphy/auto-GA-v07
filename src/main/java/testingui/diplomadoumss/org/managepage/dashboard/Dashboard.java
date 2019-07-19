package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.Cars;
import testingui.diplomadoumss.org.managepage.leftPanel.Extras;
import testingui.diplomadoumss.org.managepage.leftPanel.Hotels;

public class Dashboard extends BasePage {

    ////esto son los accion submenu cars
    @FindBy(xpath = "//*[@href='#Cars']")
    private WebElement clickCarsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement clickCars;
    //////esto es para la accions del contenido de extras


     @FindBy(css ="[class*='xcrud-in-new-window'][data-task*='print'] ")
     private WebElement clickSelectPrint;

    @FindBy(css ="[class*='xcrud-in-new-window'][data-task*='csv'] ")
    private WebElement clickSelectExport;


    @FindBy(css ="[class*='xcrud-action'][data-task*='create'] ")
    private WebElement clickButtonAdd;
/////////////////////

    /////esto es of click hotel

    @FindBy(xpath = "//*[@href='#Hotels']")
    private WebElement clickSelectHotel;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/hotels/extras']")
    private WebElement clickSelectExtras;

////////////////////Dasboard sleep/////
    public Dashboard(){
        Event.avoidToUse(10000);
    }
  //////////////esto es para acccion de hotel and submenu extras

    public Dashboard clickHotelLink() {
        Event.clickWebElement(clickSelectHotel);
        Event.avoidToUse(1);
        return this;
    }

    public Hotels clickExtraLinkIntoHotelsOptions(){
        Event.clickWebElement(clickSelectExtras);
        return new Hotels();
    }

    public Hotels clickExtrasLinksIntoHotelsOptions(){
        return clickHotelLink().clickExtraLinkIntoHotelsOptions();
    }


//    public Hotels setterLeftPanel(){
//        return clickHotel();
//
//    }
    ////////////Esto es para el button cards y submenu


    public Cars clickCarsSelected() {
        Event.clickWebElement(clickCarsSelected);
        Event.clickWebElement(clickCars);
        return new Cars();
    }

    public Cars setLeftPanel() {
        return  clickCarsSelected();
    }



    ////////////// estos son para las acciones
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

}

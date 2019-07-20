package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.extras.Extras;
import testingui.diplomadoumss.org.managepage.leftPanel.Cars;
import testingui.diplomadoumss.org.managepage.hotel.Hotels;

import java.security.PrivateKey;
import java.util.Random;

import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Dashboard extends BasePage {
    ////esto son los accion submenu cars
    private Extras extras;
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


  @FindBy(css ="[class*='xcrud-action'][data-task*='create'] ")
    private WebElement clickButtonAdd;

    //    @FindBy(css="[data-type='text']")
    @FindBy(xpath="//input[@name='cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--' and @type='text']")
    private WebElement fieldName;
    @FindBy(xpath = "//select[@name='cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-']")
    private  WebElement fieldStatus;
    @FindBy(xpath = "//input[@name='cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--' and @type='text']")
    private WebElement fieldPrice;

    @FindBy(css="[class*='xcrud-action'][data-after*='list']")
    private WebElement buttonSaveReturn;

    public Dashboard(){

        Event.avoidToUse(3);

    }

    public Extras fillTheFields(){
        Event.avoidToUse(1);
        System.out.println("llenar fields");
        String name ="Pepito";
        Random generate=new Random();
        int result= (int)Math.random()*50+1;
        String res=Integer.toString(result);
        System.out.println(name);
        Event.fillWebElement(fieldName,name);
        Event.fillWebElement(fieldPrice,res);
        System.out.println(res);
        Event.clickWebElement(fieldStatus);
        return new Extras();
    }
    public Extras ButtonSaveExtrasReturn(){
        Event.avoidToUse(3);
        System.out.println("se a guardado correctamente");
        Event.clickWebElement(buttonSaveReturn);
        return new Extras();
    }



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

    public Extras selectAddButtonHotel(){
        clickWebElement(clickButtonAdd);
        System.out.println("click button");
        return new Extras();
    }





    ////////////Esto es para el button cards y submenu


    public Cars clickCarsSelected() {
        Event.clickWebElement(clickCarsSelected);
        Event.clickWebElement(clickCars);
        return new Cars();
    }

    public Cars setLeftPanel() {
        return  clickCarsSelected();
    }



    public Dashboard clickExtrasPrint(){

        Event.clickWebElement(clickSelectPrint);
        System.out.println("Verificar click extra");
        return this;
    }


}

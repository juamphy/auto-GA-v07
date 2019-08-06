package testingui.diplomadoumss.org.managepage.dashboard;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.extras.Extras;
import testingui.diplomadoumss.org.managepage.leftPanel.Cars;
import testingui.diplomadoumss.org.managepage.hotel.Hotels;


import java.util.Random;

import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Dashboard extends BasePage {
    ////esto son los accion submenu cars
    private Extras extras;
    @FindBy(xpath = "//*[@href='#Cars']")
    private WebElement clickCarsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin/cars']")
    private WebElement clickCars;

    @FindBy(xpath = "//*[@href='#Tours']")
    private WebElement clickSelectHotel;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin/tours/extras']")
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

    @FindBy(css="[class*='xcrud-action'][data-after*='edit']")
    private WebElement buttonSaveEditExtras;

    @FindBy(css="[class*='xcrud-action'][data-task*='list']")
    private WebElement selectForReturnListExtras;

    @FindBy(xpath = "//option[@value='No']")
    private WebElement selecctValueOption;

    @FindBy(xpath = "//option[@value='Yes']")
    private WebElement selecctValueOptionYes;

    @FindBy(xpath="//table/tbody/tr[1]//a[@data-task='edit']")
    private WebElement selectEditExtras;

    @FindBy(xpath = "//table/tbody/tr[1]//a[@data-task='view']")
    private WebElement selectShowExtras;

    @FindBy(xpath = "//table/tbody/tr[1]//a[contains(text(),' Assign ')]")
    private WebElement selectActionExtras;

    @FindBy (xpath = "//*[@id='s2id_autogen1']")
    private WebElement selectFieldAssign;

    @FindBy(xpath="//ul//li/div[@class='select2-result-label' and contains(text(),'Legoland Malaysia Day Pass')]")
    private WebElement selectOptionresult;



    @FindBy(css ="#assign14 button.btn.btn-primary")
    private WebElement clickButtonUpdateAssign;

    @FindBy(xpath = "//table/tbody/tr[1]//a[contains(text(),'Translate')]")
    private WebElement selectActionTranslate;

     //Excursiones a ciudad Paris
    @FindBy(xpath="//*[@id='extra14']//input[@type='text' and @name='translated[es][title]']")
    private WebElement selectFieldSpanish;

    @FindBy(xpath="//*[@id='extra14']//input[@type='text' and @name='translated[ar][title]']")
    private WebElement selectFieldArabia;

    @FindBy(css = "#extra14 button.btn.btn-primary")
    private WebElement selectUpdateButtonSpanish;

    @FindBy(xpath = "//table/tbody/tr[1]//a[@data-task='remove']")
    private WebElement clickButtonDelete;

    @FindBy(css ="[class*='xcrud-in-new-window'][data-task*='csv'] ")
    private WebElement clickSelectExportCsvPage;

//////////////////search filter

    @FindBy(xpath="//div//a[contains(text(),'Search')]")
    private WebElement clickButtonSearch;

    @FindBy(xpath="//*[@id='content']//span[1]/input")
    private WebElement selectFieldSearch;

    //Travel Insurance
    @FindBy(xpath = "//*[@id='content']//select[2]")
    private WebElement clickForDeploy;

    @FindBy(xpath="//*[@id='content']//select//option[contains(text(),'Name')]")
    private WebElement selectFilterByName;
    //
    @FindBy(xpath="//a[contains(text(),'Go')]")
    private WebElement clickButtonGo;

    @FindBy(xpath="//a[contains(text(),'Reset')]")
    private WebElement clickButtonReset;

    @FindBy(xpath="//*[@id=\"content\"]//table//thead//tr//th[6]")
    private WebElement filterColumnnaPrice;
    //////input[@type='hidden' and @name='extrasid' and @value='25']//button[contains(text(),'Update')]


    public Dashboard(){

        Event.avoidToUse(3);

    }

    public Extras selectActionAssign(){
//        Event.avoidToUse(2);
        Event.clickWebElement(selectActionExtras);
        return new Extras();
    }

    public Extras clickButtonUpdateOfAssign(){
        Event.clickWebElement(selectFieldAssign);
        Event.avoidToUse(2 );
        Event.clickWebElement(selectOptionresult);
        Event.avoidToUse(4);
        Event.clickWebElement(clickButtonUpdateAssign);
         return new Extras();
    }

    public Extras fillTheFields(){
        Event.avoidToUse(1);
        System.out.println("llenar fields");
        String name ="Eiffel Tower Summit";
        Random generate=new Random();
        int result= generate.nextInt(500);
        result+=4;
        String res=Integer.toString(result);
        System.out.println(name);
        Event.fillWebElement(fieldName,name);
        Event.fillWebElement(fieldPrice,res);
        System.out.println(res);
//        Event.clickWebElement(fieldStatus);
        Event.clickWebElement(selecctValueOption);
        return new Extras();
    }
    public Extras ButtonSaveExtrasReturn(){
        Event.avoidToUse(3);
        System.out.println("se a guardado correctamente");
        Event.clickWebElement(buttonSaveReturn);
        return new Extras();
    }

    public Extras selectButtonEdit(){
        Event.avoidToUse(3);
        System.out.print("se ha editado los datos");
        Event.clickWebElement(selectEditExtras);
        return new Extras();
    }
    public Extras selectEditSaveExtras(){
        Event.avoidToUse(2);
        String namechange ="Paris City Tours";
        Random generates=new Random();
        int results= generates.nextInt(400);
        results+=3;
        String ress=Integer.toString(results);
        Event.fillWebElement(fieldName,namechange);
        Event.fillWebElement(fieldPrice,ress);
        System.out.println(ress);
//        Event.clickWebElement(fieldStatus);
        Event.clickWebElement(selecctValueOptionYes);
        Event.clickWebElement(buttonSaveEditExtras);
        Event.avoidToUse(2);
        Event.clickWebElement(selectForReturnListExtras);
        return new Extras();

    }
    public Extras clickElementShowExtras(){
        Event.avoidToUse(2);
        Event.clickWebElement(selectShowExtras);
        Event.avoidToUse(2);
        Event.clickWebElement(selectForReturnListExtras);
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
        Event.avoidToUse(2);
        Event.clickWebElement(clickCars);
        return new Cars();
    }

    public Cars setLeftPanel() {
        return  clickCarsSelected();
    }



    public Dashboard clickExtrasPrint() {
        Event.avoidToUse(2);
        Event.clickWebElement(clickSelectPrint);
        System.out.println("Verificar click extra");
        //missing closet print

       // webDriver.switchTo().alert().dismiss();

        return this;
    }

    public Extras selectActionTranslate(){
        Event.avoidToUse(1);
        Event.clickWebElement(selectActionTranslate);
        Event.avoidToUse(2);
        String tsAribia="العودة تذاكر الطيران";
        Event.fillWebElement(selectFieldArabia,tsAribia);
        String tspanish="Excursiones a ciudad Paris";
        Event.fillWebElement(selectFieldSpanish,tspanish);
        Event.avoidToUse(1);
        Event.clickWebElement(selectUpdateButtonSpanish);
        return new Extras();
    }
    public Extras selectButtonDelete(){
        Event.avoidToUse(1);
        Event.clickWebElement(clickButtonDelete);
        Event.avoidToUse(1);
        webDriver.switchTo().alert().accept();
        return new Extras() ;
    }

    public Extras clickSelectExportCVS(){
        Event.avoidToUse(2);
        Event.clickWebElement(clickSelectExportCsvPage);
        return new Extras();

    }
    public Extras filterByName(){
        Event.avoidToUse(1);
        Event.clickWebElement(clickButtonSearch);
        Event.avoidToUse(1);
        String filldata="3 Nights Accomodatio";
        Event.fillWebElement(selectFieldSearch,filldata);
        Event.avoidToUse(1);
        Event.clickWebElement(clickForDeploy);
        Event.avoidToUse(1);
        Event.clickWebElement(selectFilterByName);
        Event.avoidToUse(1);
        Event.clickWebElement(clickButtonGo);
        Event.avoidToUse(4);
        Event.clickWebElement(clickButtonReset);
        return new Extras();
    }
        public void  exitPage(){
            webDriver.close();

        }
      public Extras  selectColumnaPrice(){
              Event.avoidToUse(2);
              Event.clickWebElement(filterColumnnaPrice);
              return new Extras();
      }
}
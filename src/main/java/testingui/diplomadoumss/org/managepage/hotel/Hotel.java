package testingui.diplomadoumss.org.managepage.hotel;

import static testingui.diplomadoumss.org.manageevents.Event.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

public class Hotel extends BasePage {

    //@FindBy(xpath = "//*[@id=\"Hotels\"]/li[1]/a")
    @FindBy(xpath = "//*[@id=\"SPECIAL_OFFERS\"]/li[1]/a")
    private WebElement hotelsLiExpand;

    //@FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement addHotel;

    @FindBy(xpath = "//a[contains(text(),'Print')]")
    private WebElement clickPrint;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/a[2]")
    private WebElement clickExport;

    public Hotel() {
//        isWebElementVisible(bookingLink);
//        avoidToUse(1);
    }

    public Hotel clickHotelsLi() {
        clickWebElement(hotelsLiExpand);
        return this;
    }
    public Hotel clickAddHotel() {
        clickWebElement(addHotel);
        return this;
    }
    public Hotel clickPrintButton() {
        clickWebElement(clickPrint);
        return this;
    }

    public Hotel clickExportButton() {
        clickWebElement(clickExport);
        return this;
    }
}

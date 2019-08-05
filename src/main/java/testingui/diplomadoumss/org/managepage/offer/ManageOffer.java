package testingui.diplomadoumss.org.managepage.offer;

import static testingui.diplomadoumss.org.manageevents.Event.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

public class ManageOffer extends BasePage{

    //@FindBy(xpath = "//*[@id=\"Hotels\"]/li[1]/a")
    @FindBy(xpath = "//*[@id=\"SPECIAL_OFFERS\"]/li[1]/a")
    private WebElement offersLiExpand;

    //@FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement addOffer;

    @FindBy(xpath = "//a[contains(text(),'Print')]")
    private WebElement clickOfferPrint;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/a[2]")
    private WebElement clickOfferExport;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[9]/span/a[1]")
    private WebElement clickOfferEdit;

    @FindBy(xpath = "//*[@id=\"1\"]")
    private WebElement clickOfferDelete;

    public ManageOffer() {

    }

    public ManageOffer clickOffersLi() {
        clickWebElement(offersLiExpand);
        return this;
    }
    public ManageOffer clickAddOffer() {
        clickWebElement(addOffer);
        return this;
    }
    public ManageOffer clickPrintButton() {
        clickWebElement(clickOfferPrint);
        return this;
    }
    public ManageOffer clickExportButton() {
        clickWebElement(clickOfferExport);
        return this;
    }
    public ManageOffer clickEditButton() {
        clickWebElement(clickOfferEdit);
        return this;
    }
    public ManageOffer clickDeleteButton() {
        clickWebElement(clickOfferDelete);
        return this;
    }
}

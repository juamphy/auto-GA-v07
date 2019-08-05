package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Hotels;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Reviews;
import testingui.diplomadoumss.org.managepage.pagecomponents.ExportCSV;
import testingui.diplomadoumss.org.managepage.pagecomponents.Printing;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//*[@href='#Tours']")
    private WebElement clickReviewsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin/tours/reviews']")
    private WebElement clickReviews;

    @FindBy(xpath = "//a[contains(text(), 'Print')]")
    private WebElement clickPrinting;

    @FindBy(xpath = "//a[contains(text(), 'Export into CSV')]")
    private WebElement clickExportCsv;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[9]/span/a[2]")
    private WebElement clickEditButton;

    @FindBy(xpath="//input[@name='cHRfcmV2aWV3cy5yZXZpZXdfbmFtZQ--' and @type='text']")
    private WebElement fieldName;

    @FindBy(xpath="//input[@name='cHRfcmV2aWV3cy5yZXZpZXdfZW1haWw-' and @type='text']")
    private WebElement fieldEmail;

    @FindBy(xpath="//textarea[@name='cHRfcmV2aWV3cy5yZXZpZXdfY29tbWVudA--']")
    private WebElement textAreaComments;

    @FindBy(xpath = "//a[contains(text(), 'Save & Return')]")
    private WebElement saveAndReturn;

    @FindBy(xpath = "//a[contains(text(), 'Return')]")
    private WebElement returnbutton;

    public Dashboard(){
       Event.avoidToUse(5000);
    }

    public Hotels clickReviews() {
        Event.clickWebElement(clickReviewsSelected);
        Event.clickWebElement(clickReviews);
        return new Hotels();
    }

    public Hotels setLeftPanel() {
        Event.avoidToUse(2);
        return clickReviews();
    }

    public Printing clickPrinting() {
        Event.clickWebElement(clickPrinting);
        return new Printing();
    }

    public ExportCSV clickExportCSV() {
        Event.clickWebElement(clickExportCsv);
        return new ExportCSV();
    }

    public Reviews clickEditButton() {
        Event.avoidToUse(2);
        Event.clickWebElement(clickEditButton);
        return new Reviews();
    }

    public Reviews fillFieldsOnEdit(){
        Event.avoidToUse(2);
        String name = "Don Pepe";
        String email = "elcharro@gmail.com";
        String comentario = "esto se usa para llenar un comentario enorme";
        Event.fillWebElement(fieldName, name);
        Event.fillWebElement(fieldEmail, email);
        Event.fillWebElement(textAreaComments, comentario);
        Event.avoidToUse(2);
        return new Reviews();
    }

    public Reviews clickOnReturnButton() {
        Event.avoidToUse(3);
        Event.clickWebElement(returnbutton);
        return new Reviews();
    }

    public Reviews clickOnSaveAndReturnButton() {
        Event.avoidToUse(3);
        Event.clickWebElement(saveAndReturn);
        return new Reviews();
    }

}

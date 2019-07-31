package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.reviews.Hotels;
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

    public Dashboard(){
       Event.avoidToUse(5000);
    }

    public Hotels clickReviews() {
        Event.clickWebElement(clickReviewsSelected);
        Event.clickWebElement(clickReviews);
        return new Hotels();
    }

    public Hotels setLeftPanel() {
        return  clickReviews();
    }

    public Printing clickPrinting() {
        Event.clickWebElement(clickPrinting);
        return new Printing();
    }

    public ExportCSV clickExportCSV() {
        Event.clickWebElement(clickExportCsv);
        return new ExportCSV();
    }

}

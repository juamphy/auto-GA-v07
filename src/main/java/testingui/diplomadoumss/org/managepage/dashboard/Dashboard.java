package testingui.diplomadoumss.org.managepage.dashboard;

import static testingui.diplomadoumss.org.manageevents.Event.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import javax.xml.xpath.XPath;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Hotels') and @aria-expanded='false']")
    private WebElement hotelsExpand;

    @FindBy(xpath = "//*[@id=\"Hotels\"]/li[1]/a")
    private WebElement hotelsLiExpand;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement addHotel;

//    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[1]/div/ins")
//    private WebElement checkboxList;
     //Quiz//
    @FindBy(xpath = "//a[contains(text(),'NASA API Listing')]")
    private WebElement nasaApiListingExpand;


    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li/a")
    private WebElement nasaApiListingExpandLink;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

//    public Dashboard clickCarsExpand() {
//        clickWebElement(carsExpand);
//        return this;
//    }
//
//    public Dashboard clickHotelsExpand() {
//        clickWebElement(hotelsExpand);
//        return this;
//    }
//    public Dashboard clickHotelsLi() {
//        clickWebElement(hotelsLiExpand);
//        return this;
//    }
//    public Dashboard clickAddHotel() {
//        clickWebElement(addHotel);
//        return this;
//    }
//    public Dashboard clickSelectAll() {
//        clickWebElement(checkboxList);
//        return this;
//    }

    public Dashboard clickNasaApiListing() {
        clickWebElement(nasaApiListingExpand);
        return this;
    }
}

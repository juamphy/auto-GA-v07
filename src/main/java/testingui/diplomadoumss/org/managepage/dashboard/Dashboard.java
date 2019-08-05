package testingui.diplomadoumss.org.managepage.dashboard;

import static testingui.diplomadoumss.org.manageevents.Event.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.hotel.Hotel;
import testingui.diplomadoumss.org.managepage.offer.ManageOffer;

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

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[13]/a")
    private WebElement offersExpand;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public Hotel clickHotelsExpand() {  //hotels
        avoidToUse(1);
        clickWebElement(hotelsExpand);
        return new Hotel();
    }

    public ManageOffer clickOffersExpand() {  //offers
        avoidToUse(1);
        clickWebElement(offersExpand);
        return new ManageOffer();
    }
}

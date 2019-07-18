package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftPanel.Hotels;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//*[@href='#Hotels']")
    private WebElement clickRoomsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/hotels/rooms']")
    private WebElement clickRooms;

    public Dashboard(){
       Event.avoidToUse(5000);
    }

    public Hotels clickRooms() {
        Event.clickWebElement(clickRoomsSelected);
        Event.clickWebElement(clickRooms);
        return new Hotels();
    }

    public Hotels setLeftPanel() {
        return  clickRooms();
    }

}

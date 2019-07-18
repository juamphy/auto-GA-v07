package testingui.diplomadoumss.org.managepage.leftPanel.hotels.rooms;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

public class Hotels extends BasePage {

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnAddRooms;


    public Hotels btnAddRooms(){
        Event.clickWebElement(btnAddRooms);
        return new Hotels();
    }

    public Hotels addBtn() {
        return  btnAddRooms();
    }
}

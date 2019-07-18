package testingui.diplomadoumss.org.managepage.leftPanel.hotels.rooms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

public class CreateRoom extends BasePage {

    @FindBy(xpath = "//input[@name='basicprice' and @type='number']")
    private WebElement priceRoom;

    @FindBy(xpath = "//ul[@class='select2-results']//li//div[. = 'One-Bedroom Apartment']")
    private WebElement selectRoomType;


    public CreateRoom setPrice(String price){
        Event.fillWebElement(priceRoom,price);
        return this;
    }

    public CreateRoom selectRoomType(){
        Event.clickWebElement(selectRoomType);
        return new CreateRoom();
    }

    public  CreateRoom selectRoomT(){
        return setPrice("222").
                selectRoomType();
    }
}

package testingui.diplomadoumss.org.managepage.hotels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Rooms extends BasePage {

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/hotels/rooms']")
    private WebElement clickRooms;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement addRooms;

    @FindBy(xpath = "//input[@name='basicprice']")
    private WebElement price;

    @FindBy(xpath = "//input[@name='quantity']")
    private WebElement quantity;

    @FindBy(xpath = "//input[@name='minstay']")
    private WebElement minstay;

    @FindBy(xpath = "//input[@name='adults']")
    private WebElement adults;

    @FindBy(xpath = "//input[@name='children']")
    private WebElement children;

    @FindBy(xpath = "//input[@name='extrabeds']")
    private WebElement extrabeds;

    @FindBy(xpath = "//input[@name='bedcharges']")
    private WebElement bedcharges;

    @FindBy(xpath = "//div[@class='col-md-6']//select//option[@value='107']")
//    @FindBy(id = "s2id_autogen1")
    private WebElement selectTypeRoom;

    @FindBy(xpath = "//div[@class='col-md-6']//select//option[@value='32']")
    private WebElement selectHotel;

    @FindBy(xpath = "//button[@id='add']")
    private WebElement clickButtonAdd;

    @FindBy(xpath = "//table//tbody//tr[1]//td[9]//a")
    private WebElement clickUploadButton;

    @FindBy(xpath = "//table//tr//th//a[@class='btn btn-success']")
    private WebElement addButtonImage;

    @FindBy(xpath = "//div[@id='UploadPhotos']//div//div[@class='modal-body']//div[@id='dropzone']")
    private WebElement uploadImage;

    public Rooms() {
//        isWebElementVisible(bookingLink);
//        avoidToUse(3);
    }

    public Rooms clickRooms() {
        clickWebElement(clickRooms);
//        avoidToUse(3);
        clickWebElement(addRooms);
        return this;
    }

    public Rooms setAddRoomsFieldsEmpty(){
        clickWebElement(clickButtonAdd);
        return  this;
    }

    public Rooms setAddRoomsFields(){
        avoidToUse(10);
        clickWebElement(selectTypeRoom);
        avoidToUse(2);
        clickWebElement(selectHotel);
        avoidToUse(2);
        int priceVal = (int)(Math.random()*10+1);
        String value= String.valueOf(priceVal);
        fillWebElement(price,value);
        fillWebElement(quantity,value);
        fillWebElement(minstay,value);
        fillWebElement(adults,value);
        fillWebElement(children,value);
        fillWebElement(extrabeds,value);
        fillWebElement(bedcharges,value);
        avoidToUse(3);
        clickWebElement(clickButtonAdd);
        return this;
    }

    public Rooms setUploadButton(){
        avoidToUse(10);
        clickWebElement(clickUploadButton);
        clickWebElement(addButtonImage);
        avoidToUse(10);

//       uploadImage.sendKeys("D://room1.jpg");
        uploadImage.click();
        return this;
    }
}

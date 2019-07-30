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

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin/tours']")
    private WebElement clickRooms;

    @FindBy(xpath = "//form[@class='add_button']//button[@type='submit']")
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

    @FindBy(xpath = "//input[@name='tourname']")
//    @FindBy(id = "s2id_autogen1")
    private WebElement addTourName;

    @FindBy(xpath = "//div[@class='row form-group']//select//option[@value='5']")
    private WebElement stars;

    @FindBy(xpath = "//input[@name='tourdays']")
    private WebElement tourdays;

    @FindBy(xpath = "//input[@name='tournights']")
    private WebElement tournights;

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
//        clickWebElement(addRooms);
        return this;
    }

    public Rooms clickAddButton(){
        clickWebElement(addRooms);
        return this;
    }

//    public Rooms setAddRoomsFieldsEmpty(){
//        clickWebElement(clickButtonAdd);
//        return  this;
//    }

    public Rooms setAddRoomsFields(){
        avoidToUse(10);
        fillWebElement(addTourName,"New Tour Example");
        avoidToUse(2);
        clickWebElement(stars);
        avoidToUse(2);
        fillWebElement(tourdays,"3");
        fillWebElement(tournights,"2");
        return this;
    }

//    public Rooms setUploadButton(){
//        avoidToUse(10);
//        clickWebElement(clickUploadButton);
//        clickWebElement(addButtonImage);
//        avoidToUse(10);
//
////       uploadImage.sendKeys("D://room1.jpg");
//        uploadImage.click();
//        return this;
//    }
}

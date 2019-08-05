package testingui.diplomadoumss.org.managepage.hotels;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Rooms extends BasePage {

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin/tours']")
    private WebElement clickRooms;

    @FindBy(xpath = "//form[@class='add_button']//button[@type='submit']")
    private WebElement addRooms;

    @FindBy(xpath = "//input[@name='minstay']")
    private WebElement minstay;

    @FindBy(xpath = "//input[@name='children']")
    private WebElement children;

    @FindBy(xpath = "//input[@name='extrabeds']")
    private WebElement extrabeds;

    @FindBy(xpath = "//input[@name='bedcharges']")
    private WebElement bedcharges;

    @FindBy(xpath = "//input[@name='tourname']")
    private WebElement addTourName;

    @FindBy(xpath = "//table//tr//td//input[@name='maxadult']")
    private WebElement quantity;

    @FindBy(xpath = "//table//tr//td//input[@name='adultprice']")
    private WebElement price;

    @FindBy(xpath = "//table//tr//td//span[@id='adultbtn']")
    private WebElement clickEnable;

    @FindBy(xpath = "//table//tr//td//span[@id='childbtn']")
    private WebElement clickDisabledChildButton;

    @FindBy(xpath = "//table//tr//td//span[@id='infantbtn']")
    private WebElement clickDisabledInfantButton;

    @FindBy(xpath = "//div[@class='row form-group']//select//option[@value='5']")
    private WebElement stars;

    @FindBy(xpath = "//input[@name='tourdays']")
    private WebElement tourdays;

    @FindBy(xpath = "//input[@name='tournights']")
    private WebElement tournights;

    @FindBy(xpath = "//div[@class='row form-group']//select//option[@value='199']")
    private WebElement tourType;

    @FindBy(xpath = "//select[@id='isfeatured']//option[@value='no']")
    private WebElement featured;

    @FindBy(xpath = "//div[@id='s2id_locationlist1']//a")
    private WebElement clickLocation;

    @FindBy(xpath = "//ul[@class='select2-results']//li//div[@class='select2-result-label' and contains(text(),'Ag')]")
    private WebElement searchLocation;

    @FindBy(xpath = "//button[@id='add']")
    private WebElement saveButton;

    @FindBy(xpath = "//table//tr//th//a[@class='btn btn-success']")
    private WebElement addButtonImage;

    @FindBy(xpath = "//div[@id='UploadPhotos']//div//div[@class='modal-body']//div[@id='dropzone']")
    private WebElement uploadImage;

    public Rooms() {
    }

    public Rooms clickRooms() {
        clickWebElement(clickRooms);
        return this;
    }

    public Rooms clickAddButton(){
        clickWebElement(addRooms);
        return this;
    }


    public Rooms setAddRoomsFields(){
        avoidToUse(10);
        fillWebElement(addTourName,"New Tour Example");
        avoidToUse(2);
        fillWebElement(quantity,"5");
        fillWebElement(price, "60$");
        clickWebElement(clickEnable);
        clickWebElement(clickDisabledChildButton);
        clickWebElement(clickDisabledInfantButton);
        clickWebElement(stars);
        avoidToUse(2);
        fillWebElement(tourdays,"3");
        fillWebElement(tournights,"2");
        clickWebElement(tourType);
        clickWebElement(featured);
        clickWebElement(clickLocation);
        avoidToUse(3);
//        fillWebElement(searchLocation, "New test");
        clickWebElement(saveButton);
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

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div//a[@data-task='print']")
    private WebElement clickPrint;


    public Rooms print(){
        clickWebElement(clickPrint);
        return this;
    }

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div//a[@data-task='csv']")
    private WebElement clickExport;

    public Rooms export(){
        clickWebElement(clickExport);
        return this;
    }

    @FindBy(xpath = "//td[@class='xcrud-current xcrud-actions xcrud-fix']//span//a[@href='https://www.phptravels.net/admin/tours/manage/Spectaculars-Of-The-Nile-3-Nights']")
    private WebElement clickEditIcon;

    @FindBy(xpath = "//button[@id='update']")
    private WebElement editButton;

    public Rooms clickEdit() {
        clickWebElement(clickEditIcon);
        avoidToUse(3);
        clickWebElement(featured);
        avoidToUse(5);
        clickWebElement(editButton);
        return this;
    }

    @FindBy(xpath = "//td[@class='xcrud-current xcrud-actions xcrud-fix']//span//a[@id='36']")
    private WebElement clickDeleteIcon;

    public Rooms clickDelete() {
        clickWebElement(clickDeleteIcon);
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        return this;
    }

    @FindBy(xpath = "//div[@class='xcrud-nav']//button[@data-limit='100']")
    private WebElement paginationOption;

    public  Rooms pagination(){
        clickWebElement(paginationOption);
        return this;
    }


    @FindBy(xpath = "//div[@class='xcrud-nav']//a[@class='xcrud-search-toggle btn btn-default']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='xcrud-nav']//input[@name='phrase']")
    private WebElement inputSearch;

    @FindBy(xpath = "//div[@class='xcrud-nav']//a[@class='xcrud-action btn btn-primary']")
    private WebElement goButton;

    public  Rooms searchBtn(){
        clickWebElement(searchButton);
        avoidToUse(3);
        fillWebElement(inputSearch, "hong");
        clickWebElement(goButton);
        return this;
    }

    @FindBy(xpath = "//li[@id='logout']//a")
    private WebElement clickLogout;

    public Rooms logout(){
        clickWebElement(clickLogout);
        return this;
    }


}

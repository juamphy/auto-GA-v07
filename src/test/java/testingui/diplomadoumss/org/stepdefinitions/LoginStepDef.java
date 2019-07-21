package testingui.diplomadoumss.org.stepdefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.extras.Extras;
import testingui.diplomadoumss.org.managepage.leftPanel.Cars;

import testingui.diplomadoumss.org.managepage.hotel.Hotels;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepDef {
    private Login login;
    private Dashboard dashboard;
    private Extras extras;
    private Cars cars;
    private Hotels hotels;


    @Given("^I load PHP Travels$")
    public void iLoadPHPTravels() {
        login = LoadPage.loadPHPTravels();
    }

    @And("^set my credentials  on 'Login' page$")
    public void setMyCredentialsOnLoginPage() {
        dashboard = login.setCredentials();
    }

    @And("^Click 'Cars' link on 'Left Panel' Page$")
    public void clickCarsLinkOnLeftPanelPage() {

        cars = dashboard.setLeftPanel();
    }


    @And("^Click 'Hotels' link on 'Left Panel' Page$")
    public void clickHotelsLinkOnLeftPanelPage() {
         dashboard.clickExtrasLinksIntoHotelsOptions();

    }

   
    @And("^I press 'ButtonAdd' page$")
    public void iPressButtonAddPage() {
        dashboard.selectAddButtonHotel();
    }

    @And("^I validation of fields 'Add Extras' Page$")
    public void iValidationOfFieldsAddExtrasPage() {
        dashboard.fillTheFields();
    }

    @And("^I press 'SaveReturn' page$")
    public void iPressSaveReturnPage() {
            dashboard.ButtonSaveExtrasReturn();
    }


    @And("^I press 'EditButtonExtras' page$")
    public void iPressEditButtonExtrasPage() {
        dashboard.selectButtonEdit();
    }


    @And("^I press 'PrintExtras ' Page$")
    public void iPressPrintExtrasPage() {
            dashboard.clickExtrasPrint();
    }

    @And("^I press 'EditSave' page$")
    public void iPressEditSavePage() {
        dashboard.selectEditSaveExtras();
    }

    @And("^I press 'ShowExtras' page$")
    public void iPressShowExtrasPage() {
        dashboard.clickElementShowExtras();
    }
    @And("^I press 'ExportExtras' Page$")
    public void iPressExportExtrasPage() {

    }



}

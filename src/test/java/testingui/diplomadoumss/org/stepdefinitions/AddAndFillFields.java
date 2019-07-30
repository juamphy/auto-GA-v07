package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class AddAndFillFields {

    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case Add Button$")
    public void iLoadPHPTravelsCaseAddButton() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' case Add Button$")
    public void setMyCredencialsOnLoginCaseAddButton() {
        dashboard = login.setCredentials();
    }

    @And("^click 'Tours' link on 'Left Panel' page case Add Button$")
    public void clickToursLinkOnLeftPanelPageCaseAddButton() {
        rooms = dashboard.clickHotelsExpand();
    }

    @And("^Click 'Tours' in a Select Options Tours case Add Button$")
    public void clickToursInASelectOptionsToursCaseAddButton() {
        rooms.clickRooms();
    }

    @And("^click in 'Add Tours' on 'Tours page' and Fill Fields$")
    public void clickInAddToursOnToursPageAndFillFields() {
        rooms.clickAddButton();
        rooms.setAddRoomsFields();
    }


}

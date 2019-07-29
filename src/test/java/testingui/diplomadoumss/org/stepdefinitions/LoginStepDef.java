package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepDef {

    private Login login;
    private Dashboard dashboard;
    private Rooms rooms;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickCarsExpand();
    }

    @And("^click 'Rooms' link on 'Left Panel' page$")
    public void clickRoomsLinkOnLeftPanelPage() {
        rooms = dashboard.clickHotelsExpand();
    }

    @And("^click 'Add' link on 'Rooms' page$")
    public void clickAddLinkOnRoomsPage() {
        rooms.clickRooms();
    }

    @And("^set fields on 'Add Rooms Modal ' on 'Rooms page'$")
    public void setFieldsOnAddRoomsModalOnRoomsPage() {
        rooms.setAddRoomsFieldsEmpty();
        rooms.setAddRoomsFields();
        rooms.setUploadButton();
    }

}

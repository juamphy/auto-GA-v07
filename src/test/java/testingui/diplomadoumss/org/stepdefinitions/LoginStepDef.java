package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.rooms.CreateRoom;
import testingui.diplomadoumss.org.managepage.leftPanel.hotels.rooms.Hotels;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepDef {

    private Login login;
    private Dashboard dashboard;
    private Hotels hotels;
    private CreateRoom createRoom;

    @Given("^I load PHP Travels$")
    public void iLoadPHPTravels() {
        login = LoadPage.loadPHPTravels();
    }

    @And("^set my credentials  on 'Login' page$")
    public void setMyCredentialsOnLoginPage() {
        dashboard = login.setCredentials();
    }

    @And("^Click 'Hotels' link on 'Left Panel' Page$")
    public void clickHotelsLinkOnLeftPanelPage() {
        hotels = dashboard.setLeftPanel();
    }

    @And("^Click 'AddButton'$")
    public void clickAddButton() {
        hotels = hotels.addBtn();
    }

    @And("^set data on 'CreateRoom' page$")
    public void setDataOnCreateRoomPage() {
        createRoom = createRoom.selectRoomT();
    }
}

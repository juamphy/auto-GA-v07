package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class Delete {

    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case delete icon$")
    public void iLoadPHPTravelsCaseDeleteIcon() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' case delete icon$")
    public void setMyCredencialsOnLoginCaseDeleteIcon() {
        dashboard = login.setCredentials();

    }

    @And("^click 'Tours' link on 'Left Panel' page case delete icon$")
    public void clickToursLinkOnLeftPanelPageCaseDeleteIcon() {
        rooms = dashboard.clickHotelsExpand();


    }

    @And("^Click 'Tours' in a Select Options Tours case delete icon$")
    public void clickToursInASelectOptionsToursCaseDeleteIcon() {
        rooms.clickRooms();

    }

    @And("^Click 'Delete' case Delete icon Tours$")
    public void clickDeleteCaseDeleteIconTours() {
        rooms.clickDelete();
    }
}

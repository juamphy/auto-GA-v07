package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.manageloadpage.LoadPageDashBoard;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class ToursClickLeftPanel {

    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case Tour-Tours$")
    public void iLoadPHPTravelsCaseTourTours() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page Case Tour-Tours$")
    public void setMyCredencialsOnLoginPageCaseTourTours() {
        dashboard = login.setCredentials();
    }


    @And("^click 'Tours' link on 'Left Panel' page$")
    public void clickToursLinkOnLeftPanelPage() {
        rooms = dashboard.clickHotelsExpand();
    }

    @And("^Click 'Tours' in a Select Options Tours$")
    public void clickToursInASelectOptionsTours() {
        rooms.clickRooms();
    }
}

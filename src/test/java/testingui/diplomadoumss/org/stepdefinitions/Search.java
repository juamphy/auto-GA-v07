package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class Search {

    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case Search button$")
    public void iLoadPHPTravelsCaseSearchButton() {
        login = LoadPage.loadPPHPTravels();

    }

    @And("^set my credencials  on 'Login' Search button$")
    public void setMyCredencialsOnLoginSearchButton() {
        dashboard = login.setCredentials();

    }

    @And("^click 'Tours' link on 'Left Panel' Search button$")
    public void clickToursLinkOnLeftPanelSearchButton() {
        rooms = dashboard.clickHotelsExpand();

    }

    @And("^Click 'Tours' in a Select Options Tours Search button$")
    public void clickToursInASelectOptionsToursSearchButton() {
        rooms.clickRooms();
    }

    @And("^Click 'Search' button in pagination$")
    public void clickSearchButtonInPagination() {
        rooms.searchBtn();
    }
}

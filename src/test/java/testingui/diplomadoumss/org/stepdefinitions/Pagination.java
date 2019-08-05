package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class Pagination {

    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case Pagination Options$")
    public void iLoadPHPTravelsCasePaginationOptions() {
        login = LoadPage.loadPPHPTravels();

    }

    @And("^set my credencials  on 'Login' Pagination Options$")
    public void setMyCredencialsOnLoginPaginationOptions() {
        dashboard = login.setCredentials();

    }

    @And("^click 'Tours' link on 'Left Panel' pPagination Options$")
    public void clickToursLinkOnLeftPanelPPaginationOptions() {
        rooms = dashboard.clickHotelsExpand();


    }

    @And("^Click 'Tours' in a Select Options Tours Pagination Options$")
    public void clickToursInASelectOptionsToursPaginationOptions() {
        rooms.clickRooms();

    }


    @And("^Click 'Pagination' pagination options$")
    public void clickPaginationPaginationOptions() {
        rooms.pagination();
    }
}

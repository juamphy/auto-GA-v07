package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class PrintTours {

    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case Print Tours$")
    public void iLoadPHPTravelsCasePrintTours() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' case Print Tours$")
    public void setMyCredencialsOnLoginCasePrintTours() {
        dashboard = login.setCredentials();
    }

    @And("^click 'Tours' link on 'Left Panel' page case Print Tours$")
    public void clickToursLinkOnLeftPanelPageCasePrintTours() {
        rooms = dashboard.clickHotelsExpand();
    }

    @And("^Click 'Tours' in a Select Options Tours case Print Tours$")
    public void clickToursInASelectOptionsToursCasePrintTours() {
        rooms.clickRooms();
    }

    @And("^Click 'PRINT' button tours$")
    public void clickPRINTButtonTours() {
        rooms.print();
    }
}

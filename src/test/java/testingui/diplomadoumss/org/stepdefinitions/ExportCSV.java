package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class ExportCSV {

    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;
    
    
    @Given("^I load PHP travels Case EXPORT INTO CSV button$")
    public void iLoadPHPTravelsCaseEXPORTINTOCSVButton() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' case EXPORT INTO CSV button$")
    public void setMyCredencialsOnLoginCaseEXPORTINTOCSVButton() {
        dashboard = login.setCredentials();
    }

    @And("^click 'Tours' link on 'Left Panel' page case EXPORT INTO CSV button$")
    public void clickToursLinkOnLeftPanelPageCaseEXPORTINTOCSVButton() {
        rooms = dashboard.clickHotelsExpand();
    }

    @And("^Click 'Tours' in a Select Options Tours case EXPORT INTO CSV button$")
    public void clickToursInASelectOptionsToursCaseEXPORTINTOCSVButton() {
        rooms.clickRooms();
    }

    @And("^Click in 'EXPORT INTO CSV'$")
    public void clickInEXPORTINTOCSV() {
        rooms.export();
    }
}

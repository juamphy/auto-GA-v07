package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class Edit {
    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case edit icon$")
    public void iLoadPHPTravelsCaseEditIcon() {
        login = LoadPage.loadPPHPTravels();

    }

    @And("^set my credencials  on 'Login' case edit icon$")
    public void setMyCredencialsOnLoginCaseEditIcon() {
        dashboard = login.setCredentials();

    }

    @And("^click 'Tours' link on 'Left P anel' page case edit icon$")
    public void clickToursLinkOnLeftPAnelPageCaseEditIcon() {
        rooms = dashboard.clickHotelsExpand();


    }

    @And("^Click 'Tours' in a Select Options Tours case edit icon$")
    public void clickToursInASelectOptionsToursCaseEditIcon() {
        rooms.clickRooms();

    }

    @And("^Click 'Edit' Tours$")
    public void clickEditTours() {
        rooms.clickEdit();
    }
}

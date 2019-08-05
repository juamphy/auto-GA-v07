package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.hotels.Rooms;
import testingui.diplomadoumss.org.managepage.login.Login;

public class Logout {
    private Dashboard dashboard;
    private Rooms rooms;
    private Login login;

    @Given("^I load PHP travels Case Logout Account$")
    public void iLoadPHPTravelsCaseLogoutAccount() {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' Logout Account$")
    public void setMyCredencialsOnLoginLogoutAccount() {
        dashboard = login.setCredentials();
    }

    @And("^click in 'Logout' Account$")
    public void clickInLogoutAccount() {
        rooms.logout();
    }
}

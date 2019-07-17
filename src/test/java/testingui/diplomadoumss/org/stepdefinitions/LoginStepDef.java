package testingui.diplomadoumss.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.leftPanel.CarsLeftPanel;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepDef {

    private Login login;
    private Dashboard dashboard;
    private CarsLeftPanel carsLeftPanel;

    @Given("^I load PHP Travels$")
    public void iLoadPHPTravels() {
        login = LoadPage.loadPHPTravels();
    }

    @And("^set my credentials  on 'Login' page$")
    public void setMyCredentialsOnLoginPage() {
        dashboard = login.setCredentials();
    }

    @And("^Click 'Cars' link on 'Left Panel' Page$")
    public void clickCarsLinkOnLeftPanelPage() {
        carsLeftPanel = dashboard.setLeftPanel();
    }
}

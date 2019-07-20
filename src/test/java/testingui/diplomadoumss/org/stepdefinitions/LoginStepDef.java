package testingui.diplomadoumss.org.stepdefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.leftPanel.Cars;
import testingui.diplomadoumss.org.managepage.leftPanel.Extras;
import testingui.diplomadoumss.org.managepage.leftPanel.Hotels;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepDef {
    private Login login;
    private Dashboard dashboard;
    private Cars cars;
    private Hotels hotels;
    private Extras extras;

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

        cars = dashboard.setLeftPanel();
    }


    @And("^Click 'Hotels' link on 'Left Panel' Page$")
    public void clickHotelsLinkOnLeftPanelPage() {
        hotels = dashboard.clickExtrasLinksIntoHotelsOptions();

    }

    @And("^I press 'PrintExtras ' Page$")
    public void iPressPrintExtrasPage() {
        extras=dashboard.selectButtonPrint();
    }

    @And("^I press 'ButtonAdd' page$")
    public void iPressButtonAddPage() {
        extras=dashboard.clickselectAdd();
    }


//    @And("^I press 'ExportExtras' Page$")
//    public void iPressExportExtrasPage() {
//        extras=dashboard.selectOptionAdd();
//    }



}

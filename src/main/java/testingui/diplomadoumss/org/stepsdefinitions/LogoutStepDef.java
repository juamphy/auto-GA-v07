package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.core.InjectionContext;
import testingui.diplomadoumss.org.managepage.logout.Logout;

public class LogoutStepDef {

    InjectionContext testContext;
    Logout logout;

    public LogoutStepDef(InjectionContext context) {
        testContext = context;
        logout = testContext.getPageObjectManager().getLogout();
    }

    public LogoutStepDef() {

    }

    @And("^click 'Logout' button on 'Header' page$")
    public void clickLogoutButtonOnHeaderPage() {
        logout.clickLoguot();
    }
}

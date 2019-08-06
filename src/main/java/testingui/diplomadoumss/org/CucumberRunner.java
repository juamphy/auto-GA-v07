package testingui.diplomadoumss.org;

import cucumber.api.CucumberOptions;
import testingui.diplomadoumss.org.core.DriverManager;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;

@CucumberOptions(
        features = {"src/main/resources/features"},
        format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"}
)

public class CucumberRunner extends AbstractTestNGCucumberTests{

    @AfterTest
    public void quitBrowser(){
        DriverManager.getInstance().getWebDriver().quit();
    }
}


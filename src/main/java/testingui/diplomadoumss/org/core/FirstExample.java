package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) {

//        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
//        webDriver.get(PropertyAccesor.getInstance().getURL());
//        webDriver.quit();
//
        Login login = new Login();
        login.initBrowser();
        login.setCredentials();

        Dashboard dashboard = new Dashboard();
        dashboard.setLeftPanel();
    }

    public static void exampleMap(){
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}

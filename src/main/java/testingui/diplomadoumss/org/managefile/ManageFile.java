package testingui.diplomadoumss.org.managefile;

import org.openqa.selenium.json.Json;

public class ManageFile {

    private static ManageFile ourInstance = new ManageFile();

    public static ManageFile getInstance() {
        return ourInstance;
    }

    private ManageFile() {
    }


    public Json getJsonFile(String path) {
        return null;
    }
}


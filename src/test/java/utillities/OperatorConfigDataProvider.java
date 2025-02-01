package utillities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OperatorConfigDataProvider {

    private Properties properties;

public OperatorConfigDataProvider() {
        String projectLocation = System.getProperty("user.dir");
        String confFile = projectLocation + "/config/config.properties";
        try {
            File conf = new File(confFile);
            FileInputStream fileInputStream = new FileInputStream(conf);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println();
        }
    }

    public String getURL() {
        String URL = properties.getProperty("URL");
        return URL;
    }

}

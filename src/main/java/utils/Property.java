package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

    public String getProperty(String fileName, String propertyName) throws IOException {
        FileInputStream input = new FileInputStream("src/main/resources/"+fileName+".properties");
        Properties prop = new Properties();
        prop.load(input);
        return prop.getProperty(propertyName);
    }
}

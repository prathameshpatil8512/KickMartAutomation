package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class Webdriver extends Property {

    protected WebDriver driver;

    public void launchBrowser() throws IOException {
        if(getProperty("config", "browserName").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (getProperty("config", "browserName").equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        System.out.println("Browser launched is: " + getProperty("config", "browserName"));
    }

    public void launchUrl() throws IOException {
        driver.get(getProperty("config", "url"));
        driver.manage().window().maximize();
        System.out.println("Launched URL: " + getProperty("config", "url"));
    }

    @AfterMethod
    public void quiteBrowser() {
        driver.quit();
        System.out.println("Browser quitted!!!");
    }

    @BeforeMethod
    public void launch() throws IOException {
        launchBrowser();
        launchUrl();
    }
}

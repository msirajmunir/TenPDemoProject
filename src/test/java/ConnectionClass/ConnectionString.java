package ConnectionClass;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static com.codeborne.selenide.Selenide.*;

public class ConnectionString {
    public WebDriver driver;
    public ChromeOptions options;

    @BeforeClass
    public void getWebDriver() {
        try {
            //Instantiating ChromeDriver
            //System.setProperty("webdriver.chrome.driver", "GiveChromeDriverPath");
            WebDriverManager.chromedriver().setup();
            //Chrome Options
            options = new ChromeOptions();
            options.addArguments("start-maximized");
            //options.addArguments("headless");
            options.addArguments("--incognito");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");
            driver = new ChromeDriver(options);
            WebDriverRunner.setWebDriver(driver);
            System.out.println("Chrome Driver has been started...");

        } catch (Exception ex) {
            System.out.println("Cause is: " + ex.getCause());
            System.out.println("Message is: " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    @AfterClass
    public void TearDownTest() {
        try {
            closeWebDriver();
            System.out.println("Now Application Quit the Web Driver");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
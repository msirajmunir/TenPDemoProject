package Pages;
/**
 * This class contains page objects and helper methods which are used in TestCases.SmokeTestCases.java class to run
 * the Smoke test cases of the website.
 *
 * @author Siraj Munir
 * @version 1.0
 * @dated 02-11-2020
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.$;

public class Chapter1Page {
    //WebDriver driver;

    public String testingText1 = "divontheleft";
    public String homePageLink = "//p/a[text()='Home Page']";

    public WebElement text1;
    public WebElement homePage;

    public String assertSampleText1(){
        text1 = $(By.id(testingText1));
        return text1.getText();
    }

    public void clickOnHomePageLink(){
        homePage = $(By.xpath(homePageLink));
        homePage.click();
        System.out.println("Navigating back tp Home Page..");
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains page objects and helper methods which are used in TestCases.SmokeTestCases.java class to run
 * the Smoke test cases of the website.
 *
 * @author Siraj Munir
 * @version 1.0
 * @dated 02-11-2020
 */
public class HomePage {

    public String chapter1Locator = "//li/a[text()='Chapter1']";
    public String chapter2Locator = "//li/a[text()='Chapter2']";
    public String chapter3Locator = "//li/a[text()='Chapter3']";

    public WebElement chapter1;
    public WebElement chapter2;

    public void clickOnChapter1(){
        chapter1 = $(By.xpath(chapter1Locator)); //Selenide Syntax
        chapter1.click();
        System.out.println("Clicking on Chp1");
    }
}

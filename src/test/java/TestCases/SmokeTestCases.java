package TestCases;

/**
 * This class contains the Smoke test cases of the website.
 *
 * @author Siraj Munir
 * @version 1.0
 * @dated 02-11-2020
 */

import ConnectionClass.ConnectionString;
import Pages.Chapter1Page;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;


public class SmokeTestCases extends ConnectionString {
    HomePage homePageObj;
    Chapter1Page chapter1PageObj;

    @Test(priority = 0)
    public void openTheWebsite(){
       // driver.get("http://book.theautomatedtester.co.uk/"); //Selenium way of opening the URL
        open("http://book.theautomatedtester.co.uk/"); //Selenide Way
        System.out.println("Home Page Title: " + driver.getTitle());
    }

    @Test (priority = 1)
    public void TestCase01() {
        homePageObj = new HomePage();
        homePageObj.clickOnChapter1();
        System.out.println("Chapter1 Page Title: " + driver.getTitle());
       // Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void TestCase2(){
        chapter1PageObj = new Chapter1Page();
        Assert.assertEquals(chapter1PageObj.assertSampleText1(),"Assert that this text is on the page");
        System.out.println("Found this text: " + chapter1PageObj.assertSampleText1());
        chapter1PageObj.clickOnHomePageLink();
        System.out.println("Home Page Title: " + driver.getTitle());
    }
}

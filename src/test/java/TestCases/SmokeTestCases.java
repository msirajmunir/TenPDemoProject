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
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;


public class SmokeTestCases extends ConnectionString {
    //Creating a object of Page classes.
    HomePage homePageObj;
    Chapter1Page chapter1PageObj;

    @Test(priority = 0)
    public void openTheWebsite(){

        open("http://book.theautomatedtester.co.uk/"); //Selenide Way of opening the URL
        System.out.println("Home Page Title: " + title());
    }

    @Test (priority = 1)
    public void clickOnChapterOne() {
            try{
                System.out.println("===================Test Case 01======================");
                System.out.println(" ");
                homePageObj = new HomePage();
                homePageObj.clickOnChapter1(); //Calling function from HomePage class.
                System.out.println("Chapter1 Page Title: " + title());
                System.out.println(" ");
                System.out.println("===================Test Case 01 Ended======================");
            } catch (NoSuchElementException ex){
                ex.printStackTrace();
            }
    }

    @Test(priority = 2)
    public void assertAndNavigateBackToHomePage(){
        try{
            System.out.println("===================Test Case 02======================");
            System.out.println(" ");
            chapter1PageObj = new Chapter1Page();
            //Assert.assertEquals(chapter1PageObj.assertSampleText1(),chapter1PageObj.textToAssert, "This will verify the text with the expected value. ");
            chapter1PageObj.assertSampleText1(); //replaced above assertion code with Selenide code.
            System.out.println("Actual text: " + chapter1PageObj.assertSampleText1());
            chapter1PageObj.clickOnHomePageLink(); //Calling function from ChapterPage class.
            System.out.println("Home Page Title: " + title());
            System.out.println(" ");
            System.out.println("===================Test Case 02 Ended======================");
        } catch (NoSuchElementException ex){
            ex.printStackTrace();
        }
    }
}

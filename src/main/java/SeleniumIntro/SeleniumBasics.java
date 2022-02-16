package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        //step1:we need to define the chrome driver into project as property.
        //mac(no exe)
        //windows:
        //system.setProperty("webdriver.chrome.driver","chromedriver')
        //step2:we need to instantiate(declare)our driver.
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //note:driver is a reference name.webdriver-->Interface
        //new ChromeDriver();---new object;
        //interview question
        //where do you use polymorphism in your testing framework?
        //I use it ti instantiate my driver.example
        //webDriver drive=new ChromeDriver();
        //second interview
        //can you instantiate your like
        //webDriver driver= new webDriver();
        // Get() methods navigates to the given url.
        //gettitle()
        driver.get("https://www.techtorialacademy.com/");
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Home page-Techtorial")){
            System.out.println("your test is passed");
        }else{
            System.out.println("your test is failed");
        }
        //getcurrenturl(gets the current url of the website
        String actual=driver.getCurrentUrl();
        String expected="https://www.techtorialacademy.com/";
        if(actual.equals(expected)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}

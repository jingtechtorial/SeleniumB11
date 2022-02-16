package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSeleniumBasic {
    //task:i want you go to the 3 website .get the title ,currentURL you decide  and go back
    //you decide and going back
    //forward with them lastly refresh and quit
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.navigate().to("https://www.nike.com");
     driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.adidas.com/official/site");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.techtorialacademy.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();





    }
}

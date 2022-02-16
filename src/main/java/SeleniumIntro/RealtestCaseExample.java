package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealtestCaseExample {
    //  Test Case - Open Godaddy.com and validate it's Page title and the url.
//    Steps to Automate:
//            1. Launch browser of your choice say., Firefox, chrome etc.
//            2. Open this URL - https://www.godaddy.com/
//            3. Maximize or set size of browser window.
//4. Get Title of page and validate it.
//4. Get URL of current page and validate it.
//            5. Close browser.
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to( "https://www.godaddy.com/");
        driver.manage().window().maximize();
        String actualTitle=driver.getTitle();
        String expectedURL="GoDaddy";
        if(actualTitle.equals(expectedURL)){
            System.out.println();
        }
        driver.getCurrentUrl();

    }
}

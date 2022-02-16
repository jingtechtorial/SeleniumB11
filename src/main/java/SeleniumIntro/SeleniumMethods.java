package SeleniumIntro;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args)throws InterruptedException {
//what is difference between diver.quit() and driver.close()
        System.setProperty("webDriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.google.com/");
        driver.quit();
        driver.close();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.getPageSource()-->it gives the html source of the page
        System.out.println(driver.getPageSource());
        driver.navigate().to("https://www.techtorialacademy.com/");
        Thread.sleep(3000);
        driver.navigate().back();//amazon
        Thread.sleep(3000);
        driver.navigate().forward();//techtorial
        Thread.sleep(3000);
        driver.navigate().refresh();//refresh
        driver.close();
        driver.quit();

    }
}

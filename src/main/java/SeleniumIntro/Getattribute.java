package SeleniumIntro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement google= driver.findElement(By.name("btnK"));
        System.out.println(google.getAttribute("aria-label"));
        if(google.getAttribute("aria-label").equals("Google Search")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }

    }


package Homework;

import Utils.Browserutil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice2 {

    @Test
    public void shopping() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.nike.com/");
        driver.manage().window().maximize();

        WebElement searchbox=driver.findElement(By.xpath("//input[@name='search']"));
        searchbox.sendKeys("shoes");

     /*  WebElement womenshoes=driver.findElement(By.xpath("//a[@id='VisualSearchSuggestion-3']"));
       womenshoes.click();
       Thread.sleep(2000);
       WebElement women=driver.findElement(By.xpath("//span[.='Women']"));
        Browserutil.selectBy(women,"Women","value");
       Thread.sleep(2000);*/


    }
}

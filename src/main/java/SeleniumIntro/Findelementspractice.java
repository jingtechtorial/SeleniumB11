package SeleniumIntro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Findelementspractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        WebElement news=driver.findElement(By.id("root_2"));
        news.click();
        List<WebElement> headers=driver.findElements(By.xpath("//h3"));
        int count=0;
        for(int i=0;i<headers.size();i++){
            if(headers.get(i).getText().contains("Covid")){
            System.out.println(headers.get(i).getText());
            count++;
        }
        }
        System.out.println(count);


    }

    }


package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MentoringwithAhmet {

    @Test
    public void practiceHoverOver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.edureka.co/");
        driver.manage().window().maximize();

        WebElement browser=driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(browser).perform();

        WebElement datascience=driver.findElement(By.xpath("//a[@class='dropdown-toggle ga_top_category' and .='Data Science']"));
        actions.moveToElement(datascience).perform();

    }
    @Test
    public void PlanBpractice(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/fx/expand");
        driver.manage().window().maximize();

        List<WebElement> picture=driver.findElements(By.xpath("//div[@role='listitem']"));
        List<WebElement> allprices=driver.findElements(By.xpath("//div[@class='product-description']"));
        List<Double> prices=new ArrayList<>();
        Actions actions=new Actions(driver);

        for(int i=0;i< picture.size();i++){
            actions.moveToElement(picture.get(i)).perform();
            prices.add(Double.parseDouble(allprices.get(i).getText().trim().replace("$","")));

        }
        Collections.sort(prices);
        System.out.println(prices);
        Collections.reverse(prices);
        System.out.println(prices);

    }
}

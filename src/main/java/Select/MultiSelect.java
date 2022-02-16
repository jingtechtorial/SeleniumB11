package Select;

import Utils.Browserutil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiSelect {

    @Test
    public void multipleselectandfirstselectpractice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("file:///C:/Users/61908/Downloads/Techtorial%20(3).html");
        driver.manage().window().maximize();
        WebElement header=driver.findElement(By.id("techtorial1"));
        Browserutil.getTextMethod(header);
        WebElement multiselectbox=driver.findElement(By.xpath("//select[@class='select']"));
        Browserutil.selectBy(multiselectbox,"Two","text");
        Browserutil.selectBy(multiselectbox,"3","index");
        Browserutil.selectBy(multiselectbox,"5","value");

        Select select =new Select(multiselectbox);
        Thread.sleep(5000);
        select.deselectByIndex(3);

       // select.deselectAll();
        WebElement countrylist=driver.findElement(By.name("country"));
        Select country=new Select(countrylist);
       // String actualfirstselectoption=country.getFirstSelectedOption().getText().trim();
        String actualfirstselectoption=Browserutil.getTextMethod(country.getFirstSelectedOption());
        String expectedfirstselection="UNITED STATES";
        Assert.assertEquals(actualfirstselectoption,expectedfirstselection);





    }
}

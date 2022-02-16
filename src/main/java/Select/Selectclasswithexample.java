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

public class Selectclasswithexample {
    @Test
    public void validationtripbutton() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement onewaybutton = driver.findElement(By.xpath("//input[@value='oneway']"));
        onewaybutton.click();
        Assert.assertTrue(onewaybutton.isDisplayed());
        Assert.assertTrue(onewaybutton.isSelected());
        //WebElement roundtripbutton=driver.findElement(By.xpath());

    }

    @Test
    public void Selecmethod() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement onewaybutton = driver.findElement(By.xpath("//input[@value='oneway']"));
        onewaybutton.click();
        WebElement passengercount = driver.findElement(By.name("passCount"));
        Select psnger = new Select(passengercount);
        psnger.selectByIndex(1);
        WebElement departfrom=driver.findElement(By.name("fromPort"));
        Select depart=new Select(departfrom);
        depart.selectByValue("Sydney");
        WebElement month=driver.findElement(By.name("fromMonth"));


        Select mnth=new Select(month);
        mnth.selectByVisibleText("April");
        WebElement arrivindin=driver.findElement(By.name("toPort"));
        Select arr=new Select(arrivindin);
        arr.selectByIndex(2);
        WebElement returnback=driver.findElement(By.xpath("//select[@name='toMonth']"));
        Select ret=new Select(returnback);
        ret.selectByVisibleText("February");

        WebElement returnday=driver.findElement(By.xpath("//select[@name='toDay']"));
        Select retd=new Select(returnday);
        retd.selectByValue("7");

       WebElement Serviceclass=driver.findElement(By.xpath("//input[@value='Business']"));
       Serviceclass.click();

     WebElement continuebutton=driver.findElement(By.xpath("//input[@name='findFlights']"));
     continuebutton.click();

    String expected= "After flight finder - No Seats Available ";
    WebElement text=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/p[1]/font[1]/b[1]/font[1]"));
    String actualtext=text.getText();
    Assert.assertEquals(expected,actualtext);


    }
    public void Selecmethod2() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement onewaybutton = driver.findElement(By.xpath("//input[@value='oneway']"));
        onewaybutton.click();
        WebElement passengercount = driver.findElement(By.name("passCount"));
        Browserutil .selectBy(passengercount,"1","index");
       // Select psnger = new Select(passengercount);
      //  psnger.selectByIndex(1);
        WebElement departfrom=driver.findElement(By.name("fromPort"));
        Browserutil.selectBy(departfrom,"Sydney","value");
       // Select depart=new Select(departfrom);
       // depart.selectByValue("Sydney");
        WebElement month=driver.findElement(By.name("fromMonth"));
        Browserutil.selectBy(month,"April","visibleText");

        // Select mnth=new Select(month);
        // mnth.selectByVisibleText("April");
        WebElement arrivindin=driver.findElement(By.name("toPort"));
        Browserutil.selectBy(arrivindin,"2","index");
       // Select arr=new Select(arrivindin);
      //  arr.selectByIndex(2);
        WebElement returnback=driver.findElement(By.xpath("//select[@name='toMonth']"));
        Browserutil.selectBy(returnback,"February","visableText");
       // Select ret=new Select(returnback);
       // ret.selectByVisibleText("February");

        WebElement returnday=driver.findElement(By.xpath("//select[@name='toDay']"));
        Browserutil.selectBy(returnback,"7","value");
       // Select retd=new Select(returnday);
       // retd.selectByValue("7");

        WebElement Serviceclass=driver.findElement(By.xpath("//input[@value='Business']"));
        Serviceclass.click();

        WebElement continuebutton=driver.findElement(By.xpath("//input[@name='findFlights']"));
        continuebutton.click();

        String expected= "After flight finder - No Seats Available ";
        WebElement text=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/p[1]/font[1]/b[1]/font[1]"));
        String actualtext=text.getText();
        Assert.assertEquals(expected,actualtext);


    }
}

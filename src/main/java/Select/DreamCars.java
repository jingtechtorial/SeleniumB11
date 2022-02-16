package Select;

import Utils.Browserutil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;

public class DreamCars {
    @Test
    public void car() throws InterruptedException {
        //go to the "https://www.cars.com/
        //choose the options you want for your car
        //click search button
        //validate the header
        //and validate all the subheaders contains the name of the cars you are looking for
        //.clear-->sendKey
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
       WebElement newused=driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"));
        WebElement make=driver.findElement(By.xpath("//select[@id='makes']"));
        WebElement model=driver.findElement(By.xpath("//select[@id='models']"));
        WebElement searchbutton=driver.findElement(By.xpath("//button[@data-linkname='search-all-make']"));


       Browserutil.selectBy(newused,"new","value");
        Browserutil.selectBy(make,"volvo","value");
        Browserutil.selectBy(model,"volvo-s90","value");
        Thread.sleep(2000);
        searchbutton.click();

        WebElement header=driver.findElement(By.xpath("//h1[contains(text(),'New Volvo S90 for sale')]"));
        String actualheader=Browserutil.getTextMethod(header);
        String expectedheader="New Volvo S90 for sale";
        Assert.assertEquals(actualheader,expectedheader);

        List<WebElement> validationforsubheader=driver.findElements(By.xpath("//h2[@class='title']"));
        for(WebElement car:validationforsubheader){

            boolean contains=car.getText().trim().toLowerCase().contains("volvo");
            Assert.assertTrue(contains);
        }









    }
}

package ActionClass;

import Utils.Browserutil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class ActionClassMethods {

    @Test//contextclick will be right click
    public void ContextClick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver() ;
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement contextMenu=driver.findElement(By.partialLinkText("Context"));
        contextMenu.click();
        WebElement box=driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
        //action class you must use fperform at the end
        actions.contextClick(box).perform();

    }
    @Test
    public void hoverOver() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement hover=driver.findElement(By.linkText("Hovers"));
        hover.click();
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        List<WebElement> names=driver.findElements(By.tagName("h5"));
        List<WebElement> pictures=driver.findElements(By.xpath("//div[@class='figure']"));
       // for(WebElement name:names){
           // Thread.sleep(2000);
         //  actions.moveToElement(name).perform();
           // System.out.println(Browserutil.getTextMethod(name));//not showing because element is not visiable
        for(int i=0;i<names.size();i++){
            actions.moveToElement(pictures.get(i)).perform();
            System.out.println(Browserutil.getTextMethod(names.get(i)));
        }
        }
        @Test
    public void doubleclick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();

        WebElement doubleclick=driver.findElement(By.tagName("button"));
        Actions actions=new Actions(driver);
       // actions.doubleClick(doubleclick).perform();
      actions.doubleClick(driver.findElement(By.tagName("button")));
        //right click practice
      //  WebElement rightclick=driver.findElement(BY.)

            //TASK FOR STUDENTS
        /*
        Scenario to Automate:
1. Launch the Chrome web browser.
2. Open a URL "https://selenium08.blogspot.com/2019/11/double-click.html".
3. Locate the element "Double-click".
4.  click on the current location (i.e. on Double-click element).
5. Close the web browser.
         */



            }
            @Test
            public void doubleclick2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();

       WebElement doubleclick1=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions=new Actions(driver);
        actions.doubleClick(doubleclick1).perform();

        }
        @Test
    public void dragandDrop() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();

        WebElement dragable=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement orangebox=driver.findElement(By.xpath("//div[@class='test2']"));
        String actualmessage=orangebox.getText();
       // String actualmessage=Browserutil.getTextMethod(orangbox);
            String expectedmessage="... Or here.";
            Assert.assertEquals(actualmessage,expectedmessage);

            Actions actions=new Actions(driver);
            actions.dragAndDrop(dragable,orangebox).perform();
            Thread.sleep(3000);
            orangebox=driver.findElement(By.xpath("//div[@class='test2']"));
          //  WebElement acceptancecookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
          //  acceptancecookies.click();
            String actualAfterdraganddrop=Browserutil.getTextMethod(orangebox);
            String expectedafterdraganddrop="You did great!";
            Assert.assertEquals(actualAfterdraganddrop,expectedafterdraganddrop);

           String cssValue= orangebox.getCssValue("background-color");
           String expectedCssvalue="#ee6f0b";
           Assert.assertEquals(cssValue,expectedCssvalue);
        }
    }








    //List<String> expectedName=Arrays.asList("name:user1","name:user2","name:user3")
 //for(int i=0;i<names.size();i++){
// actions.movetoElement(pictures.get(i)).perform();
// Assert.assert
// }

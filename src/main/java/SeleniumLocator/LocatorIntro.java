package SeleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIntro {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/61908/Downloads/Techtorial%20(2).html");
    //getText()-->it gives you the text of element.
        //Locator:ID
        WebElement header=driver.findElement(By.id("techtorial1"));
       String actualText= header.getText();//from the system
       String expectedText="Techtorial Academy";//from the business requirement, user requirement
        if(actualText.equals(expectedText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        WebElement paragrafh=driver.findElement(By.id("details2"));
        System.out.println(paragrafh.getText());
        WebElement tools=driver.findElement(By.className("group_checkbox"));
        System.out.println(tools.getText());
        //locator name

        WebElement firstname=driver.findElement(By.name("firstName"));
        firstname.sendKeys("Ahmet");
        WebElement lastname=driver.findElement(By.name("lastName"));
        lastname.sendKeys("Wang");
        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("123456777");
        WebElement email=driver.findElement(By.name("userName"));
        email.sendKeys("jing@gmail.com");
        WebElement javaBox=driver.findElement(By.id("cond1"));
        javaBox.click();
        System.out.println(javaBox.isDisplayed());
        System.out.println(javaBox.isSelected());
        WebElement testNG=driver.findElement(By.id("cond3"));
        testNG.click();
        System.out.println(testNG.isDisplayed());
        System.out.println(testNG.isSelected());
        WebElement cumcumber=driver.findElement(By.id("cond4"));

        cumcumber.click();
        System.out.println(cumcumber.isDisplayed());
        System.out.println(cumcumber.isSelected());

    }



}

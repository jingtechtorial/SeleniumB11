package Homework;

import Utils.Browserutil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class homework3 {

    @Test

    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbutton.click();

        WebElement dropdownbox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Browserutil.selectBy(dropdownbox, "za", "value");

        List<WebElement> productorder = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        Set<String> actualorder = new LinkedHashSet<>();
        Set<String> expectedorder = new TreeSet<>();
        for (WebElement price : productorder) {

            actualorder.add(price.getText().trim());
            expectedorder.add(price.getText().trim());

        }
        Assert.assertEquals(actualorder,expectedorder);}
   @Test
    public void  test2() {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
            username.sendKeys("standard_user");
            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys("secret_sauce");

            WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
            loginbutton.click();

            WebElement dropdownbox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
            Browserutil.selectBy(dropdownbox, "Price (low to high)", "text");


        }
    }

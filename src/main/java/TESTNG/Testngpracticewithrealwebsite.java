package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Testngpracticewithrealwebsite {
    @Test
    public void validatewebsite() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        String actualwebsite = driver.getCurrentUrl();
        String expected = "https://demo.opencart.com/admin/";
        Assert.assertEquals(actualwebsite, expected);
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click();

    }

    @Test
    public void vaildatedcatalog() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click();
        WebElement catalog = driver.findElement(By.id("menu-catalog"));
        boolean Acutual = catalog.isDisplayed();
        boolean Expect = true;
        Assert.assertEquals(Acutual, Expect, "Catalog is not there");
        catalog.click();
    }

    @Test

    public void validatedproductisdisplay() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click();
        WebElement catalog = driver.findElement(By.id("menu-catalog"));
        catalog.click();
        WebElement product = driver.findElement(By.xpath("//a[.='Products']"));
        Thread.sleep(1000);
        boolean Actualpro = product.isDisplayed();
        boolean Expected1 = true;
        Assert.assertEquals(Actualpro, Expected1);
        product.click();

    }

    @Test
    public void validatedbox() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click();
        WebElement catalog = driver.findElement(By.id("menu-catalog"));
        catalog.click();
        WebElement product = driver.findElement(By.xpath("//a[.='Products']"));
        Thread.sleep(500);
        product.click();
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 1; i < boxes.size(); i++) {
            Thread.sleep(500);
            boxes.get(i).click();
            boolean actualboxValidation = boxes.get(i).isDisplayed();
            boolean expextedvalidationbox = true;
            Assert.assertEquals(actualboxValidation, expextedvalidationbox);
            boolean actualboxValidationisSelected = boxes.get(i).isSelected();
            boolean expectedisSelected = true;
            Assert.assertEquals(actualboxValidationisSelected, expectedisSelected);


        }


        }

    }


package SeleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String actualURL=driver.getCurrentUrl();
        String expected="https://www.facebook.com/";
        if(actualURL.equals(expected)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        WebElement create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        boolean validationbutton=create.isDisplayed();
        boolean expectedbutton=true;
        if(validationbutton==expectedbutton){
            System.out.println("button is working");
        }else{
            System.out.println("button is not working");
        }
        create.click();
        Thread.sleep(5000);
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("xiao jing");
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("wang");
        WebElement mobile=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
        mobile.sendKeys("123478566");
        Thread.sleep(4000);
        WebElement password=driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("123456");
        WebElement month=driver.findElement(By.name("month"));
        month.sendKeys("01");
        WebElement day=driver.findElement(By.name("birthday_day"));
        day.sendKeys("28");
        WebElement year=driver.findElement(By.name("birthday_year"));
        year.sendKeys("1989");
        WebElement gender=driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
        gender.sendKeys("female");
        gender.click();
        WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
        signup.click();


    }
}

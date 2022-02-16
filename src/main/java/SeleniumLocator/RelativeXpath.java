package SeleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");

        WebElement title=driver.findElement(By.xpath("//h3"));
        System.out.println(title.getText());
        WebElement paragraph=driver.findElement(By.xpath("//h4[@class='subheader']" ));
        System.out.println((paragraph.getText()));

        WebElement web=driver.findElement(By.xpath("//a[@href='http://elementalselenium.com/']"));
        web.click();
        System.out.println(web.getText());

        //contains:it works with text
        //tagname[contains(text(),'Horizontal']
        WebElement containsmethod=driver.findElement(By.xpath("//h3[contains(text(),'Horizontal']"));
        System.out.println(containsmethod.getText());
        //text:it works with text as well.this is for simplier than contains method, it looks fo exact //text
        //h3[.='text']


    }
}

package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
//        instance
        WebDriver driver =new ChromeDriver();
//        navigate to the website
        driver.get("http://35.175.58.98/input-form-locator.php");
//        maximize the window
        driver.manage().window().maximize();

//        locate the WebElement first name
        WebElement firstName = driver.findElement(By.id("first_name"));
//        use send keys to send the data to webelement
        firstName.sendKeys("moazzam");

//        locate the WebElement last name
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("sdiq");
        //locate the webElement email
        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("moazzamsadiq94@gmail.com");
        //locate the button and click on it
        WebElement submitBtn = driver.findElement(By.tagName("button"));
        submitBtn.click();
        //locate the webElement link
        WebElement linkBtn= driver.findElement(By.linkText("link"));
        linkBtn.click();
        //locate the webElement click her using the link Text
        WebElement clickHere=driver.findElement(By.partialLinkText("Here."));
        clickHere.click();


    }

}

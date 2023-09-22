package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HW1 {
    /*
Automating a Login Process
Objective: Write a Selenium script to automate the login process on the OrangeHRM website.
Instructions:

Go to the OrangeHRM login page: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Enter the username "abc".
Clear the username field.
Enter the username "Admin".
Enter the password "admin123".

Get the text from the login button web element and print it on the console.
Click on the login button.(I don't get this)

 */

   public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       //go to opensource
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       //maximize windows
       driver.manage().window().maximize();
       //for observation
       Thread.sleep(2000);
       //finding the username
       WebElement userName = driver.findElement(By.name("username"));
       //enter the wrong username
       userName.sendKeys("abc");
       //pressing multiple keys simultaneous
       userName.sendKeys(Keys.CONTROL + "a");
       //Clear the username field.
       userName.sendKeys(Keys.DELETE);
       //Enter the username "Admin".
       userName.sendKeys("Admin");
       //Enter the password "admin123".
       WebElement password = driver.findElement(By.name("password"));
       password.sendKeys("admin123");
       //finding the login button
       WebElement loginBtn =driver.findElement(By.tagName("button"));
       //Get the text from the login button web element
       System.out.println(loginBtn.getText());
       loginBtn.click();

   }
}

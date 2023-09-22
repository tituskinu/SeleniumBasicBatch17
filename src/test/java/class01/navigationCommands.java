package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        // go to google.com

        driver.get("http://www.google.com");
        //max the window
        driver.manage().window().maximize();
        //slow down to observe the process
        Thread.sleep(2000);
        //go to facebook.com
        driver.navigate().to("http://facebook.com");
        //slow down for observation
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        //go forward
        driver.navigate().forward();
        //slow down for observation
        Thread.sleep(2000);
        driver.navigate().refresh();
        //close
        driver.close();
        //also we can use
        //driver.quite();


    }
}

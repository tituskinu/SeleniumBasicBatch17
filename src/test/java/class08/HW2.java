package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class HW2 extends CommonMethods {
    //select the date from calendar "5th Dec 1998"
    //
    //https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker (edited)
    public static void main(String[] args) {
        String url = "https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement iframeCalendar = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframeCalendar);

        // click on date input
        WebElement calendar= driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        calendar.click();

        calendar.sendKeys("12/05/1998", Keys.ENTER);

    }


}

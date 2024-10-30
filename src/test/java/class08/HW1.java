package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HW1 extends CommonMethods {
    //@here
    //HW1:
    //goto http://35.175.58.98/table-pagination-demo.php
    //print all the rows with remarks pass
    //remember to print rows from all pages of tables
    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-pagination-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        for (int i = 0; i < 3; i++) {
            List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr"));

            for (WebElement element : list) {
                List<WebElement> columns = element.findElements(By.tagName("td"));
                for (WebElement column : columns) {
                    if (column.getText().contains("Pass")) {
                        System.out.println(element.getText());
                        break;
                    }
                }

            }
        }
    }
}

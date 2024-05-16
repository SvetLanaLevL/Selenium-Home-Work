package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto the syntax projects.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement leaveList = driver.findElement(By.xpath("//table[@class='quickLaungeContainer']/tbody/tr/td[2]"));
        leaveList.click();
        WebElement calendarFrom = driver.findElement(By.xpath("//input[@id='calFromDate']"));
        calendarFrom.click();
        Select selectMonthFrom = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        selectMonthFrom.selectByValue("1");
        Select selectYearFrom = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        selectYearFrom.selectByValue("2024");
        List<WebElement> daysFrom = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for (WebElement dayFrom : daysFrom) {
            if (dayFrom.getText().equals("16")) {
                dayFrom.click();
                break;


            }
        }
    }
}

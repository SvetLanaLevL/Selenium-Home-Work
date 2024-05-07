package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebElement createAccount= driver.findElement(By.partialLinkText("Create new account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Lana");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Levchenko");
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("lanaL@gmail.com");
        WebElement password= driver.findElement(By.id("password_step_input"));
        password.sendKeys("qqq123");
        WebElement selectMonth= driver.findElement(By.name("birthday_month"));
        selectMonth.sendKeys("January");
        WebElement selectDay= driver.findElement(By.id("day"));
        selectDay.sendKeys("9");
        WebElement selectYear=driver.findElement(By.id("year"));
        selectYear.sendKeys("2002");
        WebElement selectGender= driver.findElement(By.className("_58mt"));
        selectGender.click();






    }
}

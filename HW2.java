package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface HW2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement firstName= driver.findElement(By.name("first_name"));
        firstName.sendKeys("Lana");
        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Levchenko");
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("lanaL@gmail.com");
        WebElement button= driver.findElement(By.id("submit_button"));
        button.click();

    }
}

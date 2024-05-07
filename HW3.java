package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/Xpath.php");
         WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
         userName.sendKeys("LanaL");
        WebElement button= driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        WebElement sq1 = driver.findElement(By.xpath("//input[@id='DisplayName']"));
        sq1.sendKeys("Is Selenium easy");
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id, 'apiSet')]"));
        apiSettings.sendKeys("Hope all is correct");
        WebElement eMail1 = driver.findElement(By.xpath("//input[@class='form-control backup']"));
        eMail1.sendKeys("lanaL@gmail.com");
        WebElement eMail2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        eMail2.sendKeys("lanaL2@gmail.com");
        WebElement eMail3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        eMail3.sendKeys("lanaL3@gmail.com");
        WebElement field1 = driver.findElement(By.xpath("//input[@name='customField']"));
        field1.sendKeys("Apollo");
        WebElement field2 = driver.findElement(By.xpath("(//input[@name='customField'])[2]"));
        field2.sendKeys("Cooper");
       WebElement field3 = driver.findElement(By.xpath("//input[@name='customField1']"));
       field3.sendKeys("Tima");
        WebElement field4 = driver.findElement(By.xpath("(//input[@name='customField1'])[2]"));
        field4.sendKeys("Liza");
















    }
}

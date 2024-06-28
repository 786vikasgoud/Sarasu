import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginFeature {
    @Test
    public void login(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.sarasu.co.in/SchoolAdminLogin");
        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated());
        driver.findElement(By.xpath("//button[@class='freeuser']")).click();
        driver.findElement(By.xpath("//input[@id='username1']")).sendKeys("pasajjan");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Praveen@123");
        driver.findElement(By.xpath("//button[@class='login-btn']")).click();
        driver.quit();

    }
}

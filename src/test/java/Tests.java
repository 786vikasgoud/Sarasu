import Pages.Exam;
import Pages.RegisterMember;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Tests {
    WebDriver driver;
    public void memberShip() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://test.sarasu.co.in/SchoolAdminLogin");
        driver.manage().window().maximize();
        RegisterMember membership = new RegisterMember(driver);
        membership.RegisterNewUser();
//        driver.quit();
    }
    public void exam(){
        driver = new ChromeDriver();
        driver.get("https://test.sarasu.co.in/SchoolAdminLogin");
        driver.manage().window().maximize();
        Exam register = new Exam(driver);
        register.examLogin();
        register.writeExam();

    }
}


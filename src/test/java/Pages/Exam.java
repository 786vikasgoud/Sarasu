package Pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Exam {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public Exam(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
    }
    @FindBy(xpath = "//button[@class='freeuser']")
    WebElement Login;
    @FindBy(xpath = "//input[@id='username1']")WebElement UserName;
    @FindBy(xpath = "//input[@id='password']")WebElement Password;
    @FindBy(xpath = "//button[@class='login-btn']")WebElement Submit;
    @FindBy(xpath = "(//a[@class='link-hover-effect'])[6]")WebElement SelectExam;
    @FindBy(xpath = "(//button[@class='getStartedbtn'])[5]")WebElement StartExam;
    @FindBy(xpath = "(//button[@class='btn level-gradient-bg'])[3]")WebElement takeTest;
    @FindBy(xpath = "//input[@id='1']")WebElement option;
    @FindBy(xpath = "//button[@class='exambtnpaiduser']")WebElement next;
    @FindBy(xpath = "(//button[@class='exambtnpaiduser'])[2]")WebElement next2;
    @FindBy(xpath = "(//button[@class='exambtnpaiduser'])[1]")WebElement next1;
    @FindBy(xpath = "//button[@class='model-btnnew btn btn-primary']")WebElement SubmitTest;
    @FindBy(xpath = "//button[@id='submit']")WebElement submit;
    @FindBy(xpath = "//button[@class='After-btn-challenge1']")WebElement Explation;
    @FindBy(xpath = "(//button[@class='btn-close'])[1]")WebElement cut;
    @FindBy(xpath = "//button[@class='prevbtnpaiduser']")WebElement optionNext;
    @FindBy(xpath = "(//button[@class='prevbtnpaiduser'])[1]")WebElement option1Next;
    @FindBy(xpath = "(//button[@class='prevbtnpaiduser'])[2]")WebElement option2Next;

    public void examLogin(){
        Login.click();
        UserName.sendKeys("pasajjan");
        Password. sendKeys("Praveen@123");
        Submit.click();
    }
    public void writeExam(){
        int j=0;
        wait.until(ExpectedConditions.elementToBeClickable(SelectExam)).click();
        wait.until(ExpectedConditions.elementToBeClickable(StartExam)).click();
        wait.until(ExpectedConditions.elementToBeClickable(takeTest)).click();
        for(int i=0;i<30;i++){
            wait.until(ExpectedConditions.elementToBeClickable(option)).click();
            if(j==0) {
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(next)).click();
                } catch (ElementClickInterceptedException e) {
                    js.executeScript("arguments[0].scrollIntoView(true);", next);
                    wait.until(ExpectedConditions.elementToBeClickable(next)).click();
                    System.out.println("hiitniufndoudn11");
                }
                j++;
            }
            else {
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(next2)).click();
                } catch (ElementClickInterceptedException e) {
                    js.executeScript("arguments[0].scrollIntoView(true);", next2);
                    wait.until(ExpectedConditions.elementToBeClickable(next2)).click();
                    System.out.println("hiitniufndoudn22");
                }
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(SubmitTest)).click();
    }
}
//            wait.until(ExpectedConditions.elementToBeClickable(Explation)).click();
//            wait.until(ExpectedConditions.elementToBeClickable(cut)).click();
//            if(!option1Next.isDisplayed()) {
//                try {
//                    wait.until(ExpectedConditions.elementToBeClickable(optionNext)).click();
//                } catch (ElementClickInterceptedException e) {
//                    js.executeScript("arguments[0].scrollIntoView(true);", optionNext);
//                    wait.until(ExpectedConditions.elementToBeClickable(optionNext)).click();
//                    System.out.println("hiitniufndoudn11");
//                }
//            }
//            else {
//                try {
//                    wait.until(ExpectedConditions.elementToBeClickable(option2Next)).click();
//                } catch (ElementClickInterceptedException e) {
//                    js.executeScript("arguments[0].scrollIntoView(true);", option2Next);
//                    wait.until(ExpectedConditions.elementToBeClickable(option2Next)).click();
//                    System.out.println("hiitniufndoudn22");
//                }
////                wait.until(ExpectedConditions.elementToBeClickable(option2Next)).click();
//            }
//wait.until(ExpectedConditions.elementToBeClickable(option2Next)).click();
//            wait.until(ExpectedConditions.elementToBeClickable(next)).click();
package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.Objects;

public class RegisterMember {
    WebDriver driver;
    Actions actions;
    String filepath="/home/vikas/Downloads/praveen.jpeg";
    String filepath2="/home/vikas/Downloads/Adharlow.jpeg";

    JavascriptExecutor js;
    WebDriverWait wait;
    public RegisterMember(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        js = (JavascriptExecutor) driver;
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    @FindBy(xpath = "//button[@class='freeusertrail']")
    WebElement memberShipUser;
    @FindBy(xpath = "//b[contains(text(),'Next')]")WebElement next;
    @FindBy(xpath = "(//button[@class='sgnbtn'])[2]") WebElement next2;
    @FindBy(xpath = "(//button[@class='sgnbtn1'])[2]")WebElement next3;
    @FindBy(xpath = "//input[@id='studentname']")
    WebElement studentName;
    @FindBy(xpath = "//input[@type='file']")WebElement Photo;
    @FindBy(xpath = "//input[@type='file']")WebElement adharPhoto;
    @FindBy(xpath = "//input[@id='authorcheckboxstatus']")WebElement checkBox;
    @FindBy(xpath = "//input[@id='email']")WebElement email;
    @FindBy(xpath = "//input[@id='primarycontactphoneno']")WebElement pPhoneNo;
    @FindBy(xpath = "//input[@id='parentname']")WebElement parentsName;
    @FindBy(xpath = "//input[@id='parentphoneno']")WebElement parentsPPhone;
    @FindBy(xpath = "//input[@id='paremail']")WebElement parentEmail;
    @FindBy(xpath = "//input[@id='checkboxstatus']")WebElement Knowledge;
    @FindBy(xpath = "(//*[@id='radiobtn'])[1]")WebElement marksRelive;
    @FindBy(xpath = "//input[@id='aadhaarno']")WebElement adharNo;
    @FindBy(xpath = "//input[@id='address']")WebElement address;
    @FindBy(xpath = "//input[@id='schoolname']") WebElement schoolName;
    @FindBy(xpath = "//select[@id='standard']")WebElement stand;
    @FindBy(xpath = "//select[@id='standard']//option[text()='12']")WebElement s;
    @FindBy(xpath = "//select[@id='gender']")WebElement gender;
    @FindBy(xpath = "//input[@id='dob']")WebElement dateOfBirth;
    @FindBy(xpath = "//input[@id='schoolphoneno']")WebElement schoolPhoneNumber;
    @FindBy(xpath = "//input[@id='schooladdress']")WebElement schoolAddress;
    @FindBy(xpath = "//input[@id='pincode']")WebElement pinCode;
    @FindBy(xpath = "(//input[@placeholder=' '])[1]")WebElement city;
    @FindBy(xpath = "(//input[@placeholder=' '])[2]")WebElement dist;
    @FindBy(xpath = "(//input[@placeholder=' '])[3]")WebElement state;
    @FindBy(xpath = "//*[@id='username']")WebElement loginUsername;
    @FindBy(xpath = "//*[@id='password']")WebElement loginPassword;
    @FindBy(xpath = "//*[@id='reenterpassword']")WebElement loginRePassword;
    @FindBy(xpath = "//*[@id='course']/option[2]")WebElement loginCourse;
    public void RegisterNewUser() throws InterruptedException {
        memberShipUser.click();
        studentName.sendKeys("Vikas goud");
        checkBox.click();
        adharNo.sendKeys("258818285932");
        gender.click();
        Select genderSelect = new Select(gender);
        genderSelect.selectByVisibleText("Male");
        pinCode.sendKeys("502316");
        s.click();
        dateOfBirth.sendKeys("12032006");
        s.click();
        address.sendKeys("Kowdipally");
        schoolAddress.sendKeys("Kowdipally");
        schoolName.sendKeys("Oxford high school");
        schoolPhoneNumber.sendKeys("9952962196");
        pinCode.sendKeys("502316");
        city.sendKeys("Hyderabad");
        dist.sendKeys("medak");
        state.sendKeys("telangana");
        Photo.sendKeys(filepath);
        clickOnNextBtn(next);
        adharPhoto.sendKeys(filepath);
        pPhoneNo.sendKeys("9951962196");
        clickOnMarksRevilesBtn();
        wait.until(ExpectedConditions.elementToBeClickable(marksRelive));
        email.sendKeys("vikkydada421@gmail.com");
        parentEmail.sendKeys("shivaiah@gmail.com");
        parentsName.sendKeys("sanga goud");
        parentsPPhone.sendKeys("9975758950");
        Knowledge.click();
        Thread.sleep(10000);
        clickOnNextBtn(next2);
        if(!loginUsername.isDisplayed()){
            clickOnNextBtn(next2);
        }
        loginUsername.sendKeys("VikasGoud");
        loginPassword.sendKeys("Vikas786@");
        loginRePassword.sendKeys("Vikas786@");
        loginCourse.click();
        //clickOnNextBtn(next3);

    }
    public void clickOnNextBtn(WebElement next){
            try {
                wait.until(ExpectedConditions.elementToBeClickable(next)).click();
            } catch (ElementClickInterceptedException e) {
                js.executeScript("arguments[0].scrollIntoView(true);", next);
                wait.until(ExpectedConditions.elementToBeClickable(next)).click();
            }
    }


    public void clickOnMarksRevilesBtn() {
        try {
            WebElement marksReliveElement = wait.until(ExpectedConditions.elementToBeClickable(marksRelive));
            js.executeScript("arguments[0].scrollIntoView(true);", marksReliveElement);
            marksReliveElement.click();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();  // Handle or log the exception accordingly
        }
    }


}

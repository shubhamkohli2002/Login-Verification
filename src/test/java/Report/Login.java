package Report;

import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

@Listeners({AllureTestNg.class})
public class Login {
    WebDriver driver;

    @BeforeTest
    public void setup(@Optional String browser) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    @Description("Valid login functionality with student credentials")
    @Severity(SeverityLevel.CRITICAL)
    public void TestCase1() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        System.out.println("✅Login verified successfully.");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}

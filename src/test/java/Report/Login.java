package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Login {
    WebDriver driver;
    @BeforeTest
    public void setup(@Optional String browser) throws Exception{

        // Initiate browser driver
        driver = new ChromeDriver();

        // adding implicit wait of 12 secs
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

    @Test(priority = 1)
    public void TestCase1() {

     driver.get("https://practicetestautomation.com/practice-test-login/");
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
    driver.findElement(By.xpath("//button[@id='submit']")).click();
        System.out.println("✅Login verified successfully.");
    }

    @AfterTest
    public void teardown() {

        // quitting browser
        driver.quit();
    }
}

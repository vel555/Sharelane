
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZipCodeTests {
    @BeforeTest
    public void setUp() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
    }
    @Test
    public void testValidZipCode() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("12345");
        WebElement submitButton = driver.findElement(By.cssSelector("[value=Continue]"));
        submitButton.click();

        driver.quit();
    }
    @Test
    public void testInvalidZipCodeLetters() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeField = driver.findElement(By.name("zip_code"));
        zipCodeField.sendKeys("ABCDE");
        WebElement submitButton = driver.findElement(By.cssSelector("[value=Continue]"));
        submitButton.click();

        driver.quit();

    }
    @AfterTest
    public void tearDown(){

        WebDriver driver;
        driver = new ChromeDriver();
        driver.quit();
    }
}
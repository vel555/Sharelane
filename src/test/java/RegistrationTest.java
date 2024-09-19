import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {
@Test
    public void registrationsShareline() {

        WebDriver driver = new  ChromeDriver();
driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");

    WebElement firstName = driver.findElement(By.name("first_name"));
    WebElement lastName = driver.findElement(By.name("last_name"));
    WebElement email = driver.findElement(By.name("email"));
    WebElement password1 = driver.findElement(By.name("password1"));
    WebElement confirmPassword = driver.findElement(By.name("password2"));
    WebElement submitButton = driver.findElement(By.cssSelector("[value=Register]"));

    firstName.sendKeys("vacia");
    lastName.sendKeys("rogov");
    email.sendKeys("abc@gmail.com");
    password1.sendKeys("123456");
    confirmPassword.sendKeys("123456");
    submitButton.click();

    WebElement successMessage = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
    assert successMessage.isDisplayed();

    driver.quit();

    }



}

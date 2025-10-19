package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sauce_demo {
	WebDriver driver;
	@Parameters({"user","pass"})
  @Test
  public void login(String username , String password) {
	  driver.findElement(By.xpath("//input[@name = 'user-name']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@name = 'login-button']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

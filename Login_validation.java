package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login_validation {
	WebDriver driver;
  @Test(priority = 2)
  public void login1() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("valid123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("validd");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	  
  }
  @Test(priority = 3,description = "valid credentials")
  public void login2() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("valid");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("valid");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	  
  }
  @Test(priority = 1)
  public void login3() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("validww");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("validkk");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
  }

  @AfterTest
  public void afterTest() {
  }

}

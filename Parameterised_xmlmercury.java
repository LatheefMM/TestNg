package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Parameterised_xmlmercury {
	WebDriver driver;
	@Parameters({"user","pass"})
  @Test
  public void login(String username,String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/index.php"); 
	  driver.manage().window().maximize();
	  }

  @AfterTest
  public void afterTest() {
  }

}

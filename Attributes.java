package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Attributes {
	WebDriver driver;
  @Test (priority = 3,enabled = false)
  public void AmazonTest() {
	  driver.get("https://www.amazon.in/");
  }
  @Test(priority = 1,description = "This is flipkart")
  public void FlipkartTest() {
	  driver.get("https://www.flipkart.com/");
  }
  @Test(priority = 2,invocationCount = 1)
  public void GoogleTest() {
	  driver.get("https://www.google.com/");
  }
  @Test(priority = 4)
  public void MercuryTest() {
	  driver.get("https://demo.guru99.com/");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

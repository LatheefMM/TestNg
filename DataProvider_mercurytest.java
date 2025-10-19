package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProvider_mercurytest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String n, String s) {
		driver.findElement(By.name("userName")).sendKeys(n);
		driver.findElement(By.name("password")).sendKeys(s);
		driver.findElement(By.name("submit")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
  }


  @DataProvider(name = "dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "aabc123", "abc" },
      new Object[] { "bbbb4444", "b99999" },
      new Object[] {"valid","valid"}
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

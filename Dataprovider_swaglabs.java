package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dataprovider_swaglabs {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String n, String s) {
	  driver.findElement(By.xpath("//input[@name = 'user-name']")).sendKeys(n);
	  driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(s);
	  driver.findElement(By.xpath("//input[@name = 'login-button']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
  }


  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "esfrsdg", "efrgfdmg" },
      new Object[] {"dshfcdvsc","eyfdgcvdsh"},
      new Object[] { "standard_user", "secret_sauce" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}

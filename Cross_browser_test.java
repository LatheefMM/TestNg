package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class Cross_browser_test {
	WebDriver  driver;
	@Parameters({"user","pass"})
  @Test
  public void Crossbrowser_login(String username,String password) {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
	  
  }
  @Parameters("browsers")
  @BeforeTest
  public void beforeTest(String browsers) {
	  if(browsers.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
	  }
	

	  else if(browsers.equalsIgnoreCase("safari")){
	driver = new SafariDriver();
	  }
	  else if(browsers.equalsIgnoreCase("edge")) {
		  driver=new EdgeDriver();
	  }
	  else {
		  driver = new FirefoxDriver();
		  }
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}

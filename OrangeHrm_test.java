package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class OrangeHrm_test {
	WebDriver driver;
  @Test(dataProvider = "dp",priority = 1)
  public void Login(String n, String s) throws InterruptedException  {
	  
	  
	  
//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	  WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//	  username.sendKeys(n);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(n);
	   

//	  WebElement password = driver.findElement(By.name("password"));
//	  password.sendKeys(s);
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(s);

	  driver.findElement(By.xpath("//button[@type='submit']")).click();



  
	  
  }
  
  
  
  @Test(dataProvider = "description",priority = 2)
  public void Login(String p, String k,String f) throws InterruptedException  {
	  
	  
	  


	  Thread.sleep(800);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
       driver.findElement(By.linkText("Job Titles")).click();
       
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
       
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(p);
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(k);
       
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(f);
       
       
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();

  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  Thread.sleep(900);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }

  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
        new Object[] { "Admin", "admin123" },
    };
  }
  
  @DataProvider(name="description")
  public Object[][] description(){
	  return new Object[][] {
		  new Object[] {"Software Tester","difdhgdknvxklsvnxdfv","ewjgfbdjgdfsgkreag"},
		  new Object[] {"data analyst","euwdfghdjsvdf","ewjgfbdjgdfsgkreag"}
	  };
  }
 
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	
	
  }

  @AfterTest
  public void afterTest() {
	  
  }

}

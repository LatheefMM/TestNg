package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Musafir_Test {
	WebDriver driver;
  @Test(priority = 1)
  public void first_page()  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[1]/ul[1]/li[2]/label")).click();
	  
	  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[2]/input")).sendKeys("kochi");
	
	  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[3]/input")).sendKeys("chennai");

	  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[9]/input")).click();
	  
	  driver.findElement(By.xpath("/html/body/div[3]/div/ul[2]/li[28]")).click();
	  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[10]/input")).click();
	 
      driver.findElement(By.xpath("/html/body/div[3]/div/ul[2]/li[31]")).click();
      
      WebElement drop1=driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[11]/div[1]/select"));
      Select obj1 = new Select(drop1);
      obj1.selectByValue("2");
      
      WebElement drop2=driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[11]/div[2]/select"));
      Select obj2 = new Select(drop2);
      obj2.selectByValue("1");
      
      WebElement drop3=driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[11]/div[3]/select"));
      Select obj3 = new Select(drop3);
      obj3.selectByValue("1");
      
      driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[1]/fieldset[13]/a[2]")).click();
      
      
      
      
      
	  
	  
  }
  @Test(priority = 2)
  public void second_page()  {
	  
	  
//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[4]/div/div[2]/div")));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  
	 driver.findElement(By.xpath("/html/body/div/div[4]/div/div[2]/div/div/div[2]/div[3]/div/button")).click();
	 
	
	 
	  
	  
  }@Test(priority = 3)
  
  public void Third_page() throws Exception {
	  
	  
//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[8]")));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	  WebElement drop4 = driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[1]/div/select"));
	  Select obj4 = new Select(drop4);
	  obj4.selectByIndex(1);
	 
	  
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[1]/ul/li[1]/input")).sendKeys("Abdul");
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[1]/ul/li[3]/input")).sendKeys("latheef");
	 
	  
     WebElement drop9 = driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[2]/div/select"));
	  
	  Select obj9 = new Select(drop9);
	  obj9.selectByIndex(1);
	  
	  
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[2]/ul/li[1]/input")).sendKeys("dddddd");
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[2]/ul/li[3]/input")).sendKeys("eeeeee");
	 
	  
	  
	  
	  
	  
	  WebElement drop5 = driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[3]/div/select"));
	  
	  Select obj5 = new Select(drop5);
	  obj5.selectByIndex(1);
	  
	  
	  
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[3]/ul/li[1]/input")).sendKeys("abc");
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[3]/ul/li[3]/input")).sendKeys("abc");
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[3]/ul/li[4]/input")).sendKeys("26 08 2000");
	 
	  
	  
	  WebElement drop6 = driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[4]/div/select"));
	  Select obj6 = new Select(drop6);
	  obj6.selectByIndex(1);
	  
	  
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[4]/ul/li[1]/input")).sendKeys("abc1");
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[4]/ul/li[3]/input")).sendKeys("vvvvv");
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[4]/ul/li[4]/input")).sendKeys("06 07 2025");
	  
	  
	  
	  
	  
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[5]/ul/li[1]/input")).sendKeys("abc@gmail.com");
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/ul[2]/li/ul/li[5]/ul/li[2]/input")).sendKeys("8877990099");
	 
	  driver.findElement(By.xpath("/html/body/form/div[8]/div[1]/div[2]/div/div[3]/p/a")).click();
	  
	  
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://in.musafir.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}

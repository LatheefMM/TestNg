package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Assignment3 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abdul latheef M M");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abdullatheef@gmail.com");
	  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7788996655");
	  driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("hdgfdhjsfbhd House,dshjfdgfjd P.O,EDJSFDB");
	  driver.findElement(By.xpath("//input[@id='male']")).click();
	  driver.findElement(By.xpath("//input[@id='sunday']")).click();
	  driver.findElement(By.xpath("//input[@id='monday']")).click();
	  driver.findElement(By.xpath("//input[@id='saturday']")).click();
	  WebElement p = driver.findElement(By.xpath("//select[@id='country']"));
	  Select obj = new Select(p);
	  obj.selectByIndex(2);
	  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[6]/select/option[6]")).click();
	  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[7]/select/option[9]")).click();
	  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	  driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();
	  driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();
      driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[3]/a")).click();
      
      driver.findElement(By.xpath("//input[@id='txtDate']")).click();
      
      WebElement s = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
      Select obj1 = new Select(s);
      obj1.selectByIndex(11);
    
      WebElement r = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
      Select obj2= new Select(r);
      obj2.selectByIndex(10);
      driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[3]/a")).click();
      
      
      driver.findElement(By.id("start-date")).clear();
      driver.findElement(By.id("start-date")).sendKeys("20/10/2025");
      
   

      driver.findElement(By.id("end-date")).clear();
      driver.findElement(By.id("end-date")).sendKeys("25/10/2025");
      
      driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
      
      driver.findElement(By.xpath("//button[@name='start']")).click();
      
      driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
      Alert al = driver.switchTo().alert();
      al.accept();
      
       driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
      Alert al2 = driver.switchTo().alert();
      al2.accept();
      
      driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
      Alert al3 = driver.switchTo().alert();
      al3.accept();
      
      WebElement t = driver.findElement(By.xpath("//button[@class='dropbtn']"));
      Actions act = new Actions(driver);
      act.moveToElement(t).perform();
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']")));
     WebElement d = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[7]/div[1]/button"));
      Actions act3 = new Actions(driver);
      act3.doubleClick(d).perform();
      
      
      WebElement i = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[8]/div[1]/div[1]"));
      WebElement j = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[8]/div[1]/div[2]"));
      Actions act2 = new Actions(driver);
      act2.dragAndDrop(i, j).perform();
      
      
      
      
      
      
      
      
      
      
      


      
      
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/#");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

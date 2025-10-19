package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Mercury_Test {
	WebDriver driver;
  @Test
  public void login_test() {
		driver.findElement(By.name("userName")).sendKeys("valid123");
		driver.findElement(By.name("password")).sendKeys("valid");
		driver.findElement(By.name("submit")).click();
	  
  }
  @Test
  public void register() throws InterruptedException {

		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ABDUL");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Latheef");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8877665544");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("latheef@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Mundackal house");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Perumbavoor");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Kerala");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("683547");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("valid123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("valid123");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
	  
  }
  @Test
  public void flight() {
	  driver.findElement(By.linkText("Flights")).click();
		 driver.findElement(By.xpath("//input[@value='oneway']")).click();
		 WebElement dropdown=driver.findElement(By.xpath("//select[@name='passCount']"));
		 Select obj = new Select(dropdown);
		 obj.selectByIndex(2);
		 WebElement dropdown1=driver.findElement(By.xpath("//select[@name='fromPort']"));
		 Select obj1 = new Select(dropdown1);
		 obj1.selectByIndex(2);
		 WebElement dropdown2=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		 Select obj2 = new Select(dropdown2);
		 obj2.selectByIndex(2);
		 WebElement dropdown3=driver.findElement(By.xpath("//select[@name='fromDay']"));
		 Select obj3 = new Select(dropdown3);
		 obj3.selectByIndex(2);
		 WebElement dropdown4=driver.findElement(By.xpath("//select[@name='toPort']"));
		 Select obj4 = new Select(dropdown4);
		 obj4.selectByIndex(2);
		 WebElement dropdown5=driver.findElement(By.xpath("//select[@name='toMonth']"));
		 Select obj5 = new Select(dropdown5);
		 obj5.selectByIndex(2);
		 WebElement dropdown6=driver.findElement(By.xpath("//select[@name='toDay']"));
		 Select obj6 = new Select(dropdown6);
		 obj6.selectByIndex(2);
		 driver.findElement(By.xpath("//input[@value='Business']")).click();
		 WebElement dropdown7=driver.findElement(By.xpath("//select[@name='airline']"));
		 Select obj7 = new Select(dropdown7);
		 obj7.selectByIndex(2);
		 driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	  
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

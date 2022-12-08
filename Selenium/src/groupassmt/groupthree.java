package groupassmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupthree 
{
	WebDriver driver;
	  @BeforeMethod
	 public void setup()
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			
	 } 
	  
	  
	  @Test(groups=("smoke")) 
		 public void computer()
		 {
			 driver.get("https://demowebshop.tricentis.com/");
//			  driver.findElement(By.xpath("//a[@href=\"/computers\"]")).click();
//			  System.out.println("This is computer");
		 }
	  @Test
	  public void calculator()
	  {
		  driver.get("https://www.calculator.net/");
		  String s2= driver.getTitle();
		  System.out.println(s2); 
	  }
	  
	  @Test
	  public void five()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(5)\"]")).click();
		  System.out.println("This in no 5");
	  }
	  
	  
	  @Test
		public void selenium()
		{
			driver.get("https://demo.guru99.com/");
			  driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
			  System.out.println("This is selenium dropdown");
		  }
	  @Test
	  public void one()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(1)\"]")).click();
		  System.out.println("This in no 1");
	  }
	
	  @Test
	  public void six()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(6)\"]")).click();
		  System.out.println("This in no 6");
	  }
	  
	  @Test
	  public void three()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(3)\"]")).click();
		  System.out.println("This in no 3");
	  }
	  
	  @Test
	  public void seven()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(7)\"]")).click();
		  System.out.println("This in no 7");
	  }
	  
	  @Test
	  public void zero()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(0)\"]")).click();
		  System.out.println("This in no 0");
	  } 
	  
	  @Test
	  public void two()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(2)\"]")).click();
		  System.out.println("This in no 2");
	  }
	  
	  @Test
	  public void four()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(4)\"]")).click();
		  System.out.println("This in no 4");
	  }
	  
	  
	  @Test
	  public void nine()
	  { 
		  driver.get("https://www.calculator.net/");
		  driver.findElement(By.xpath("//span[@onclick=\"r(9)\"]")).click();
		  System.out.println("This in no 9");
	  }
	  
	 
	  
@AfterMethod
	  
	  public void after()
	  {
	  driver.close();
	  
      } 
	  
		  
	 }

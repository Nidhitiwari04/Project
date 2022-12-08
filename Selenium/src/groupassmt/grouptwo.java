package groupassmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grouptwo 
{
	WebDriver driver;
	  @BeforeMethod
	 public void setup()
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			
	 } 
	  
	  
	  
	  
	  @Test(groups=("smoke")) 
		public void books()
		{
			driver.get("https://demowebshop.tricentis.com/");
//			driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
//			System.out.println("This is booklink");
	}
	  
	  @Test
	  public void guru()
	  {
		  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  String s1= driver.getTitle();
		  System.out.println(s1); 
	  }
	  
	 
	@Test
	public void selenium()
	{
		driver.get("https://demo.guru99.com/");
		  driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
		  System.out.println("This is selenium dropdown");
	  }
		
	@Test
	public void insurance()
	{
		driver.get("https://demo.guru99.com/");
			  System.out.println("This is insurance dropdown");
	}
	
	
	@Test
	public void agile()
	{
		driver.get("https://demo.guru99.com/");
		  System.out.println("This is agile project");
		  
	}
	
	@Test
	public void bank()
	{
		driver.get("https://demo.guru99.com/");
		  System.out.println("This is bank project");
		  
	}
	
	
	@Test
	public void security()
	{
		driver.get("https://demo.guru99.com/");
		  System.out.println("This is security dropdown");
	}
	
	
	@Test
	public void telecom()
	{
		driver.get("https://demo.guru99.com/");
		  System.out.println("This is telecom dropdown");
	}
	
	@Test
	public void payment()
	{
		driver.get("https://demo.guru99.com/");
		  System.out.println("This is payment gateway");
	}
	
	@Test
	public void tours()
	{
		driver.get("https://demo.guru99.com/");
		  System.out.println("This is tour dropdown");
	}
	
	@Test
	public void seo()
	{
		driver.get("https://demo.guru99.com/");
		  System.out.println("This is SEO dropdown");
	}
	
	@AfterMethod
	  
	  public void after()
	  {
	  driver.close();
	  
      } 
	}
	  
	  
	  
	  
	  
	  
	  


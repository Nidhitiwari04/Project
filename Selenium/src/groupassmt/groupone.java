package groupassmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupone

{

	WebDriver driver;
	  @BeforeMethod
	 public void setup()
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			
	 } 
	  @Test
	  public void demo()
	  {
		 driver.get("https://demowebshop.tricentis.com/");
//		 String s= driver.getTitle();
//		 System.out.println(s);
	  }
	  
	  @Test
	  public void register()
	  {
		  driver.get("https://demowebshop.tricentis.com/");
		 // driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		 // System.out.println("This is register link"); 
				  
	  } 
		@Test (groups=("smoke")) 
	  public void login()
	  {
		 driver.get("https://demowebshop.tricentis.com/");
//		 driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
//		 System.out.println("This is login");
	  }	  
		  
		@Test
		public void selenium()
		{
			driver.get("https://demo.guru99.com/");
			  driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
			  System.out.println("This is selenium dropdown");
		  }
		@Test
		public void books()
		{
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
			System.out.println("This is booklink");
		}
		  
		  
		  @Test
		  public void electronics()
		  {
			  driver.get("https://demowebshop.tricentis.com/");
			  driver.findElement(By.xpath("//a[@href=\"/electronics\"]")).click();
			  System.out.println("This is Electronic");
		  }
		  
		 @Test
		 public void computer()
		 {
			 driver.get("https://demowebshop.tricentis.com/");
			  driver.findElement(By.xpath("//a[@href=\"/computers\"]")).click();
			  System.out.println("This is computer");
		 }
		  
		  @Test
		  public void shoes()
		  {    driver.get("https://demowebshop.tricentis.com/");
			  driver.findElement(By.xpath("//a[@href=\"/apparel-shoes\"]")).click();
			  System.out.println("This is apparel and shoes");
		  }
		  
		  
		  @Test
		  public void jewelry()
		  
		  {
			  driver.get("https://demowebshop.tricentis.com/");
			  driver.findElement(By.xpath("//a[@href=\"/jewelry\"]")).click();
			  System.out.println("This is Jwelery");
			
		  }
	@Test
	public void giftcard()
	{
		
		driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.xpath("//a[@href=\"/gift-cards\"]")).click();
		  System.out.println("This is giftcard");
		}
		  
	@Test
	public void cart ()
	{
		
		driver.get("https://demowebshop.tricentis.com/");
		  driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
		  System.out.println("This is shoping cart link");
		}
	
		
	@AfterMethod
	  
	  public void after()
	  {
	  driver.close();
	  
} 
		  
}	  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	  
	  
	  
	  
	  
	  


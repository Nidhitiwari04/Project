import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) throws InterruptedException 
	
	

	
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 
		  driver.get("https://demowebshop.tricentis.com/");
		 // driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		 
		  //driver.findElement( By.xpath("(//a[@href='/25-virtual-gift-card'])[1]/../..//input[@type='button']")).click();
		  //Thread.sleep(2000);
		 // driver.navigate().back();
	
		
		 //driver.findElement(By.xpath("(//a[@href=\'/141-inch-laptop\'])[2]/../..//input[@type='button']")).click();
		 // Thread.sleep(2000);
		  
		// driver.findElement(By.xpath("//a[@href='/build-your-cheap-own-computer'][1]/../..//input[@type='button']")).click();
		// Thread.sleep(1000);
		// driver.navigate().back();
		  
		 // driver.findElement(By.xpath("//a[@href='/build-your-own-computer'][1]/../..//input[@type='button']")).click();
		 // driver.navigate().back();
		  
		  


	}

}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/online-event-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.name("first_name")).sendKeys("john");
		driver.findElement(By.name("last_name")).sendKeys("jack");
		driver.findElement(By.id("user_email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("qspider");
		//driver.findElement(By.cssSelector("a[href=\"/phone\"]")).sendKeys("4343434343");
		
	
		driver.findElement(By.id("input_box_1665631521")).sendKeys("no");
		driver.findElement(By.name("input_box_1665632559")).sendKeys("jack");
		
		driver.findElement(By.name("radio_1665632432")).click();
	//driver.quit();
		
		
		
		
		

	}

}

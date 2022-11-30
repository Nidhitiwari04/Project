package SeleniumProjects.drivers;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstproject
{
public static void main(String[] args) throws InterruptedException, IOException

  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	   
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  
		  Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nidhi");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("dwivedi");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("dwivedi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asasa");
		driver.findElement(By.xpath("//select[@name=birth_day]"));
		//File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
		
		//FileUtils.copyFile(ScreenshotFile,new File("./screenshot/screen.png"));
		
		
		
		
		
  }  
  
}

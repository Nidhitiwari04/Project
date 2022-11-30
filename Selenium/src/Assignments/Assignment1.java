package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
 public static void main(String[] args) throws InterruptedException
 
  {
	
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.calculator.net/");
      driver.manage().window().maximize();
     driver.findElement(By.id("calcSearchTerm")).sendKeys("salary");
     Thread.sleep(3000);
     driver.navigate().back();
      driver.navigate().forward();
      driver.close();
      
   // driver.manage().window().maximize();
   	  //driver.findElement(By.cssSelector("input#email")).sendKeys("nidhi.d@gmail.com");
   	 // driver.findElement(By.cssSelector("input#pass")).sendKeys("32323");
   	 // driver.findElement(By.cssSelector("a#u_0_0_Sk")).click();
   	  //driver.findElement(By.cssSelector("a[ajaxify=\"/reg/spotlight/\"]")).click();
   	 // driver.findElement(By.cssSelector("input#u_2_b_4b")).sendKeys("nidhi");
     
   
     //driver.findElement(By.id("sciInPut")).sendKeys("2+2");
    //driver.findElement(By.id("sciOutPut")).sendKeys("4");

		//File ScreenshotFile=((TakeScreenshot)driver).getScreenshotAs((OutputType.FILE));
		
		//FileUtils.copyFile(ScreenshotFile,new File("./screenshot/screen.png"));
    
  }
}

package TestPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Locator {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		//Locators//
		  // Located by id 
		  driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		  Thread.sleep(3000);
		 // Located by name
		  driver.findElement(By.name("Password")).sendKeys("jobprogram");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnLogin")).click();
		  //driver.findElement(By.linkText("Forgot Password")).click();
	      Thread.sleep(3000);
	      //Located by linked text
	      driver.findElement(By.linkText("Employee")).click();
		  Thread.sleep(3000);
	      driver.findElement(By.linkText("Create")).click();
	      // Located by xpath(xpath by index)
	      driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Prabha");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath(" (//input[@placeholder='Last Name'])")).sendKeys("Merimi");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath(" (//input[@type='text'])[3]")).sendKeys("abc@gmail.com");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath(" (//input[@id='MobileNo'])")).sendKeys("1234567890");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("(//input[@id='DOB'])")).sendKeys("1-2-0000");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("(//textarea[@id='Address'])")).sendKeys("address");
	      // screenshot
	      File source=(File) (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
	     // System.out.println(source);
	      
	      File target = new File("C:\\Users\\Admin\\AppData\\Local\\Temp\\screenshot5444058084290865966.png");
	    
	      FileHandler.copy(source, target);
	}
	
}

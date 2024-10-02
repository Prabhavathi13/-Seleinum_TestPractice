package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
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
		  Thread.sleep(3000);
			driver.findElement(By.linkText("More")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("iFrames")).click();
			Thread.sleep(3000);
			
//			driver.findElement(By.linkText("Home")).click();
//			Thread.sleep(3000);
			driver.switchTo().frame("iframe2");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Toggle navigation")).click();

	

	}

}

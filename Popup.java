package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

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
		  driver.findElement(By.linkText("Popups")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("btn-six")).click();
		  Thread.sleep(3000);
		  // xpath by text
		  driver.findElement(By.xpath("//button[text()='Close']")).click();
	}

}

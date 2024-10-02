package TestPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		
		
		}

}

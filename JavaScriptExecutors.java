package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://magnus.jalatechnologies.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
		js.executeScript("document.getElementById('Password').value='jobprogram'");
		js.executeScript("document.getElementById('btnLogin').click()");
		
		String getURL = js.executeScript("return document.URL").toString();
		System.out.println(getURL);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();

 
		


	}

}

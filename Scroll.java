package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.zohocorp.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
    	js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		//WebElement Ref = driver.findElement(By.tagName("a"));
		//js.executeScript("arguments[0].scrollIntoView(true);",Ref);
		//Ref.click();
		js.executeScript("alert('hello prabha');");

	}

}

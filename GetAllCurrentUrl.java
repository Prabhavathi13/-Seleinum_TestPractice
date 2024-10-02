package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).isDisplayed()) {
				String nameOfLinks = links.get(i).getText();
				links.get(i).click();

				String pageUrl = driver.getCurrentUrl();

				System.out.println(nameOfLinks + " " + pageUrl);

				driver.navigate().back();

				links = driver.findElements(By.tagName("a"));
			}
		}

	}

}

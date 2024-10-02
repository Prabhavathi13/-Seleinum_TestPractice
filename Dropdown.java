package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
		WebElement dropdown = driver.findElement(By.id("CountryId"));
		Select select = new Select(dropdown);
		select.selectByIndex(5);
		Thread.sleep(3000);
		WebElement selectCity = driver.findElement(By.id("CityId"));
		Select select1 = new Select(selectCity);
		select1.selectByIndex(5);
		WebElement countryOptions = driver.findElement(By.id("CountryId"));
		List<WebElement> getOptions = countryOptions.findElements(By.tagName("option"));
		System.out.println(getOptions.size());

		for (int i = 0; i < getOptions.size(); i++) {
			System.out.println(getOptions.get(i).getText());
		}

	}

}

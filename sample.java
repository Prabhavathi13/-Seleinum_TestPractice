package TestPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://magnus.jalatechnologies.com/Account/Login");
	    
	   // driver.close();
	    driver.navigate().to("https://aws.amazon.com/console/");
	  //  Thread.sleep();
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    String geturl = driver.getCurrentUrl();
	    System.out.println(geturl);
	    driver.getPageSource();
	    
	    
	    
	    
	      
	    
	  
		

	}

}


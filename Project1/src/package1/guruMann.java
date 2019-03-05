package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class guruMann {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.youtube.com/");
		
		
		driver.findElement(By.xpath("//*[@id='search' and @tabindex='0']")).sendKeys("guru mann health and fitness");
		driver.findElement(By.xpath("//*[@id='search' and @tabindex='0']")).sendKeys(Keys.ENTER);
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Health And Fitness")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.cssSelector("yt-icon[class=\"style-scope ytd-expandable-tab-renderer\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input-1\"]")).sendKeys("morning workout");
		
		driver.findElement(By.xpath("//*[@id=\"input-1\"]")).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("MORNING or EVENING Workout")).click();
		
		
	
		
		
		
		
	
		
	}
	
	
}

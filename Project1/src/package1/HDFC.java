package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(5000);
		
		
		//driver.findElement(By.cssSelector("img[alt=\"product services\"]")).click();
		
		driver.findElement(By.cssSelector("img[alt=\"product services\"]")).click();
		

	}

}

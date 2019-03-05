package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("//*[@type='checkbox' and @ value='checkbox1']")).click();
		driver.findElement(By.xpath("//*[@type='checkbox' and @ value='checkbox2']")).click();
		driver.findElement(By.xpath("//*[@type='checkboxn' and @ value='checkbox3']")).click();
		
	}
	
	
}

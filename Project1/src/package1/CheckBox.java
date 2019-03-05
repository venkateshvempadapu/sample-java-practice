package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		for (int i=0;;i++)
		{
			
		
		driver.findElement(By.xpath("//*[@type='checkbox' and @ value='checkbox1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@type='checkbox' and @ value='checkbox2']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@type='checkbox' and @ value='checkbox3']")).click();
		
		Thread.sleep(2000);
		
		}
		
	}
		

}

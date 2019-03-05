package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class YahooMail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("testtesting37@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("Abcd@@12345");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		driver.findElement(By.xpath("(//span[text()='Mail'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-test-id='compose-button']")).click();
		driver.findElement(By.xpath("(//*[@role='combobox'])[2]")).sendKeys("Bheemesh.Cirpe@gmail.com");
		driver.findElement(By.xpath("//*[@data-test-id='compose-subject']")).sendKeys("Automation Testing for File Upload Download");
		driver.findElement(By.xpath("(//*[@role='button'])[5]")).sendKeys("C:\\Users\\Bheemsh\\Downloads\\123.jpg");
		driver.findElement(By.xpath("//*[@title='Send this email']")).click();
	
		
		
		
		

}

}

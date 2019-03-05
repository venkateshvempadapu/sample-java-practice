package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.way2sms.com/");
		
		driver.findElement(By.xpath("//*[@id=\"mobileNo\"]")).sendKeys("9700181055");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("nanukava");
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("mobile")).sendKeys("9493498091");
		Thread.sleep(5000);
		
		driver.findElement(By.id("message")).sendKeys("This is message from Selenium Program From Bheemesh");
		
		
		driver.findElement(By.xpath("//*[@id=\"sendButton\"]")).click();  
		
		
	}

}

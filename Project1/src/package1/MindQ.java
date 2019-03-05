package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MindQ {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.mindqsystems.com/contact-us.php");
		
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Sai Taja");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("saitija.tambale@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("9703434918");
		
		driver.findElement(By.xpath("//*[@id='course_name']")).sendKeys("Selenium with Java");
		
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("Need Framework Classess for real time projects");
		
		
		
	}

}

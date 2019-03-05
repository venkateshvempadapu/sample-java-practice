package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ffai.loyaltyplus.aero/ailoyalty/register.jsf");
		
		WebElement d=driver.findElement(By.id("register_form:profile:title_label"));
		
		List<WebElement> s= driver.findElements(By.xpath("(//li[contains(@id,'register_form:profile:title_')]/following-sibling::li)"));
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", s);
		

	}

}

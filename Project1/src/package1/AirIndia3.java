package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AirIndia3 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ffai.loyaltyplus.aero/ailoyalty/register.jsf");
		
		WebElement d=driver.findElement(By.id("register_form:profile:title_label"));
		
		d.click();
		
	
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", d);
		
		Select S= new Select(d);
		//S.selectByVisibleText("MR");
		
		
		System.out.println("Done");
		
		
		
		
		

		
		
		
		
		

	}

}

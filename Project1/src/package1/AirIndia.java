package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class AirIndia {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ffai.loyaltyplus.aero/ailoyalty/register.jsf");
		
		WebElement d=driver.findElement(By.id("register_form:profile:title_label"));
		
		d.click();
		
		System.out.println("Click working fine");
		
		WebElement e=driver.findElement(By.id("register_form:profile:title_input"));
		
		Select S= new Select(e);
		
		Thread.sleep(5000);
		

		Actions actions = new Actions(driver);
		actions.moveToElement(e);
		actions.click();
		actions.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(3000);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.build().perform();
		
		
		
	    S.selectByVisibleText("MR");
		

		
		//driver.close();
	
		
}
}

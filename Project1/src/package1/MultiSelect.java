package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement driver1=driver.findElement(By.id("fruits"));	
		
		Select S=new Select(driver1);
	
		S.selectByVisibleText("Orange");
		S.selectByVisibleText("Grape");
	
		Thread.sleep(2000);
	
		S.deselectByVisibleText("Orange");
	
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}

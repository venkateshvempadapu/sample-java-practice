package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
	WebElement driver1=driver.findElement(By.name("country"));	
		
	Select S=new Select(driver1);
	
	S.selectByVisibleText("INDIA");
	
	Thread.sleep(2000);
	
	S.deselectByVisibleText("INDIA");
	
	driver.quit();
	
	}

}

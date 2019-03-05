package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		
		driver.manage().window().maximize();
	
	
		driver.findElement(By.xpath("//*[@id=\"java_technologies\"]/li[1]/a")).click();
		
		
		
		
		Thread.sleep(5000);
		
		
		
		/*driver.findElement(By.id("search")).click();
		
		driver.findElement(By.id("search")).sendKeys("Xpath");
		
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);  */
		
		
		
		WebElement element = driver.findElement(By.id("search_submit"));
		
		//element.click();
		
		
		/*********************Method 1**********************/
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().build().perform();
		

		/*********************Method 2**********************/
		
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		
		
		
		
	}

}

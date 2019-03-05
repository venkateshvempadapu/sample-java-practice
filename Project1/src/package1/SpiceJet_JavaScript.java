package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet_JavaScript {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id='buttons']/div/div/ul/li[2]/a/span[2]")).click();
		
		Thread.sleep(5000);
		WebElement s=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_txt_Fromdate_MST']"));

		//s.click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("driver.setAttribute('value','01-01-2019');",s);
		

		
		
	}

}

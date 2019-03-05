package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

	   //By finding all the web elements using iframe tag
	   List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	   System.out.println("The total number of iframes are " + iframeElements.size());
		
		
		
		
		
		
	}
	
	
	
}

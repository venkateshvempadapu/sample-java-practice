package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		//driver.get("https://stackoverflow.com/questions/15171745/how-to-slidemove-slider-in-selenium-webdriver");
		
			
			
			driver.get("https://nareshit.in/contact-us/");
		
		//driver.switchTo().frame("google_ads_iframe_/248424177/stackoverflow.com/lb/question-pages_0");
		
		
		JavascriptExecutor  Js =  (JavascriptExecutor)driver;
		
	  //  Js.executeScript("window.scrollBy(0,1000)");
	    Js.executeScript("window.scrollBy(100,1000)");
	   

	}

}

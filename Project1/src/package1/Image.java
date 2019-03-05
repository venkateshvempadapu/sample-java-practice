package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[1]/div/div/h1/a/i")).click();
		//driver.findElement(By.cssSelector("#blueBarDOMInspector > div > div.loggedout_menubar_container > div > div > h1 > a > i")).click();
		
		
		driver.findElement(By.cssSelector("i[class=\"fb_logo img sp_9jEi5ZEk7ZM sx_f2ffbb\"]")).click();
		
		
		
	}

}

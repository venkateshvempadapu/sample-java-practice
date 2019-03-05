package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate_Cache_Yahoo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://in.yahoo.com/");
		
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("gurumann");
		
		Actions a=new Actions(driver);
		
		
		for(int i=1; i<=10;i++)
			
		{
			
			a.sendKeys(Keys.DOWN).build().perform();
			
			String s=driver.findElement(By.xpath("//*[@id='uh-search-box']")).getAttribute("value");
			System.out.println(s);
			
			if (s.equalsIgnoreCase("gurumann height"))
				
			{
				System.out.println("passed");
               
				
			}
			
			
		}
		
		
		
		
		
		
	}

}

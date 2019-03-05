package package1;
import java.util.List;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AirIndia2 {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ffai.loyaltyplus.aero/ailoyalty/register.jsf");
		
		WebElement d=driver.findElement(By.id("register_form:profile:title_label"));
		
		d.click();
		
		List<WebElement> s= driver.findElements(By.xpath("(//li[contains(@id,'register_form:profile:title_')]/following-sibling::li)"));
		
		
		//WebElement y=driver.findElement(By.xpath("//*[@id='register_form:profile:title_1']"));
		
		WebElement y=driver.findElement(By.xpath("(//*[text()='MASTER'])[3]"));
		
		//String t=y.getText();
		
		//System.out.println(y.getText());
		
		
		
		Thread.sleep(3000);
		
		y.click();
			
			
		
	
		/*for (int i=0;i<s.size();i++)
			
		{
		
			System.out.println(s.get(i).getText());
			
			s.get(i).click();
			
			Thread.sleep(3000);
			
			d.click();
			
			
		}  */

	
		
		
		
		
		


	
		
}
}

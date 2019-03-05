package package1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id='buttons']/div/div/ul/li[2]/a/span[2]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='MySpiceTripSearchContainer']/div[4]/button")).click();
		
		
		List<WebElement> r=driver.findElements(By.xpath("(//table)[7]/tbody/tr"));
		List<WebElement> c=driver.findElements(By.xpath("(//table)[7]/tbody/tr[1]/td"));
		
		//System.out.println(r);
		//System.out.println(c);
		
		int i,j;
		
		for(i=1;i<= r.size();i++)
			
		{
			for (j=1;j<=c.size();j++)	
			{
				
			WebElement  m=driver.findElement(By.xpath("(//table)[7]/tbody/tr["+i+"]/td["+j+"]"));	
				
			
				
				
				
				System.out.println(m.getText());	
				
			/*	if(i==4&j==6)
					
					
				{
					
					driver.findElement(By.xpath("(//table)[7]/tbody/tr["+i+"]/td["+j+"]")).click();
					
					System.out.println("Value Selected");
				
				} */
				
			}	
			
		}
		
		
		
		
		
		
		
	}

}

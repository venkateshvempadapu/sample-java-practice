package package1;
	
	
	
	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Iframe2_w3school {
		
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		
		   List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		   System.out.println("The total number of iframes are " + iframeElements.size());
		
		
		/*Thread.sleep(5000);
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//*[text()='Try it']")).click();
		
		
		String x=driver.switchTo().alert().getText();
		System.out.println(x);
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//driver.close();
		*/
		
		
		}

	}


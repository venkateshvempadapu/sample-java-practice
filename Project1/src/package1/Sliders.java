package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/mens-footwear/pr?sid=osp%2Ccil&otracker=nmenu_sub_men_0_Footwear&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax");
		
		
		WebElement e=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[1]/div/div/div/section[2]/div[3]/div[1]"));
		
		
		WebElement e2=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[1]/div/div/div/section[2]/div[3]/div[1]/div[1]"));
		Actions a= new Actions(driver);
		
		
	
		
		a.dragAndDropBy(e, 30, 0).build().perform();
		Thread.sleep(5000);
		a.dragAndDropBy(e2, 30, 0).build().perform();
		
		
		
		
		

	}
	
}

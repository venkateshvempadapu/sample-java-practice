package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class Download {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
		
		
		//String link="https://github.com/mozilla/geckodriver/releases";
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[3]/a"));		
		
		
		String link=e.getAttribute("href");
		System.out.println(link);
		
		
		String wget_command = "cmd /c C:\\Users\\Bheemsh\\Downloads\\wget-1.19.4-win32\\wget.exe -P G: --no-check-certificate " + link;

        try {
        	
        Process exec = Runtime.getRuntime().exec(wget_command);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        
        
        } catch (InterruptedException | IOException ex) {
        System.out.println(ex.toString());
        }
		
		

	}

}

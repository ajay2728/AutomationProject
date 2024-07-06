package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public  WebDriver driver;
	
	
	
	public WebDriver setupBrowser() throws Exception {
		
		FileInputStream input = new FileInputStream("config.properties");
		
		Properties properties = new Properties();
		
		properties.load(input);
		
		String browser = properties.getProperty("browser");
		 
		
		if(driver == null) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			
		}
		
		driver.get(properties.getProperty("URL"));
		
		Thread.sleep(5000);
		
		return driver;
		
	}
      
}

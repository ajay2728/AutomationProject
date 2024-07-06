package com.akav.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderClass {
 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/hotels");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@tabindex='2']")).click();
		Thread.sleep(1000);
		
		String expectedMonth = "September";
		
		
		
		
		while(true) {
			
			String currentMonth = driver.findElement(By.xpath("(//div[@class = 'DayPicker-Months']//div[@role = 'heading'])[1]//div")).getText();
			
			if(currentMonth.contains(expectedMonth)) {
				
				break;
			}else {
				driver.findElement(By.xpath("//*[local-name() = 'svg' and @data-testid = 'rightArrow' ]")).click();
				Thread.sleep(1000);
			}
		}
		
		driver.findElement(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[text() = '5']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}

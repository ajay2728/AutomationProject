package pageObjects;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.Timeout;
import io.cucumber.messages.types.Duration;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By searchBar = By.xpath("//textarea[@title= 'Search']");
	
	
	public void enterDataIntoSearchBar(String data) {
		
		Set<String> windows = driver.getWindowHandles();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element1 = driver.findElement(By.className("SAdf"));
		WebElement element2 = driver.findElement(By.className("SAdf"));
		
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.SHIFT).sendKeys(element2, "ajayluar").build().perform();
		
		
		action.dragAndDrop(element1, element2);
		
		
		Select dropdownElement = (Select) driver.findElement(By.tagName("Select"));
		
		Dropdo
		
	}

}

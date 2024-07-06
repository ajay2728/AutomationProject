package com.akav.stepdefinitions;

import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utils.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GoogleSearchPage;

public class searchDefinitions {
	
	TestBase testBase;
	GoogleSearchPage googleSearchPage;
	
	SoftAssert assertSoft = new SoftAssert();
	
	public searchDefinitions(TestBase testBase) throws Exception {
		
		this.testBase = testBase;
		this.testBase.setupBrowser();		
		
		googleSearchPage = new GoogleSearchPage(testBase.driver);
	}
	
	@Given("Open the web browser with google link")
	public void open_the_web_browser_with_google_link() throws Exception {
	    
		testBase.setupBrowser();
	}
	@When("user search something in the google")
	public void user_search_something_in_the_google(DataTable datatabe) {
		
		Map<String ,String> map = datatabe.asMap(String.class , String.class);
		
	   googleSearchPage.enterDataIntoSearchBar("Aryavardhan IPS");
	}
	@Then("validate search result is displaying")
	public void validate_search_result_is_displaying() {
		
		assertSoft.assertEquals(false, true);
		assertSoft.assertAll();
		
		testBase.driver.quit();
	   
	}

}

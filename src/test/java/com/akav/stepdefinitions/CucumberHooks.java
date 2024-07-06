package com.akav.stepdefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestBase;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {
	
	TestBase testBase;
	WebDriver driver;
	public CucumberHooks(TestBase testbase) throws Exception {
		
		this.testBase = testBase;
		driver = testBase.setupBrowser();
	
		
	}
		
	@AfterStep
	public void isStepFailed(Scenario scenario) throws Exception {
				
		
		if(scenario.isFailed()) {
			System.out.print("Ajayakumat");
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		    byte[] byteArray = FileUtils.readFileToByteArray(source);
		    scenario.attach(byteArray, "image/png", "image");
		}
	}

}

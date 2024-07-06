package TestNGRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "FeatureFiles" ,glue = "com.akav.stepdefinitions", plugin = {"html:target/reports.html" ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNGrUNNER extends AbstractTestNGCucumberTests {

}

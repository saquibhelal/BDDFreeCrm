package com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Icam_Automation_Test_QA\\FreeCrmBddFrameWork\\src\\main\\java\\com\\qa\\Features\\contactList.feature"// Path of the feature file
		,glue={"stepDefinitions"},//Path of the stepdefinition file
		format={"pretty","html:test-output"},//generate different type of reporting 
		monochrome=true,//display the console output in a proper readable format
		strict=true,
		dryRun=false//to check the mapping between feature file and step def file
		)

public class TestRunner {

	
	
	
	
	
}

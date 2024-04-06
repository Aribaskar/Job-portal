package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/feature", glue = "com.step",tags = "@pen", dryRun = false,plugin = {"json:C:\\Users\\ariba\\eclipse-workspace\\JobPortal\\target\\Report\\jvm.json"})

public class TestRunner {
	
	@AfterClass
	public static void report() {
		
		File f=new File("C:\\Users\\ariba\\eclipse-workspace\\JobPortal\\target\\Report\\jobreport");
		
		Configuration c=new Configuration(f, "JobPortal");
		c.addClassifications("laptop","Dell");
		c.addClassifications("OS", "windows");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("version", "11");
		
		List<String> j=new ArrayList<String>();
		j.add("C:\\Users\\ariba\\eclipse-workspace\\JobPortal\\target\\Report\\jvm.json");
		
		ReportBuilder bu=new ReportBuilder(j, c);
		bu.generateReports();
		
	

}

}

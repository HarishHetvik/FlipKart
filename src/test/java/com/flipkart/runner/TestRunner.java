package com.flipkart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@chrome or @edge or @search or  @proceed"),features="src\\test\\resources\\FeaturesFile",glue ="com.flipkart.stepdefinition",dryRun = false,plugin = {"junit:target\\index.xml","html:target\\index.html"})
public class TestRunner {

}
 
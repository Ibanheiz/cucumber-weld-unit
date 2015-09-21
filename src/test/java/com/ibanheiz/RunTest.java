package com.ibanheiz;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	dryRun = false,
	strict = true,
	features = "src/test/resources",
	monochrome = true,
	plugin = {
	"pretty"
	}
)
public class RunTest {
}

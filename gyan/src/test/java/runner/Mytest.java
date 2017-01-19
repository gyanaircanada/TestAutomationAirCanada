package runner;

import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//This is for Junit ...
//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Mytest.feature",
glue={"StepDefination"},
plugin ={"json:target/cucumber1.json"})

public class Mytest extends AbstractTestNGCucumberTests{
public void a()
{
	System.out.println("asdsa");
}
}

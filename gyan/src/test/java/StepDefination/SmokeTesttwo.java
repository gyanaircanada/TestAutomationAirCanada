package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTesttwo {
	WebDriver driver;
	
@Given("^Open firefox and start application$")
public void Open_firefox_and_start_application() throws Throwable {
//C:\Users\IBM_ADMIN\workspace\AirCanada\Selenium_CucumberProject\featutes\geckodriver.exe
	System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\workspace\\AirCanada\\gyan\\featutes\\geckodriver.exe");
 driver = new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("http://www.facebook.com");
 
}
@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void I_enter_valid_username_and_password(String sUserName, String sPassword) throws Throwable {
    driver.findElement(By.id("email")).sendKeys(sUserName);
    driver.findElement(By.id("pass")).sendKeys(sPassword);
}
@Then("^User is able to login successfully$")
public void User_is_able_to_login_successfully() throws Throwable {
	driver.findElement(By.id("loginbutton")).click();
    
}
@Then("^Application should be closed$")
public void application_should_be_closed() throws Throwable {
    driver.quit();
}


}

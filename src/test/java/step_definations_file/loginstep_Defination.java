package step_definations_file;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import all_pom_classes.Accountpage;

import org.junit.Assert;

public class loginstep_Defination
{
	 WebDriver driver;
	 Accountpage accountPage;

	    @Given("the user is on the Customer Account login page")
	    public void userIsOnLoginPage() {
	        // Initialize the WebDriver and navigate to the login page
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://magento.softwaretestingboard.com/customer/account/");
	        accountPage = new Accountpage(driver);
	    }

	    @When("the user enters a valid email and password")
	    public void userEntersValidCredentials() {
	        accountPage.enterEmail("valid.email@example.com");
	        accountPage.enterPassword("validpassword");
	    }

	    @When("the user enters an invalid email and password")
	    public void userEntersInvalidCredentials() {
	        accountPage.enterEmail("invalid.email@example.com");
	        accountPage.enterPassword("invalidpassword");
	    }

	    @When("clicks on the login button")
	    public void userClicksLoginButton() {
	        accountPage.clickLogin();
	    }

	    @Then("the user should be redirected to the account dashboard")
	    public void userRedirectedToDashboard() {
	        // Verify redirection - This is a placeholder; implement actual verification
	        Assert.assertTrue(driver.getCurrentUrl().contains("customer/account/"));
	        driver.quit();
	    }

	    @Then("an error message should be displayed")
	    public void errorMessageDisplayed() {
	        String errorMessage = accountPage.getErrorMessage();
	        Assert.assertTrue(errorMessage.contains("Invalid login or password."));
	        driver.quit();
	    }
	}
	

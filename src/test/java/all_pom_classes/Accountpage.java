
	package all_pom_classes;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Accountpage {

	    WebDriver driver;

	    // Constructor to initialize elements with Selenium Page Factory
	    public Accountpage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Locators for elements on the account page
	    @FindBy(id = "email")
	    private WebElement emailField;

	    @FindBy(id = "pass")
	    private WebElement passwordField;

	    @FindBy(id = "send2")
	    private WebElement loginButton;

	    @FindBy(css = ".message-error")
	    private WebElement errorMessage;

	    // Methods to interact with elements
	    public void enterEmail(String email) {
	        emailField.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }

	    public String getErrorMessage() {
	        return errorMessage.getText();
	    }
	}



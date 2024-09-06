package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/account_login.feature",
    glue = "src/test/java/step_definations_file/loginstep_Defination.java.java",
    plugin = {"pretty", "html:target/cucumber-reports"}
)

public class account_runner
{
	
}

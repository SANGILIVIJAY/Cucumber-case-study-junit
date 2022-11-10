package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions (features= {"src/test/resources/loginn/loginn2.feature"},glue={"definition"},tags="@NegativeTesting",plugin={"html:report/myreport.html"})
	public class test_runner{
		
		
	}
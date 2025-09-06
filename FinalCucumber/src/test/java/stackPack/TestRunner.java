package stackPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/stackkFolder",
				glue= {"stackPack"},
				plugin= {"pretty","html:target/cucumber-reports/report.html",
						"json:target/cucumber-reports/report.json",
						"junit:target/cucumber-reports/report.xml"})

public class TestRunner {

}

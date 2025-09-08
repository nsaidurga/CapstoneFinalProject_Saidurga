package stackPack;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/stackkFolder",
				glue= {"stackPack"},
				plugin= {"pretty","html:target/htmlreport.html",
						"json:target/report.json",
						"junit:target/report.xml"})

public class TestRunner {

}

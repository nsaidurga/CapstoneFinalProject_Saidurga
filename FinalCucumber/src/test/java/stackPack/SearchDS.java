package stackPack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDS {
	//
	WebDriver d;
	@Given("Home page available")
	public void home_page_available() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on search input field")
	public void click_on_search_input_field() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clicksearchfiled();
	}

	@Then("Entering the search words")
	public void entering_the_search_words() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.searchwords();
	}
	
	@Given("Search with Partial Product")
	public void search_with_partial_product() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.partialname();
	}

	@Given("Search with Invalid Keyword")
	public void search_with_invalid_keyword() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.invalidname();
	}

	@Given("Search with Special Characters")
	public void search_with_special_characters() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.specialsearch();
	}

	@Given("Search with Blank Input")
	public void search_with_blank_input() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.blanksearch();
	}

	@Given("Search with extra spaces Input")
	public void search_with_extra_spaces_input() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.spacessearch();
	}

	@Given("Case Sensitivity Check")
	public void case_sensitivity_check() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.casesensitive();
	}

	@Then("Listed the matched results")
	public void listed_the_matched_results() {
	    System.out.println("All matched results here");
	}


}

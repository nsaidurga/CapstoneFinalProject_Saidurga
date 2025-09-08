package stackPack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDS {
	//
	WebDriver d;
	@Given("Home page available")
	public void home_page_available() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
		d=new ChromeDriver(options);
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on search input field")
	public void click_on_search_input_field() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clicksearchfiled();
	}

	@Then("Entering the search words {string}")
	public void entering_the_search_words(String name) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.searchwords(name);
	}
	
	@Given("Search with Partial Product {string}")
	public void search_with_partial_product(String partial)  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.partialname(partial);
	}

	@Given("Search with Invalid Keyword {string}")
	public void search_with_invalid_keyword(String invalid) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.invalidname(invalid);
	}

	@Given("Search with Special Characters {string}")
	public void search_with_special_characters(String special) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.specialsearch(special);
	}

	@Given("Search with Blank Input {string}")
	public void search_with_blank_input(String blank) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.blanksearch(blank);
	}

	@Given("Search with extra spaces Input {string}")
	public void search_with_extra_spaces_input(String space) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.spacessearch(space);
	}

	@Given("Case Sensitivity Check {string}")
	public void case_sensitivity_check(String case1) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.casesensitive(case1);
	}

	@Then("Listed the matched results")
	public void listed_the_matched_results() {
	    System.out.println("All matched results here");
	}
}

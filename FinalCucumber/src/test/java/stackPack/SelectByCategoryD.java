package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectByCategoryD {
	WebDriver d;
	//input[value="Apple"]
	
	@Given("Home2 page visible")
	public void home2_page_visible() {
		
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("check available categories")
	public void check_available_categories() {
	    System.out.println("Check all the functionality of category buttons...");
	}

	@When("click on single category button")
	public void click1_on_single_category_button() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.singlecatclick();
	}

	@Then("See the specified selected category of the products")
	public void see_the_specified_selected_category_of_the_products() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.singcatprods();
	}

//
	@When("click on two category buttons")
	public void click_on_two_category_buttons() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.twocatclick();
	}

	@Then("See the two specified selected categories of the products")
	public void see_the_two_specified_selected_categories_of_the_products() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.doblecatprods();
	}

//
	@When("click on three category buttons")
	public void click_on_three_category_buttons() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.threecatclick();
	}

	@Then("See the three particular selected categories of the products")
	public void see_the_three_particular_selected_categories_of_the_products() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.threecatprods();
	}

//
	@When("click on four category buttons")
	public void click_on_four_category_buttons() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.fourcatclick();
	}

	@Then("See the four particular selected categories of the products")
	public void see_the_four_particular_selected_categories_of_the_products()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.fourcatprods();
	}


}

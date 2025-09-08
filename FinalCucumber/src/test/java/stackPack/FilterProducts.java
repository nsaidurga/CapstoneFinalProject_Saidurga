package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterProducts {
	WebDriver d;
	
	@Given("Home3 page visible")
	public void home3_page_visible() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
		d=new ChromeDriver(options);
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on search button")
	public void click_on_search_button() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.serchbut();
	}

	@Then("click on Order by select button")
	public void click_on_order_by_select_button() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickorderby();
	}

	@And("choose the type of filtering")
	public void choose_the_type_of_filtering() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.typefilter();
	}

	@And("Scroll the List of products")
	public void scroll_the_list_of_products()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.scroll();
	}

}

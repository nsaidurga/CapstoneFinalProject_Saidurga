package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartDemo {
	WebDriver d;
	@Given("Home page visible")
	public void home_page_visible() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
		d=new ChromeDriver(options);
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("search a product {string}")
	public void search_a_product(String proname) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.searchprod(proname);
	}

	@Then("click on addtocart button")
	public void click_on_addtocart_button() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.addtocartbuton();
	}
	

	@And("increase the count for same product")
	public void increase_the_count_for_same_product() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.counter();
	}

	@And("check details of the product")
	public void check_details_of_the_product() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.detailsofprod();
	}
}

package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteCart {
	WebDriver d;

	@Given("Home page1 visible")
	public void home_page1_visible() {
		d = new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("search a1 product")
	public void search_a1_product() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.prodsearch();
	}

	@Then("add multiple products to cart")
	public void add_multiple_products_to_cart() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.multipleadd();
	}

	@And("remove all items from cart")
	public void remove_all_items_from_cart() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.removecart();
	}

	@And("ensure cart is empty")
	public void ensure_cart_is_empty() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.emptycart();

	}

}

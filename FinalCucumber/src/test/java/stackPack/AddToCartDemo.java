package stackPack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartDemo {
	WebDriver d;
	@Given("Home page visible")
	public void home_page_visible() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("search a product")
	public void search_a_product() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.searchprod();
	}

	@Then("click on addtocart button")
	public void click_on_addtocart_button() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.addtocartbuton();
	}
	

	@And("increase the count for same product")
	public void increase_the_count_for_same_product() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.counter();
	}

	@And("check details of the product")
	public void check_details_of_the_product() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.detailsofprod();
	}
	//(//div[@class="shelf-item__buy-btn"])[3]
			//Navbar_logo__image__3Blki
}

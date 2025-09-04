package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutProcess {
	WebDriver d;
	@Given("Home4 page visible")
	public void home_page_visible() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@And("Login user")
	public void login_user() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.login();
		
	}
	@When("After adding a product")
	public void after_adding_a_product() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.afteradd();
	}

	@Then("click on checkout button")
	public void click_on_checkout_button() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.checkbuton();
	}

	@And("verify fill all fields")
	public void verify_fill_all_fields() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.allfields();
	}
	@And("verify without filled fields")
	public void verify_without_filled_fields() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.emptyfields();
	}

	@And("verify all fields with special characters")
	public void verify_all_fields_with_special_characters() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.specialchars();
	}

	@And("verify all fields with null values")
	public void verify_all_fields_with_null_values() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.nullvalues();
	}

	@And("verify postal code with nonNumbers")
	public void verify_postal_code_with_non_numbers() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.postcode();
	}

	@And("close the page")
	public void close_the_page() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.closepage();
	}


}

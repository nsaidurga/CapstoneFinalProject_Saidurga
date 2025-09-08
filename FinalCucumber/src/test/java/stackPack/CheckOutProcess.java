package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CheckoutDemo {
	WebDriver d;
	@Given("Home page is visible for checkout")
	public void home_page_is_visible_for_checkout() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("After1 adding a product")
	public void after1_adding_a_product()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.afteradd();
	}

	@And("click on checkout1 button")
	public void click_on_checkout1_button()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.checkbuton();
	}

	@And("Login the user for checkout")
	public void login_the_user_for_checkout()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.login();
	}

	@When("checkout with input fields {string}, {string}, {string}, {string} and {string}")
	public void checkout_with_input_fields_firstname_lastname_address_state_and_pincode(String firstname,String lastname,String address,String state,String pincode) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.allfields(firstname, lastname, address, state, pincode);

	}
}

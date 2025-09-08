package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders {
	WebDriver d;
	
	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
		
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Click on Orders tab")
	public void click_on_orders_tab() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickonorders();
	}

	@When("existingUser login with credentials")
	public void existing_user_login_with_credentials() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.existingsuser();
	}

	@And("Clicked the order tab")
	public void clicked_the_order_tab() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickorders1();
	}

	@Then("user can see all orders")
	public void user_can_see_all_orders() {
	    System.out.println("All placed orders are here");
	}

	@And("scrolldown page and close")
	public void scrolldown_page_and_close() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.scrollorders();
		d.close();
	}
//
	
	@When("demoUser login with credentials")
	public void demo_user_login_with_credentials() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.demouser1();
	}

	@And("Clicked1 the order tab")
	public void clicked1_the_order_tab() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickorders2();
	}

	@Then("a1dded112 anew product {string}, {string}, {string}, {string} and {string}")
	public void a1dded112_anew_product(String firstname1,String lastname1,String address1,String state1,String pincode1){
		PageClassSDB pc=new PageClassSDB(d);
		pc.newaddprod(firstname1, lastname1, address1, state1, pincode1);
		System.out.println("one svssh");
	}

	@And("all placed orders")
	public void all_placed_orders() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.placedorders();
		d.close();
	}
//
	
	@When("favoriteUser login with credentials")
	public void favorite_user_login_with_credentials() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.favouriteuser1();
	}

	@And("Clicked2 the order tab")
	public void clicked2_the_order_tab() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickorders3();
	}

	@Then("p1lace112 the order from favourites {string}, {string}, {string}, {string} and {string}")
	public void p1lace112_the_order_from_favourites(String firstname,String lastname,String address,String state,String pincode) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.placeorderfromfavs(firstname, lastname, address, state, pincode);
	}

	@And("order page opened")
	public void order_page_opened() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.orderpageopen();
		d.close();
	}

}

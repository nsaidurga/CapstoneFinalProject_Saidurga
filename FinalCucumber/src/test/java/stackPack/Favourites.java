package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Favourites {
	WebDriver d;
	@Given("User on home page")
	public void user_on_home_page() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("Click on favourites tab")
	public void click_on_favourites_tab() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.favouritestabclick1();
	}
	
	@When("demoUser1 login with credentials")
	public void demo_user1_login_with_credentials() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.demouserlogin();
	}

	@When("no favourites found")
	public void no_favourites_found() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.nofavourites();
	}

	@Then("Add few favourites")
	public void add_few_favourites() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.addfavourites();
	}

	@Then("click on the favouritestab")
	public void click_on_the_favouritestab() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickonfavourites2();
	}

	@Then("all favourites here")
	public void all_favourites_here() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.allfavourites();
	}
//

	@When("favoriteUser1 login with credentials")
	public void favorite_user1_login_with_credentials() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.favoriteuserlogin();
	}

	@When("you can see all favourites")
	public void you_can_see_all_favourites() {
	    System.out.println("All favourites here");
	}

	@Then("Remove all favourites")
	public void remove_all_favourites() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.removefavourites();
	}

	@And("Returned to home page")
	public void returned_to_home_page() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.returnhomepage();
	}

	@And("click on favourites")
	public void click_on_favourites()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickfavourites3();
	}

	@And("After the favourites page")
	public void after_the_favourites_page()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.refreshfavs();
	}
	
	@When("favoriteUser2 login with credentials")
	public void favorite_user2_login_with_credentials()  {
		PageClassSDB pc=new PageClassSDB(d);
		pc.favuser();
	}

	@Then("place1 the order from favourites {string}, {string}, {string}, {string} and {string}")
	public void place1_the_order_from_favourites(String firstname,String lastname,String address,String state,String pincode) {
		PageClassSDB pc=new PageClassSDB(d);
		pc.placeorderfromfavs(firstname, lastname, address, state, pincode);
	}

	@And("order1 page opened")
	public void order1_page_opened() {
		PageClassSDB pc=new PageClassSDB(d);
		pc.orders();
	}
	
}

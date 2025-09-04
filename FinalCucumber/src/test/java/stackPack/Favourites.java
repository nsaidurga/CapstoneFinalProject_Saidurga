package stackPack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Favourites {
	//div[@id='2']//button[@aria-label='delete']
	WebDriver d;
	@Given("User on home page")
	public void user_on_home_page() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("Click on favourites tab")
	public void click_on_favourites_tab() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.favouritestabclick1();
	}
	
	@When("demoUser1 login with credentials")
	public void demo_user1_login_with_credentials() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.demouserlogin();
	}

	@When("no favourites found")
	public void no_favourites_found() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.nofavourites();
	}

	@Then("Add few favourites")
	public void add_few_favourites() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.addfavourites();
	}

	@Then("click on the favouritestab")
	public void click_on_the_favouritestab() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickonfavourites2();
	}

	@Then("all favourites here")
	public void all_favourites_here() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.allfavourites();
	}
//

	@When("favoriteUser1 login with credentials")
	public void favorite_user1_login_with_credentials() throws InterruptedException {
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
	public void click_on_favourites() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.clickfavourites3();
	}

	@And("After the favourites page")
	public void after_the_favourites_page() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.refreshfavs();
	}
	
	@When("favoriteUser2 login with credentials")
	public void favorite_user2_login_with_credentials() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.favuser();
	}

	@Then("place1 the order from favourites")
	public void place1_the_order_from_favourites() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.placefromfavs();
	}

	@And("order1 page opened")
	public void order1_page_opened() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.orders();
	}
	
}

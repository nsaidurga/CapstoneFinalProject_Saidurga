package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signin {
	WebDriver d;
	@Given("User is on the Sign In page")
	public void user_is_on_the_sign_in_page() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/signin");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User1 enters username")
	public void user1_enters_username() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.username1();
	}
	
	@And("Enters password1")
	public void enters_password1() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.password();
	}

	@And("Clicks on the Sign In button1")
	public void clicks_on_the_sign_in_button1() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.signinsubmit();
	}

	@Then("User1 should be successfully logged in")
	public void user1_should_be_successfully_logged_in() {
		System.out.println("you are loged in as demouser");
	}

	@And("Homepage1 should be displayed")
	public void homepage1_should_be_displayed() throws InterruptedException {
		System.out.println("Home page is opened");
		Thread.sleep(2000);
	    d.close();
	}
//2
	@When("User2 enters username")
	public void user2_enters_username() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.username2();
	}

	@And("Enters password2")
	public void enters_password2() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.password();
	}

	@And("Clicks on the Sign In button2")
	public void clicks_on_the_sign_in_button2() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.signinsubmit();
	}

	@Then("User2 should be successfully logged in")
	public void user2_should_be_successfully_logged_in() {
		System.out.println("Log in as favuser");
	}

	@And("Homepage2 should be displayed")
	public void homepage2_should_be_displayed() {
		System.out.println("Home page is opened");
	    d.close();
	}
//
	@When("User3 enters username")
	public void user3_enters_username() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.username3();
	}

	@And("Enters password3")
	public void enters_password3() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.password();
	}

	@And("Clicks on the Sign In button3")
	public void clicks_on_the_sign_in_button3() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.signinsubmit();
	}

	@Then("User3 should be successfully logged in")
	public void user3_should_be_successfully_logged_in() {
		System.out.println("Login in successful as image user");
	}

	@And("Homepage3 should be displayed")
	public void homepage3_should_be_displayed() {
		System.out.println("Home page is opened");
	    d.close();
	}
//
	@When("User4 enters username")
	public void user4_enters_username() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.username4();
	}

	@And("Enters password4")
	public void enters_password4() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.password();
	}

	@And("Clicks on the Sign In button4")
	public void clicks_on_the_sign_in_button4() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.signinsubmit();
	}

	@Then("User4 should be successfully logged in")
	public void user4_should_be_successfully_logged_in() {
		System.out.println("Sign in successful as existing user");
	}

	@And("Homepage4 should be displayed")
	public void homepage4_should_be_displayed() {
		System.out.println("Un loaded images of products on Home page");
	    d.close();
	}
//
	@When("User5 enters username")
	public void user5_enters_username() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.username5();
	}

	@And("Enters password5")
	public void enters_password5() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.password();
	}

	@And("Clicks on the Sign In button5")
	public void clicks_on_the_sign_in_button5() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.signinsubmit();
	}

	@Then("User unable to sign in")
	public void user_unable_to_sign_in() {
		System.out.println("Your account has been locked");
	}

	@And("Your account has been locked.")
	public void your_account_has_been_locked() {
		System.out.println("Home page is not open");
	    d.close();
	}

}

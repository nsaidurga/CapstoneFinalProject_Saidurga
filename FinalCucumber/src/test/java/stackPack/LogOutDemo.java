package stackPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutDemo {
	WebDriver d;
	
	@Given("Home1 page visible")
	public void home1_page_visible() {
		d=new ChromeDriver();
		d.get("https://bstackdemo.com/signin");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user can login")
	public void user_can_login() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.userlog();
	}

	@Then("click on the logout button")
	public void click_on_the_logout_button() throws InterruptedException {
		PageClassSDB pc=new PageClassSDB(d);
		pc.firstlogout();
	}

	@And("home page for guest")
	public void home_page_for_guest() throws InterruptedException {
	    System.out.println("Home page is opened for guest");
	    Thread.sleep(1000);
	    d.close();
	}
}

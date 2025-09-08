package stackPack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageClassSDB {
	WebDriver d;
	WebDriverWait wait;

	public PageClassSDB(WebDriver d) {
		this.d = d;
		this.wait = new WebDriverWait(d, Duration.ofSeconds(10));
	}

	// All locators
	By username = By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]");
	By favuser = By.xpath("//div[@id=\"username\"]//div[text()=\"fav_user\"]");
	By imageuser = By.xpath("//div[@id=\"username\"]//div[text()=\"image_not_loading_user\"]");
	By existuser = By.xpath("//div[@id=\"username\"]//div[text()=\"existing_orders_user\"]");
	By lockuser = By.xpath("//div[@id=\"username\"]//div[text()=\"locked_user\"]");
	By demouser = By.xpath("//div[@id=\"username\"]//div[text()=\"demouser\"]");
	By password = By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]");
	By testpass = By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]");
	By signinbuton = By.id("login-btn");
	By searchfield = By.cssSelector("input[placeholder=\"Search\"]");
	By searchbuton = By.cssSelector("button[role=\"button\"]");
	By add3 = By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]");
	By add2 = By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[2]");
	By add1 = By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[1]");
	By add6 = By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[6]");
	By add5 = By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[5]");
	By plus = By.xpath("(//button[@class=\"change-product-button\"])[2]");
	By checkoutbuton = By.className("buy-btn");
	By del1 = By.xpath("(//div[@class=\"shelf-item__del\"])[1]");
	By del2 = By.xpath("(//div[@class=\"shelf-item__del\"])[2]");
	By del3 = By.xpath("(//div[@class=\"shelf-item__del\"])[3]");
	By favdel1 = By.xpath("//div[@id='1']//button[@aria-label='delete']");
	By favdel2 = By.xpath("//div[@id='2']//button[@aria-label='delete']");
	By favdel3 = By.xpath("//div[@id='3']//button[@aria-label='delete']");
	By favdel4 = By.xpath("//div[@id='4']//button[@aria-label='delete']");
	By favo = By.cssSelector("a#favourites[class=\"Navbar_link__3Blki menu-item\"]");
	By homepage = By.className("Navbar_logo__image__3Blki");
	By favbuton = By.id("favourites");
	By ordersbuton = By.id("orders");
	By signout = By.id("signin");
	By firstn = By.id("firstNameInput");
	By lastn = By.id("lastNameInput");
	By addresn = By.id("addressLine1Input");
	By statef = By.id("provinceInput");
	By pin = By.id("postCodeInput");
	By continu = By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]");
	By cat2 = By.xpath("(//span[@class=\"checkmark\"])[2]");
	By cat3 = By.xpath("(//span[@class=\"checkmark\"])[3]");
	By cat4 = By.xpath("(//span[@class=\"checkmark\"])[4]");
	By cat1 = By.xpath("(//span[@class=\"checkmark\"])[1]");

//addtocart
	public void searchprod(String proname) {
		WebElement inp = d.findElement(searchfield);
		inp.click();
		inp.clear();
		inp.sendKeys(proname);
		d.findElement(searchbuton).click();
	}

	public void addtocartbuton() {
		((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		d.findElement(add3).click();
		d.findElement(add1).click();
		d.findElement(add2).click();
		d.findElement(add6).click();
		d.findElement(add5).click();
	}

	public void counter() {
		System.out.println("Add to cart frame is automatically open");
		for (int i = 1; i < 4; i++) {
			d.findElement(plus).click();
		}
	}

	public void detailsofprod() {
		System.out.println("Check the selected product details");
		d.close();
	}

//checkout
	public void login() {
		d.findElement(username).click();
		d.findElement(demouser).click();

		d.findElement(password).click();
		d.findElement(testpass).click();

		d.findElement(signinbuton).click();

	}

	public void afteradd() {
		((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		d.findElement(add1).click();
	}

	public void checkbuton() {
		d.findElement(checkoutbuton).click();
	}

	public void allfields(String firstname, String lastname, String address, String state, String pincode) {
		d.findElement(firstn).sendKeys(firstname);

		d.findElement(lastn).sendKeys(lastname);
		d.findElement(addresn).sendKeys(address);

		d.findElement(statef).sendKeys(state);
		d.findElement(pin).sendKeys(pincode);
		d.findElement(pin).sendKeys(Keys.ENTER);
		d.close();
	}

//deletcart

	public void prodsearch(String proname) {
		WebElement inp = d.findElement(searchfield);
		inp.sendKeys(proname);
		d.findElement(searchbuton).click();
	}

	public void multipleadd() {
		((JavascriptExecutor) d).executeScript("window.scrollBy(0, 500);");
		d.findElement(add1).click();
		d.findElement(add2).click();
		d.findElement(add3).click();
	}

	public void removecart() throws InterruptedException {
		WebElement u = d.findElement(del3);
		u.click();
		d.findElement(del2).click();
		Thread.sleep(1500);
		d.findElement(del1).click();
	}

	public void emptycart() {
		WebElement checkout = d.findElement(checkoutbuton);
		boolean see = checkout.isDisplayed();
		if (see) {
			System.out.println("no available products");
		}
		d.close();
	}

//favourites

	public void favouritestabclick1() {
		d.findElement(By.id("favourites")).click();
	}

	public void demouserlogin() {
		d.findElement(username).click();
		d.findElement(demouser).click();
		d.findElement(password).click();
		d.findElement(testpass).click();
		d.findElement(signinbuton).click();
	}

	public void nofavourites() {
		System.out.println("No favourites found, add your favourites");
		d.findElement(By.className("Navbar_logo__image__3Blki")).click();
	}

	public void addfavourites() {
		d.navigate().refresh();
		((JavascriptExecutor) d).executeScript("window.scrollBy(0,300);");
		d.findElement(favdel1).click();
		d.findElement(favdel2).click();
		d.findElement(favdel3).click();
		d.findElement(favdel4).click();
	}

	public void clickonfavourites2() {
		d.findElement(favo).click();
	}

	public void allfavourites() {
		System.out.println("all favourites");
		((JavascriptExecutor) d).executeScript("window.scrollBy(0,600);");
		d.close();
	}

//
	public void favoriteuserlogin() {
		d.findElement(username).click();
		d.findElement(favuser).click();
		d.findElement(password).click();
		d.findElement(testpass).click();
		d.findElement(signinbuton).click();
		System.out.println("remove favourites");
	}

	public void removefavourites() throws InterruptedException {
		Thread.sleep(1000);
		d.navigate().refresh();
		d.findElement(favdel1).click();
		d.findElement(favdel2).click();
		d.findElement(favdel3).click();
		d.findElement(favdel4).click();
	}

	public void returnhomepage() {
		d.findElement(homepage).click();
	}

	public void clickfavourites3() {
		d.findElement(favbuton).click();
	}

	public void refreshfavs() {
		d.navigate().refresh();
		d.close();
	}

	//
	public void favuser() {
		d.findElement(username).click();
		d.findElement(favuser).click();
		d.findElement(password).click();
		d.findElement(testpass).click();
		d.findElement(signinbuton).click();
	}

	public void orders() {
		d.findElement(ordersbuton).click();
		d.close();
	}

//filter

	public void serchbut() {
		d.findElement(searchbuton).click();
	}

	By tag = By.tagName("select");

	public void clickorderby() {
		WebElement drop = d.findElement(tag);
		Select sel = new Select(drop);
		sel.selectByVisibleText("Select");
	}

	public void typefilter() {
		WebElement drop = d.findElement(tag);
		Select sel = new Select(drop);
		sel.selectByValue("highestprice");
	}

	public void scroll() {
		for (int i = 0; i < 7; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0,300);");
		}
		for (int i = 0; i < 7; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0,-300);");
		}
		d.close();
	}
//logout

	public void userlog() {
		d.findElement(username).click();
		d.findElement(demouser).click();
		d.findElement(password).click();
		d.findElement(testpass).click();
		d.findElement(signinbuton).click();
	}

	public void firstlogout() {
		// Thread.sleep(2000);
		d.findElement(signout).click();
	}
//orders

	public void clickonorders() {
		d.findElement(By.id("orders")).click();
	}

	public void existingsuser() {
		d.findElement(username).click();
		d.findElement(existuser).click();
		d.findElement(password).click();
		d.findElement(testpass).click();
		d.findElement(signinbuton).click();
	}

	public void clickorders1() {
		d.findElement(ordersbuton).click();
	}

	public void scrollorders() {
		for (int i = 0; i < 5; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0,200);");
		}
	}

	//
	public void demouser1() {
		d.findElement(username).click();
		d.findElement(demouser).click();
		d.findElement(password).click();
		d.findElement(testpass).click();
		d.findElement(signinbuton).click();
	}

	public void clickorders2() {
		d.findElement(ordersbuton).click();
		d.findElement(homepage).click();
	}

	public void newaddprod(String firstname, String lastname, String address, String state, String pincode) {
		((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		d.findElement(add3).click();
		d.findElement(add1).click();
		d.findElement(add2).click();
		d.findElement(checkoutbuton).click();
		d.findElement(firstn).sendKeys(firstname);

		d.findElement(lastn).sendKeys(lastname);
		d.findElement(addresn).sendKeys(address);

		d.findElement(statef).sendKeys(state);
		d.findElement(pin).sendKeys(pincode);
		d.findElement(pin).sendKeys(Keys.ENTER);
		d.findElement(continu).click();
	}

	public void placedorders() {
		d.findElement(ordersbuton).click();
	}

//
	public void favouriteuser1() {
		d.findElement(username).click();
		d.findElement(favuser).click();
		d.findElement(password).click();
		d.findElement(testpass).click();
		d.findElement(signinbuton).click();
	}

	public void clickorders3() {
		d.findElement(ordersbuton).click();
	}

	public void placeorderfromfavs(String firstname, String lastname, String address, String state, String pincode) {
		d.findElement(By.id("favourites")).click();

		d.navigate().refresh();
		((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		d.findElement(add3).click();
		d.findElement(add1).click();
		d.findElement(add2).click();
		d.findElement(checkoutbuton).click();

		d.findElement(firstn).sendKeys(firstname);
		d.findElement(lastn).sendKeys(lastname);
		d.findElement(addresn).sendKeys(address);
		d.findElement(statef).sendKeys(state);
		d.findElement(pin).sendKeys(pincode);
		d.findElement(pin).sendKeys(Keys.ENTER);
		d.findElement(continu).click();
	}

	public void orderpageopen() {
		d.findElement(ordersbuton).click();
	}
//search module

	public void clicksearchfiled() {
		System.out.println("All the clicks on next method");
	}

	public void searchwords(String name) {
		List<String> l = new ArrayList<>();
		l.add(name);
		l.add(name);
		l.add(name);
		l.add(name);
		for (String s : l) {
			WebElement search = d.findElement(searchfield);
			search.click();
			search.clear();
			search.sendKeys(s);
			d.findElement(searchbuton).click();
		}
		d.close();
	}

	public void partialname(String partial) {
		WebElement search = d.findElement(searchfield);
		search.click();
		search.sendKeys(partial);
		d.findElement(searchbuton).click();
		d.close();
	}

	public void invalidname(String invalid) {
		WebElement search = d.findElement(searchfield);
		search.click();
		search.sendKeys(invalid);
		d.findElement(searchbuton).click();
		d.close();
	}

	public void specialsearch(String special) {
		WebElement search = d.findElement(searchfield);
		search.click();
		search.sendKeys(special);
		d.findElement(searchbuton).click();
		d.close();
	}

	public void blanksearch(String blank) {
		WebElement search = d.findElement(searchfield);
		search.click();
		search.sendKeys(blank);
		d.findElement(searchbuton).click();
		d.close();
	}

	public void spacessearch(String space) {
		WebElement search = d.findElement(searchfield);
		search.click();
		search.sendKeys(space);
		d.findElement(searchbuton).click();
		d.close();
	}

	public void casesensitive(String case1) {
		WebElement search = d.findElement(searchfield);
		search.click();
		search.sendKeys(case1);
		d.findElement(searchbuton).click();
		d.close();
	}
//selectcategory

	public void singlecatclick() {
		d.findElement(cat2).click();
	}

	public void singcatprods() {
		for (int i = 0; i < 3; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0,300);");
		}
		d.close();
	}

//
	public void twocatclick() {
		d.findElement(cat3).click();
		d.findElement(cat4).click();
	}

	public void doblecatprods() {
		for (int i = 0; i < 3; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0,300);");
		}
		d.close();
	}

//
	public void threecatclick() {
		d.findElement(cat4).click();
		d.findElement(cat2).click();
		d.findElement(cat3).click();
	}

	public void threecatprods() {
		for (int i = 0; i < 3; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0,300);");
		}
		d.close();
	}

//
	public void fourcatclick() {
		d.findElement(cat4).click();
		d.findElement(cat2).click();
		d.findElement(cat3).click();
		d.findElement(cat1).click();
	}

	public void fourcatprods() {
		for (int i = 0; i < 3; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0,300);");
		}
		d.close();
	}
//signin

	public void username1() {
		d.findElement(username).click();
		d.findElement(demouser).click();
	}

	public void password() {
		d.findElement(password).click();
		d.findElement(testpass).click();
	}

	public void signinsubmit() {
		d.findElement(signinbuton).click();
	}

	public void username2() {
		d.findElement(username).click();
		d.findElement(favuser).click();
	}

	public void username3() {
		d.findElement(username).click();
		d.findElement(imageuser).click();
	}

	public void username4() {
		d.findElement(username).click();
		d.findElement(existuser).click();
	}

	public void username5() {
		d.findElement(username).click();
		d.findElement(lockuser).click();
	}

}

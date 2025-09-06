package stackPack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;


public class PageClassSDB {
	WebDriver d;
	WebDriverWait wait;

	public PageClassSDB(WebDriver d) {
		this.d = d;
		this.wait = new WebDriverWait(d, Duration.ofSeconds(10));
	}
//addtocart
	public void searchprod() throws InterruptedException {
		WebElement inp = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		inp.click();
		inp.clear();
		inp.sendKeys("iPhone");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
	}

	public void addtocartbuton() throws InterruptedException {
		for (int i = 0; i < 2; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		    Thread.sleep(1000);
		}
		//d.findElement(By.xpath("(//div[text()=\"Add to cart\"])[1]")).click();
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[2]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[6]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[5]")).click();
		Thread.sleep(2000);
	}
	
	public void counter() throws InterruptedException {
	    System.out.println("Add to cart frame is automatically open");
	    for(int i=1;i<4;i++) {
	    d.findElement(By.xpath("(//button[@class=\"change-product-button\"])[2]")).click();
	    Thread.sleep(1000);
	    }
	}

	public void detailsofprod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Check the selected product details");
	    d.close();
	}
	
//checkout
	public void login() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"demouser\"]")).click();
		
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		
		d.findElement(By.id("login-btn")).click();
		
	}

	public void afteradd() throws InterruptedException {
		for (int i = 0; i < 1; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("(//div[text()=\"Add to cart\"])[1]")).click();
		Thread.sleep(2000);
	}

	public void checkbuton() throws InterruptedException {
	    d.findElement(By.className("buy-btn")).click();
	    Thread.sleep(2000);
	}

	public void allfields() throws InterruptedException {
	    WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    firstname.sendKeys("Akhil");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    lastname.sendKeys("Kumar");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    adress.sendKeys("ABC colony,KPHB,Hyderabad");
	    
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    state.sendKeys("Telangana");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    pincode.sendKeys("123456");
	    click_on_submit();
	    Thread.sleep(3000);
	    //d.findElement(By.className("button button--tertiary optimizedCheckout-buttonSecondary")).click();
	    d.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	    Thread.sleep(3000);
	}
	
	public void emptyfields() throws InterruptedException {
		afteradd();
		checkbuton();
		WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    click_on_submit();
	    Thread.sleep(2000);
	    firstname.sendKeys("Nikhil");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    click_on_submit();
	    Thread.sleep(2000);
	    lastname.sendKeys("Varma");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    click_on_submit();
	    Thread.sleep(2000);
	    adress.sendKeys("ABC colony,Abf street,Banglore city");
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    click_on_submit();
	    Thread.sleep(2000);
	    state.sendKeys("Karnataka");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    click_on_submit();
	    Thread.sleep(2000);
	    pincode.sendKeys("354435");
	    click_on_submit();
	    Thread.sleep(3000);
	    //d.findElement(By.className("button button--tertiary optimizedCheckout-buttonSecondary")).click();
	    d.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	    Thread.sleep(3000);
	}

	public void specialchars() throws InterruptedException {
		afteradd();
		checkbuton();
		WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    firstname.sendKeys("@$#%@fddaret");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    lastname.sendKeys("@@@##cvxdgst");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    adress.sendKeys("&*#$!^%@*#&$@^*&#*((,ahdfwubfhnjeg,*%^(^*@#t4grbwfb,sdjfg467%&$#%^@*&,&($*^!@&");
	    
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    state.sendKeys("%#$*&@^*#&^@&(*@");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    pincode.sendKeys("43524@#$");
	    click_on_submit();
	    Thread.sleep(3000);
	    //d.findElement(By.className("button button--tertiary optimizedCheckout-buttonSecondary")).click();
	    d.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	    Thread.sleep(3000);
	}

	public void nullvalues() throws InterruptedException {
		afteradd();
		checkbuton();
		WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    firstname.sendKeys("null");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    lastname.sendKeys("null");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    adress.sendKeys("null");
	    
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    state.sendKeys("null");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    pincode.sendKeys("null");
	    click_on_submit();
	    Thread.sleep(3000);
	    //d.findElement(By.className("button button--tertiary optimizedCheckout-buttonSecondary")).click();
	    d.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	    Thread.sleep(3000);
	}

	public void postcode() throws InterruptedException {
		afteradd();
		checkbuton();
		WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    firstname.sendKeys("Sai");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    lastname.sendKeys("NSD");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    adress.sendKeys("ABC colony,SDF city,Chennai");
	    
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    state.sendKeys("Tamilnadu");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    pincode.sendKeys("GFSDFAGGsvsfa");
	    Thread.sleep(2000);
	    click_on_submit();
	}

	public void closepage() throws InterruptedException {
		Thread.sleep(3000);
	    d.close();
	}

	public void click_on_submit() throws InterruptedException {
		Thread.sleep(2000);
	    d.findElement(By.id("checkout-shipping-continue")).click(); 
	}
//deletcart
	
	public void prodsearch() throws InterruptedException {
		WebElement inp = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		inp.click();
		// inp.clear();
		inp.sendKeys("iPhone");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
	}

	public void multipleadd() throws InterruptedException {
		for (int i = 0; i < 1; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
			Thread.sleep(1000);
		}
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[2]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]")).click();
		Thread.sleep(2000);
	}

	public void removecart() throws InterruptedException {
		
		d.findElement(By.xpath("(//div[@class=\"shelf-item__del\"])[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__del\"])[2]")).click();
		Thread.sleep(1500);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__del\"])[1]")).click();
		Thread.sleep(2000);
	}

	public void emptycart() throws InterruptedException {
		WebElement checkout = d.findElement(By.className("buy-btn"));
		//Assert.assertTrue(checkout.isDisplayed(), "Checkout button is not displayed!");
		boolean see=checkout.isDisplayed();
		if(see) {
			System.out.println("no available products");
		}
		Thread.sleep(2000);
		d.close();
	}
//favourites
	
	public void favouritestabclick1() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.id("favourites")).click();
		d.navigate().refresh();
	    Thread.sleep(1000);
	}
	
	public void demouserlogin() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"demouser\"]")).click();
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		d.findElement(By.id("login-btn")).click();
	}

	public void nofavourites() throws InterruptedException {
	    System.out.println("No favourites found, add your favourites");
	    Thread.sleep(1000);
	    d.findElement(By.className("Navbar_logo__image__3Blki")).click();
	}

	public void addfavourites() throws InterruptedException {
		for(int i=0;i<1;i++) {
			((JavascriptExecutor)d).executeScript("window.scrollBy(0,300);");
		}
		Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='1']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='2']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='3']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='4']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	}

	public void clickonfavourites2() throws InterruptedException {
		Thread.sleep(1000);
		//d.findElement(By.id("favourites")).click();
		d.findElement(By.cssSelector("a#favourites[class=\"Navbar_link__3Blki menu-item\"]")).click();
		//d.navigate().refresh();
	}

	public void allfavourites() throws InterruptedException {
	    System.out.println("all favourites");
	    for(int i=0;i<1;i++) {
			((JavascriptExecutor)d).executeScript("window.scrollBy(0,300);");
			Thread.sleep(2000);
		}
	    d.close();
	}
//

	public void favoriteuserlogin() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"fav_user\"]")).click();
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		d.findElement(By.id("login-btn")).click();
	}

	public void removefavourites() throws InterruptedException {
		Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='1']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='2']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='3']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[@id='4']//button[@aria-label='delete']")).click();
	    Thread.sleep(2000);
	}

	public void returnhomepage() {
	    d.findElement(By.className("Navbar_logo__image__3Blki")).click();
	}

	public void clickfavourites3() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.id("favourites")).click();
		Thread.sleep(2000);
	}

	public void refreshfavs() throws InterruptedException {
		d.navigate().refresh();
		Thread.sleep(2000);
		d.close();
	}
	
	//
	public void favuser() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"fav_user\"]")).click();
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		d.findElement(By.id("login-btn")).click();
	}

	public void placefromfavs() throws InterruptedException {
		//d.findElement(By.id("favourites")).click();
	    Thread.sleep(1000);
	    d.navigate().refresh();
	    Thread.sleep(1000);
	    for (int i = 0; i < 1; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		    Thread.sleep(1000);
		}
	    Thread.sleep(2000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[2]")).click();
		Thread.sleep(2000);
	    d.findElement(By.className("buy-btn")).click();
	    Thread.sleep(2000);
	    WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    firstname.sendKeys("ABC");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    lastname.sendKeys("DEF");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    adress.sendKeys("ABC colony,GAFD city,Hyderabad");
	    
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    state.sendKeys("Telangana");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    pincode.sendKeys("520092");
	    Thread.sleep(2000);
	    d.findElement(By.id("checkout-shipping-continue")).click();
	    Thread.sleep(3000);
	    d.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	    Thread.sleep(1000);
	}

	public void orders() throws InterruptedException {
		d.findElement(By.id("orders")).click();
		Thread.sleep(2000);
	    d.close();
	}
//filter
	
	public void serchbut() throws InterruptedException {
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
	}

	public void clickorderby() throws InterruptedException {
		WebElement drop=d.findElement(By.tagName("select"));
		//drop.click();
		Select sel=new Select(drop);
		Thread.sleep(2000);
		sel.selectByVisibleText("Select");
	}

	public void typefilter() {
		WebElement drop=d.findElement(By.tagName("select"));
		Select sel=new Select(drop);
		sel.selectByValue("highestprice");
	}

	public void scroll() throws InterruptedException {
		Thread.sleep(2000);
	    for(int i=0;i<7;i++) {
	    	((JavascriptExecutor)d).executeScript("window.scrollBy(0,300);");
	    	Thread.sleep(500);
	    }
	    for(int i=0;i<7;i++) {
	    	((JavascriptExecutor)d).executeScript("window.scrollBy(0,-300);");
	    	Thread.sleep(500);
	    }
	    d.close();
	}
//logout
	
	public void userlog() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"demouser\"]")).click();
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.id("login-btn")).click();
	}

	public void firstlogout() throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.id("signin")).click();
		Thread.sleep(3000);
	}
//orders
	
	public void clickonorders() throws InterruptedException {
		Thread.sleep(1000);
	    d.findElement(By.id("orders")).click();
	}

	public void existingsuser() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"existing_orders_user\"]")).click();
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		d.findElement(By.id("login-btn")).click();
	}

	public void clickorders1() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.id("orders")).click();
		Thread.sleep(1000);
	}

	public void scrollorders() throws InterruptedException {
	    for(int i=0;i<5;i++) {
	    	((JavascriptExecutor)d).executeScript("window.scrollBy(0,200);");
	    	Thread.sleep(1000);
	    }
	    Thread.sleep(1000);
	    d.close();
	}
	//
	public void demouser1() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"demouser\"]")).click();
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		d.findElement(By.id("login-btn")).click();
	}

	public void clickorders2() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.id("orders")).click();
		Thread.sleep(2000);
		d.findElement(By.className("Navbar_logo__image__3Blki")).click();
	}

	public void newaddprod() throws InterruptedException {
		for (int i = 0; i < 1; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		    Thread.sleep(1000);
		}
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[2]")).click();
		Thread.sleep(2000);
	    d.findElement(By.className("buy-btn")).click();
	    Thread.sleep(2000);
	    WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    firstname.sendKeys("Akhil");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    lastname.sendKeys("Kumar");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    adress.sendKeys("ABC colony,KPHB,Hyderabad");
	    
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    state.sendKeys("Telangana");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    pincode.sendKeys("123456");
	    Thread.sleep(2000);
	    d.findElement(By.id("checkout-shipping-continue")).click(); 
	    Thread.sleep(3000);
	    d.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	    Thread.sleep(1000);
	}

	public void placedorders() throws InterruptedException {
		d.findElement(By.id("orders")).click();
		Thread.sleep(2000);
		d.close();
	}
	//
	public void favouriteuser1() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"fav_user\"]")).click();
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		d.findElement(By.id("login-btn")).click();
	}

	public void clickorders3() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.id("orders")).click();
		Thread.sleep(1000);
	}

	public void placeorderfromfavs() throws InterruptedException {
	    d.findElement(By.id("favourites")).click();
	    Thread.sleep(1000);
	    d.navigate().refresh();
	    Thread.sleep(1000);
	    for (int i = 0; i < 1; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		    Thread.sleep(1000);
		}
	    Thread.sleep(2000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[2]")).click();
		Thread.sleep(2000);
	    d.findElement(By.className("buy-btn")).click();
	    Thread.sleep(2000);
	    WebElement firstname=d.findElement(By.id("firstNameInput"));
	    firstname.click();
	    firstname.sendKeys("ABC");
	    WebElement lastname=d.findElement(By.id("lastNameInput"));
	    lastname.click();
	    lastname.sendKeys("DEF");
	    WebElement adress=d.findElement(By.id("addressLine1Input"));
	    adress.click();
	    adress.sendKeys("ABC colony,GAFD city,Hyderabad");
	    
	    WebElement state=d.findElement(By.id("provinceInput"));
	    state.click();
	    state.sendKeys("Telangana");
	    WebElement pincode=d.findElement(By.id("postCodeInput"));
	    pincode.click();
	    pincode.sendKeys("520092");
	    Thread.sleep(2000);
	    d.findElement(By.id("checkout-shipping-continue")).click();
	    Thread.sleep(3000);
	    d.findElement(By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]")).click();
	    Thread.sleep(1000);
	}

	public void orderpageopen() throws InterruptedException {
		d.findElement(By.id("orders")).click();
		Thread.sleep(2000);
	    d.close();
	}
//search module
	
	public void clicksearchfiled() {
	    //d.findElement(By.cssSelector("input[placeholder=\"Search\"]")).click();
		System.out.println("All the clicks on next method");
	}

	public void searchwords() throws InterruptedException {
		Thread.sleep(2000);
		List<String> l = new ArrayList<>();
		l.add("iPhone");
		l.add("Galaxy");
		l.add("One Plus");
		l.add("Google Pixel");
		for (String s : l) {
			WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
			search.click();
			search.clear();
			search.sendKeys(s);
			d.findElement(By.cssSelector("button[role=\"button\"]")).click();
			Thread.sleep(2000);
		}
		d.close();
	}
	
	public void partialname() throws InterruptedException {
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.click();
		search.sendKeys("sams");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
		d.close();
	}

	public void invalidname() throws InterruptedException {
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.click();
		search.sendKeys("634523trweTYFSdqwe");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
		d.close();
	}

	public void specialsearch() throws InterruptedException {
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.click();
		search.sendKeys("$##@%@^&");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
		d.close();
	}

	public void blanksearch() throws InterruptedException {
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.click();
		search.sendKeys("");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
		d.close();
	}

	public void spacessearch() throws InterruptedException {
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.click();
		search.sendKeys("         ");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
		d.close();
	}

	public void casesensitive() throws InterruptedException {
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
		search.click();
		search.sendKeys("sAmSUnG");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("button[role=\"button\"]")).click();
		Thread.sleep(2000);
		d.close();
	}
//selectcategory
	
	public void singlecatclick() throws InterruptedException {
		Thread.sleep(3000);
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
	    Thread.sleep(3000);
	}

	public void singcatprods() throws InterruptedException {
		Thread.sleep(2000);
		for(int i=0;i<2;i++) {
			((JavascriptExecutor)d).executeScript("window.scrollBy(0,300);");
			Thread.sleep(1000);
		}
	    d.close();
	}

//
	public void twocatclick() throws InterruptedException {
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[3]")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[4]")).click();
	    Thread.sleep(2000);
	}

	public void doblecatprods() throws InterruptedException {
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
			((JavascriptExecutor)d).executeScript("window.scrollBy(0,300);");
			Thread.sleep(1000);
		}
	    d.close();
	}

//
	public void threecatclick() throws InterruptedException {
		d.findElement(By.xpath("(//span[@class=\"checkmark\"])[4]")).click();
		Thread.sleep(2000);
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[3]")).click();
	    Thread.sleep(2000);
	}

	public void threecatprods() throws InterruptedException {
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
			((JavascriptExecutor)d).executeScript("window.scrollBy(0,300);");
			Thread.sleep(1000);
		}
	    d.close();
	}
//
	public void fourcatclick() throws InterruptedException {
		d.findElement(By.xpath("(//span[@class=\"checkmark\"])[4]")).click();
		Thread.sleep(2000);
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[3]")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("(//span[@class=\"checkmark\"])[1]")).click();
	    Thread.sleep(2000);
	}

	public void fourcatprods() throws InterruptedException {
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
			((JavascriptExecutor)d).executeScript("window.scrollBy(0,300);");
			Thread.sleep(1000);
		}
	    d.close();
	}
//signin
	
	public void username1() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"demouser\"]")).click();
	}
	
	public void password() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
	}

	public void signinsubmit() throws InterruptedException {
		Thread.sleep(1000);
		d.findElement(By.id("login-btn")).click();
	}

//2
	public void username2() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"fav_user\"]")).click();
	}

//
	public void username3() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"image_not_loading_user\"]")).click();
	}

//
	public void username4() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"existing_orders_user\"]")).click();
	}

//
	public void username5() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"locked_user\"]")).click();
	}

}

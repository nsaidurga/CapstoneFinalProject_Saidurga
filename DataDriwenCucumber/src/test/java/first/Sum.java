package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sum {
	WebDriver d;
	WebDriverWait wait;

	public Sum(WebDriver d) {
		this.d = d;
		this.wait = new WebDriverWait(d, Duration.ofSeconds(10));
	}
	
	public void all() throws InterruptedException {
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"Select Username\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"username\"]//div[text()=\"demouser\"]")).click();
		
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"Select Password\"]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//div[@id=\"password\"]//div[text()=\"testingisfun99\"]")).click();
		
		d.findElement(By.id("login-btn")).click();
		Thread.sleep(4000);
		for (int i = 0; i < 1; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
		    Thread.sleep(1000);
		}
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(20));

		// Wait until checkout form is visible
		WebElement firstName = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]"))
		);
		firstName.click();
		//d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[3]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//div[@class=\"shelf-item__buy-btn\"])[1]")).click();
		Thread.sleep(2000);
	    d.findElement(By.className("buy-btn")).click();
	    Thread.sleep(1000);
	}
}

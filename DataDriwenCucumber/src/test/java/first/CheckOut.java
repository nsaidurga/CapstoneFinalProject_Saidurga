package first;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class CheckOut {
	WebDriver d;

	public static List<List<String>> getSheetData(String filePath, String sheetName) {
		List<List<String>> sheetData = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = WorkbookFactory.create(fis)) {
			Sheet sheet = workbook.getSheet(sheetName);

			for (Row row : sheet) {
				List<String> rowData = new ArrayList<>();
				for (Cell cell : row) {
					rowData.add(cell.toString());
				}
				sheetData.add(rowData);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return sheetData;
	}

	@Given("checkout for product order using excel")
	public void checkout_for_product_order_using_excel() throws InterruptedException {
		String excelPath = "C:\\Users\\sai durga\\OneDrive\\Desktop\\googleSheets\\checkoutExcel.xlsx";
		List<List<String>> sheetData = getSheetData(excelPath, "Sheet1");

		for (int i = 1; i < sheetData.size(); i++) {
			String firstname = sheetData.get(i).get(0);
			String lastname = sheetData.get(i).get(1);
			String address = sheetData.get(i).get(2);
			String state = sheetData.get(i).get(3);
			String postcode = sheetData.get(i).get(4);

			System.out.println("Check out " + i);

			d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://bstackdemo.com/signin");
			Sum s=new Sum(d);
			s.all();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(20));

			// Wait until checkout form is visible
			WebElement firstName = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.id("firstNameInput"))
			);
			firstName.sendKeys(firstname);

			Thread.sleep(2000);
			d.findElement(By.id("lastNameInput")).sendKeys(lastname);
			
			Thread.sleep(2000);
			d.findElement(By.id("addressLine1Input")).sendKeys(address);

			Thread.sleep(2000);
			d.findElement(By.id("provinceInput")).sendKeys(state);
			
			Thread.sleep(2000);
			d.findElement(By.id("postCodeInput")).sendKeys(postcode);
			Thread.sleep(1000);
			d.findElement(By.id("postCodeInput")).sendKeys(Keys.ENTER);

		    //d.findElement(By.id("checkout-shipping-continue")).click();
		    Thread.sleep(2000);
			d.close();
		}
	}
}

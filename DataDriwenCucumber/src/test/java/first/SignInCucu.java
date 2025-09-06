package first;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class SignInCucu {
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

	@Given("user signedin using excel")
	public void user_signedin_using_excel() throws InterruptedException {
		String excelPath = "C:\\Users\\sai durga\\OneDrive\\Desktop\\googleSheets\\loginDemoStack.xlsx";
		List<List<String>> sheetData = getSheetData(excelPath, "Sheet1");

		for (int i = 1; i < sheetData.size(); i++) {
			String username = sheetData.get(i).get(0);
			String password = sheetData.get(i).get(1);

			System.out.println("Login attempt " + i + ": " + username + " / " + password);

			d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://bstackdemo.com/signin");

			Thread.sleep(2000);
			d.findElement(By.xpath("//div[@id='username']//input")).sendKeys(username);
			Thread.sleep(1000);
			d.findElement(By.xpath("//div[@id='username']//input")).sendKeys(Keys.ENTER);

			Thread.sleep(2000);
			d.findElement(By.xpath("//div[@id='password']//input")).sendKeys(password);
			Thread.sleep(1000);
			d.findElement(By.xpath("//div[@id='password']//input")).sendKeys(Keys.ENTER);

			d.findElement(By.id("login-btn")).click();
			d.close();
		}
	}
}

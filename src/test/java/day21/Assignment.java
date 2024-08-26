package day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();

//		excel
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\caldata.xlsx");

//		calculator
		WebElement initialDeposit = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		WebElement leangthOfCD = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		WebElement interestRate = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		WebElement calculatebtn = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));

		String path = "D:\\Java\\seleniumwebdriver\\TestData\\caldata2.xlsx";
		int rows = ExcelUtils.getRowCount(path, "Sheet1"); // get a row count from the sheet
		System.out.println("row count is : " + rows);

//		for(int i =0; i>)
	}

}

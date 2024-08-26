package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		
//		select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
//		count all checkbox
		List<WebElement> leangthchk = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Checkbox leangth is: "+leangthchk.size());
		
//		printing options from dropdown
//		for(int i=0;i<leangthchk.size();i++) {
//			System.out.println(leangthchk.get(i).getText());
//		}
//		for(WebElement op:leangthchk) {
//			System.out.println(op.getText());
//		}
//		select multiple optionns
		for(WebElement op:leangthchk) {
			String options = op.getText();
			if(options.equals("HTML") || options.equals("CSS") || options.equals("MS SQL Server")) {
				op.click();
			}
		}
		
		
//		driver.close();
	}

}

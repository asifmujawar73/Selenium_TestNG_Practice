package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		2) Hidden dropdown
//		Login to OrangeHRM--> pim--> employee status
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		
//		Login URL
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		Pim
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
//		clicking on Employee Status drop down
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		Thread.sleep(5000);
//		select single option
		//div[@role='listbox']//span[text()='Full-Time Permanent']
		
//		for(WebElement option : options) {
//			if(option.getText().contains("Full-Time Permanant")) {
//				option.click();
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//div[contains(text(),'Freelance')]")).click();
//		count number of options
//		driver.findElement(By.xpath(""))
		
//		COUNT NUMNER OF EMPLOYEES 
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(options.size());
		
//		print all the options
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
	}
	

}

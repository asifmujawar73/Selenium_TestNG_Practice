package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
				
//		Login URL
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		clicking on PIM
		driver.findElement(By.xpath("//span[text()='PIM']")).click();

//		Clicked on DropDown
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		Thread.sleep(5000);
//		single select options
//		driver.findElement(By.xpath("//div[@role='listbox']//div[2]")).click();
		
//		count total number of options
		List<WebElement> HiddenDrpDn = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("No. of options available are: "+ HiddenDrpDn.size());
		
//		print all the drop downs using Enhanced For loop
		for(WebElement options:HiddenDrpDn) {
			System.out.println("Droup Downs are: ");
			System.out.println(options.getText());
		}
	}

}

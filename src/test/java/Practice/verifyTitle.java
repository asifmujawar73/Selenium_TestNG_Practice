package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifyTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://boss.blackbuck.com/dashboard/services/fastag/confirmation-pending-orders");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//img[@class='headerlogo']"));

		String title = driver.getTitle();

		if (title.equals("BLACKBUCK")) {
			System.out.println("title is correct!");
		} else {
			System.out.println("title is wrong!");
		}
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='w-100 login-select-option']")));
		dropdown.selectByVisibleText("Employee Login");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}

package Practice;

//Q4.Write a Selenium WebDriver script in Java to open a website and print the page title.

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://boss.blackbuck.com/dashboard/services/fastag/confirmation-pending-orders");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("BlackBuck")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("No your Title is not matching!");
		}
		driver.quit();
	}

}

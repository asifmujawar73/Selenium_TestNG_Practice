package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().to("https://www.linkedin.com/in/asif-mujawar/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Washing machines']")).click();
//		refresh command
		driver.navigate().refresh();
		
//		forward
//		driver.navigate().forward();
		
//		backward
		driver.navigate().back();
		
		
	}

}

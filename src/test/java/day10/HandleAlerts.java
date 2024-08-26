package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//		normal alert with ok button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		driver.switchTo().alert().accept();
		
//		confirmation alert button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}

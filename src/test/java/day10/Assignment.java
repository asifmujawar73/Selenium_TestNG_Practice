package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		driver.get("https://mypage.rediff.com/login/dologin");
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
//		1) click on login then handle alert 
//		driver.findElement(By.xpath("//input[@id='txtlogin']")).sendKeys("asifmujawar0073@gmail.com");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
//		2) https://ui.vision/demo/webtest/frames/
//		1) switch to  5th frame
		
		WebElement frame5=mywait.until(d ->d.findElement(By.xpath("//frame[@src='frame_5.html']")));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Automation");
		
//		2) click on link  - opens new iframe
//		3) switch to inner frame 
		driver.switchTo().frame(0); 
		
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();	
	
//		4)  check logo presence in the inner frame.
		boolean logoDisplay = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();

		System.out.println(logoDisplay);


	}

}

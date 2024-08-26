package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
//		tag id
//		driver.findElement(By.cssSelector(".form-control")).sendKeys("Iphone");

//		tag attribute
//		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Iphone");
		
//		tag class attribute
		driver.findElement(By.cssSelector(".form-control['1']")).sendKeys("iphone");
		
		
	}

}

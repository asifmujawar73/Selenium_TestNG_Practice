package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		
//		tag id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
//		sendKeys.submite();
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphone");
		
		
//		tag class
//		driver.findElement(By.cssSelector("input.small-searchterms")).sendKeys("iphone 15 pro max");
//		driver.findElement(By.cssSelector(".small-searchterms")).sendKeys("iphone 15 pro max");
	
//		tag attribute
		
//		driver.findElement(By.cssSelector("input[placeholder='search-store']")).sendKeys("iphone");
//		driver.findElement(By.cssSelector("[placeholder='search-store']")).sendKeys("iphone");
		
//		tag class attribute
		
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("iphone");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("iphone");

	}

}

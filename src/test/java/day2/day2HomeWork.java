package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number Of Links: " + links.size());
		
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		System.out.println("Number Of Images: " + Images.size());
		
		driver.findElement(By.linkText("Sign up")).click();
		
//		driver.close();
	}

}

package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
//		WebElement searchBox = driver.findElement(By.name("field-keywords"));
//		searchBox.sendKeys("MacBook");
		
//		driver.findElement(By.name("field-keywords")).sendKeys("MacBook refurnished");
//		searchBox.submit();
		
//		check logo display or not using ID attribute
		WebElement logo =  driver.findElement(By.id("nav-logo"));
		boolean status = logo.isDisplayed();
		System.out.println(logo);
		
		 // Print the logo display status
        if (status) {
            System.out.println("Logo is displayed.");
        } else {
            System.out.println("Logo is not displayed.");
        }
        
//        driver.findElement(By.linkText("Amazon miniTV")).click();
        
//        to find listed elements
       List<WebElement> headerLinks = driver.findElements(By.className("nav-progressive-content"));
       System.out.println(headerLinks);
		
//       to find all anchor tags
       List<WebElement> links=driver.findElements(By.tagName("a"));
       System.out.println(links.size());
       
     List<WebElement>  images = driver.findElements(By.tagName("img"));
       System.out.println(images.size());
       
       driver.quit();
	}

}

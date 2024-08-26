package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		
		driver.manage().window().maximize();
		
//		x path for single attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("tshirt");

		
//		x path for multiple attribute
//		driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("iphone");
//		//input: This selects all <input> elements in the document. 
//		The double slashes (//) indicate that the search should be conducted throughout the entire document, 
//		not just at the root level.
	
		
//		x-path with and & oR oprator
//	need both attribute should be correct in and operator
//		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("chocolates");
////		need atleast one attribute should be correct
//	WebElement searchbox = driver.findElement(By.xpath("//input[@placeholde='Search' or @name='search']"));
//	searchbox.sendKeys("IPHONE");
//		searchbox.sendKeys(Keys.ENTER);
		
////		x-path with text inner text
//		driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		//a[normalize-space()='MacBook']
		//h3[text()='Featured']
	boolean	displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
	System.out.println(displaystatus);
	
	String TextValue = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
	System.out.println(TextValue);
	
//	X-path with contains method
//	driver.findElement(By.xpath("//input[contains (@placeholder,'Search')]")).sendKeys("iphone");
	
	
//	x path wih start -with
	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("iphone");

	}  

	
}

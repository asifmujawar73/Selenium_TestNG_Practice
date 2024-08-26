package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditonalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
//		** displayed or not 
////		boolean logoDisplay = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store'])").
//		boolean logoDisplay = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//		System.out.println(logoDisplay);
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("logo status is: " + logo.isDisplayed());
		
		
//		is enabled or not
		WebElement nameText = driver.findElement(By.xpath("//input[@id='FirstName']"));
		System.out.println("The test for name is : "+ nameText.isEnabled());
		
//		is selected
		boolean selected = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("The text selected status is: "+ selected);
		
		WebElement male_rdbtn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rdbtn = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selecting redio button status is..");
		System.out.println("Male button Status is :"+ male_rdbtn.isSelected());
		System.out.println("femel button status is :"+ female_rdbtn.isSelected());
		
		System.out.println("After selecting the male radio button status is :");
		male_rdbtn.click();
		female_rdbtn.click();
		
		System.out.println("male :"+male_rdbtn.isSelected());
		System.out.println("female :"+female_rdbtn.isSelected());
		
		driver.manage().window().maximize();
		
		driver.quit();
	}

}

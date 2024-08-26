package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		String crt_title = driver.getTitle();
		if (crt_title.equals ("nopCommerce demo store")){
			System.out.println("Test Passed!");
			
		}else {
			System.out.println("Test Failed!");
		}
		driver.close();
////		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
////		WebDriver driver=new EdgeDriver();  
//		
////		open url - https://www.opencart.com/
//		
//		driver.get("https://www.opencart.com/");
//	
////	validate title should be "your card"
//	
//	String act_title = driver.getTitle();
//		if (act_title.equals("Your Cart")){
//			System.out.println("Test Case is Passed..!");
//	}
//		else {
//			System.out.println("Test case filled..!");
//		}
//		driver.close();
	}
}


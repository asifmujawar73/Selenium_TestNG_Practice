package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
//	get	Page Title
//	String Headtitle = driver.getTitle();
//	System.out.println(Headtitle);;
		
	System.out.println(driver.getTitle());

	
	//	get current url
//	System.out.println(driver.getCurrentUrl());

	String crturl = driver.getCurrentUrl();
	System.out.println(crturl);
	
//	page source
//	System.out.println(driver.getPageSource());
	
//	getWindowHandle(); - it returns ID of the single browser window in the form of string
//	
//	String windowID = driver.getWindowHandle();
//	System.out.println("Window ID" + windowID);
//	
//	getWindowHandles(); - return Id's of multiple browser windows
	String windowsID = driver.getWindowHandles();
	System.out.println("Multiple Id's"+ windowsID);
	
	
	
//	driver.close();

	}

}

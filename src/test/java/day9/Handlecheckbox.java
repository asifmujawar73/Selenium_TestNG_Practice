package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		select/check box
//		WebElement checkBox = driver.findElement(By.xpath("//input[@id='sunday']"));
//		System.out.println("before checking: "+ checkBox.isSelected());
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
//		System.out.println("After clicking: "+ checkBox.isSelected());
		
//		check the count of checkbox
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of checkboxes are: "+ checkboxes.size());
		
//		selecting all checkboxes in same time
//		for (int i = 0; i<checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//		2nd approch
//		for(WebElement chkbx:checkboxes) {
//			chkbx.click();
		
//		select checkbox only last 3
//		for (int i = 4;i<checkboxes.size(); i++) {
//			checkboxes.get(i).click();
			
// //			select checkbox only first 3
//			for (int i=0;i<=2;i++) {
//				checkboxes.get(i).click();
//			
//			}
//				Thread.sleep(5000);
				
////				select or unselect checkbox
//				for(WebElement chkbx:checkboxes) {
//					if(chkbx.isSelected()) {
//					chkbx.click();
//					}
//					else {
//						chkbx.click();
		
		
//					**	to select specifiec checkbox 1,4,7 ***
		
						for (int i=0;i<checkboxes.size();i++) {
							if(i==1 || i==4 || i==6) {
								checkboxes.get(i).click();
							}
						}
					}
				
		
	}



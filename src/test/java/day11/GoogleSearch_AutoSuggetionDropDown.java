package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch_AutoSuggetionDropDown {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("solapur");
			Thread.sleep(5000);
			
			List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//span"));
			
			
			System.out.println("No of Searchs are: "+ options.size());
			
//			select anyone
			for(int i=0;i<options.size();i++) {
				System.out.println(options.get(i).getText());
				if(options.get(i).getText().equals("Solapur")) {
					options.get(i).click();}
					break;
//						else {
//							options.get(i+1).click();
//							System.out.println("No option");
						
					
				
			}
//			driver.close();
	}

}

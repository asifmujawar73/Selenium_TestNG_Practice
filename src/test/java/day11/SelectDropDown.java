package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement sltdrpdnEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select sltdrpdn = new Select(sltdrpdnEle); 
		
//		select option from the dropDown
//		1
//		sltdrpdn.selectByVisibleText("Germany");
		
//		2
//		sltdrpdn.selectByValue("Germany");
		
//		3
//		sltdrpdn.selectByIndex(4);

		List<WebElement> options = sltdrpdn.getOptions();
		System.out.println("Number of options in dropdown: "+ options.size());
		
//		printing the options
		for(int i=3; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		
//		driver.close();
	}

}

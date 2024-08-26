package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
	
//		1) Handle country dropdown with/without  using Select class:
		WebElement option = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select options = new Select(option); 
		
		
//		a) count total number of options
		List<WebElement> countryOptions = options.getOptions();
		System.out.println("Number Of Optins Available are: "+ countryOptions.size());
		
//		b) print all the options 
		System.out.println("Dropdown options are: ");
		for(WebElement Alloptions : countryOptions) {
			System.out.println(Alloptions.getText());
		}
		
//		c) select one option
		options.selectByVisibleText("India");
		
		
//		2) Hidden dropdown
		
		
//		driver.close();
	}

}

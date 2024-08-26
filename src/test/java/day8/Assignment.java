package day8;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		1) provide some string search for it
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		2) count number of links
		List<WebElement> searchlinks = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		System.out.println("Number of links are: "+ searchlinks.size());
		
		
//		3) click on each link using for loop
		System.out.println("printing & clicking links................");
		for(WebElement link:searchlinks)
		{
			System.out.println(link.getText());
			 link.click();
		}

//		4) get window ID's for every browser window

		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println("Switching to each browser window and getting the titles........"); 
		for (String winID : windowIDs) {
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);
		}
		
		driver.quit();
	}

}

package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1_doubleClick_DragAnddrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		1) double click & Drag and drop
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement butten=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		field1.clear();
		field1.sendKeys("Arshi");
		
		Actions act=new Actions(driver);
		act.doubleClick(butten).build().perform();
		
//		validation
		String text = field2.getAttribute("value");
		System.out.println("The captured value is: "+ text);
		
		if(text.equals("Arshi")) {
			System.out.println("Passed!");
		}
		else {
			System.out.println("Need to check your code!");
		}
		
//		drag and drop
		WebElement drag=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
		
//		driver.close();
	}

}

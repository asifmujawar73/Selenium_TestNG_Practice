package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2_dragAnddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		//Element(BANK) which need to drag.		
    	 WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        
    	//Element(DEBIT SIDE) on which need to drop.		
    	WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     
	//Element(SALES) which need to drag.		
    	WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));
       
	//Element(CREDIT SIDE) on which need to drop.  		
    	WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));					
    
    	//Element(500) which need to drag.		
       WebElement From3=driver.findElement(By.xpath("//section[@id='g-container-main']//li[1]//a[1]"));					
       
       //Element(DEBIT SIDE) on which need to drop.		
    	WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));					
        
	//Element(500) which need to drag.		
    	WebElement From4=driver.findElement(By.xpath("//section[@id='g-container-main']//li[1]//a[1]"));					
       
       //Element(CREDIT SIDE) on which need to drop.		
    	WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));					
     
	//Using Action class for drag and drop.		
    	Actions act=new Actions(driver);		
    	Thread.sleep(5000);
    	
    	act.dragAndDrop(From1, To1).build().perform();
    	Thread.sleep(3000);
    	act.dragAndDrop(From2, To2).build().perform();
    	Thread.sleep(3000);
    	act.dragAndDrop(From3, To3).build().perform();
    	Thread.sleep(3000);
    	act.dragAndDrop(From4, To4).build().perform();
    	
    	
    	WebElement message=driver.findElement(By.xpath("(//a[normalize-space()='Perfect!'])[1]"));
    	System.out.println(message.getText());
    	
    	
    		if("Perfect!".equals(message.getText())){
    			System.out.println("passed!");
    		}
    		else {
    			System.out.println("Failed!");
    		}
    	}
}

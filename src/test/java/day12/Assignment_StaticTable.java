package day12;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_StaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
//	1	select departure city
		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Portland");
		
//		2 select your destination city
		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("Berlin");
		
//		click on find flight button
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
//		find all the rows from table
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("Number of rows are: "+ rows);
		
//		6 - capture prices then store in array
//		int prices = driver.findElements(By.xpath("//table[@class='table']//tr//td[6]")).getText();
		String pricesArr[] = new String[rows];    // 0 - 4
		for(int r = 1; r<=rows; r++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+ r +"]/td[6]")).getText();
			pricesArr[r-1]=price;    //adding price into array
		}
		
//		7- Sort prices then find lower price value
		for(String arrvalue:pricesArr) {
			System.out.println(arrvalue);
		}
		Arrays.sort(pricesArr);      //this will sort price
		String lowestPrice = pricesArr[0];
		System.out.println("Thes lowest price among these: " + lowestPrice);
		
//		8- Find record in table having lower price
		for(int r=1; r<=rows; r++) {
			String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+ r + "]//td[6]")).getText();
			if(price.equals(lowestPrice))
			Thread.sleep(5000);{
				driver.findElement(By.xpath("//table[@class='table']//tbody/tr//td[1]")).click();
				break;
			}
		}
		
		//9 - Fill the details then click on Purchase Flight button
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Asif Mujawar");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("At Post Wangi");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Solapur");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("413221");
		driver.findElement(By.xpath("//select[@id='cardType']")).sendKeys("Diner's Club");
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("4160211535107792");
		driver.findElement(By.id("creditCardMonth")).clear();
		driver.findElement(By.id("creditCardMonth")).sendKeys("03");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("28");
		driver.findElement(By.id("nameOnCard")).sendKeys("Asif Rajahamad Mujawar");
		driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		
		//10 - validation String 
		String message = driver.findElement(By.xpath("//h1")).getText();
		if(message.contains("Thank you for your purchase")) {
			System.out.println("Success !! Passed");
		}else {
			System.out.println("Failed");
		}
//		driver.quit();
	}
	
}

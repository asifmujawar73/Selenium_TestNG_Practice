package Practice;

//Q5.Write a TestNG test case to verify that a button is clickable.

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class checkButtonIsClickeble {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}
	
	@Test
	public void buttoncheck() {
		WebElement button = driver.findElement(By.xpath("//button[@id='Button1']"));
		boolean isclickable = button.isDisplayed() && button.isEnabled();
		Assert.assertTrue(isclickable, "The button is clickeble");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

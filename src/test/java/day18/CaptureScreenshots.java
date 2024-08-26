package day18;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
		
		//1) full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		*/
		
		//2) capture the screenshot of specific section
		/*WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featredproducts.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		*/
		
		//3) capture the screenshot of webelement
	/*	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		
		*/
		
//		Capture sticker --
		driver.get("https://www.redwolf.in/vinyl-stickers-india");
		driver.manage().window().maximize();
		
		WebElement sticker = driver.findElement(By.xpath("//img[@title='Free Hugs - Sticker']"));
		File source=sticker.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\sticker.png");
		source.renameTo(targetfile);
		
		
		//driver.quit();
//		D:\Java\seleniumwebdriver\src\test\java\screenshots

	}

}

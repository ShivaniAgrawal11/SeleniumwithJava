package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement lo=driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		lo.click();
		WebElement ph=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		ph.sendKeys("9685888691");
		Thread.sleep(2000);
		WebElement otp=driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		otp.click();
		WebElement ver=driver.findElement(By.xpath("//button[normalize-space()='Verify']"));
		ver.click();
		Thread.sleep(5000);
		WebElement se=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		se.click();
		WebElement sho=driver.findElement(By.xpath("//input[@value=\"shoes\"]"));
		sho.click();		
		
		
		
		
	}

}

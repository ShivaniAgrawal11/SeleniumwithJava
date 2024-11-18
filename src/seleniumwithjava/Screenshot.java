package seleniumwithjava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		WebElement vn=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		vn.sendKeys("admin123");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File ds=new File("C:\\Users\\shiva\\OneDrive\\Pictures\\Screenshots\\s1.png");
		FileUtils.copyFile(src, ds);
		WebElement ln=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		ln.click();
		Thread.sleep(5000);
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File ds1=new File("C:\\Users\\shiva\\OneDrive\\Pictures\\Screenshots\\s2.png");
		FileUtils.copyFile(src1, ds1);

	}

}

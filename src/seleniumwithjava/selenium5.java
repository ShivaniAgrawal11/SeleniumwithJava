package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		WebElement vn=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		vn.sendKeys("admin123");
		WebElement ln=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		if(ln.isDisplayed()&&ln.isEnabled()) {
		ln.click();
		}
		Thread.sleep(2000);
		WebElement info=driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
		info.click();
		Thread.sleep(2000);
		WebElement m=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		WebElement f=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		if(f.isSelected()) {
			m.click();
		}
		else {
			f.click();
			}
		WebElement s=driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']"));
		s.click();
	}

}

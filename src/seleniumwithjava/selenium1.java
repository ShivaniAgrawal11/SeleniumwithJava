package seleniumwithjava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		WebElement vn=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		vn.sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		//driver.quit();
		WebElement ln=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		ln.click();
		Thread.sleep(2000);
		WebElement bz=driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		bz.click();
		Thread.sleep(2000);
		WebElement tx=driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		tx.sendKeys("Shivani Agrawal");
		WebElement px=driver.findElement(By.xpath("//button[@type='submit']"));
		px.click();
	}

}

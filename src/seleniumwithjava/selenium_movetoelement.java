package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_movetoelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement ca=driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a = new Actions(driver);
		a.moveToElement(ca).perform();
		WebElement st=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		Thread.sleep(2000);
		a.moveToElement(st).build().perform();
		WebElement AT=driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));
		AT.click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		a.moveToElement(ca).perform();
//		a.moveToElement(st).perform();		
//		WebElement SO=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Software Testing']"));
//		SO.click();
//		Thread.sleep(2000);
//		WebElement mt=driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));
//		mt.click();
//		Thread.sleep(2000);
//		WebElement istqb=driver.findElement(By.xpath("//a[normalize-space()='ISTQB Training']"));
//		istqb.click();
//		Thread.sleep(2000);
//		WebElement ms=driver.findElement(By.xpath("//a[normalize-space()='Manual + Selenium']"));
//		ms.click();
//		Thread.sleep(2000);
		
		
		
		
		

	}

}

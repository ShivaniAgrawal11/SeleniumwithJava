package seleniumwithjava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement in=driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		in.click();
		Thread.sleep(2000);
		String pw=driver.getWindowHandle();
		System.out.println(pw);
		Set<String>aw=driver.getWindowHandles();
		System.out.println(aw);
		for(String a : aw) {
			if(!(pw).equals(a)) {
				driver.switchTo().window(a);
				
			}
		}
		
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Shivani");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Shivi@11");
		
		
		

	}

}

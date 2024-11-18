package seleniumwithjava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		WebElement un=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    un.click();
	    Alert a=driver.switchTo().alert();
	    a.accept();
	    WebElement vn=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
	    vn.click();
	    WebElement wn=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    wn.click();
	    driver.switchTo().alert();
	    a.dismiss();
	    WebElement xn=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
	    xn.click();
	    WebElement yn=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    yn.click();
	    Thread.sleep(2000);
	    driver.switchTo().alert();
	    a.sendKeys("Shivani");
	    a.accept();
	  
	    
	    
	    
	    
		
		

	}

}

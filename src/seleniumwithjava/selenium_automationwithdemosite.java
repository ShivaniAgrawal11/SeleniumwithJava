package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_automationwithdemosite {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement fn=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Shivani");
		WebElement ln=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("Agrawal");
		WebElement add=driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		add.sendKeys("Vijay Nagar, Indore");
		WebElement em=driver.findElement(By.xpath("//input[@type='email']"));
		em.sendKeys("shivaniagrawal605@gmail.com");
		WebElement ph=driver.findElement(By.xpath("//input[@type='tel']"));
		ph.sendKeys("9685888691");
		WebElement ge=driver.findElement(By.xpath("//label[normalize-space()='FeMale']"));
		if(ge.isDisplayed()&&ge.isEnabled()) {
			ge.click();
			} 
		WebElement hob=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		if(hob.isDisplayed()&&hob.isEnabled()) {
			hob.click();
		}
		WebElement lan=driver.findElement(By.xpath("//div[@id='msdd']"));
		lan.click();
		WebElement eng=driver.findElement(By.xpath("//a[normalize-space()='English']"));
		eng.click();
		WebElement hin=driver.findElement(By.xpath("//a[normalize-space()='Hindi']"));
		hin.click();
		Thread.sleep(1000);
		WebElement lang=driver.findElement(By.xpath("//label[normalize-space()='Languages']"));
		lang.click();
		WebElement ski=driver.findElement(By.xpath("//select[@id='Skills']"));
		ski.click();
		WebElement skill=driver.findElement(By.xpath("//option[@value=\"Art Design\"]"));
		skill.click();
		Thread.sleep(1000);
		WebElement skills=driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
		skills.click();
		WebElement coun=driver.findElement(By.xpath("//span[@role='combobox']"));
		coun.click();
		Thread.sleep(1000);
		WebElement countr=driver.findElement(By.xpath("//input[@role='textbox']"));
		countr.sendKeys("India");
		Thread.sleep(1000);	
		WebElement country=driver.findElement(By.xpath("//select[@id='countries']"));
		Actions a = new Actions(driver);
		a.doubleClick(country).perform();
		
		Thread.sleep(2000);
		WebElement yea=driver.findElement(By.xpath("//select[@id='yearbox']"));
		yea.click();
		WebElement year=driver.findElement(By.xpath("//option[@value=\"1998\"]"));
		year.click();
		WebElement DOB=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		DOB.click();
		WebElement mont=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		mont.click();
		WebElement month=driver.findElement(By.xpath("//option[@value=\"December\"]"));
		month.click();
		WebElement dob=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		dob.click();
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		day.click();
		WebElement dayy=driver.findElement(By.xpath("//option[@value=\"11\"]"));
		dayy.click();
		WebElement doB=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		doB.click();
		Thread.sleep(1000);
		WebElement pass=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("Shivi@11");
		WebElement cnfpass=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		cnfpass.sendKeys("Shivi@11");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package mock.questions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Irctc {
	
	
	@Test
	public void irctc()
	{
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//a[contains(.,'BUSES')]/parent::li[@class='menu-list header-icon-menu']")).click();
		String parent = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			if(!wh.equals(parent))
			{
				driver.switchTo().window(wh);
				System.out.println("window switched");
			}
		}
		WebElement from = driver.findElement(By.xpath("//label[.='Depart From']/following-sibling::input"));
		from.sendKeys("Bengaluru");
	
		
		
 WebElement bng = driver.findElement(By.xpath("//li[.='Bengaluru']/div"));
 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
 wait.until(ExpectedConditions.elementToBeSelected(bng));
 
 
		
		
		
		
		
		
		
	
		
		
		
		
		
		//driver.close();
	}

}

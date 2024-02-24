package mock.questions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SamsungCount_AllpagesFlipkart {
	
	
	@Test
	public void samsung() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("q")).sendKeys("galaxy s23"+Keys.ENTER);
		
		
		
		int sum=0;
		for(;;)
		{
			try
			{
				List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
				int count = mobiles.size();
				sum=sum+count;
				
				
				WebElement nxtBtn = driver.findElement(By.xpath("//span[.='Next']"));
				nxtBtn.click();
				//Thread.sleep(2000);
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.titleContains("Best"));
				wait.until(ExpectedConditions.visibilityOf(nxtBtn));
				
			}
			catch(Exception e)
			{
				break;
			}
			
		}
		
		System.out.println(sum);
		
		String max=sum+"";
		String resText = driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText();
		if(resText.contains(max))
		{
			System.out.println("tc passed");
		}
		else
		{
			System.out.println("assertion failed");
		}
		driver.quit();
		
	}

}

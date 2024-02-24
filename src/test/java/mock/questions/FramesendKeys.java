package mock.questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesendKeys {
	
	
	@Test
	public void t()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();
		
		driver.findElement(By.xpath("//div[@class='iframe-container']"));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='container']/div[@class='row']//input[@type='text'])[2]")).sendKeys("abhi");
		
		driver.close();
	}

}

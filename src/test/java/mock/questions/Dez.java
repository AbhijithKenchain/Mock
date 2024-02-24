package mock.questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dez {

	
	@Test
	public void learn()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='page']"));
		
		WebElement frameele = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frameele);
		
		driver.findElement(By.xpath("//a[@class='menu-link' and text()='Courses']")).click();
		WebElement popuptext = driver.findElement(By.xpath("//div[@class='row justify-content-center']/descendant::h1[.='Learn It Easy']"));
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.visibilityOf(popuptext));
		
		
		
		WebElement X = driver.findElement(By.xpath("//div[@class='ml-popup w-100 row-form']/button/span"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(X));
		X.click();
		
	}
}

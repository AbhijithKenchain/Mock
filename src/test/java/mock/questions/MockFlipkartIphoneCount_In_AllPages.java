package mock.questions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MockFlipkartIphoneCount_In_AllPages {

	@Test
	public void flip() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("apple iphone 14");
		search.sendKeys(Keys.ENTER);
		List<WebElement> page = driver.findElements(By.xpath("//div[@class='_4rR01T' and contains(text(),'iPhone')]"));
		int count = 0;
		for (;;) {
			try {
				for (WebElement i : page) {
					count++;
				}
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[.='Next']")).click();
			} catch (Exception e) {
				break;
			}
		}

		System.out.println(count);

		String fullcount = "";
		fullcount = count + "";
		String resulttext = driver.findElement(By.xpath("//span[contains(text(),'of')]")).getText();
		if (resulttext.contains(fullcount)) {
			System.out.println("tc passed");
		} else {
			System.out.println("expected and actual count is diffrent");
		}

	}

}

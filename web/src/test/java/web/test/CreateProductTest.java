package web.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateProductTest {

	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:/dev/geckodriver/geckodriver.exe"); // Example [path to gecko (firefox) driver] => "C:/dev/tools/geckodriver.exe")
		
	}
	
	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();	
		
        //Launch the Online Store Website
		driver.get("http://localhost:7070");
		driver.findElement(By. linkText("Manage Products")).click();
		
		driver.findElement(By.name("description")).click();
		driver.findElement(By.name("description")).sendKeys("testProdukt");
		
		driver.findElement(By.cssSelector("form:nth-child(3) > p > input")).click();
		
		driver.findElement(By.name("id")).click();
		driver.findElement(By.name("id")).sendKeys("0");
		
		driver.findElement(By.cssSelector("form:nth-child(9) > p > input")).click();
		
		assertEquals(driver.findElement(By.id("productDescription")).getText(), "Description: testProdukt");
		

		
		
		//Wait for 5 Sec
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Close the driver
        driver.quit();
	}

}

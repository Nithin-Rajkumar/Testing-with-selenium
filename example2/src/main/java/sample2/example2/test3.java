package sample2.example2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {
	WebDriver driver=new EdgeDriver();
	String a="Admin";
	String b="admin123";
	@BeforeTest
	public void beforetest(){
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	@Test
	public void Tc_01() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
//		Assert.assertEquals(a,"Admin");
//		Assert.assertEquals(b,"admin123");
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		btn.click();
		String ur=driver.getCurrentUrl();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",ur);
		
		
	}
	@AfterTest
	public void aftertest() {
		
	}
}

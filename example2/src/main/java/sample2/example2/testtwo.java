package sample2.example2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testtwo {
	@Test(priority=1)
	  public void TC_001() { 
		WebDriverManager.chromedriver().setup();
	       ChromeOptions co=new ChromeOptions(); 
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	}
}

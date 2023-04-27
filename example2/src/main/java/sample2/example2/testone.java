package sample2.example2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test; import io.github.bonigarcia.wdm.WebDriverManager;

public class testone {
	@Test(priority=1)
	  public void TC_001() { 
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Guest Registration Form - User Registration");
	}
}

package sample.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5drag {
	public static void main(String[] sgg) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver drivertwo=new ChromeDriver();
		ChromeOptions co=new ChromeOptions(); 
	       co.addArguments("--remote-allow-origins=*");

		WebDriver chromedriver = new ChromeDriver(co);
		chromedriver.get("https://www.google.com/");
	    driver.get("https://www.google.com/");
	    drivertwo.get("https://www.google.com/");
	}
}

package sample.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Nithin");
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[3]/div/input")).sendKeys("R");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("manopalaniraja2154@gmail.com");
        //finding the password
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("mano@2102");
//        driver.navigate().to(null);
        //Subcribe
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
    }
}



package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFIelds {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("http://leafground.com/pages/Edit.html");
driver.findElement(By.id("email")).sendKeys("JenniferAniston@gmail.com");
driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("testleaf");
System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));
WebElement clearType = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
clearType.clear();
WebElement exist = driver.findElement(By.xpath("//input[@disabled='true']"));
boolean str = exist.isEnabled();
System.out.println(str);

	
} 
}
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;


public class AssignmentFive {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String webTitle =driver.getTitle();
	System.out.println("Title is" +webTitle);
	driver.findElement(By.linkText("Log Out")).click();
	driver.close();
	}

}

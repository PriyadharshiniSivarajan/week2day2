package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.name("UserFirstName")).sendKeys("Jennifer");
		driver.findElement(By.name("UserLastName")).sendKeys("Aniston");
		driver.findElement(By.name("UserEmail")).sendKeys("JenniferAniston@gmail.com");
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		Select drop = new Select(jobTitle);
		drop.selectByVisibleText("Marketing / PR Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("IBM INDIA PVT LTD");
		WebElement employee = driver.findElement(By.name("CompanyEmployees"));
		Select drop2 = new Select(employee);
		drop2.selectByIndex(1);
		driver.findElement(By.name("UserPhone")).sendKeys("9129612527");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select drop3 = new Select(country);
		drop3.selectByValue("IN");
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();	
		
	}

}

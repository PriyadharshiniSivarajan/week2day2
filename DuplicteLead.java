package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class DuplicteLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.linkText("Smitha"));
		String str2 = findElement.getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='10182']")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Mismatch");
		}
		String attribute = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		if (str2.equals(attribute)) {
			System.out.println("Name verified");
		}
	}
}
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vidya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='10148']")).click();
		String str = driver.getTitle();
		String str1="View Lead | opentaps CRM";
		if(str.equals(str1))
		{
		
		System.out.println("Title verified");

	}

		else {
			System.out.println("Title is not same");
		}
		driver.findElement(By.linkText("Edit")).click();
		WebElement company = driver.findElement(By.id("updateLeadForm_companyName"));
		company.clear();
		company.sendKeys("Cognizant");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement tableText = driver.findElement(By.id("viewLead_companyName_sp"));
		String str2= tableText.getText();
		System.out.println(str2);
		if(str2.contains("Cognizant"))
		{
			System.out.println("Change verified");
		}
		
		
}
}

package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver obj = new ChromeDriver();
	obj.manage().window().maximize();
	obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	obj.get("http://leaftaps.com/opentaps/control/login");
	obj.findElement(By.id("username")).sendKeys("demosalesmanager");
	obj.findElement(By.id("password")).sendKeys("crmsfa");
	obj.findElement(By.className("decorativeSubmit")).click();
	obj.findElement(By.linkText("CRM/SFA")).click();
	obj.findElement(By.linkText("Contacts")).click();
	obj.findElement(By.linkText("Create Contact")).click();
	obj.findElement(By.id("firstNameField")).sendKeys("Jennifer");
	obj.findElement(By.id("lastNameField")).sendKeys("Aniston");
	obj.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jen");
	obj.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ann");
	obj.findElement(By.id("createContactForm_personalTitle")).sendKeys("Miss");
	obj.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
	obj.findElement(By.id("createContactForm_description")).sendKeys("Automation testing");
	obj.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jenniferanniston@gmail.com");
	WebElement stateProvince = obj.findElement(By.name("generalStateProvinceGeoId"));
    Select drop= new Select(stateProvince);
    drop.selectByVisibleText("New York");
    obj.findElement(By.className("smallSubmit")).click();
    obj.findElement(By.linkText("Edit")).click();
    WebElement editDepartment = obj.findElement(By.name("description"));
    editDepartment.clear();
    editDepartment.sendKeys("Development");
    obj.findElement(By.name("importantNote")).sendKeys("Testleaf institute");
    obj.findElement(By.xpath("//input[@class='smallSubmit']")).click();
    String str=obj.getTitle();
    System.out.println("Page tilte" +str);
    
    


}
}
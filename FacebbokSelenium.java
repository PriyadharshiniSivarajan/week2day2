package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class FacebbokSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://en-gb.facebook.com/");
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createNew = obj.findElement(By.xpath("//a[@rel = 'async']"));
		createNew.click();
		obj.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Jennifer");
		obj.findElement(By.name("lastname")).sendKeys("Aniston");
		obj.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9146750986");
		WebElement password = obj.findElement(By.id("password_step_input"));
		password.sendKeys("password");
		WebElement day = obj.findElement(By.id("day"));
	    Select drop=new Select(day);
		drop.selectByValue("7");
		WebElement month = obj.findElement(By.id("month"));
		Select drop1=new Select(month);
		drop1.selectByIndex(3);
		WebElement year = obj.findElement(By.id("year"));
		Select drop2 =new Select(year);
		drop2.selectByValue("1997");
		obj.findElement(By.xpath("//label[text()='Female']")).click();
	}  

}

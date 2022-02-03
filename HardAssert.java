package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:/leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		WebElement actual = driver.findElement(By.linkText("Leadssdfdsf"));
		WebElement expected = driver.findElement(By.linkText("Leads"));
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("Hard Assert completed successfully");


	}
}

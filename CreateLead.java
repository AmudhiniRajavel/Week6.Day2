package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@BeforeClass
	  public void setUp() {
		  fileName ="createLead";
	  }
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName, String fName, String lName) {
		
		driver.findElement(By.linkText("Leadser")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
}
	
	

	}
	


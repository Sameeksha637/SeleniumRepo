package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTestLeafCreate {

	public static void main(String[] args) {
	
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		dr.get("http://leaftaps.com/opentaps/control/login");
		
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		dr.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		dr.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Capgemini");
		
		dr.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sameeksha");
		
		dr.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Pal");
		
		dr.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc22@gmail.com");
		
		dr.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9876543210");
		
		dr.findElement(By.xpath("//input[contains(@name,'subm')]")).click();
		
   }

}

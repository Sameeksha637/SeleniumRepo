package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create {

	public static void main(String[] args) {
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		dr.get("http://leaftaps.com/opentaps/control/login");
		
		dr.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		
		dr.findElement(By.className("decorativeSubmit")).click();
		
		dr.findElement(By.linkText("CRM/SFA")).click();
	        
	    dr.findElement(By.linkText("Leads")).click();
	        
	    dr.findElement(By.linkText("Create Lead")).click();
	    
	    dr.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");
	    
	    dr.findElement(By.id("createLeadForm_firstName")).sendKeys("Sameeksha");
	    
	    dr.findElement(By.id("createLeadForm_lastName")).sendKeys("Pal");
	    
	    dr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("samusameeksha22@gmail.com");
	   
	    dr.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987643210");
	    
	    dr.findElement(By.name("submitButton")).click();
	   
	 }

}

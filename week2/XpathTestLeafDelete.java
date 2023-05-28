package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTestLeafDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		dr.get("http://leaftaps.com/opentaps/control/login");
		
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		dr.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		dr.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	
		dr.findElement(By.xpath("//span[text()='Phone']")).click();
		
		dr.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
        		
	    String text = dr.findElement(By.xpath("//a[contains(text(),'13736')]")).getText();
	    System.out.println(text);
	    
	    dr.findElement(By.xpath("//a[contains(text(),'13736')]")).click();
	    
	    dr.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	    
	    dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		dr.findElement(By.xpath("//input[@name='id']")).sendKeys("13736");
		
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String actualMessage=dr.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(actualMessage);
	    
	    
	    
	    

	}

}

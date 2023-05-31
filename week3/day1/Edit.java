package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Using Advance Xpath

public class Edit {

	public static void main(String[] args) {
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		dr.get("http://leaftaps.com/opentaps/control/main");
		
		dr.findElement(By.xpath("//form[@id='login']//input")).sendKeys("Demosalesmanager");
		
		dr.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		
		dr.findElement(By.xpath("//input[@id='username']/following::input[2]")).click();
		
		dr.findElement(By.xpath("//div[@id='button']/div/a")).click();
		
		dr.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();
		
		dr.findElement(By.xpath("//a[text()='My Leads']/following::a")).click();
		
		dr.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("Capgemini");
		
		dr.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("Sameeksha");
		
		dr.findElement(By.xpath("//span[text()='Last name']/following::input")).sendKeys("Pal");
		
		dr.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']/following::input")).click();
		
		
	    dr.findElement(By.xpath("//a[text()='Duplicate Lead']/following-sibling::a[2]")).click();
				
		dr.findElement(By.xpath("//span[text()='Company Name']/following::input")).clear();
			
		dr.findElement(By.xpath("//span[text()='Company Name']/following::input")).sendKeys("Capgemini India");
				
		dr.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']/following::input")).click();

		
		
	}

}

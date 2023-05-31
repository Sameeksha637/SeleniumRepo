package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Using Advance Xpath

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		dr.get("https://en-gb.facebook.com/");
		
		dr.findElement(By.xpath("//a[text()='Forgotten password?']/following::a")).click();
		
		dr.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/preceding::input[@name='firstname']")).sendKeys("Sameeksha");
		
		dr.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Pal");
		
		dr.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9876543210");
		
		dr.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Sam@1999");
		
		Select date = new Select(dr.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("16");
		Select month = new Select(dr.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Mar");
		Select year = new Select(dr.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("1999");
		
		dr.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();

	}

}

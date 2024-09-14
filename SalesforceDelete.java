package week3Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceDelete {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",element);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Salesforce Automation by Prasanth");
		Thread.sleep(5000);
		WebElement element2 = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();",element2);
		Thread.sleep(5000);
		WebElement element3 = driver.findElement(By.xpath("//a[@title='Delete']/div"));
		driver.executeScript("arguments[0].click();",element3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		Thread.sleep(2000);
		WebElement OpportunityFound = driver.findElement(By.xpath("//a[text()='Salesforce Automation by Prasanth']"));
        String text = OpportunityFound.getText();
		if(text.equals("Salesforce Automation by Prasanth")) {
			System.out.println("Opportunity is Found");
		}
		else {
			System.out.println("Opportunity is deleted");
		}
	}

}

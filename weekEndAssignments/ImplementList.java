package weekEndAssignments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ImplementList {
	public static void main(String[] args) throws InterruptedException {

		
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		

		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		String total = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + total);
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Brand name list size :" + bagBrandList.size());
		
		System.out.println(" Name of the BagBrands:");

		for (int i=0;i<bagBrandList.size();i++) {
			String text = bagBrandList.get(i).getText();
			System.out.println("---> "+text);
		}
		
		System.out.println("------------------------------------------------------------------------");

		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" BagName list Size :" + bagNameList.size());
		System.out.println(" Names of the Bags:");
		for (int i=0;i<bagNameList.size();i++) {
			String text = bagNameList.get(i).getText();
			System.out.println("---> "+text);
		}

	}
}


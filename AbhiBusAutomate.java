package week3Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusAutomate {

	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
		
		
		WebElement element = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
		String bus=element.getText();
		
		System.out.println("The selected bus is:"+bus);
		
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]"));
		String seat=element2.getText();
		
		System.out.println(seat);
		
		
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='5UA']")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		WebElement amt=driver.findElement(By.xpath("//div[@class='seat-fare col auto']"));
		String fare=amt.getText();
		
		System.out.println("Total Fare for bus:"+fare);
		
		WebElement SelectSeat=driver.findElement(By.xpath("//div[@class='selected-seat col auto']//div[1]/div[1]"));
		String Seats=SelectSeat.getText();
		
		System.out.println("Seat selected:"+Seats);
		
		
		
	}

}

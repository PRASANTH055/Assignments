import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("prasanth");
        driver.findElement(By.name("lastname")).sendKeys("prasanth@07");
        driver.findElement(By.name("reg_email__")).sendKeys("prasanth@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("prasanth@05");
        String title = driver.getTitle();
        if (title.contains("Facebook")) {
			System.out.println("Title is verified");
		}
        else {
        	System.out.println("Title is not verified");
        }
	}

}

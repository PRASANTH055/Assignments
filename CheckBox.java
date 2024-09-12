import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node01jifpnuy2ivgz1vmfbfhvcrd736054823.node0");
        driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div)[2]")).click(); 
        driver.findElement(By.xpath("(//div[@class='grid formgrid'])[2]//div[2]")).click();
        driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]//div[2]")).click();
        driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[2]/div[2]")).click();
        driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//div[2]")).click();
        driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget'])/div[2]")).click();
        driver.findElement(By.xpath("//ul[@data-label='Cities']")).click(); 
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("A");
        driver.findElement(By.xpath("(//label[text()='Amsterdam'])[2]")).click();
        driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
	}

}

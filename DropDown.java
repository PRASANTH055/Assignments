import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://leafground.com/select.xhtml;jsessionid=node01vat187vksi6eb1lr7a3asoxc6037131.node0");
       WebElement DropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
       Select selectTool=new Select(DropDown);
       selectTool.selectByIndex(3);
       driver.findElement(By.xpath("//div[@id='j_idt87:country']")).click();
       driver.findElement(By.xpath("//li[text()='India']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@id='j_idt87:city']")).click();
       driver.findElement(By.xpath("//li[@data-label='Bengaluru']")).click();
       driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).sendKeys("selenium");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
       driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).sendKeys("play");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//li[@data-item-label='Playwright']")).click();
       driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
       driver.findElement(By.xpath("//li[@data-label='English']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//label[text()='Select Values']")).click();
       driver.findElement(By.xpath("//li[@data-label='One']")).click();
       }

}

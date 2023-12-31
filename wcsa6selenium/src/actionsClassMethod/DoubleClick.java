package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("http://aishwarya/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::td[@class='navItem relative']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("uploadNewLogoOption")).click();
	Thread.sleep(2000);
  WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
  Actions act=new Actions(driver);
  Thread.sleep(2000);
  act.doubleClick(target).perform();
	driver.close();
}
}

package Browser_Launch;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrowseLaunch {

	static {
		
		
		System.out.println(System.getProperty("user.dir")+"\\Selenium_Class\\Drivers\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) throws Throwable {
		
		
		try {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Selenium_Class\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.navigate().to("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		
		WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));


	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
	
		Thread.sleep(5000);
		
		WebElement images = driver.findElement(By.xpath("//a[contains(text(),'Images')]"));
		
	
		Select s=new Select(element);
		s.getFirstSelectedOption()()()()
		
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);	
		
		
		Set<String> child = driver.getWindowHandles();
	
		for (String x : child) {
	driver.switchTo().window(x);
	String title = driver.getTitle();

	if(title.equalsIgnoreCase("Google Images"))
	{
		driver.switchTo().window(x);
		
}
		
}
		
		}catch (Exception e)
		{
			throw new RuntimeException();
		}
		
		}
}

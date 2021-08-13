package Rare_Topics;

public class Handlebuttonwithsendkeys {

	
	// set chrome driver exe path
	System.setProperty("webdriver.chrome.driver", "C:/~/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/selenium-webdriver-sample");
	// send enter key to button
	driver.findElement(By.xpath("//input[@id='btn-sendkeys']")).sendKeys(Keys.ENTER);
}

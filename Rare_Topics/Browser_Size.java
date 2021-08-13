package Rare_Topics;

public class Browser_Size {

	
	WebDriver driver=new chromedriver();
	driver.get("https://selenium-mentor.com");
	// below line sets the size of the browser
	driver.manage().window().setSize(new Dimension(200, 200));
}

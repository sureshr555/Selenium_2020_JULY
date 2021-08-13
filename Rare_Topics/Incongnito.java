package Rare_Topics;

public class Incongnito {

	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.DesiredCapabilities;
	public class PrivateBrowsing {
	    public static void main(String args[]){
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        System.setProperty("webdriver.chrome.driver","D:\PATH\chromedriver.exe");
	        WebDriver driver = new ChromeDriver(capabilities);
	        driver.get("https://chercher.tech");
	        System.out.println(driver.getTitle());
	    }
	}
}

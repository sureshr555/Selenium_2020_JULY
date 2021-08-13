package JavaScriptExecutor;

public class Scroll_Down {

/*	
	
	ScroolDown
	Syntax:
	JavaScriptExecutor jk=(JavaScriptExecutor)driver;
	jk.executeScript("arguments[0].ScrollIntoview(true)",WebElement)
	ScroolUp
	JavaScriptExecutor jk=(JavaScriptExecutor)driver;
	jk.executeScript("arguments[0].ScrollIntoview(false)",WebElement)
	Program:
	package org.cts.toyota.login;

	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Employee {
	  public static void main(String[] args) throws IOException {
	    System.setProperty("webdriver.chrome.driver", "path");
	    WebDriver driver = new ChromeDriver();
	    driver.get("url");

	    WebElement down = driver.findElement(By.id("email"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // down
	    js.executeScript("arguments[0].scrollIntoView(true)", down);
	    // up
	    js.executeScript("arguments[0].scrollIntoView(false)", down);

	  }
	}*/
}

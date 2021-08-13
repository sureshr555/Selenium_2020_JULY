package WindowsHandling;

public class Ex1_WindowsHAndling {

/*	

Windows Handling
Syntax:
driver.switchTo().window(String Url) 
driver.switchTo().window(String title) 
driver.switchTo().window(String windows)

driver.getwindowHandle()-parent 
driver.getwindowHandles()--child

Set<String> all=driver.getwindowsHandles();
List<String> emp=new ArrayList<String>();
emp.addAll(all);
driver.switchTo().window(emp.get(index));
Program:
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "path");
    WebDriver driver = new ChromeDriver();
    driver.get("url");
    // parent window id
    String pWid = driver.getWindowHandle();
    // all windows
    Set<String> allWindows = driver.getWindowHandles();
    for (String x : allWindows) {
      if (!pWid.equals(x)) {
        driver.switchTo().window(x);
      }

    }

  }
}*/

}

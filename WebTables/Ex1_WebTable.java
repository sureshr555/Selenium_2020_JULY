package WebTables;

public class Ex1_WebTable {

	
/*	

webtable
Syntax:
List<WebElement> tRows=driver.findElements(By.tagName("tr"));
for(WebElement x:tRows){
List<WebElement> tData=driver.findElements(By.tagName("td"));
for(WebElement y:tData){
String name=y.getText();
sysout(name);
}
}
Program:
package org.cts.toyota.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "path");
    WebDriver driver = new ChromeDriver();
    driver.get("url");
    // Enhnaced for loop
    List<WebElement> tRows = driver.findElements(By.tagName("tr"));
    for (WebElement rows : tRows) {
      List<WebElement> tData = rows.findElements(By.tagName("td"));
      for (WebElement data : tData) {
        System.out.println(data.getText());

      }
    }

    // for loop
    for (int i = 0; i < tRows.size(); i++) {
      List<WebElement> tData = tRows.get(i).findElements(By.tagName("td"));
      for (int j = 0; j < tData.size(); j++) {
        System.out.println(tData.get(j).getText());
      }
    }
  }
}*/
}

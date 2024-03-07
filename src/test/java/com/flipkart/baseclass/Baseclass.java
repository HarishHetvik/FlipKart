package com.flipkart.baseclass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.pom.Pom;

public class Baseclass extends Pom {
	
	public static WebDriver driver;
	 
	
	public void implicityWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public boolean isDisplayed(WebElement element) {
		boolean b = element.isDisplayed();
		return b;
	}

	public boolean isSelected(WebElement element) {
		boolean b = element.isSelected();
		System.out.println(b);
		return b;
	}

	public boolean isEnabled(WebElement element) {
		boolean b = element.isEnabled();
		return b;
	}

	public WebElement visibilityOf(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
		return until;
	}

	public void browserLaunch(String browser) {
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}
	}
	public void enterUrl(String url) {
		driver.get(url);
	}

	public void elementClick(WebElement element) {
		
		element.click();
	}
	public String getTexts(WebElement element) {
		 String text = element.getText();
            return text;
	}
	public void sendkey(WebElement element,String text) {
		
		element.sendKeys(text);
	}
	public void windowHandle() {
		String prtWin = driver.getWindowHandle();
		Set<String> allWin =driver.getWindowHandles();
		for(String win :allWin) {
			if(!prtWin.equals(win)) {
				driver.switchTo().window(win);
			}
		}

	}
	public void refresh() {
      driver.navigate().refresh();
} 
}
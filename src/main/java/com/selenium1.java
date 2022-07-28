//package SeleniumCommands;
package com.mindtree.seleniumclass;

import java.time.Duration;
import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Personal Finance"));
		action.moveToElement(element).build().perform();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Income Tax calculator")));
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.linkText("Income Tax calculator"));
		action.moveToElement(element2);
		action.click().build().perform();
		
		
	}

}

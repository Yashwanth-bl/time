//package SeleniumCommands;
package com.mindtree.seleniumclass;

import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();		
		driver.findElement(By.linkText("Checkboxes")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]")).click();
		Thread.sleep(2000);
	driver.navigate().to("http://the-internet.herokuapp.com/");
	Thread.sleep(2000);
		driver.findElement(By.linkText("Inputs")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/input")).sendKeys("1234");
		Thread.sleep(2000);
		driver.navigate().to("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dropdown")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/select/option[3]")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("File Upload")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("C:\\Users\\mindc1may28\\Desktop\\Document.rtf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
		Thread.sleep(2000);	
		driver.navigate().to("http://the-internet.herokuapp.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Sortable Data Tables")).click();
		Thread.sleep(2000);
		String t1= driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[3]")).getText();
		System.out.print("email:"+t1+"    ");
		String t2= driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[5]")).getText();
		System.out.print("website"+t2);
		Thread.sleep(2000);
		driver.navigate().to("http://the-internet.herokuapp.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Key Presses")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"target\"]")).sendKeys("WIN");
		String b= driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		System.out.print("result"+b);
		driver.navigate().to("http://the-internet.herokuapp.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		System.out.print("new window");
		//driver.quit();
		driver.navigate().to("http://the-internet.herokuapp.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Context Menu")).click();
		Thread.sleep(2000);
		WebElement rit =  driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
		Actions action= new Actions(driver);
		action.contextClick(rit).perform();
		Alert we= driver.switchTo().alert();
		we.accept();		
		driver.quit();
	}

}

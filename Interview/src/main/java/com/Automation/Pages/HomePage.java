/**
 * 
 */
package com.Automation.Pages;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.Automation.Testcases.TestCase_1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.bytebuddy.asm.Advice.Enter;
/**
 * @author siddharthj
 *This class will store all the locators and methods of Amazon website
 */
public class HomePage extends TestCase_1 {
	
	public static ExtentTest test1;
	 ExtentTest Loggers;
	 ExtentReports report;
	 ExtentHtmlReporter htmlReporter;
	 ExtentReports extent;
	 WebDriver driver;
	
	
	By All = By.xpath("//span[text()='All'][@class=\"hm-icon-label\"]");
	By Electronics = By.xpath("//div[text()='TV, Appliances, Electronics']");
	By television = By.xpath("//a[text()='Televisions']");
	By Samsung_checkbox = By.xpath("//span[text()='Samsung']/../div/label/i");
	By SortBy = By.xpath("//select[@name='s']");
	By Sort_Hightolow = By.xpath("//a[text()='Price: High to Low']");
	By Second_Highest_Price = By.xpath("//*[@data-image-index='2']");
	By Abou_Item = By.xpath("//h1[text()=' About this item ']");
	By Brands = By.xpath("//*[text()='Brands']");
	By Size = By.xpath("//span[text()='4K']");
	By Addtocart = By.xpath("//input[@id='add-to-cart-button']");
	
	
	
	
			
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyNavigation() {
		
		
		driver.findElement(All).click();
		driver.findElement(Electronics).click();
		driver.findElement(television).click();
	}
	
	
	
	public void selectBrand() {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Size));
		driver.findElement(Size).click();
	}
	
	public void sorting() {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SortBy));
		Select Sorting = new Select(driver.findElement(SortBy));
		Sorting.selectByValue("price-desc-rank");		
	}
	
	public void selectingProduct() {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Second_Highest_Price));
		driver.findElement(Second_Highest_Price).click();
	}
	
	public void assertAboutItem() {
		String currentHandle= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
		if(!actual.equalsIgnoreCase(currentHandle)) {
		driver.switchTo().window(actual);
		driver.findElement(Addtocart).click();
		
		
		}}}
	
	
	}
	




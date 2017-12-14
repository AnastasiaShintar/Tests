package by.htp.testng.testng_study;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import by.htp.testng.testng_study.XpathConstant;

public class XpathTest {

	private static final String DRIVER_FIREFOX = "webdriver.gecko.driver";
	private static final String DRIVER_FIREFOX_PATH = "C:\\driver\\geckodriver.exe";
	protected static final String SEARCHLINE = "//*[@id=\"lst-ib\"]";
	protected static final String GENERALNEW = "//*[@id=\"title_news_block\"]/div[1]/p/a";
	
	private WebDriver driver;
	private WebElement element;
	XpathConstant constant = new XpathConstant();
	

	@BeforeClass
	public void BeforeClass() {
		System.setProperty(DRIVER_FIREFOX, DRIVER_FIREFOX_PATH);
		driver = new FirefoxDriver();
	}

	@BeforeMethod
	public void BeforeMethod() {

	}

	@BeforeSuite
	public void BeforeSuit() {

	}

//	@Test
//	public void test1() {
//		System.out.println("test1");
//		
//		driver.get("http://www.google.com");
//		element = driver.findElement(By.xpath(SEARCHLINE));
//		element.sendKeys("JAVA");
//		element.submit();
//
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		String title = driver.getTitle();
//		assertTrue(title.contains("JAVA"));
//	}
	
	@Test
	public void test2() {
		System.out.println("test2");
		 driver.get("http://www.tut.by");
		 element = driver.findElement(By.xpath(GENERALNEW));
		 element.click();
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"utm_article_block\"]/div[1]/div[1]/h1/text()")));
		 element = driver.findElement(By.id("article_body"));
		
	}

	@AfterClass
	public void AfterClass() {

	}

	@AfterMethod
	public void AfterMethod() {

	}

	@AfterSuite
	public void AfterSuit() {

	}

}

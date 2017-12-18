package by.htp.testng.testng_study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MailTest {
	private static final String DRIVER_FIREFOX = "webdriver.gecko.driver";
	private static final String DRIVER_FIREFOX_PATH = "C:\\driver\\geckodriver.exe";
	private WebDriver driver;
	private WebElement element;

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
		System.setProperty(DRIVER_FIREFOX, DRIVER_FIREFOX_PATH);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}

	@Test
	public void MailTest1() {
		driver.get("https:www.mail.ru");
		element = driver.findElement(By.id("mailbox:login"));
		element.sendKeys("anastasiashintartest");
		Select selCountryOfUser = new Select(driver.findElements(By.id("mailbox:domain")).get(0));
		selCountryOfUser.selectByVisibleText("@mail.ru");
		element = driver.findElement(By.id("mailbox:password"));
		element.sendKeys("123456789qwerty");
		element = driver.findElement(By.cssSelector("#mailbox\\3a submit > input"));
		element.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		element = driver.findElement(By.cssSelector(
				"#b-toolbar__left > div > div > div.b-toolbar__group.b-toolbar__group_left > div > a > span"));
		element.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		element = driver.findElement(By.cssSelector("textarea.js-input:nth-child(6)"));
		element.sendKeys("sviatlana.zakharenka@gmail.com");
		element = driver.findElement(
				By.cssSelector(".compose-head__row_nohr > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)"));
		element.sendKeys("Anastasia Shintar. HTP.JAVA.TAT5");
		element = driver.findElement(By.cssSelector("span.mce_bold"));
		element.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		element.sendKeys("Hello Svetlana! This is my git link: https://github.com/AnastasiaShintar/Tests");
		element = driver.findElement(
				By.cssSelector("div.b-toolbar__item_:nth-child(1) > div:nth-child(1) > span:nth-child(1)"));
		element.click();
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
		// driver.close();
		// driver = null;
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

}

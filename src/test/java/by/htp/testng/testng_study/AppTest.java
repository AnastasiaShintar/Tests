package by.htp.testng.testng_study;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest {

	private static final String DRIVER_FIREFOX = "webdriver.gecko.driver";
	private static final String DRIVER_FIREFOX_PATH = "C:\\driver\\geckodriver.exe";
	private static final String GENERALNEW = "#title_news_block > div.b-general.ni._titlealts_ > p > a";
	private static final String PROFILE = "#navigation > li.last > a";
	private static final String EDITPROFILE = "#middle > div.user > div.personal > div.login > div > a";
	private static final String PROFILEPERSONALFORM = "#profile-personal-form > div.title";
	private static final String ADDPHOTO = "#profile-personal-form > div.content > form > table > tbody > tr:nth-child(4) > td:nth-child(4) > input[type=\"file\"]";
	private static final String PROFILEPRIVACYFORM = "#profile-privacy-form > div.title";
	private static final String PROFILENOTIFICATIONFORM = "#profile-notifications-form > div.title";
	private static final String NOTIFICATIONCHECKBOX = "#profile-notifications-form > div.content > form > label.notifications > input[type=\"checkbox\"]";
	private static final String DELIVERCHECKBOX = "#profile-notifications-form > div.content > form > label.deliveries > input[type=\"checkbox\"]";
	private static final String SAVENOTIFICATIONS = "#profile-notifications-form > div.content > form > div > input";
	private static final String PROFILEVISIBILITY = "#profile-privacy-form > div.content > form > table > tbody > tr:nth-child(4) > td:nth-child(1) > label > input[type=\"radio\"]";
	private static final String SAVEVISIBILITY = "#profile-privacy-form > div.content > form > div > input";
	
	
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

//	 @Test
//	 public void test1() {
//	 System.out.println("test1");
//	
//	 driver.get("http://www.google.com");
//	 element = driver.findElement(By.name("lst-ib"));
//	 element.sendKeys("JAVA");
//	 element.submit();
//	
//	 try {
//	 Thread.sleep(10000);
//	 } catch (InterruptedException e) {
//	 e.printStackTrace();
//	 }
//	
//	 String title = driver.getTitle();
//	 assertTrue(title.contains("JAVA"));
//	
//	 }
//
//	 @Test
//	 public void test2() {
//	
//	 System.out.println("test2");
//	 driver.get("http://www.tut.by");
//	 element = driver.findElement(By.cssSelector(GENERALNEW));
//	 element.click();
//	 //System.out.println(driver.findElement(By.xpath("//*[@id=\"utm_article_block\"]/div[1]/div[1]/h1/text()")));
//	 //element = driver.findElement(By.id("article_body"));
//	
//	
//	 }
//
//	 @Test
//	 public void test3() {
//	
//	 System.out.println("test3");
//	 driver.get("http://www.quizful.net/LoginAction.registration");
//	 element = driver.findElement(By.id("login"));
//	 element.sendKeys("NastyaShintar");
//	 element = driver.findElement(By.name("registrationForm.password"));
//	 element.sendKeys("NastyaShintar12345");
//	 element = driver.findElement(By.name("registrationForm.repassword"));
//	 element.sendKeys("NastyaShintar12345");
//	 element = driver.findElement(By.name("registrationForm.email"));
//	 element.sendKeys("anastasiashintar@gmail.com");
//	 element = driver.findElement(By.id("corporate"));
//	 element.click();
//	 try {
//	 Thread.sleep(10000);
//	 } catch (InterruptedException e) {
//	 e.printStackTrace();
//	 }
//	 element = driver.findElement(By.name("ok"));
//	 element.click();
//	 }
//	
	@Test
	public void test4() {
		System.out.println("test4");
		driver.get("http://www.quizful.net/LoginAction.loginForm");
		element = driver.findElement(By.id("login"));
		element.sendKeys("Nastyshi");
		element = driver.findElement(By.name("loginForm.password"));
		element.sendKeys("NastyaShintar12345");
		element = driver.findElement(By.name("ok"));
		element.click();
		element = driver.findElement(By.cssSelector(PROFILE));
		element.click();
		element = driver.findElement(By.cssSelector(EDITPROFILE));
		element.click();
		element = driver.findElement(By.cssSelector(PROFILEPERSONALFORM));
		element.click();
		element = driver.findElement(By.name("personalForm.name"));
		element.sendKeys("Anastasia");
		element = driver.findElement(By.name("personalForm.surname"));
		element.sendKeys("Shintar");
		element = driver.findElement(By.name("personalForm.birthyear"));
		element.sendKeys("1989");
		element = driver.findElement(By.name("personalForm.company"));
		element.sendKeys("TASK");
		Select selCountryOfUser = new Select(driver.findElements(By.name("personalForm.countryId")).get(0));
		selCountryOfUser.selectByVisibleText("Беларусь");
		element = driver.findElement(By.cssSelector(ADDPHOTO));
		element.sendKeys("D:\\fhAnY2lZlxk.jpg");
		element = driver.findElement(By.name("personalForm.about"));
		element.sendKeys("I like bake cakes and cookies!");
		element = driver.findElement(By.name("personalForm.save"));
		element.click();
		element = driver.findElement(By.cssSelector(EDITPROFILE));
		element.click();
		element = driver.findElement(By.cssSelector(PROFILENOTIFICATIONFORM));
		element.click();
		element = driver.findElement(By.cssSelector(NOTIFICATIONCHECKBOX));
		element.click();
		element = driver.findElement(By.cssSelector(DELIVERCHECKBOX));
		element.click();
		element = driver.findElement(By.cssSelector(SAVENOTIFICATIONS));
		element.click();
		element = driver.findElement(By.cssSelector(EDITPROFILE));
		element.click();
		element = driver.findElement(By.cssSelector(PROFILEPRIVACYFORM));
		element.click();
		element = driver.findElement(By.cssSelector(PROFILEVISIBILITY));
		element.click();
		element = driver.findElement(By.cssSelector(SAVEVISIBILITY));
		element.click();
	} 

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
		 driver.close();
		 driver = null;
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
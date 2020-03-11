package mystoreTestng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MystorewebpageTest {
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeMethod
	public void setExtent() {
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/mytestreport.html");
		htmlreporter.config().setDocumentTitle("Automtion Testing");
		htmlreporter.config().setReportName("My store");
		htmlreporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	@Test(priority=1)
	public  void setup() throws InterruptedException {
		test=extent.createTest("setup");
		System.setProperty("webdriver.chrome.driver", "F:\\automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://automationpractice.com/index.php");
		
	}
	@Test(priority=2)
	public void verifypagetitleTest()
	{
		test=extent.createTest("verifypagetitleTest");
		String title=driver.getTitle();
		System.out.println("the page title is"+title);
		Assert.assertEquals(title, "my Store");
	}
	@Test(priority=3)
	public void verifythePhplogotest()
	{
		test=extent.createTest("verifythePhplogotest");
		boolean Logo=driver.findElement(By.xpath("//img[@class='logo img-responsive']")).isDisplayed();
		Assert.assertTrue(Logo);
		}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		}
	
		}

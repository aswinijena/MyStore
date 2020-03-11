package mystoreTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class mystoreHappypath {
	WebDriver driver;
	char size='M';
	String d="SKU : demo_3";
	
	ExtentHtmlReporter htmlreporter;
ExtentReports extent;
ExtentTest test;
@BeforeMethod
public void setExtent() {
	htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myreport.html");
	htmlreporter.config().setDocumentTitle("Automtion Testing");
	htmlreporter.config().setReportName("My store");
	htmlreporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(htmlreporter);
}
@AfterMethod
public void close()
{
	extent.flush();
}
@Test
public void mystoreflow() throws InterruptedException {
	test=extent.createTest("mystoreflow");
	System.setProperty("webdriver.chrome.driver", "F:\\automation\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(3000);
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("ak@kja.com");
	Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(4000);
		WebElement Mrradiobutton=driver.findElement(By.xpath("//label[ @class='top' ]"));
		Mrradiobutton.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("ajk");
			Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("kmls");
			Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("demo123");
		Thread.sleep(2000);
		Select date=new Select(driver.findElement(By.id("days")));
		date.selectByValue("1");
		Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByValue("3");
		Thread.sleep(2000);
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='newsletter' and @type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='optin']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("abc");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("hyd");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("second floor");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("vskp");
		Thread.sleep(3000);
        WebElement Dropdown=driver.findElement(By.xpath("//select[@name='id_state']"));
			Select Dropdownc=new Select(Dropdown);
			Dropdownc.selectByVisibleText("Alaska");
			Thread.sleep(3000);
		driver.findElement(By.name("postcode")).sendKeys("00000");
	    Thread.sleep(3000);
		
		driver.findElement(By.name("id_country")).sendKeys("United States");
		Thread.sleep(3000);
		
		driver.findElement(By.name("other")).sendKeys("jaskd");
		Thread.sleep(3000);
		driver.findElement(By.id("phone")).sendKeys("12233");
		Thread.sleep(3000);
		driver.findElement(By.id("phone_mobile")).sendKeys("8492749294");
		Thread.sleep(3000);
        driver.findElement(By.id("alias")).sendKeys("hfjhfj");
		Thread.sleep(3000);
        driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
		Thread.sleep(4000);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ak@kja.com");
	     Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("demo123");
	      Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
	     Thread.sleep(2000);
	String s=driver.findElement(By.xpath("//h1[text()='My account']")).getText();
    Assert.assertEquals("MY ACCOUNT", s);
	System.out.println("My account is displayed");
	Thread.sleep(3000);
        WebElement d=driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a"));
	Actions a=new Actions(driver);
	a.moveToElement(d).click().build().perform();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("#categories_block_left > div > ul > li:nth-child(1) > a")).click();
	System.out.println("the size is "+size);
	Thread.sleep(4000);
            driver.findElement(By.xpath("//a[text()='"+this.size+"']")).click();
	Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
	Thread.sleep(9000);
            driver.switchTo().frame(0);
	driver.findElement(By.cssSelector("#add_to_cart > button > span")).click();
        Thread.sleep(4000);
	/*driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
	Thread.sleep(4000);
            driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();*/
	/*String m=driver.findElement(By.xpath("//small[@class='cart_ref']")).getText();
        Assert.assertEquals('d', m);
	String c=driver.findElement(By.xpath("//a[@title='View my shopping cart']")).getText();
	Assert.assertEquals("Cart 1 Product", c);
		Thread.sleep(4000);*/
        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("uniform-addressesAreEquals")).click();
	/*driver.findElement(By.xpath("//span[text()='Add a new address']")).click();*/
	driver.findElement(By.name("message")).sendKeys("ok");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("uniform-cgv")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("processCarrier")).click();
	Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
	


	





			
}

		
}

package mystoreTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MystoreRegistrationPageTest {
	WebDriver driver;
	@BeforeClass
	public void setupTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}
	@Test(priority=1)
	public void emailaddressTest() throws InterruptedException
	{
driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("aj5k@kja.com");
Thread.sleep(3000);
}
	@Test(priority=2)
	public void creataccountTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(4000);
	}
	@Test(priority=3)
	public void titleTest() throws InterruptedException
	{
		WebElement Mrradiobutton=driver.findElement(By.xpath("//label[ @class='top' ]"));
	Mrradiobutton.click();
	Thread.sleep(4000);
		
	}
	@Test(priority=4)
	public void firstnameTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("ajk");
		Thread.sleep(4000);
	}
	@Test(priority=5)
	public void lastnameTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("kmls");
		Thread.sleep(3000);
	}
	@Test(priority=7)
	public void passwordTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("demo123");
		Thread.sleep(3000);
	}
	
	@Test(priority=8)
	public void dobTest() throws InterruptedException {
		driver.findElement(By.xpath("//select[@id='days' and @name='days']")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='months' and @name='months']")).sendKeys("April");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='years' and @name='years']")).sendKeys("1999");
		Thread.sleep(3000);
	
	}
	@Test(priority=9)
	public void checkboxTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='newsletter' and @type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='optin']")).click();
		Thread.sleep(3000);

	}
	@Test(priority=10)
	public void comanyNameTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("abc");
		Thread.sleep(3000);

	}
	@Test(priority=11)
	public void addressTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("hyd");
		Thread.sleep(3000);

	}
	@Test(priority=12)
	public void address2Test() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("second floor");
		Thread.sleep(3000);

	}
	@Test(priority=13)
	public void  cityTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("vskp");
		Thread.sleep(3000);

	}
	@Test(priority=14)
	public void dropdownTest() throws InterruptedException {
		WebElement Dropdown=driver.findElement(By.xpath("//select[@name='id_state']"));
		Select Dropdownc=new Select(Dropdown);
		Dropdownc.selectByVisibleText("Alaska");
		Thread.sleep(3000);
		}
	@Test(priority=15)
	public void postcodTest() throws InterruptedException
	{
		driver.findElement(By.name("postcode")).sendKeys("00000");
		Thread.sleep(3000);
	}
	/*@Test(priority=16)
	public void countryTset() throws InterruptedException {
	driver.findElement(By.name("id_country")).sendKeys("United States");
	Thread.sleep(3000);
	}*/
	@Test(priority=17)
	public void adTest() throws InterruptedException {
		driver.findElement(By.name("other")).sendKeys("jaskd");
		Thread.sleep(3000);
	}
	@Test(priority=18)
	public void homeTest() throws InterruptedException {
		driver.findElement(By.id("phone")).sendKeys("12233");
		Thread.sleep(3000);
	}
	@Test(priority=19)
	public void phonTest() throws InterruptedException {
		driver.findElement(By.id("phone_mobile")).sendKeys("8492749294");
		Thread.sleep(3000);
	}
	@Test(priority=20)
	public void  assignTest() throws InterruptedException {
		driver.findElement(By.id("alias")).sendKeys("hfjhfj");
		Thread.sleep(3000);
	}
	@Test(priority=21)
	public void registerTest() throws InterruptedException {
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(3000);
		

	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}

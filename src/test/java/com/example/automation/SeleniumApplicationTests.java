package com.example.automation;


import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SeleniumApplicationTests {

	WebDriver driver;

	SoftAssert softassert = new SoftAssert();
	String emailXPath = "//input[@type='text' and @id='email']";
	String dobXPath = "//input[@type='text' and @id='dob']";
	String mobileXPath = "//input[@type='number' and @id='mobile']";

	@BeforeClass
	public void setUp() throws InterruptedException {
		// Set up the WebDriver instance
		System.setProperty("webdriver.chrome.driver", "/home/kumar/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(1000 * 4);
	}

	@AfterClass
	public void tearDown() {
		// Close the WebDriver instance
		driver.quit();
	}


	@Test
	public void EmailTestBy_Valid_Input() throws InterruptedException {
		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("krshubham2000@gmail.com");

		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("1990-02-04");
		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is Passed");
		Thread.sleep(2000);
	}

	@Test
	public void DobTestBy_Valid_InputFormat() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(2000);
		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("1990-02-04");

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("krshubham2000@gmail.com");
		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);


		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is passed");
	}

	@Test
	public void MobileNoBy_Valid_InputFormat() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(2000);

		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("krshubham2000@gmail.com");
		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("1990-02-04");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);

		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is passed");
	}


	@Test
	public void EmailTestBy_Invalid_Input_As_Integer() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(4000);

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("123456");

		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("1990-02-04");
		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);

		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is failed");
	}
	@Test(priority = 5)
	public void EmailTestBy_Invalid_Input_As_StringOnly_without_AtTheRate() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(4000);

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("shubham");

		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("04/02/2000");
		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);


		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is failed");
	}

	@Test(priority = 6)
	public void EmailTestBy_Valid_Input_As_Wrong_Email() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(4000);

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("shubham@");

		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("04/02/2000");
		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);


		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is passed");
	}



	@Test
	public void DobTestBy_InValid_InputFormat_As_String() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(4000);

		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("xyz");

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("krshubham2000@gmail.com");
		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");


		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);


		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is failed");

	}

	@Test
	public void DobTestBy_Invalid_InputFormat_As_Integer() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(4000);

		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("1233-55");

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("krshubham2000@gmail.com");
		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("9955698234");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);


		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is failed");
	}

	@Test
	public void MobileNoBy_Invalid_InputFormat() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(4000);

		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("0000000000");

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("krshubham2000@gmail.com");
		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("04/02/2000");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);

		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is failed");
	}

	@Test
	public void MobileNoBy_Invalid_InputFormat_As_String() throws InterruptedException {
		driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");
		Thread.sleep(4000);

		WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
		mobileField.sendKeys("xyz");

		WebElement emailField = driver.findElement(By.xpath(emailXPath));
		emailField.sendKeys("krshubham2000@gmail.com");
		WebElement dobField = driver.findElement(By.xpath(dobXPath));
		dobField.sendKeys("04/02/2000");

		driver.findElement(By.xpath("//*[@id=\"Agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"automationtestform\"]/div[4]/button[1]")).sendKeys(Keys.ENTER);


		WebElement SubmitFormIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/h3"));
		softassert.assertEquals(true, SubmitFormIcon.isDisplayed());
		softassert.assertAll();
		System.out.println("The test case is failed");
	}
}

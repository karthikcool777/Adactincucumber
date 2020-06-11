
	package com.base;

	import java.io.File;
	import java.io.IOException;
	import java.util.Set;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Baseclass {
		public static WebDriver driver;
		public static Actions a;
		public  static Select s;
		public static Alert b;

		public static void launchchrome() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\Cucumberday1\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		public static void launchEdge() {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\seleniumbatch\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		public static void launchFirefox() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\seleniumbatch\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		public static void Website(String url) {

			driver.get(url);
			driver.manage().window().maximize();
		}

		public static void txtEntry(WebElement e, String value) {
			e.sendKeys(value);
		}

		public static void refresh() {
			driver.navigate().refresh();
		}

		public static void buttonclick(WebElement b) {
			b.click();
		}

		public static void mouseHover(WebElement mou) {
			a = new Actions(driver);
			a.moveToElement(mou).perform();
		}
		
		public static void doubleClick() 
		{
			a= new Actions(driver);
			a.doubleClick().perform();
		}

		public static void dropdown(WebElement drp, String txt) {
			s = new Select(drp);
			s.selectByVisibleText(txt);
		}
		
		public static void scrollup(WebElement e) 
		{
			
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView(false);",e);
		}
		
		public static void scrolldown(WebElement e) 
		{
			
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView(true);",e);
		}
		


		public static void screenShot() throws IOException {
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dst = new File("C:\\Users\\DELL\\eclipse-workspace\\seleniumbatch\\screen//pic.png");
			

		}
		
		public static void getText(WebElement e) 
		{
			String text = e.getText();
			System.out.println(text);
		}

		public static void getAttribute(WebElement e, String ref) 
		{
			String atr = e.getAttribute(ref);
			System.out.println(atr);
		}
		
		public static void alerts() 
		{
			b = driver.switchTo().alert();
			b.dismiss();
			
		}
		
		public static void windowHandle() 
		{
			String parId = driver.getWindowHandle();
			System.out.println(parId);
			
			Set<String> s = driver.getWindowHandles();
			for (String x : s) {
				if(!(x.equals(parId))) 
				{
					driver.switchTo().window(x);
				}
				
			}
			
			
		}
		
		public static void frame(WebElement e) 
		{
			driver.switchTo().frame(e);
			
		}
		
		
public static void closebrowser() {
	driver.quit();

}


	}



package stepdefinetion;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass{

	@Before(order=1)
	public void date() {
		System.out.println(new Date());
	}
	
	@Before(order=2)
	public void before() {
		launchchrome();
		   Website("http://adactinhotelapp.com/index.php");
	}

	@After(order=1)
	public void close() {
	closebrowser();
	}
	
	@After(order=2)
	public void screensc(Scenario sc) 
	{
		if(sc.isFailed()) 
		{
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] sh = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(sh, "image/png");
		}
	}
	
}

package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebdriverManager() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		
		if(driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
	    driver=new ChromeDriver();
			}
			
			else if(prop.getProperty("browser").equalsIgnoreCase("Firefox"))
			{
				//Write Firefox driver
			}	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 driver.get(url);	
		}
		
		return driver;
	}
	

}

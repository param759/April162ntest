package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Browserclass {
public WebDriver driver;
public Properties prep;
	public WebDriver startbrowser() throws IOException
	{
		//FileInputStream fis=new FileInputStream("C:\\Users\\15199\\eclipse-workspace\\April14\\src\\main\\java\\Resources\\work.properties");
		
		FileInputStream fos=new FileInputStream("C:\\Users\\15199\\eclipse-workspace\\April14\\src\\main\\java\\Resources\\work.properties");
		 prep=new Properties();
	prep.load(fos);
	
	String browsername=prep.getProperty("browser");
	//String browsername=System.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome"))
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Desktop\\latestchrome\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15199\\Desktop\\latestchrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 
	}
	return driver;
	
	}
}

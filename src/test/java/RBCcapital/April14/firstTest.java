package RBCcapital.April14;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagework.Bamkingpage;
import Pagework.Homepage;
import Resources.Browserclass;
import Resources.Windowswitch;

public class firstTest extends Browserclass {
	public WebDriver driver;
	public String Parentid;
	public String childid;
@BeforeTest
public void invokebrowser() throws IOException
{
	driver=startbrowser();
	driver.get(prep.getProperty("URL"));

}

@Test
public void dropdown()
{
	Homepage hp=new Homepage(driver);
String PS=driver.getPageSource();
if(PS.contains("Accept all cookies")) {
	hp.acceptcookies().click();
}
	Actions am=new Actions(driver);
	am.moveToElement(hp.hoverrbcsites()).build().perform();
	
	hp.insuranceoption().click();
	/*Set<String> ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	 Parentid=it.next();
	 childid=it.next();	
	driver.switchTo().window(childid);*/
	
}

@Test
public void enterword()
{
	Windowswitch toll=new Windowswitch(driver);
	toll.windows();
	Bamkingpage bank=new Bamkingpage(driver);
	//bank.finlocation().click();
	bank.loc().sendKeys("M9W4E7");
	bank.insurance().click();
	bank.enter().sendKeys("help");
//	bank.enter().sendKeys(Keys.ENTER);
}


}

package Resources;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Windowswitch {
public WebDriver driver;
public String Parentid;
public String childid;
public Windowswitch(WebDriver driver)
{
	this.driver=driver;
}



public void windows()
{
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	 Parentid=it.next();
	 childid=it.next();	
	driver.switchTo().window(childid);
}
}

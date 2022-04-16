package Pagework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Waiting;

public class Homepage {
public WebDriver driver;
public Waiting wg;
 public Homepage(WebDriver Pdriver)
 {
	 this.driver=Pdriver;
	  wg=new Waiting(driver);
 }
 
By accept=By.xpath("//a[contains(text(),'Accept all cookies')]");
By RBCsites=By.cssSelector("li[class=\"other-sites dropdown\"]");
By Banking=By.xpath("//a[contains(text(),'Insurance')]");

private WebElement cookies;
private WebElement hover;
private WebElement Bank;

public WebElement acceptcookies()
{
	
	WebElement cookies= driver.findElement(accept);
	wg.waittime(cookies, 10);
	return cookies;
}

public WebElement hoverrbcsites()
{
	WebElement firsthover=driver.findElement(RBCsites);
	wg.waittime(firsthover, 10);
	return firsthover;
}

public WebElement insuranceoption()
{
	WebElement Bank=driver.findElement(Banking);
	wg.waittime(Bank, 10);
	return Bank;
}
}


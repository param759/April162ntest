package Pagework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Waiting;

public class Bamkingpage {
public WebDriver driver;
public Waiting wg;
public WebElement loc;

public Bamkingpage(WebDriver driver)
{
	this.driver=driver;
	Waiting wg=new Waiting(driver);
}

By place=By.id("//input[@id='q']");
By Busi=By.xpath("//a[@id='header-business-banking']");
By ins=By.xpath("//span[contains(text(),'Search RBC...')]");
By search=By.cssSelector("#header-search");
By addrss=By.xpath("//input[@id='locatorQuery']");

public WebElement finlocation()
{
	
	WebElement loc=driver.findElement(Busi);
	return loc;
	
}
public WebElement Enter()
{
	
	WebElement post=driver.findElement(place);
	wg.waittime(post, 10);
	return post;
	
}
public WebElement insurance()
{
	WebElement hos=driver.findElement(ins);
	
	return hos;
	
}
public WebElement enter()
{
	return driver.findElement(search);
}

public WebElement loc()
{
	return driver.findElement(addrss);
}
}

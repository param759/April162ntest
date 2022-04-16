package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting {
public WebDriver driver;
public Waiting(WebDriver driver)
{
	this.driver=driver;
}

public void waittime(WebElement element,long Timeoutinseconds)
{
	WebDriverWait home=new WebDriverWait(driver, Timeoutinseconds);
	home.until(ExpectedConditions.visibilityOf(element));
}
}

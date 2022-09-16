package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By extractedPrdNameOnCheckout=By.cssSelector("p.product-name");
	private By applyButtonCheckout=By.cssSelector("button.promoBtn");
	private By placeOredrButtonCheckout=By.xpath("//button[text()='Place Order']");
	
	public String getextractedPrdNameOnCheckout()
	{
		return driver.findElement(extractedPrdNameOnCheckout).getText();
	}
	
	public boolean verifyApplyButtonCheckout()
	{
		return driver.findElement(applyButtonCheckout).isDisplayed();
	}
	
	public boolean verifyPlaceOredrButtonCheckout()
	{
		return driver.findElement(placeOredrButtonCheckout).isDisplayed();
	}

	
	
	

}

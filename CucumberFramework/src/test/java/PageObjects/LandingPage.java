package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	private By search=By.xpath("//input[@type='search']");
	private By productName=By.cssSelector("h4.product-name");
	private By topDealslink= By.linkText("Top Deals");
	private By plusButtonToCart=By.cssSelector("a.increment");
	private By productAddToCart=By.xpath("//button[text()='ADD TO CART']");
	private By cartIcon=By.xpath("//img[@alt='Cart']");
	private By cartProceedCheckout=By.xpath("//button[@type='button']");
	
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(topDealslink).click();
	}
	
	public void selectQuantity(String quantity)
	{
		int i=Integer.parseInt(quantity);
		while((i-1)>0)
		{
		driver.findElement(plusButtonToCart).click();
		i--;
		}
	}
	
	public void selectProductAddToCart()
	{
		driver.findElement(productAddToCart).click();
	}
	
	public void selectCartIcon()
	{
		driver.findElement(cartIcon).click();
	}
	
	public void selectcartProceedCheckout()
	{
		driver.findElement(cartProceedCheckout).click();
	}
	
	public String verifyLandingPage()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	

}

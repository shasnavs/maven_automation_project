package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorenvyPage {
	WebDriver driver;
	//@FindBy(xpath = "//*[@id=\"log_in\"]")
	WebElement signin;
	@FindBy(xpath = "//*[@id=\"user_email\"]")
	WebElement email;
	@FindBy(xpath = "//*[@id=\"user_password\"]")
	WebElement pass;
	@FindBy(xpath = "//*[@id=\"login_submit\"]")
	WebElement loginbttn;
	@FindBy(xpath = "//*[@id=\"post-trending-feed\"]/li[3]/a")
	WebElement jwellery;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[4]/div/div[1]/div[1]/ul/li[3]/ul/li[3]/a")
	WebElement mens;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div/div")
	WebElement sortby;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div/div/div/ul/li[1]/a")
	WebElement sortbynew;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[4]/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/a")
	WebElement firstproduct;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div[1]/a[1]")
	WebElement addtowish;
	@FindBy(xpath = "//*[@id=\"header-keyword-search\"]")
	WebElement search;
	@FindBy(xpath = "//*[@id=\"header\"]/div[8]/form/button/i")
	WebElement srchbutton;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[4]/div/div[1]/div[2]/div/div[8]/div[3]/div[1]/a")
	WebElement product;
	@FindBy(xpath = "//*[@id=\"add-to-cart-form\"]/input[4]")
	WebElement addtocart;
	@FindBy(xpath = "//*[@id=\"header\"]/div[1]/a/span")
	WebElement viewcart;
	
	public StorenvyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//public void signin()
	{
		//signin.click();
	}
	public void setvalues(String UN,String PASS)
	{
		email.sendKeys(UN);
		pass.sendKeys(PASS);
	}
	public void login()
	{
		loginbttn.click();
	}
	public void jwellerymenu()
	{
		jwellery.click();
	}
	public void mens()
	{
		mens.click();
	}
	public void sortby()
	{
		sortby.click();
	}
	public void sortbynewest()
	{
		sortbynew.click();
	}
	public void firstproduct()
	{
		firstproduct.click();
	}
	public void addtowish()
	{
		addtowish.click();
	}
	public void searchvalues(String s)
	{
		search.sendKeys(s);
	}
	public void searchbttn()
	{
		srchbutton.click();
	}
	public void product()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 3000)");
		product.click();
	}
	public void addtocart()
	{
		addtocart.click();
	}
	public void viewcart()
	{
		viewcart.click();
	}
}

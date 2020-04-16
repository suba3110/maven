package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class homePage {
	WebDriver driver;
	public homePage(WebDriver d) {
		driver=d;
	}
	@FindBy(xpath="//*[@id=\'center_column\']/ul/li/a") WebElement home;
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a") WebElement dress;
	@FindBy(xpath="//*[@id=\'center_column\']/ul/li[2]/div/div[1]/div/a[1]/img") WebElement image;
	@FindBy(xpath="//*[@id=\'center_column\']/ul/li[2]/div/div[2]") WebElement display;
	//@FindBy(xpath="//*[@id=\'center_column\']/ul/li[2]/div")WebElement image1;
	@FindBy(xpath="//*[@id=\'center_column\']/ul/li[2]/div/div[2]/div[2]/a[1]") WebElement cartDisplay;
	@FindBy(xpath="//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a") WebElement proceed;
	@FindBy(xpath="//*[@id=\'center_column\']/p[2]/a[1]") WebElement checkOut;
	@FindBy(id="addressesAreEquals") WebElement address;
	@FindBy(name="processAddress") WebElement proceed1;
	@FindBy(name="processCarrier") WebElement proceed2;
	@FindBy(xpath="//*[@id='order']/div[2]/div/div/div/div") WebElement alertMsg;
	@FindBy(xpath="//*[@id=\'order\']/div[2]/div/div/a") WebElement close;
	@FindBy(id="cgv") WebElement agreement;
	@FindBy(xpath="//*[@id=\'HOOK_PAYMENT\']/div[1]/div/p/a")WebElement payment;
	@FindBy(xpath="//*[@id=\'center_column\']/form/div/h3") WebElement bankWire;
	@FindBy(xpath="//*[@id=\'cart_navigation\']/button") WebElement confirm;
	@FindBy(xpath="//*[@id=\'center_column\']/p/a") WebElement backToOrder;
	@FindBy(xpath="//*[@id=\'block-history\']") WebElement table;
	
public void Input() {
	try {
		home.click();
		dress.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void chart()throws Exception {
	try {
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(image).build().perform();
		Thread.sleep(2000);
		Assert.assertTrue((display).isDisplayed());
		//image1.click();
		Thread.sleep(9000);
		cartDisplay.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw e;
	}
}
public void Input1() {
	
	try {
		Thread.sleep(3000);
		proceed.click();
		Thread.sleep(2000);
		checkOut.click();
		Assert.assertTrue(address.isEnabled());
		proceed1.click();
		proceed2.click();
		Thread.sleep(3000);
		Assert.assertTrue(alertMsg.isDisplayed());
		close.click();
		agreement.click();
		proceed2.click();
		payment.click();
		Assert.assertTrue(bankWire.isDisplayed());
		confirm.click();
		backToOrder.click();
		Assert.assertTrue(table.isDisplayed());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}

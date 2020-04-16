package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Signin {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a") WebElement signin;
	@FindBy(id="email_create") WebElement email;
	@FindBy(id="SubmitCreate") WebElement createButton;
	
	public Signin(WebDriver d) {
		this.driver=d;	
	}
	
	public void SigninWord(String mail) {
		try {
			signin.click();
			email.sendKeys(mail);
			createButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
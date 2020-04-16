package pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import maven.browser;


public class main {
	WebDriver driver;
	Logger log=LogManager.getLogger(main.class);
	
	
	@BeforeMethod
	 @Parameters({"browser","url"})
	 public void setup(String browser,String url) {
		browser obj=new browser();
	  obj.initialize(browser, url);
	  driver=obj.getDriver();
	  driver.manage().window().maximize();
	  }
	
	@Test
	public void mainMethod() {
		try {
			log.info("Execution starts");
			Signin sign=PageFactory.initElements(driver,Signin.class);
			sign.SigninWord("queen@gmail.com");
			log.info("Signing to a page");
			Thread.sleep(3000);
			authentication atn=PageFactory.initElements(driver,authentication.class);
			atn.authenticationWord("suba","shini","minion5@gmail.com","Qw@#4");
			atn.dayDropDown();
			atn.monthDropDown();
			atn.yearDropDown();
			atn.authenticationWord1();
			atn.stateDropDown();
			atn.postalCode();
			atn.countryDropDown();
			atn.authenticationInput();
			log.info("Account Registration is done ");
			atn.validate();
			homePage home=PageFactory.initElements(driver,homePage.class);
			home.Input();
			home.chart();
			home.Input1();
			ScreenShot screen=PageFactory.initElements(driver,ScreenShot.class);
			screen.captureScreenShot();
			log.info("Taken screenshot");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@AfterMethod
	 public void teardown() {
		 driver.quit();
	 }


}

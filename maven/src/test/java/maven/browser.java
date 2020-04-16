package maven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browser {
	public WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	
	  
	  public void initialize(int browser, String url) {
		 switch(browser) {
		 case 1:
		      System.setProperty("webdriver.chrome.driver","C:\\Users\\Suba\\Downloads\\driver\\chromedriver\\chromedriver.exe");
		      driver=new ChromeDriver();
		      driver.get(url);
		      break;
		 case 2:
			  driver=new InternetExplorerDriver();
		      driver.get(url);
		      break;
		 default:
			  System.setProperty("webdriver.ie.driver","C:\\Users\\Suba\\Downloads\\driver\\Ie\\IEDriverServer.exe");
			  driver=new InternetExplorerDriver();
		      driver.get(url);
		      
		 }    
	  }
		 
		 

}
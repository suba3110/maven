package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	WebDriver driver;
	public ScreenShot(WebDriver driver) {
		this.driver=driver;
	}
	public void captureScreenShot() {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("C:\\Users\\Suba\\Documents\\maven_screenshot\\maven.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

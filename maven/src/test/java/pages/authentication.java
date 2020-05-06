package pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class authentication{
	WebDriver driver;
	
	
	@FindBy(id="id_gender1") WebElement gender;
	@FindBy(name="customer_firstname") WebElement fName;
	@FindBy(id="customer_lastname") WebElement lName;
	@FindBy(name="email") WebElement email;
	@FindBy(name="passwd") WebElement passwrd;
	@FindBy(id="days") WebElement days;
	@FindBy(id="months") WebElement month;
	@FindBy(id="years") WebElement year;
	@FindBy(name="optin") WebElement option;
	@FindBy(id="company") WebElement company;

	
    @FindBy(name="address1") WebElement address;
    @FindBy(name="address2") WebElement address1;
    @FindBy(name="city") WebElement city1;
    
    @FindBy(id="id_state") WebElement state;
    @FindBy(id="postcode") WebElement post;
    @FindBy(id="id_country")WebElement country;
    @FindBy(id="other")WebElement other;
    @FindBy(id="phone")WebElement phone;
    @FindBy(id="phone_mobile")WebElement mobile;
    @FindBy(id="alias")WebElement alias;
    @FindBy(id="submitAccount")WebElement register;
    public authentication(WebDriver driver) {
		this.driver=driver;
	}
	
	public void authenticationWord(String fname,String lname,String mail,String pswd) throws Exception {
		try {
			gender.click();
			fName.sendKeys(fname);
			lName.sendKeys(lname);
			email.clear();
			email.sendKeys(mail);
			passwrd.sendKeys(pswd);
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public void dayDropDown() {
		Select drop=new Select(days);
		drop.selectByIndex(10);
		}
	
	public void monthDropDown() {
		Select drop=new Select(month);
		drop.selectByIndex(10);
		}
	public void yearDropDown() {
		Select drop=new Select(year);
		drop.selectByIndex(4);
		}
	public void authenticationWord1() throws Exception {
		try{
			option.click();
			company.sendKeys("tyuvc");
			File filepath=new File("C:\\Users\\Suba\\Documents\\Book1.xlsx");
		    FileInputStream inputstream=new FileInputStream(filepath);
		    XSSFWorkbook book=new XSSFWorkbook(inputstream);
		    XSSFSheet sheet=book.getSheet("Sheet1");
		    
		    String addres=sheet.getRow(1).getCell(0).getStringCellValue();
		    String addres1=sheet.getRow(1).getCell(1).getStringCellValue();
		    String city=sheet.getRow(1).getCell(2).getStringCellValue();
		    
			address.sendKeys(addres);
			address1.sendKeys(addres1);
			city1.sendKeys(city);
			
			book.close();
			
		} catch (Exception e) {
			throw e;
		}
	}
	public void stateDropDown() {
		Select stateobj=new Select(state);
		stateobj.selectByIndex(5);
	}
		
		public void postalCode() {
			post.sendKeys(String.valueOf(76895));
	}
		public void countryDropDown() {
			Select countryobj=new Select(country);
			countryobj.selectByIndex(1);
		}
		public void authenticationInput() {
			try {
				other.sendKeys(String.valueOf(9867546329l));
				phone.sendKeys(String.valueOf(7865498043l));
				mobile.sendKeys(String.valueOf(8976564536l));
				alias.clear();
				alias.sendKeys("Home");
				register.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		public void validate() {
			String title=driver.getTitle();
			String expectedtitle="My account - My Store";
			Assert.assertEquals(title,expectedtitle);			
		}
		
}

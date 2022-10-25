package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Flight_and_Hotel {

	public POM_Flight_and_Hotel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='eFQ30H'])[9]")
	private WebElement CliCk_Flight;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement Source;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Destination;

	@FindBy(xpath = "((//div[@class='KxNUF-'])[25]")
	private WebElement Date;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement Traveller;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement Click_Button;

	@FindBy(xpath = "(//div[@class='_1XFPmK'])[1]")
	private WebElement One_way;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement Search;

	public void Source_City(String City_NAme) {
		Source.sendKeys(City_NAme);
	}

	public void Destination_City(String Dest_City_Name) {
		Destination.sendKeys(Dest_City_Name);
	}

	public void No_Traveller(String Travellers) {
		Traveller.click();
	}

	public void Date1(String hb) {
		Date.click();
	}

	public void Type_of_Journey() {
		One_way.isSelected();
	}

	public void select_one_way() {
		One_way.click();
	}

	public void Click_Search() {
		Search.click();
	}

	public void Clear_Dest() {
		Destination.clear();
	}

	public void Clear_Source() {
		Source.clear();
	}
	public void Cl_Flight() {
		CliCk_Flight.click();
	}
}


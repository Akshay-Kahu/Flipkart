package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_utility_package.Base_Class;

public class TOP_Offer {
public static WebDriverWait dynamic_wait;
	
	public TOP_Offer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Get access to your Orders, Wishlist and Recommendations']")
	private WebElement Hidden_division_Pop_up_text;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement Hidden_division_Pop_up_close;
	
	@FindBy(xpath = "//h2[text()='Top Offers']")
	private WebElement Top_Offer_text;

	@FindBy(xpath = "(//a[text()='VIEW ALL'])[1]")
	private WebElement View_All;

	@FindBy(xpath = "//div[text()='Top Offers']")
	private WebElement Top_offer_check;

	@FindBy(xpath = "//div//div[text()='SanDisk']")
	private WebElement SanDisk;

	@FindBy(xpath = "//div//div[text()='Water Bottles']")
	private WebElement Water_Bottle;

	@FindBy(xpath = "//div//div[text()='Apple iPads']")
	private WebElement Apple_Ipads;

	@FindBy(xpath = "//div//div[text()='Office Supplies']")
	private WebElement Office_Supplies;

	@FindBy(xpath = "//div//div[text()='Pens']")
	private WebElement Pens;

	@FindBy(xpath = "//div//div[text()='HP']")
	private WebElement HP_Mouse;

	@FindBy(xpath = "//div//div[text()='Lunch Boxes']")
	private WebElement Lunch_Box;

	@FindBy(xpath = "//div//div[text()='Soundbars and Home Theatres']")
	private WebElement Home_Theature;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/div[2]/div[10]/a/div[2]")
	private WebElement Home_Temples;//div//div[text()='Home Temples']
	
	@FindBy(xpath = "//div//div[text()='Musical Toys']")
	private WebElement Musical_Toys;

	@FindBy(xpath = "//div//div[text()='Puzzle']")
	private WebElement Puzzle;

	@FindBy(xpath = "//div//div[text()='Learning toys']")
	private WebElement Learning_Toys;

	
	public String Pop_up_text() {
		Base_Class.Explicite_wait(Hidden_division_Pop_up_text);
		return Hidden_division_Pop_up_text.getText();
	}
	
	public void Pop_Up_close() {
		Base_Class.Explicite_wait(Hidden_division_Pop_up_close);
		Hidden_division_Pop_up_close.click();
	}
	
	public String top_offer_text() {
		Base_Class.Explicite_wait(Top_Offer_text);
		return Top_Offer_text.getText();
	}

	public void view_all_offer() {
		Base_Class.Explicite_wait(View_All);
		View_All.click();
	}

	public String top_offer_check() {
		Base_Class.Explicite_wait(Top_offer_check);
		return Top_offer_check.getText();
	}

	public String sandisk() {
		Base_Class.Explicite_wait(SanDisk);
		return SanDisk.getText();
	}

	public String water_bottle() {
		Base_Class.Explicite_wait(Water_Bottle);
		return Water_Bottle.getText();
	}

	public String apple_ipads() {
		Base_Class.Explicite_wait(Apple_Ipads);
		return Apple_Ipads.getText();
	}

	public String office_supplies() {
		Base_Class.Explicite_wait(Office_Supplies);
		return Office_Supplies.getText();
	}

	public String pens() {
		Base_Class.Explicite_wait(Pens);
		return Pens.getText();
	}

	public String hp_mouse() {
		Base_Class.Explicite_wait(HP_Mouse);
		return HP_Mouse.getText();
	}

	public String Lunch_Box() {
		Base_Class.Explicite_wait(Lunch_Box);
		return Lunch_Box.getText();
	}

	public String home_theature() {
		Base_Class.Explicite_wait(Home_Theature);
		return Home_Theature.getText();
	}

	public String home_temples() {
		Base_Class.Explicite_wait(Home_Temples);
		return Home_Temples.getText();
	}

	public String musical_toys() {
		Base_Class.Explicite_wait(Musical_Toys);
		return Musical_Toys.getText();
	}

	public String puzzle() {
		Base_Class.Explicite_wait(Puzzle);
		return Puzzle.getText();
	}

	public String learning_toys() {
		Base_Class.Explicite_wait(Learning_Toys);
		return Learning_Toys.getText();	
	}
	
}

package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Grocery {

	public POM_Grocery(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Grocery']")
	private WebElement Grocery;

	@FindBy(xpath = "//input[@title='Search grocery products'])")
	private WebElement Click_grocery;

	@FindBy(xpath = "//input[@title='Search grocery products'])")
	private WebElement search_grocery;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement click_button;

	@FindBy(xpath = "//h2[text()='Grocery Prices In India']")
	private WebElement Grocery_Prices;

	@FindBy(xpath = "//h1[text()='Flipkart Grocery: Your New Go-to Online Grocery Store']")
	private WebElement Flipkart_Grocery;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[1]")
	private WebElement latest_grocery_1;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[2]")
	private WebElement latest_grocery_2;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[3]")
	private WebElement latest_grocery_3;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[4]")
	private WebElement latest_grocery_4;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[5]")
	private WebElement latest_grocery_5;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[6]")
	private WebElement latest_grocery_6;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[7]")
	private WebElement latest_grocery_7;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[8]")
	private WebElement latest_grocery_8;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[9]")
	private WebElement latest_grocery_9;

	@FindBy(xpath = "(//li[@class='_1pbqS9'])[10]")
	private WebElement latest_grocery_10;

	public void Grocery() {
		Grocery.click();
	}

	public void click_grocery(String grocery) {
		Click_grocery.click();
	}

	public void search_grocery(String handwash) {
		search_grocery.sendKeys(handwash);
	}

	public void Clear_search_grocery() {
		search_grocery.clear();
	}

	public void click_button() {
		click_button.click();
	}

	public String Grocery_text_validation() {
		return Grocery_Prices.getText();

	}

	public String Flipkart_Grocery_text() {
		return Flipkart_Grocery.getText();

	}

	public String Grocery_product_1() {
		return latest_grocery_1.getText();
	}

	public String Grocery_product_2() {
		return latest_grocery_2.getText();
	}

	public String Grocery_product_3() {
		return latest_grocery_3.getText();
	}

	public String Grocery_product_4() {
		return latest_grocery_4.getText();
	}

	public String Grocery_product_5() {
		return latest_grocery_5.getText();
	}

	public String Grocery_product_6() {
		return latest_grocery_6.getText();
	}

	public String Grocery_product_7() {
		return latest_grocery_7.getText();
	}

	public String Grocery_product_8() {
		return latest_grocery_8.getText();
	}

	public String Grocery_product_9() {
		return latest_grocery_9.getText();
	}

	public String Grocery_product_10() {
		return latest_grocery_10.getText();

	}
}

package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class3_Grocery {
	
	public POM_Class3_Grocery(WebDriver driver) {
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
	
	@FindBy(xpath="//h2[text()='Grocery Prices In India']")
	private WebElement Grocery_Prices;
	
	@FindBy(xpath="//h1[text()='Flipkart Grocery: Your New Go-to Online Grocery Store']")
	private WebElement Flipkart_Grocery;
   
	@FindBy(xpath="(//li[@class='_1pbqS9'])[1]")
	private WebElement latest_grocery_1;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[2]")
	private WebElement latest_grocery_2;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[3]")
	private WebElement latest_grocery_3;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[4]")
	private WebElement latest_grocery_4;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[5]")
	private WebElement latest_grocery_5;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[6]")
	private WebElement latest_grocery_6;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[7]")
	private WebElement latest_grocery_7;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[8]")
	private WebElement latest_grocery_8;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[9]")
	private WebElement latest_grocery_9;
	
	@FindBy(xpath="(//li[@class='_1pbqS9'])[10]")
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
	
    public void Grocery_text_validation() {
    	 Grocery_Prices.getText();
    
    }
	public void Flipkart_Grocery_text() {
		 Flipkart_Grocery.getText();
	
	}
	public void Grocery_product_1() {
		latest_grocery_1.getText();
	}
	public void Grocery_product_2() {
		latest_grocery_2.getText();
	}
	public void Grocery_product_3() {
		latest_grocery_3.getText();
	}
	public void Grocery_product_4() {
		latest_grocery_4.getText();
	}
	public void Grocery_product_5() {
		latest_grocery_5.getText();
	}
	public void Grocery_product_6() {
		latest_grocery_6.getText();
	}
	public void Grocery_product_7() {
		latest_grocery_7.getText();
	}
	public void Grocery_product_8() {
		latest_grocery_8.getText();
	}
	public void Grocery_product_9() {
		latest_grocery_9.getText();
	}
	
	public void Grocery_product_10() {
		latest_grocery_10.getText();
	
		}
}

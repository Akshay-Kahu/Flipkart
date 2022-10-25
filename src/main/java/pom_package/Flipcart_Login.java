package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipcart_Login {
	
	public Flipcart_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Login_button;
	
	@FindBy(xpath = "//span[contains(text(),'your Orders, Wishlist ')]")
	private WebElement Welcome_Text;
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement Popup;

	public void Enter_Email_input(String email) {
		Email.sendKeys(email);
	}
	
	public void Clear_Email_input() {
		Email.clear();
	}

	public void Enter_Password_input(String password) {
		Password.sendKeys(password);
	}

	public void Clear_Passsword_input() {
		Password.clear();
	}
	
	public void Click_on_Login() {
		Login_button.click();
	}

	public String Get_Welcome_Text() {
		return Welcome_Text.getText();
	}

	public void Close_Popup() {
		Popup.click();

	}

}

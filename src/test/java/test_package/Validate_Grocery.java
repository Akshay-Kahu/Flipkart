package test_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_utility_package.Base_Class;

public class Validate_Grocery extends Base_Class {
	
	
	@BeforeClass
	public void Inital_Activity() throws IOException {
		Launch_Browser(Get_Property_Text("Browser"));
		Static_Wait(3);
		Initialization();

}
	@BeforeMethod
	 public void URL_Launch() throws InterruptedException {
	   driver.get("URL");
		// driver.get("https://www.flipkart.com/");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//div[@class='eFQ30H'])[10]")).click();
	}
	@Test(priority=0)
	public void Grocery_validation() throws IOException {
		//Actual = Grocery Prices In India();
	 String actual = Grocery.Flipkart_Grocery_text();
	 String expected = Get_Property_Text("test14");
	 Assert.assertEquals(actual, expected);
	}
   @Test(priority=2)
    public void product_1() throws IOException {
	 //  Grocery.Grocery_product_1()
	   String actual = Grocery.Grocery_product_1();
	   String expected = Get_Property_Text("test15");
	   Assert.assertEquals(actual, expected);
   }
   @Test(priority=3)
   public void product_2() throws IOException {
		 
		   String actual = Grocery.Grocery_product_2();
		   String expected = Get_Property_Text("test16");
		   Assert.assertEquals(actual, expected);
		   
   }
   @Test(priority=4)
   public void product_3() throws IOException {
		 
		   String actual = Grocery.Grocery_product_3();
		   String expected = Get_Property_Text("test17");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=5)
   public void product_4() throws IOException {
		 
		   String actual = Grocery.Grocery_product_4();
		   String expected = Get_Property_Text("test18");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=6)
   public void product_5() throws IOException {
		
		   String actual = Grocery.Grocery_product_5();
		   String expected = Get_Property_Text("test19");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=7)
   public void product_6() throws IOException {
		
		   String actual = Grocery.Grocery_product_6();
		   String expected = Get_Property_Text("test20");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=8)
   public void product_7() throws IOException {
		 
		   String actual = Grocery.Grocery_product_7();
		   String expected = Get_Property_Text("test21");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=9)
   public void product_8() throws IOException {
		 
		   String actual = Grocery.Grocery_product_8();
		   String expected = Get_Property_Text("test22");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=10)
   public void product_9() throws IOException {
		
		   String actual = Grocery.Grocery_product_9();
		   String expected = Get_Property_Text("test23");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=11)
   public void product_10() throws IOException {
		 
		   String actual = Grocery.Grocery_product_10();
		   String expected = Get_Property_Text("test24");
		   Assert.assertEquals(actual, expected);
		   
 }
   @Test(priority=1)
   public void product_() throws IOException {
		 
	   String actual = Grocery.Flipkart_Grocery_text();
	   String expected = Get_Property_Text("test25");
	   Assert.assertEquals(actual, expected);
   }
   @AfterMethod
	public void Navigate_to() {
		driver.navigate().to("https://www.flipkart.com/");
		Static_Wait(5);
	}
	
	@AfterClass
	public void quit() {
		Quit_Browser();
	}
}
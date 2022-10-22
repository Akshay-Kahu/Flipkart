package test_package;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_utility_package.Base_Class;

public class Validate_Flights extends Base_Class{
	

	@BeforeClass
	public void Initial_Activity() throws InterruptedException, IOException {
		Launch_Browser(Get_Property_Text("Browser"));
		Static_Wait(2);
		Initialization1();
		}
	@BeforeMethod
	public void Enter_URL() throws InterruptedException {
		
		}
	
	@Test(priority = 2)
	public void Dest_City_enter() {
		flights.Destination_City("Nagpur");
		Static_Wait(2);
		flights.Clear_Dest();
	}
	@Test(priority = 1)
	public void Source_city_enter() throws InterruptedException {
		flights.Source_City("Mumbai");
		Static_Wait(2);
		flights.Clear_Source();
		}
	@Test(enabled=false)
	public void Enter_Date() {
		flights.Date1("25");
	}
	@Test(priority = 0)
	public void Journey_Type() {
		flights.select_one_way();
	}
	@Test(priority = 3)
	public void Select_Traveller() {
		flights.No_Traveller("2");
	}
	
	
	@AfterClass
	public void Close_Browser() {
		driver.close();
	}

}

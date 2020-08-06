package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataTableStepDefination {

	
	public static WebDriver driver;
	
	@Given("^user is on Google Homepage for DataTableTest$")
	public void user_is_on_Google_Hoempage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumBrowserDriversJarFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Then("^enter search text as DataTable$")
	public void enter_search_text_as_DataTable(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
		//Write the code to handle Data Table
		 List<List<String>> data = arg1.raw();
		 
		 
		 
		 
		 //This is to get the first data of the set (First Row + First Column)
		 driver.findElement(By.name("q")).sendKeys(data.get(0).get(0)); 
		 driver.findElement(By.name("q")).clear();
		 driver.findElement(By.name("q")).sendKeys(data.get(1).get(0)); 
	}

	
	
	 
	 

	 
	 
}

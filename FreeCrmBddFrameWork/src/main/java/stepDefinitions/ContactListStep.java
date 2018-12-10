package stepDefinitions;

import com.qa.pages.ContactListPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//Author Saquib 
public class ContactListStep extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ContactListPage cntcList;
	
	
	@Given("^user will open browser$")
	public void user_will_open_browser()  {
		TestBase.initialization();
	    System.out.println("Browser opening");
	}

	@Then("^login into application$")
	public void login_into_application()  {
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("User Login Into the Application");
	}

	@Then("^user will click on list of contact$")
	public void user_will_click_on_list_of_contact()  {
		cntcList=new ContactListPage();
		cntcList.listContact();
	}

}

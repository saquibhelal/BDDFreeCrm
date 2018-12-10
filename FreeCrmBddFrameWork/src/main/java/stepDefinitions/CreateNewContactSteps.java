package stepDefinitions;

import com.qa.pages.CreateNewContact;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CreateNewContactSteps extends TestBase {
	
	LoginPage loginPage;
	CreateNewContact crCnt;
	HomePage homePage;
	
	@Given("^users open browser$")
	public void users_open_browser()   {
		TestBase.initialization();
	    System.out.println("Browser opening");
	}

	@Then("^user on login page$")
	public void user_on_login_page() {
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String Title=loginPage.validateLoginPageTitle();
		//Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", Title);
	    System.out.println("Login into page");
	}
	
	
	@Then("^validate contact page$")
	public void validate_contact_page()  {
	  // String title= crCnt.validateContactPage();
	  // Assert.assertEquals("Contact Information", title);
	}

	@Then("^create new contact$")
	public void create_new_contact() {
		crCnt=new CreateNewContact();
		crCnt.createNewContact();
		System.out.println("Contact created Successfully---->");
	    
	}
}

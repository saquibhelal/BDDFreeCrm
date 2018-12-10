package stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user open browser$")
	public void user_open_browser() throws Throwable {
	    TestBase.initialization();
	    System.out.println("Browser opening");
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginPage=new LoginPage();
		String Title=loginPage.validateLoginPageTitle();
		//Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", Title);
	    System.out.println("Login into page");
	}

	@Then("^user logs into app$")
	public void user_enter_username_and_password() throws Throwable {
	homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	

	@Then("^validate homepage title$")
	public void validate_homepage_title() throws Throwable {
		String homeVerify=homePage.verifyHomePageTitle();
	   // Assert.assertEquals("CRMPRO",homeVerify );
	}

	
}

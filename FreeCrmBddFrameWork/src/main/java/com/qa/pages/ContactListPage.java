package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ContactListPage extends TestBase{
	
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contact;
	
	@FindBy(xpath=".//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a")
	WebElement list;
	
	@FindBy(xpath="//*[@id='__editbtn']")
	WebElement editButton;
	
	@FindBy(xpath="//*[@id='title']/select")
	WebElement title;
	
	
	
	
	public ContactListPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void listContact(){
		driver.switchTo().frame("mainpanel");
		//Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();//contact.click();
		list.click();
	}
	
	
	
	

}

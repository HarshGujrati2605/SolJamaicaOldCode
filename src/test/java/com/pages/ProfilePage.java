package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonactionmethods.CommonActions;
import com.globalvariable.GlobalVariable;

public class ProfilePage extends GlobalVariable {
    
	By addresscardforscroll = By.xpath("(//div[contains(@class , 'ship-active-card')])[4]");
	By editiconaddress = By.xpath("(//div[@id = 'selectedshippingaddressid'])[1]");
	By firstnameaddress = By.xpath("//input[contains(@id ,'firstName')]");
	By lastnameaddrssfield = By.xpath("//input[contains(@name , 'lastName')]");
	By emailtextfield =By.xpath("//input[contains(@name , 'email')]");
	By cellphonenumber = By.xpath("//input[contains(@id ,'cellPhone')]");
	By countrydropdown = By.xpath("//select[contains(@id ,'state') and not(contains(@aria-hidden , 'true'))]");
	By state = By.xpath("//select[contains(@id ,'state')]");
	By country = By.xpath("//select[contains(@id ,'country')]");
	By address1 = By.xpath("//input[contains(@name , 'address1')]");
	By address2 = By.xpath("//input[contains(@name , 'address2')]");
	By address3 = By.xpath("//input[contains(@name , 'address3')]");
	By zipcodefield = By.xpath("//input[contains(@name , 'zipcode')]");
	By continuebutton = By.xpath("//button[contains(@id , 'submit')]");
	By addressname = By.xpath("(//div[contains(@class , 'ship-active-card')]//span)[1]");
	By phonenumber = By.xpath("(//div[contains(@class , 'ship-active-card')]//p[2]/a)[1]");
	By emailid = By.xpath("(//div[contains(@class , 'ship-active-card')]//p[@class = 'email-section']/a)[5]");
	By addnewaddress = By.cssSelector(".addnew-ship-card");
	By shippingcardslist = By.xpath("//div[contains(@class , 'info-body')]//div[contains(@class , 'ship-active-card')]/div[not(contains(@class , 'addeditaddress addnew-ship-card'))]");

	
	
	public void updateAddress(String statename) throws Exception {
		Thread.sleep(2000);
		//CommonActions.iScrollToTheElementByLocator(addresscardforscroll, "address");
		//Thread.sleep(2000);
		CommonActions.iClickJSEByLocator(editiconaddress, "Edit address icon");
		GlobalVariable.updated_firstname = CommonActions.randomProfileNameGenerator();
		GlobalVariable.updated_cellnumber = CommonActions.randomMobileNumberGenerator();
		Thread.sleep(1000);
		CommonActions.clickOnElementAndType(firstnameaddress, GlobalVariable.updated_firstname, "First name");
		CommonActions.iLogMessage("Updated the firstname " + GlobalVariable.updated_firstname);
		CommonActions.clickOnElementAndType(cellphonenumber, GlobalVariable.updated_cellnumber, "Cell number");
		CommonActions.iLogMessage("Updated the cellphone " + GlobalVariable.updated_cellnumber);
		Thread.sleep(1000);
		GlobalVariable.updated_address =  CommonActions.randomProfileAdressGenerator();
		CommonActions.clickOnElementAndType(address1, GlobalVariable.updated_address, "Updated Address 1");
		CommonActions.iClickElementByLocator(continuebutton, "continue button");

	}

	public void iValidateUpdatedAddress() throws Exception {
		CommonActions.iVerifyPartialElementText(addressname, GlobalVariable.updated_firstname, "firstname");
		System.out.println(GlobalVariable.updated_cellnumber);
		
		CommonActions.iVerifyPartialElementText(phonenumber, GlobalVariable.updated_cellnumber, "Phonenumber");
		new HomePage().iClickHome();
	}
	
	public void iAddnewAddress(String statename) throws Exception {
		CommonActions.iScrollToTheElementByLocator(addnewaddress, "addnewaddres");
		Thread.sleep(3000);
		CommonActions.iClickJSEByLocator(addnewaddress, "addnewaddress");
		GlobalVariable.firstname = CommonActions.randomNameGeneratornew();
		GlobalVariable.lastname = CommonActions.randomLastnameGenerator();
		GlobalVariable.phone = CommonActions.randomMobileNumberGenerator();
		GlobalVariable.emailid =CommonActions.randomEmailIdGeneratorFixPrefix();
		CommonActions.clickOnElementAndType(firstnameaddress, GlobalVariable.firstname, "firstname");
		CommonActions.clickOnElementAndType(lastnameaddrssfield, GlobalVariable.lastname, "lastname");
		CommonActions.clickOnElementAndType(emailtextfield, GlobalVariable.emailid, "Email");
		CommonActions.clickOnElementAndType(cellphonenumber, GlobalVariable.phone, "phone");
		CommonActions.clickOnElementAndType(address1, "Test Address, East Ross, "+CommonActions.randomStringGenerator(), "address1");
		CommonActions.clickOnElementAndType(address2, "Montana - 66554, Guernsey, "+ CommonActions.randomStringGenerator(), "firstname");
		CommonActions.clickOnElementAndType(address3, "1315 Stamm Flat, Dylanshire, Suriname "+CommonActions.randomStringGenerator(), "firstname");
		CommonActions.clickOnElementAndType(zipcodefield, "42144", statename);
	    CommonActions.selectOptionFromDropdownclass(country, statename);
	    CommonActions.selectOptionFromDropdownclass(state, CommonActions.randomStateSelector());
		CommonActions.iClickElementByLocator(continuebutton, "continue button");	
		
	}
	
	public void iValidateAddedNewAddress() throws Exception {
		Thread.sleep(2000);
		List<WebElement> shippingcards = CommonActions.getElementList(shippingcardslist);
		int size = shippingcards.size();
		System.out.println(firstname + " "+ lastname);
		CommonActions.iLogMessage("The total number of shippment address added is "+ size);
		CommonActions.iVerifyExactElementText(By.xpath("(//div[contains(@class , 'ship-active-card')]//span)["+size+"]"), firstname + " " + lastname , "Name in the address");
		CommonActions.iVerifyExactElementText(By.xpath("(//div[contains(@class , 'ship-active-card')]//p[@class = 'email-section']/a)["+size+"]"), GlobalVariable.emailid, "email id");
		CommonActions.iVerifyPartialElementText(By.xpath("(//div[contains(@class , 'ship-active-card')]//p[2]/a)["+size+"]"), phone, "Phone number");
	}
	
	
	

}

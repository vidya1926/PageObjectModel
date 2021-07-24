package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectspecificMethods;
import pages.Loginpage;

public class EditLead extends ProjectspecificMethods{
	
	@BeforeTest
	public void setfile()
	{ 
		callexcelfile="EditLead";
	}
	@Test(dataProvider="fetchdata")
	
	public  void editlead (String uname,String pwd,String Phno,String cname) throws InterruptedException, IOException {
		new Loginpage(driver).enterUsername(uname).enterPasssword(pwd).clickLoginbutton().Crmsfa().
		clickLeadbutton().clickfindLeadbt().clickphno().enterphno(Phno).clickfindLeads().clickfirstname().clickEditbt().enterUpdateleadform(cname).clickeditSubmit();
	}
	}

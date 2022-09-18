package Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.LoginPage;

public class LoginTest extends BaseClass{
	

	@Test
	public void Test1() {
		
		test.log(LogStatus.INFO, "Test1 Started");
		
		LoginPage lp=new LoginPage(driver);
		lp.login("sowmi2v@dxc.com","Sowmi@123");
		
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
	/*	if(ActError.equals(ExpError)) {
			System.out.println("TC PAssed");
		}else {
			System.out.println("Tc Failed");
		}*/
		
	//	Assert.assertFalse(Error.isDisplayed());  //failed
		AssertJUnit.assertTrue(Error.isDisplayed()); //shows error pass
		AssertJUnit.assertEquals(ActError, ExpError);
				
	}
	

	@Test
	@Parameters({"uname","pwd"})
	public void test2(String Username,String Password )
	{
		test.log(LogStatus.INFO, "Test2 Started");
		LoginPage lp=new LoginPage(driver);
		lp.login(Username,Password);
		
		
	}
	
	@Test
	
	public void test3() {
		test.log(LogStatus.INFO, "Test3 Started");
		
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
        String Password = sheet.getRow(1).getCell(1).getStringCellValue();
        
        LoginPage lp = new LoginPage(driver);
        lp.login(UserName,Password);
	}


}

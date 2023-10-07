package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseClass;
import ListenersJava.AllureListener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({AllureListener.class})
public class BrowserSettings extends BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void open() {
		
		BaseClass bs = new BaseClass();
		driver = bs.initialize_driver();
		driver.get("https://www.google.com/");

    }
	
	@Test(priority = 1, description="Verification of Title")
	@Description("Step Description 1 - Verification of Title")
	@Epic("Epic from JIRA")
	@Feature("Feature 1")
	@Story("Story ID")
	@Step("Verification -1")
	@Severity(SeverityLevel.MINOR)
	public void titleVerification()
	{
		 System.out.println(driver.getTitle());
	     Assert.assertEquals(driver.getTitle(), "Googley");
		
	}
	
	@Test(priority = 2, description="Verification of URL")
	@Description("Step Description 2 - Verification of URL")
	@Epic("Epic from JIRA")
	@Feature("Feature 2")
	@Story("Story ID")
	@Step("Verification -2")
	@Severity(SeverityLevel.MINOR)
	public void urlVerification()
	{
		 System.out.println(driver.getTitle());
	     Assert.assertEquals(driver.getCurrentUrl(), "https://www.googley.com/");
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}

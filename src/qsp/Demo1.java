package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {
	ExtentReports e=new ExtentReports("./ExtentReport/extentreport.html");
	ExtentTest t = e.startTest("testA");
@Test
public void testA() {
//System.setProperty("webdriver.gecko.driver","C:/Users/CBT/Desktop/Suganthi/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
Reporter.log("Open Google",true);
t=e.startTest("test");
t.log(LogStatus.PASS,"Hi");
e.endTest(t);
}
@Test
public void testB()
{
	t=e.startTest("test");
	t.log(LogStatus.FAIL, "Bye");
	e.endTest(t);
	e.flush();
}
}
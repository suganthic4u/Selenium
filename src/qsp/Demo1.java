package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {
@Test
public void testA() {
//System.setProperty("webdriver.gecko.driver","C:/Users/CBT/Desktop/Suganthi/geckodriver.exe");
ExtentReports e=new ExtentReports("./ExtentReport/extentreport.html");
ExtentTest t = e.startTest("testA");
t.log(LogStatus.PASS,"Hi");
e.endTest(t);
e.flush();
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
driver.close();
}
}
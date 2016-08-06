package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
@Test
public void testA() {
//System.setProperty("webdriver.gecko.driver","C:/Users/CBT/Desktop/Suganthi/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
driver.close();
}
}
package GroupRun.Test123;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class JenkinToast {
	
	public static WebDriver driver;
  @Test
  public void sink() throws InterruptedException {
	  
	 
	  driver.get("https://www.google.com");
	  
	  driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("ramesh meaning");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver(); 
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}

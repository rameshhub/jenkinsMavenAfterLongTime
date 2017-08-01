package GroupRun.Test123;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowTest {

	
	@Test()
	public void main() {

		WebDriver driver=new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();

		Set<String> s= driver.getWindowHandles();

		for(String a : s){

			driver.switchTo().window(a);

		}

		System.out.println(driver.findElement(By.xpath("html/body/div/h3")).getText());



	}

}

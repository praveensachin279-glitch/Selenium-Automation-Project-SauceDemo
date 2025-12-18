package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

	public static void main(String[] args)  {
		WebDriver driver=BaseTest.startApp();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	      
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))).click();

	       
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();

		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {
			System.out.println("Pass:successfully logout");
		}
		else
		{
			System.out.println("Fail:there is some error");
		}
		

	}

}

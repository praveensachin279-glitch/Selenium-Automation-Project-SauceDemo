package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BaseTest.startApp();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		
		String CurrentUrl = driver.getCurrentUrl();
		if(CurrentUrl.contains("inventory")) {
			System.out.println("Pass:login successful");
		}
		else
		{
			System.out.println("Fail:login fails");
		}
	

	}

}

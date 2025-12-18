package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvalidLogin {

	public static void main(String[] args) {
		WebDriver driver=BaseTest.startApp();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("praveen");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123252");
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		
		WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));
		String msg = error.getText();
		if(msg.contains("Username and password do not match")) {
			System.out.println("Pass:invalid login");
		}
		else
		{
			System.out.println("Fail:no invalid login");
		}


	}

}

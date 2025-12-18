package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmptyLogin {

	public static void main(String[] args) {
		WebDriver driver=BaseTest.startApp();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("");
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		
		WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));
		String msg = error.getText();
		if(msg.contains("required")) {
			System.out.println("PASS: Empty field validation");
		}
		else
		{
			System.out.println("FAIL: Empty field validation");
		}


	}


	}



package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductSort {

	public static void main(String[] args) {
	WebDriver driver=BaseTest.startApp();
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	WebElement button = driver.findElement(By.id("login-button"));
	button.click();
	
	Select sort=new Select(driver.findElement(By.className("product_sort_container")));
     sort.selectByVisibleText("Price (low to high)");
     System.out.println("Pass:product sorted by lowest to highest");
	}

}

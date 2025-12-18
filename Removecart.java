package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Removecart {

	public static void main(String[] args) {
		WebDriver driver=BaseTest.startApp();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		 
		 String cartcount = driver.findElement(By.className("shopping_cart_link")).getText();
		 driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		 
		 
		 boolean cartBadgePresent =
			        driver.findElements(By.className("shopping_cart_badge")).size() > 0;

			if (!cartBadgePresent) {
			    System.out.println("PASS: Item removed from cart");
			} else {
			    System.out.println("FAIL: Item not removed");
			}


}
}

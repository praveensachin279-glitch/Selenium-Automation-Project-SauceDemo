package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addingcart {

	public static void main(String[] args) {
		WebDriver driver=BaseTest.startApp();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		 driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

		 String cartcount = driver.findElement(By.className("shopping_cart_link")).getText();
       
		if(cartcount.equals("2")) {
        	System.out.println("Pass:product add to the cart");
        }
		else
		{
			System.out.println("Fail:product not added to the cart");
		}
	}

}

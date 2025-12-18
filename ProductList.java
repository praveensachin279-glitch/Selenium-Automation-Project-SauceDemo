package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductList {

	public static void main(String[] args) {
		WebDriver driver=BaseTest.startApp();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.id("login-button"));
		button.click();
		int productlist = driver.findElements(By.xpath("//div[@class='inventory_item']")).size();
		if(productlist>0) {
			System.out.println("Total number of product: "+productlist);
			System.out.println("Pass:product displayed");
		}
		else
		{
			System.out.println("Fail:product not displayed");
		}
        
	}

}

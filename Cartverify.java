package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartverify {

    public static void main(String[] args) {

        WebDriver driver = BaseTest.startApp();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

        boolean itemPresent = driver.findElements(By.className("inventory_item_name")).size() > 0;

        if (itemPresent) {
            System.out.println("PASS: Item present in cart");
        } else {
            System.out.println("FAIL: Item missing in cart");
        }

        
    }
}

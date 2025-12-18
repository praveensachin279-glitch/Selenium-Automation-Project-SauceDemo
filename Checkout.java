package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BaseTest.startApp();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
          Thread.sleep(5000);
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        Thread.sleep(5000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("finish")).click();

        if (driver.getPageSource().contains("Thank you for your order")) {
            System.out.println("PASS: Checkout completed");
        } else {
            System.out.println("FAIL: Checkout failed");
        }

       
    }
}

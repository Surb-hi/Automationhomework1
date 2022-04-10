package project1_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1_FireFox {
    public static void main(String[] args) {
        //step-1 setup firefox browser
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //step-2 open url
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);

        //step-3 print the title of the page
        String title=driver.getTitle();
        System.out.println(title);

        //step-4 print the current url
        String CurrentUrl=driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

        //step-5 print the page source
        String PageSource=driver.getPageSource();
        System.out.println(driver.getPageSource());

        //step-6 Enter the email to email field
        WebElement EmailField=driver.findElement(By.id("Email"));
        EmailField.sendKeys("Prime123@gmail.com");

        //step-7 Enter the password to password field
        WebElement PasswordField=driver.findElement(By.name("Password"));
        PasswordField.sendKeys("prime123");

        //step-8close the browser
        driver.close();
    }
}
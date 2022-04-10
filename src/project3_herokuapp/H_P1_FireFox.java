package project3_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class H_P1_FireFox {
    public static void main(String[] args) {
        //step-1 setup FireFox browser
        String BaseUrl = "http://the-internet.herokuapp.com/login";

        //step-2 open url
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(BaseUrl);

        //step-3 print the title of the page
        System.out.println(driver.getTitle());

        //step-4 print the current url
        System.out.println(driver.getCurrentUrl());

        //step-5 print the page source
        System.out.println(driver.getPageSource());

        //step-6 Enter the email to email field
        WebElement EmailField = driver.findElement(By.id("username"));
        EmailField.sendKeys("PRIME");

        //step-7 Enter the password to password field
        WebElement PasswordField=driver.findElement(By.name("password"));

        //step-8close the browser
        driver.close();
    }
}
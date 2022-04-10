package project4_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class U_P1_FireFox {
    public static void main(String[] args) {

        //step-1 setup Firefox browser
        String BaseUrl="https://www.saucedemo.com/";

        //step-2 open url
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(BaseUrl);

        //step-3 print the title of the page
        System.out.println(driver.getTitle());

        //step-4 print the current url
        System.out.println(driver.getCurrentUrl());

        //step-5 print the page source
        System.out.println(driver.getPageSource());

        //step-6 Enter the email to email field
        WebElement EmailField=driver.findElement(By.id("user-name"));
        EmailField.sendKeys("Prime3");

        //step-7 Enter the password to password field
        WebElement PasswordField=driver.findElement(By.name("password"));
        PasswordField.sendKeys("12Prime");

        //step-8close the browser
        driver.close();
    }
}
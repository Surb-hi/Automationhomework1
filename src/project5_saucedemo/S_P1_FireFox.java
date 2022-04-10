package project5_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S_P1_FireFox {
    public static void main(String[] args) {

        //step-1 setup chrome browser
        String BaseUrl="https://courses.ultimateqa.com/users/sign_in";

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
        WebElement EmailField=driver.findElement(By.id("user[email]"));
        EmailField.sendKeys("PrMie");

        //step-7 Enter the password to password field
        WebElement PasswordFiled=driver.findElement(By.name("user[password]"));
        PasswordFiled.sendKeys("OPRIM");

        //step-8close the browser
        driver.close();
    }
}
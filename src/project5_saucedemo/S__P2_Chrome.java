package project5_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S__P2_Chrome {
    public static void main(String[] args) {

        //step-1 setup chrome browser
        String BaseUrl= "https://courses.ultimateqa.com/users/sign_in";
        //step-2 open url
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(BaseUrl);
        //step-3 print the title of the page
        System.out.println(driver.getTitle());
        //step-4 print the current url
        System.out.println(driver.getCurrentUrl());
        //step-5 print the page source
        System.out.println(driver.getPageSource());
        //step-6 Enter the email to email field
        WebElement EmailField=driver.findElement(By.id("user[email]"));
        EmailField.sendKeys("Prime345");
        //step-7 Enter the password to password field
        WebElement Password=driver.findElement(By.name("user[password]"));
        Password.sendKeys("345PRIE");
        //step-8close the browser
        driver.close();
    }
}
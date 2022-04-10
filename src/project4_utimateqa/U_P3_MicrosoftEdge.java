package project4_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class U_P3_MicrosoftEdge {
    public static void main(String[] args) {

        //step-1 setup Edge  browser
        String BaseUrl="https://www.saucedemo.com/";

        //step-2 open url
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(BaseUrl);

        //step-3 print the title of the page
        System.out.println(driver.getTitle());

        //step-4 print the current url
        System.out.println(driver.getCurrentUrl());

        //step-5 print the page source
        System.out.println(driver.getPageSource());

        //step-6 Enter the email to email field
        WebElement EmailFiled=driver.findElement(By.id("user-name"));
        EmailFiled.sendKeys("PRIME456");

        //step-7 Enter the password to password field
        WebElement PasswordField=driver.findElement(By.name("password"));
        PasswordField.sendKeys("345677");

        //step-8close the browser
        driver.close();

    }
}
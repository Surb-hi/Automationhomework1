package project1_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_Chrome {
    public static void main(String[] args) {

        //step-1 setup chrome browser
        String BaseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";


        //step-2 open url
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(BaseUrl);

        //step-3 print the title of the page
        String title= driver.getTitle();
        System.out.println(title);

        //step-4 print the current url
        System.out.println(driver.getCurrentUrl());

        //step-5 print the page source
        System.out.println(driver.getPageSource());

        //step-6 Enter the email to email field
        WebElement EmailField=driver.findElement(By.id("Email"));
        EmailField.sendKeys("prime234@gmail.com");

        //step-7 Enter the password to password field
        WebElement PasswordField=driver.findElement(By.name("Password"));
        PasswordField.sendKeys("Prime234");

        //step-8close the browser
        driver.close();

    }


}

package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

    public class ComSauceDemo {
        //Setup Chrome browser
        static String browser = "Chrome";
        static String baseUrl = "https://www.saucedemo.com/";
        static WebDriver driver;

        public static void main(String[] args) {
            //Multiple browser
            if (browser.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Wrong Browser name");
            }
            //Open URL
            driver.get(baseUrl);
            //Maximize the window
            driver.manage().window().maximize();
            //Timeout for hold the page
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //Print the title of the page.
            System.out.println(driver.getTitle());
            //Print the current url.
            System.out.println(driver.getCurrentUrl());
            //Print the page source
            System.out.println(driver.getPageSource());
            //Enter the email to email field
            driver.findElement(By.id("user-name")).sendKeys("diwali");
            //Enter the password field
            driver.findElement(By.id("password")).sendKeys("xyz@123");
            //Click on login button
            driver.findElement(By.id("login-button")).click();
            //Navigate to base URL
            driver.navigate().to(baseUrl);
            //Refresh the page
            driver.navigate().refresh();
            //Close the browser
            driver.quit();
        }
    }

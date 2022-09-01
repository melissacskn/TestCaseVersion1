package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/vngrs/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String actualTitleOfHomePage = driver.getTitle();
        Assert.assertEquals(actualTitleOfHomePage, "Automation Exercise", "Home page is not visible");
        System.out.println("Home page is visible successfully");
        WebElement login = driver.findElement(new By.ByCssSelector("a[href=\"/login\"]"));
        login.click();
        WebElement loginToYourAccountTitle = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2"));
        Boolean loginToYourAccountTitleVisible=loginToYourAccountTitle.isDisplayed();
        if(loginToYourAccountTitleVisible){
            System.out.println("'Login to your account' is visible");
        }
        driver.findElement(By.cssSelector("input[placeholder='Email Address']")).sendKeys("melissacskn@gmail.com");
        driver.findElement(new By.ByCssSelector("input[data-qa=\"login-password\"]")).sendKeys("mel30cos");
        driver.findElement(new By.ByCssSelector("button[data-qa=\"login-button\"]")).click();
        WebElement loggedAs= driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a"));
        Boolean loggedAsVisible= loggedAs.isDisplayed();
        if(loggedAsVisible){
            System.out.println("'Logged in as username' is visible");
        }

        driver.findElement(By.cssSelector("a[href=\"/delete_account\"]")).click();
        driver.findElement(By.cssSelector("button[class=\"btn btn-danger\"]")).click();



    }
}

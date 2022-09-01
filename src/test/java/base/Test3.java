package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test3 {
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
        driver.findElement(By.cssSelector("input[placeholder='Email Address']")).sendKeys("hello@gmail.com");
        driver.findElement(new By.ByCssSelector("input[data-qa=\"login-password\"]")).sendKeys("hello123");
        driver.findElement(new By.ByCssSelector("button[data-qa=\"login-button\"]")).click();
        WebElement loggedAs= driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p"));
        Boolean incorrectdAsVisible= loggedAs.isDisplayed();
        if(incorrectdAsVisible){
            System.out.println("'Your email or password is incorrect!' is visible");
        }




    }

}

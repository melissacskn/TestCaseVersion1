package base;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class Test1 {
    public WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/vngrs/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        String actualTitleOfHomePage = driver.getTitle();
        Assert.assertEquals(actualTitleOfHomePage, "Automation Exercise", "Home page is not visible");
        System.out.println("Home page is visible successfully");

        WebElement login = driver.findElement( By.cssSelector("a[href=\"/login\"]"));
        login.click();
        WebElement newUser = driver.findElement(new By.ByCssSelector("#form > div > div > div:nth-child(3) > div > h2"));
        Boolean newUserVisible = newUser.isDisplayed();
        if (newUserVisible) {
            System.out.println("'New User Signup!' is visible");
        }
        WebElement name = driver.findElement(new By.ByCssSelector("input[placeholder=\"Name\"]"));

        name.sendKeys("Melissa Coskun");
        WebElement email = driver.findElement(new By.ByCssSelector("input[data-qa=\"signup-email\"]"));


        email.sendKeys("hello21029@gmail.com");
        WebElement signUpButton = driver.findElement(new By.ByCssSelector("button[data-qa=\"signup-button\"]"));
        signUpButton.click();
        WebElement enterAccountİnformation = driver.findElement(new By.ByCssSelector("#form > div > div > div > div.login-form > h2 > b"));

        Boolean enterAccountİnformationVisible = enterAccountİnformation.isDisplayed();
        if (enterAccountİnformationVisible) {
            System.out.println("'ENTER ACCOUNT INFORMATION' is visible");
        }


        WebElement titleBox = driver.findElement(By.cssSelector("input[id=\"id_gender2\"]"));

        Boolean titleBoxEnabled = titleBox.isEnabled();
        WebElement titleBoxLable = driver.findElement(By.cssSelector("label[for=\"id_gender2\"]"));


        if (titleBoxEnabled) {
            try {
                titleBox.click();
            } catch (ElementClickInterceptedException e) {
                titleBoxLable.click();
            }
        }

        WebElement passwordButton = driver.findElement(new By.ByCssSelector("input[id=\"password\"]"));
        WebElement passwordButtonLabel = driver.findElement(new By.ByCssSelector("label[for=\"password\"]"));
        Boolean passwordButtonEnable = passwordButton.isEnabled();


        if (passwordButtonEnable) {
            try {
                passwordButton.click();

            } catch (ElementClickInterceptedException e) {
                passwordButtonLabel.click();
            }
        }


        passwordButton.sendKeys("mel30cos");


        WebElement dayOfBirth = driver.findElement(new By.ByCssSelector("select[id=\"days\"]"));
        Select selectDay = new Select(dayOfBirth);
        selectDay.selectByValue("21");

        WebElement monthOfBirth = driver.findElement(new By.ByCssSelector("select[id=\"months\"]"));
        Select selectMonth = new Select(monthOfBirth);
        selectMonth.selectByIndex(2);

        WebElement yearOfBirth = driver.findElement(new By.ByCssSelector("select[id=\"years\"]"));
        Select selectYear = new Select(yearOfBirth);
        selectYear.selectByValue("2001");

        WebElement newsletterButton = driver.findElement(new By.ByCssSelector("input[name=\"newsletter\"]"));
        WebElement newsletterButtonLabel = driver.findElement(new By.ByCssSelector("label[for=\"newsletter\"]"));
        Boolean newsLetterButtonEnabled = newsletterButton.isEnabled();
        if (newsLetterButtonEnabled) {
            try {
                newsletterButton.click();
            } catch (ElementClickInterceptedException e) {
                newsletterButtonLabel.click();
            }
        }
        WebElement receiveOffersButton = driver.findElement(By.name("optin"));
        WebElement receiveOffersButtonLabel = driver.findElement(new By.ByCssSelector("label[for=\"optin\"]"));
        Boolean receiveOffersButtonEnabled = receiveOffersButton.isEnabled();
        if (receiveOffersButtonEnabled) {
            try {
                receiveOffersButton.click();
            } catch (ElementClickInterceptedException e) {
                receiveOffersButtonLabel.click();
            }
        }


        WebElement firstName = driver.findElement(By.id("first_name"));
        WebElement firstNameLabel = driver.findElement(new By.ByCssSelector("label[for=\"first_name\"]"));
        Boolean firstNameEnabled = firstName.isEnabled();
        if (firstNameEnabled) {
            try {
                firstName.click();
            } catch (ElementClickInterceptedException e) {
                firstNameLabel.click();
            }
        }
        firstName.sendKeys("Melissa");


        WebElement lastName = driver.findElement(By.id("last_name"));
        WebElement lastNameLabel = driver.findElement(new By.ByCssSelector("label[for=\"last_name\"]"));
        Boolean lastNameEnabled = lastName.isEnabled();
        if (lastNameEnabled) {
            try {
                lastName.click();
            } catch (ElementClickInterceptedException e) {
                lastNameLabel.click();
            }

        }
        lastName.sendKeys("Coskun");


        WebElement company = driver.findElement(By.id("company"));
        WebElement companyLabel = driver.findElement(new By.ByCssSelector("label[for=\"company\"]"));
        Boolean companyEnabled = company.isEnabled();
        if (companyEnabled) {
            try {
                company.click();
            } catch (ElementClickInterceptedException e) {
                companyLabel.click();
            }
        }
        company.sendKeys("VNGRS");


        WebElement address1 = driver.findElement(By.id("address1"));
        WebElement address1Label = driver.findElement(new By.ByCssSelector("label[for=\"address1\"]"));
        Boolean address1Enabled = address1.isEnabled();
        if (address1Enabled) {
            try {
                address1.click();
            } catch (ElementClickInterceptedException e) {
                address1Label.click();
            }
        }
        address1.sendKeys("Carlos Ct");


        WebElement address2 = driver.findElement(By.id("address2"));
        WebElement address2Label = driver.findElement(new By.ByCssSelector("label[for=\"address2\"]"));
        Boolean address2Enabled = address2.isEnabled();
        if (address2Enabled) {
            try {
                address2.click();
            } catch (ElementClickInterceptedException e) {
                address2Label.click();
            }
        }
        address2.sendKeys("Sali Drive");


        WebElement country = driver.findElement(By.id("country"));
        Select selectCountry = new Select(country);
        selectYear.selectByIndex(4);


        WebElement state = driver.findElement(By.cssSelector("#state"));
        /*
        WebElement stateLabel = driver.findElement(new By.ByCssSelector("label[for=\"state\"]"));
        Boolean stateEnabled = state.isEnabled();
        if (stateEnabled) {
            try {
                state.click();
            } catch (ElementClickInterceptedException e) {
                stateLabel.click();
            }
        }
        */

        state.sendKeys("Victoria");


        WebElement city = driver.findElement(By.cssSelector("#city"));
        WebElement cityLabel = driver.findElement(new By.ByCssSelector("label[for=\"city\"]"));
        Boolean cityEnabled = city.isEnabled();
        if (cityEnabled) {
            try {
                city.click();
            } catch (ElementClickInterceptedException e) {
                cityLabel.click();
            }
        }
        city.sendKeys("Melbourne");


        WebElement zipcode = driver.findElement(By.cssSelector("#zipcode"));
        zipcode.click();
        zipcode.sendKeys("3630");


        WebElement mobileNumber = driver.findElement(By.cssSelector("#mobile_number"));
        WebElement mobileNumberLabel = driver.findElement(new By.ByCssSelector("label[for=\"mobile_number\"]"));
        Boolean mobileNumberEnabled = mobileNumber.isEnabled();
        if (mobileNumberEnabled) {
            try {
                mobileNumber.click();
            } catch (ElementClickInterceptedException e) {
                mobileNumberLabel.click();
            }
        }
        mobileNumber.sendKeys("+61 4 9043 580");

        WebElement createAccountButton = driver.findElement(By.cssSelector("#form > div > div > div > div.login-form > form > button"));
        createAccountButton.click();

        WebElement accountCreatedTitle=driver.findElement(By.cssSelector("#form > div > div > div > h2 > b"));
        Boolean accountCreatedTitleVisible= accountCreatedTitle.isDisplayed();
        if(accountCreatedTitleVisible){
            System.out.println("'ACCOUNT CREATED!' is visible");
        }
        driver.findElement(new By.ByCssSelector("a[data-qa=\"continue-button\"]")).click();
        WebElement loggedAs= driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a"));
        Boolean loggedAsVisible= loggedAs.isDisplayed();
        if(loggedAsVisible){
            System.out.println("'Logged in as username' is visible");
        }
        driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a")).click();

    }
}

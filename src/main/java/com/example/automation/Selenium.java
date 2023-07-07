package com.example.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {

        // setting up the selenium webdriver
        System.setProperty("webdriver.chrome.driver", "/home/kumar/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();


        try {
            // Navigating to the web page
            driver.get("https://app.cloudqa.io/home/AutomationPracticeForm");

            // Defining the XPath of the fields
            String emailXPath = "//*[@id=\"email\"]";
            String dobXPath = "//*[@id=\"dob\"]";
            String mobileXPath = "//*[@id=\"mobile\"]";

            // Interaction with the fields using the defined XPath locators
            WebElement emailField = driver.findElement(By.xpath(emailXPath));
            emailField.sendKeys("krshubham2000@gmail.com");

            WebElement dobField = driver.findElement(By.xpath(dobXPath));
            dobField.sendKeys("04/02/2000");

            WebElement mobileField = driver.findElement(By.xpath(mobileXPath));
            mobileField.sendKeys("9955698234");


            // checking if the fields contain the expected values and validation logic

            String enteredEmail = emailField.getAttribute("value");
            if (enteredEmail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}")) {
                System.out.println("Email format is valid.");
            } else {
                System.out.println("Email format is invalid.");
            }

            String enteredDob = dobField.getAttribute("value");


            String enteredMobile = mobileField.getAttribute("value");
            if (enteredMobile.length() == 10) {
                System.out.println("Mobile Number length is valid.");
            } else {
                System.out.println("Mobile Number length is invalid.");
            }



            if (enteredEmail.equals("krshubham@gmail.com")) {
                System.out.println("Email field test passed.");
            } else {
                System.out.println("Email field test failed.");
            }

            if (enteredDob.equals("04/02/2000")) {
                System.out.println("Date of Birth field test passed.");
            } else {
                System.out.println("Date of Birth field test failed.");
            }

            if (enteredMobile.equals("9955698234")) {
                System.out.println("Mobile Number field test passed.");
            } else {
                System.out.println("Mobile Number field test failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            Thread.sleep(1000 * 10);

            // Quit the webDriver
            driver.close();
        }
    }
}

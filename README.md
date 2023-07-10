# Automation-testing-using-Selenium

Automated Field Testing using Selenium WebDriver
This project demonstrates how to automate the testing of three fields (email, date of birth, and mobile number) on a web page using Java and Selenium WebDriver. The program is designed to handle changes in the HTML elements' properties or positions, ensuring its flexibility and robustness.

Prerequisites
Before running the program, ensure you have the following installed:

Java Development Kit (JDK)
Selenium WebDriver Java bindings
ChromeDriver (compatible with your Chrome browser version)
Getting Started
Clone the repository to your local machine or download the source code.
Set up the WebDriver by providing the correct path to the ChromeDriver executable in the code.
Review and update the XPath locators in the code to match the fields on your web page.
Customize the validation logic in the code based on your specific requirements.
Compile and run the program.
Code Explanation
The main code file is Selenium.java, which contains the test script. Here's a breakdown of the code structure:

Set up the WebDriver and navigate to the web page.
Define XPath locators for the email, date of birth, and mobile number fields.
Interact with the fields by entering values.
Perform assertions to validate the entered values or customize the validation logic as needed.
Customizing Validation Logic
To customize the validation logic based on your specific requirements:

Modify the assertions in the code or add additional checks after interacting with the fields.
You can perform regular expression matching, implement custom validation methods, or utilize external libraries for advanced validations.
Update the validation logic based on your specific rules, format requirements, or any other criteria relevant to the fields being tested.
Handling Changes in HTML Elements
The program handles changes in the HTML elements' properties or positions through the use of XPath locators. If the HTML structure changes:

Update the XPath locators in the code to match the new structure or properties of the fields.
Avoid hardcoding the locators directly into the test script; instead, consider storing them in a separate configuration file or class for easy updates.
Conclusion
Automating field testing using Selenium WebDriver provides a reliable and efficient way to ensure the functionality and integrity of web forms. By following the steps outlined in this project, you can easily adapt the program to test various fields while accommodating changes in the HTML elements' properties or positions.

Feel free to customize and extend this project according to your specific testing requirements or integrate it into your existing test automation framework.


Acknowledgments
The Selenium WebDriver community for their valuable resources and documentation.


package scripts;

/**
 * Created by Rupesh Kumar on 1/27/2018.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.URL;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {

    WebDriver driver = null;

    @Test
    public void testOne() throws Exception {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
        //driver = new ChromeDriver();
        System.out.println(" Executing on Chrome");
        String Node = "http://ec2-13-127-145-170.ap-south-1.compute.amazonaws.com:4545/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");

        driver = new RemoteWebDriver(new URL(Node), cap);
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        Thread.sleep(30000);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();

    }

    @Test
    public void testTwo() throws Exception {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.firefox.marionette",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
        //driver = new FirefoxDriver();
        System.out.println(" Executing on Firefox");
        String Node = "http://ec2-13-127-145-170.ap-south-1.compute.amazonaws.com:4545/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setBrowserName("firefox");
        driver = new RemoteWebDriver(new URL(Node), cap);
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        Thread.sleep(30000);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();

    }

    @Test
    public void testThree() throws Exception {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
        //driver = new ChromeDriver();
        System.out.println(" Executing on Chrome");
        String Node = "http://ec2-13-127-145-170.ap-south-1.compute.amazonaws.com:4545/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(Node), cap);
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        Thread.sleep(30000);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();

    }

    @Test
    public void testFour() throws Exception {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.firefox.marionette",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
        //driver = new FirefoxDriver();
        System.out.println(" Executing on Firefox");
        String Node = "http://ec2-13-127-145-170.ap-south-1.compute.amazonaws.com:4545/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setBrowserName("firefox");
        driver = new RemoteWebDriver(new URL(Node), cap);
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        Thread.sleep(30000);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();

    }

    @AfterTest
    public void close() {
        driver.quit();
    }

}
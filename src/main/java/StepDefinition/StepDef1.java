package StepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef1 {


        @Given("^User is at login page\\.$")
        public void user_is_at_login_page() {

                System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
                WebDriver d1=new ChromeDriver();
                d1.get("https://www.google.com");

        }
}
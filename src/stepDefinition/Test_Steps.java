package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class Test_Steps {

	public static WebDriver driver;
	
 @Given("^User is on Home Page$")
 public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver_win32\\chromedriver.exe");
	 	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
 }
 
 @When("^User Navigate to LogIn Page$")
 public void user_Navigate_to_LogIn_Page() throws Throwable {
	 driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	 
 
 }
 
 @When("^User enters \"(.*)\" and \"(.*)\"$")
 public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
	 //System.out.println("User Name and Password");
	 driver.manage().window().maximize(); 
	 driver.findElement(By.id("user_login")).sendKeys(username); 
     driver.findElement(By.id("user_pass")).sendKeys(password);
     driver.findElement(By.id("wp-submit")).click();
 }
 
 @Then("^Message displayed Login Successfully$")
 public void message_displayed_Login_Successfully() throws Throwable {
	 System.out.println("Login Successfully");
 }
 
 @When("^User LogOut from the Application$")
 public void user_LogOut_from_the_Application() throws Throwable {
	 System.out.println("user_LogOut_from_the_Application");
    //driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 }
 
 @Then("^Message displayed Logout Successfully$")
 public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
 }
 @Then("^close the browser$")
 public void close_the_browser() throws Throwable{
	 driver.quit();
 }
}

package step_2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_new {
	WebDriver we;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.gecko.driver","/home/administrator/Desktop/geckodriver");
	      we=new FirefoxDriver();
	      we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	   
	}

	@When("^User navigate to Login Page$")
	public void user_navigate_to_Login_Page() {
		we.get("http://apps.gamonoid.com/icehrm-open/login.php?login=no");
		
	}

	@And("^enters Username and Password and click on login button$")
	public void enters_Username_and_Password_and_click_on_login_button()  {
		
		 we.findElement(By.name("username")).sendKeys("admin");
	     we.findElement(By.name("password")).sendKeys("admin");
	     we.findElement(By.xpath("html/body/div[1]/div[2]/div/div/form[1]/fieldset/button")).click();
	
	}

	@Then("^Sucessfull$")
	public void sucessfull() {
		System.out.println("user is login successfully");
	  
	}

	@Given("^User Must be Logged in the Account$")
	public void user_Must_be_Logged_in_the_Account() {
		System.out.println("user is logged in");
	 
	}

	@When("^User clicks on Employee$")
	public void user_clicks_on_Employee() {
		System.out.println("Employee module shou;ld be display");
	    
	}

	@And("^User click on add employee and the employee$")
	public void user_click_on_add_employee_and_the_employee() throws InterruptedException {
		we.findElement(By.linkText("Employees")).click();
        Thread.sleep(2000);
        we.findElement(By.xpath("html/body/div[2]/aside[1]/section/ul/li[2]/ul/li[1]/a")).click();
        Thread.sleep(5000);
        we.findElement(By.id("tabEmployeeEducation")).click();
        Thread.sleep(5000);
        we.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div[1]/div/div[3]/div[1]/div[1]/div/button[1]")).click();
        Thread.sleep(5000);
        we.findElement(By.className("select2-choice")).click();
        Thread.sleep(5000);
        we.findElement(By.xpath("html/body/div[14]/ul/li[2]/div")).click();
        Thread.sleep(5000);
        we.findElement(By.xpath("html/body/div[2]/aside[2]/section[2]/div[1]/div/div[3]/div[2]/form/div/div[3]/div[1]/div/a")).click();
        Thread.sleep(5000);
        we.findElement(By.xpath("html/body/div[15]/ul/li[2]/div")).click();
        we.findElement(By.id("institute")).sendKeys("GEU");
       Thread.sleep(5000);
       we.findElement(By.xpath(".//*[@id='date_start_date']/span")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath("html/body/div[11]/div[3]/table/tbody/tr/td")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath("html/body/div[11]/div[3]/table/tbody/tr/td/span[10]")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath("html/body/div[11]/div[2]/table/tbody/tr/td/span[2]")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath("html/body/div[11]/div[1]/table/tbody/tr[3]/td[4]")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath(".//*[@id='date_end_date']/span")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath("html/body/div[12]/div[3]/table/tbody/tr/td/span[10]")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath("html/body/div[12]/div[2]/table/tbody/tr/td/span[4]")).click();
       Thread.sleep(5000);
       we.findElement(By.xpath("html/body/div[12]/div[1]/table/tbody/tr[6]/td[2]")).click();
       Thread.sleep(5000);
	    
	}

	@Then("^Message Displayed employee is added$")
	public void message_Displayed_employee_is_added()  {
		System.out.println("Employee is add");
	    
	}

}

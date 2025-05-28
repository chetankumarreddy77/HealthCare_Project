package Steps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import PageFM.Home;
import PageFM.Login;
import PageFM.Logout;
import ReportingUtil.Reporters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def {
	
	
	WebDriver driver;
	Reporters R1;
	
	Login Lp;
	Home  Hp;
	Logout Lg;
	
	
	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    R1 = new Reporters();
	    R1.CreateHTMLReport("HealthCare_Report");
	}
	@When("user enter the url as {string}")
	public void user_enter_the_url_as(String url) {
	    Lp = new Login();
	    Lp.driver(driver,R1);
	    Lp.user_enter_the_url_as(url);
	}
	@Then("user login details with username as {string} and Password as {string} and click LoginButton")
	public void user_login_details_with_username_as_and_password_as_and_click_login_button(String username, String password) throws InterruptedException, IOException {
	    Lp.user_login_details_with_username_as_and_password_as_and_click_login_button(username, password);
	}
	@Then("user click the menu and click the home button")
	public void user_click_the_menu_and_click_the_home_button() throws InterruptedException {
	   Hp = new Home();
	   Hp.driver(driver,R1);
	   Hp.user_click_the_menu_and_click_the_home_button();
	}
	@When("user click the Make Appointment")
	public void user_click_the_make_appointment() throws InterruptedException {
		Hp.user_click_the_make_appointment();
	}
	@When("user choose the Facility and tick to apply")
	public void user_choose_the_facility_and_tick_to_apply() throws InterruptedException {
		Hp.user_choose_the_facility_and_tick_to_apply();
		
	}
	@Then("user click the Healthcare Program and choose one")
	public void user_click_the_healthcare_program_and_choose_one() throws InterruptedException {
		Hp.user_click_the_healthcare_program_and_choose_one();
	}
	@Then("user choose one date and comment as {string}")
	public void user_choose_one_date_and_comment_as(String para) throws InterruptedException, IOException {
		Hp.user_choose_one_date_and_comment_as(para);
	}
	@When("user book appointment and go to homepage")
	public void user_book_appointment_and_go_to_homepage() throws InterruptedException {
		Hp.user_book_appointment_and_go_to_homepage();
	}
	@When("user quit the browser")
	public void user_quit_the_browser() {
	   Lg = new Logout();
	   Lg.driver(driver,R1);
	   Lg.user_quit_the_browser();
	}

}

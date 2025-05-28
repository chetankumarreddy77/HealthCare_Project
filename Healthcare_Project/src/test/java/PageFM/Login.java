package PageFM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Login {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(id="txt-username")
	WebElement Username;
	
	@FindBy(id="txt-password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"btn-login\"]")
	WebElement LoginBtn;
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	
	
	public void user_enter_the_url_as(String url) {
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void user_login_details_with_username_as_and_password_as_and_click_login_button(String username, String password) throws InterruptedException, IOException {
		Username.sendKeys(username);
	    Thread.sleep(2000);
	    Password.sendKeys(password);
	    Thread.sleep(2000);
	    R1.logger(driver, "username", "password");
	    LoginBtn.click();
	    Thread.sleep(2000);
	}

}

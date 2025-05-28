package PageFM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Logout {
	
WebDriver driver;
Reporters R1;
	
	public void driver(WebDriver driver01,Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	
	public void user_quit_the_browser() {
		R1.closeReport();
	    driver.quit();
	}

}

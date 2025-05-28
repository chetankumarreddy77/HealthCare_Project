package PageFM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ReportingUtil.Reporters;

public class Home {
	
WebDriver driver;
Reporters R1;

	@FindBy(xpath="//*[@id=\"menu-toggle\"]")
	WebElement MenuBTn;
	
	@FindBy(xpath="//*[@id=\"sidebar-wrapper\"]/ul/li[2]/a")
	WebElement HomeBTn;
	
	@FindBy(xpath="//*[@id=\"btn-make-appointment\"]")
	WebElement Appoinment;
	
	@FindBy(xpath="//*[@id=\"combo_facility\"]")
	WebElement Facility;
	
	@FindBy(xpath="//*[@id=\"chk_hospotal_readmission\"]")
	WebElement Tick;
	
	@FindBy(xpath="//*[@id=\"radio_program_medicaid\"]")
	WebElement ChooseOne;
	
	@FindBy(xpath="//*[@id=\"txt_visit_date\"]")
	WebElement ChooseDate;
	
	@FindBy(xpath="//*[@id=\"txt_comment\"]")
	WebElement Comment;
	
	@FindBy(xpath="//*[@id=\"btn-book-appointment\"]")
	WebElement BookedAppoinment;
	
	@FindBy(xpath="//*[@id=\"summary\"]/div/div/div[7]/p/a")
	WebElement Homepage;
	
	@FindBy(xpath="//*[@id=\"menu-toggle\"]")
	WebElement GoToMenu;
	
	@FindBy(xpath="//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")
	WebElement History;
	
	public void driver(WebDriver driver01,Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	public void user_click_the_menu_and_click_the_home_button() throws InterruptedException {
		MenuBTn.click();
	    Thread.sleep(2000);
	    HomeBTn.click();
		Thread.sleep(2000);
	}
	
	public void user_click_the_make_appointment() throws InterruptedException {
		Appoinment.click();
		Thread.sleep(2000);
	}
	
	public void user_choose_the_facility_and_tick_to_apply() throws InterruptedException {
		WebElement dropdownElementes = Facility;
		
		Select dropdowns = new Select(dropdownElementes);
		dropdowns.selectByIndex(1);
		
		Thread.sleep(2000);
		
		Tick.click();
		Thread.sleep(2000);
		
	}
	
	public void user_click_the_healthcare_program_and_choose_one() throws InterruptedException {
		ChooseOne.click();
		Thread.sleep(2000);
		ChooseDate.sendKeys("27/05/2025");
		Thread.sleep(2000);
	}
	
	public void user_choose_one_date_and_comment_as(String para) throws InterruptedException, IOException {
		Comment.sendKeys(para);
		Thread.sleep(2000);
		R1.logger(driver, "Appointment_details", "Appoinment_report");
	}
	
	public void user_book_appointment_and_go_to_homepage() throws InterruptedException {
		BookedAppoinment.click();
		Thread.sleep(2000);
		Homepage.click();
		Thread.sleep(2000);
		GoToMenu.click();
	    Thread.sleep(2000);
	    History.click();
	    Thread.sleep(2000);
	}

}

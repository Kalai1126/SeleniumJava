package firstpackage.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant Technology Solutions");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kalaivani");
		driver.findElementById("createLeadForm_lastName").sendKeys("Balasubramanian");
		driver.findElementByName("submitButton").click();
		String LeadPage = driver.getTitle();
		System.out.println("Hey I am in LeadPage: "+LeadPage);
				
	}
}

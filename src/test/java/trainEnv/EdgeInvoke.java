package trainEnv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EdgeInvoke {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	String cNumber ="KING12345782";
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver   driver = new ChromeDriver();
		driver.get("http://dev-achapp1.dpworld.sa:83/auth/login/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement userName= driver.findElement(By.name("username"));
		userName.sendKeys("Gowtham");
		WebElement passWord= driver.findElement(By.name("password"));
		passWord.sendKeys("Dxb@2023");
		  //class="ant-notification-notice-message"
		
		
		
		WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		
		WebElement administrationMenu= driver.findElement(By.xpath("//*[text()='Administration']"));
		administrationMenu.click();
		
		WebElement subMenuInterface= driver.findElement(By.xpath("//*[text()='Interface']"));
		subMenuInterface.click();
		
		WebElement subMenuAssignment= driver.findElement(By.xpath("//*[text()='Token Assignment']"));
		subMenuAssignment.click();
		Thread.sleep(10000);
		WebElement searchBox= driver.findElement(By.xpath("(//input[@class='ant-input'])[3]"));
		searchBox.sendKeys(cNumber);
		
		// Specify the text you want to search for
        String searchText = cNumber;
		
		//String.format(arg0, arg1);
		
		String xpath = String.format("//td[contains(text(), '%s')]", searchText);
		
		
		
		WebElement getcNumberDeatils= driver.findElement(By.xpath(xpath));
		String actctnumber=getcNumberDeatils.getText();
		
		System.out.println("++++++++++++ "+actctnumber);
		
		
		
	}

}

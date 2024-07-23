package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class LeafDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node019anidn3klkslr87fyopz3k75529911.node0");

		driver.manage().window().maximize();


		String	backColor =	driver.findElement(By.id(null)).getCssValue("background-color");

		//	String	backColor =	driver.findElement(.id("j_idt88:j_idt96")).getCssValue("background-color");

		String	textColor =	driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");


		System.out.println(backColor);
		System.out.println(textColor);



	}

}

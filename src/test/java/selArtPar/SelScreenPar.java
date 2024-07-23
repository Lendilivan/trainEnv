package selArtPar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelScreenPar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.javatpoint.com/webdriver-locating-strategies-by-xpath-using-contains");
		
		
		screenShotUtils( driver,  "filenametttt");
		
		//driver.findElement(By.linkText("selenium"));
		
		
		
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//a[@class='selected']"));
		actions.contextClick(elementLocator).perform();
		

	}
	
	
	
	public static void 	screenShotUtils(WebDriver driver, String filename) throws IOException {
		
		 // Convert WebDriver object to TakeScreenshot
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		
		// Call getScreenshotAs method to create an image file
		
	File sourceLoaction=sc.getScreenshotAs(OutputType.FILE);
		
		
		
		 // Move the image file to a new destination
     
	File destLocation = new File ("./screenshot/"+filename+".png");
	
	
        // Copy the file to the destination
	FileUtils.copyFile(sourceLoaction, destLocation);
      
		
	}

}


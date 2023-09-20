package trainEnv;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe"); 
		EdgeDriver   driver = new EdgeDriver();
		driver.get("https://evo2app.otr-ict.chn:6116/");
		
	}

}

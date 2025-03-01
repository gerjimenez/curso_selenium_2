package curso_selenium_2;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Validando_drivers_g_e_c_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //validando edgedriver
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\edgedriver\\msedgedriver.exe");
			  WebDriver driver_edge = new EdgeDriver();
			  driver_edge.get("https://www.google.com");
			  
		// validando chrome driver
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\chromedriver\\chromedriver.exe");
		// WebDriver driver_chrome = new ChromeDriver();
		// driver_chrome.get("https://www.google.com");
		
		//validando geckodrive
		 // System.setProperty("webdriver.gecko.driver", "E:\\Canal Nicolas Alvarez\\nuevo curso avanzado de selenium con java\\drivers\\geckodriver\\geckodriver.exe");
		 // WebDriver driver_firefox = new FirefoxDriver();
		  // driver_firefox.get("https://www.google.com");
		  

		  
	}

}

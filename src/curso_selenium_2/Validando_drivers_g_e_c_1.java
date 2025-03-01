package curso_selenium_2;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Validando_drivers_g_e_c_1 {

	public static void main(String[] args) {
		   //validando edgedriver
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\edgedriver\\msedgedriver.exe");
			  WebDriver driver_edge = new EdgeDriver();
			  driver_edge.get("https://www.google.com");
			  // metodo basico 2 getTitle = nos trae el titulo de las pagina actual
			  System.out.println(driver_edge.getTitle());
			  // metodo basico 3, getCurrentUrl() muestra la direcdcion actual de la pagina
			  System.out.println(driver_edge.getCurrentUrl());
			  // metodo basico 4, close() cierra el navegador
			  // driver_edge.close();
			  // metodo basico 5, quit() termina la sesion del driver
			  driver_edge.quit();;
			  
			  
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

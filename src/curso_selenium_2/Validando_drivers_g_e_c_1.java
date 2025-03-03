package curso_selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.locators.RelativeLocator;


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
			  
			  // Localizadores tradicionales
			  // encontrar elemento por id
			 /* driver_edge.findElement(By.id("APjFqb"));
			  // encontrar el elemento por class name
			  driver_edge.findElement(By.className("gNO89b"));
			// encontrar elemento por name
			  driver_edge.findElement(By.name("btnI"));
			// encontrar elemento por link test
			  driver_edge.findElement(By.linkText("Sobre Google"));
			  // encontrar el elemento por link test parcial
			  driver_edge.findElement(By.partialLinkText("Sobre"));  
			// encontrar elemento por xpath
			  driver_edge.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[2]/div[3]"));   */  
			  
			  // Para saltar primera pantalla
			  driver_edge.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();	
			  
			
			  // Localizadores relativos (amigables)
			  //driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_F"))).click();
			  // driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_X"))).click();
			  driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_F")).toRightOf(By.className("gb_X"))).click();
			  
			  
			  // metodo basico 5, quit() termina la sesion del driver
			  // driver_edge.quit();;
			  
			  
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

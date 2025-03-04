package curso_selenium_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ElementNotInteractableException;

import org.openqa.selenium.WebElement;

// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.locators.RelativeLocator;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;


public class Validando_drivers_g_e_c_1 {

	public static void main(String[] args) {
		   //validando edgedriver
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\Gerardo Jimenez Diez\\drivers_webs\\edgedriver\\msedgedriver.exe");
			  WebDriver driver_edge = new EdgeDriver();
			  /* driver_edge.get("https://www.google.com");
			  // metodo basico 2 getTitle = nos trae el titulo de las pagina actual
			  System.out.println(driver_edge.getTitle());
			  // metodo basico 3, getCurrentUrl() muestra la direcdcion actual de la pagina
			  System.out.println(driver_edge.getCurrentUrl());
			  // metodo basico 4, close() cierra el navegador
			  // driver_edge.close(); */
			  
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
			  // driver_edge.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();	
			  
			
			  // Localizadores relativos (amigables) CLick en Imagenes al final
			  //driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_F"))).click();
			  // driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_X"))).click();
			  //driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_F")).toRightOf(By.className("gb_X"))).click();
			  
			  // TIPOS DE WAITS NO MEZCLAR
			  //Implicit wait
			  /* driver_edge.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver_edge.get("https://www.google.com");
			  driver_edge.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();
			  driver_edge.findElement(By.className("Gdd5U")); */
			  
			  // Explicit wait   Mas recomendado
			  driver_edge.get("https://www.google.com");
			  driver_edge.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();
			  WebElement image = driver_edge.findElement(By.className("gLFyf"));
			  Wait<WebDriver> wait = new WebDriverWait(driver_edge,Duration.ofSeconds(5)); 	
			  wait.until(imageshow->image.isDisplayed());
			  driver_edge.findElement(By.className("gLFyf")).sendKeys("selenium"); 
			  
			  // fluent wait
			  /* driver_edge.get("https://www.google.com");
			  driver_edge.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]")).click();
			  WebElement image = driver_edge.findElement(By.className("gLFyf"));
			  Wait<WebDriver> wait = new FluentWait<>(driver_edge)
					  .withTimeout(Duration.ofSeconds(2))
					  .pollingEvery(Duration.ofMillis(300))
					  .ignoring(ElementNotInteractableException.class);
			  wait.until(d->{
			    image.sendKeys("selenium");
			    return true;
			  });   */
			  
			  
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

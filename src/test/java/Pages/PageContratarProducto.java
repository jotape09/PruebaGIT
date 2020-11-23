package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilidades.ClaseBase;

public class PageContratarProducto extends ClaseBase{
	WebDriverWait wait;
	
	public PageContratarProducto(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	//****************   OBJETOS   *******************
	
	
	//*********Contratar Productos
    By btnContratarProducto = By.xpath("//*[@id='contratarNuevo']/p");
    By btnSiguiente = By.xpath("//*[@id='siguientePregunta']/p");
	
    
    
    
	//****************   METODOS   *******************
    
    
  //Se presiona el boton CONTRATAR PRODUCTO
    public void ContratarProducto(WebDriver driver) throws InterruptedException {
    	Thread.sleep(20000);
    	driver.switchTo().frame(2);
    	//wait.until(ExpectedConditions.elementToBeClickable(btnContratarProducto));
    	click(btnContratarProducto);
    }//fin contratar producto
    
    
}// Fin clase PageContratarProducto

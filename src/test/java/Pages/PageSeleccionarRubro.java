package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilidades.ClaseBase;

public class PageSeleccionarRubro extends ClaseBase {

	WebDriverWait wait;
	
	public PageSeleccionarRubro(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	
	//****************   OBJETOS   *******************
	
    //*********Selecciona Rubro
    //By btnSeleccionaRubro = By.xpath("//*[@id='selectRubro']/div/span");
    By btnSeleccionaRubro = By.xpath("/html/body/div/div/div/app-root/app-inicio-v2/div/div[2]/div[1]/div[1]/div[2]/app-rubro-question/div/form/label/ng-select/div/span");
    By btnDiscoteque = By.xpath("/html/body/div/div/div/app-root/app-inicio-v2/div/div[2]/div[1]/div[1]/div[2]/app-rubro-question/div/form/label/ng-select/ng-dropdown-panel/div/div[2]/div[3]");
    By btnDiscotequeJessi = By.xpath("/html/body/div/div/div/app-root/app-inicio-v2/div/div[2]/div[1]/div[1]/div[2]/app-rubro-question/div/form/label/ng-select/ng-dropdown-panel/div/div[2]/div[4]/span");
    By btnSiguiente = By.xpath("//*[@id='siguientePregunta']/p");
    
  //****************   METODOS   *******************
    
    
  //Se selecciona el rubro
    public void SeleccionaRubroBryan(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(7000);
    	//driver.switchTo().frame(2);
    	//String Valor = obtenerTexto(textoVenderDeForma);
    	//Assert.assertEquals("Quiero vender de forma", Valor);
    	click(btnSeleccionaRubro);
    	click(btnDiscoteque);
    	click(btnSiguiente);
    }//fin contratar producto
	
    
  //Se selecciona el rubro
    public void SeleccionaRubroJessi(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(7000);
    	//driver.switchTo().frame(2);
    	//String Valor = obtenerTexto(textoVenderDeForma);
    	//Assert.assertEquals("Quiero vender de forma", Valor);
    	click(btnSeleccionaRubro);
    	click(btnDiscotequeJessi);
    	click(btnSiguiente);
    }//fin contratar producto
    
    
}// fin PageSeleccionarRubro

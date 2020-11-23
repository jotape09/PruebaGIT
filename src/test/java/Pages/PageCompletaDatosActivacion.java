package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilidades.ClaseBase;

public class PageCompletaDatosActivacion extends ClaseBase{
	WebDriverWait wait;
	
	
	public PageCompletaDatosActivacion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	
	
	//****************   OBJETOS   *******************
	
	
    //*********Datos Local y Solicitante (Presencial)
    By textoDatosSolicitante = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[1]/h4");
	//*********Completa Datos Activacion
    By textoCompletaDatosActivacion = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[1]/h4");
	By txtNombreComercio = By.xpath("//*[@id=\'nombreFantasia\']");
	By txtURL = By.xpath("//*[@id='urlWebsite']");
	By listaComercio = By.xpath(" //*[@id=\'direccionExistente\']");
	By btnSeleccionarComercio = By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div/div/strong");
	By btnRealizarasTuIntegracion = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[2]/app-datos-direccion-web/app-datos-integrador/div/div[1]/button[2]");
    By btnConfirmarDatosSolicitante = By.xpath("//*[@id=\'content-wrapper\']/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[3]/app-datos-solicitante-local-web/div[2]/form/div/div[5]/label/span[1]");
	By btnConfirmaDatosSolicitante2 = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[3]/app-datos-solicitante-local-web/div[2]/form/div/div[5]/label/span[2]");
    By btnConfirmaPasos = By.xpath("//*[@id=\'siguientePaso\']");
    
  //****************   METODOS   *******************
    
    public void CompletarDatosActivacion(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(10000);
    	String Valor = obtenerTexto(textoCompletaDatosActivacion);
    	Assert.assertEquals("Completa los datos de activación", Valor);
    	agregarTexto("TEST", txtNombreComercio);
    	agregarTexto("www.test.cl", txtURL);
    	Thread.sleep(3000);
    	click(listaComercio);
    	Thread.sleep(1000);
    	click(btnSeleccionarComercio);
    	Thread.sleep(3000);
    	click(btnRealizarasTuIntegracion);
    	Thread.sleep(2000);
    	click(btnConfirmaDatosSolicitante2);
    	Thread.sleep(3000);
    	click(btnConfirmaPasos);
    }//CompletarDatosActivacion

    public void CompletarDatosActivacionDeseo(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(10000);
    	String Valor = obtenerTexto(textoCompletaDatosActivacion);
    	Assert.assertEquals("Completa los datos de activación", Valor);
    	agregarTexto("TEST", txtNombreComercio);
    	agregarTexto("www.test.cl", txtURL);
    	Thread.sleep(3000);
    	click(listaComercio);
    	Thread.sleep(1000);
    	click(btnSeleccionarComercio);
    	Thread.sleep(2000);
    	click(btnConfirmarDatosSolicitante);
    	Thread.sleep(3000);
    	click(btnConfirmaPasos);
    }//CompletarDatosActivacion
    
    
}// fin PageCompletaDatosActivacion

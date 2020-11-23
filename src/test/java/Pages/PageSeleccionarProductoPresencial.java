package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilidades.ClaseBase;

public class PageSeleccionarProductoPresencial extends ClaseBase{

	WebDriverWait wait;
	
	public PageSeleccionarProductoPresencial(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	//****************   OBJETOS   *******************
	

	
	
	// By btnPresencial = By.xpath("//*[@id='presencial']']");
	By textoVenderDeForma = By.xpath("/html/body/div/div/div/app-root/app-inicio-v2/div/div[2]/div[1]/div[1]/div[2]/app-como-vender-question/div/h5/span");
    By btnPresencial = By.xpath("/html/body/div/div/div/app-root/app-inicio-v2/div/div[2]/div[1]/div[1]/div[2]/app-como-vender-question/div/button[1]");
    
    By btnPermanente = By.xpath("//*[@id='permanente']");
    By btnTemporal = By.xpath("//*[@id='temporal']");
    By btnFYE = By.xpath("//*[@id='feriaEvento']");

    By btnNuevoLocal = By.xpath("//*[@id='nuevoLocal']");
    By btnLocalExistente = By.xpath("//*[@id='localExistente']");
    By btnLocalCarmen1 = By.xpath("//*[@id='selectLocal']/div/span");
    By btnLocalCarmen2 = By.xpath("/html/body/ng-dropdown-panel/div/div[2]/div");
    
    By btnSiguiente = By.xpath("//*[@id='siguientePregunta']/p");
	
    //*********Soluciones para ventas Presenciales
    By textoProductosRecomendados = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-equipos/app-wizard-master/div[3]/div[1]/h4");
    
    By btnCerrar = By.xpath("//*[@id='cerrarModalCorona1']/span");
    By txtPosFijo = By.xpath("//*[@id='cantidadEquipos_1']");
    By txtPosFijoJessi = By.xpath("//*[@id='cantidadEquipos_2']");
    By btnTipoPosFijo1 = By.xpath("//*[@id='seleccionConexion']/div/span");
    By btnTipoPosFijoJessi = By.xpath("//*[@id='seleccionConexion']/div/span");
    By btnCableInternetJessi = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-equipos/app-wizard-master/div[3]/app-box-productos/form/div/div[3]/div[5]/div/div[2]/label/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
    By btnCableInternet = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-equipos/app-wizard-master/div[3]/app-box-productos/form/div/div[2]/div[5]/div/div[2]/label/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
    By btn3g = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-equipos/app-wizard-master/div[3]/app-box-productos/form/div/div[2]/div[5]/div/div[2]/label/ng-select/ng-dropdown-panel/div/div[2]/div[2]/span");
   
    By txtPosMovil = By.xpath("//*[@id='cantidadEquipos_2']");
	By txtPosTemporal = By.xpath("//*[@id='cantidadEquipos_0']");
	
	By btnGuardarYContinuar4 = By.xpath("//*[@id='guardarContinuar']/span");
    
    
  //****************   METODOS   *******************
    

public void VenderPresencialPermanenteNuevoLocalPosFijo(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	//wait.until(ExpectedConditions.elementToBeClickable(btnPresencial));
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(4000);
	//wait.until(ExpectedConditions.elementToBeClickable(btnPermanente));
	click(btnPermanente);
	click(btnSiguiente);
	Thread.sleep(4000);
	//wait.until(ExpectedConditions.elementToBeClickable(btnNuevoLocal));
	click(btnNuevoLocal);
	click(btnSiguiente);
	Thread.sleep(5000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosFijo);
	click(btnTipoPosFijo1);
	click(btnCableInternet);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteNuevoLocalPosFijo

public void VenderPresencialPermanenteNuevoLocalPosFijoJessi(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	//wait.until(ExpectedConditions.elementToBeClickable(btnPresencial));
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(4000);
	//wait.until(ExpectedConditions.elementToBeClickable(btnPermanente));
	click(btnPermanente);
	click(btnSiguiente);
	Thread.sleep(4000);
	//wait.until(ExpectedConditions.elementToBeClickable(btnNuevoLocal));
	click(btnNuevoLocal);
	click(btnSiguiente);
	Thread.sleep(5000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosFijoJessi);
	Thread.sleep(2000);
	click(btnTipoPosFijoJessi);
	click(btnCableInternetJessi);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteNuevoLocalPosFijo


public void VenderPresencialPermanenteNuevoLocalPosMovil(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(6000);
	click(btnPermanente);
	click(btnSiguiente);
	Thread.sleep(6000);
	click(btnNuevoLocal);
	click(btnSiguiente);
	Thread.sleep(9000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosMovil);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteNuevoLocalPosMovil

public void VenderPresencialPermanenteNuevoLocalPosMovilJessi(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(6000);
	click(btnPermanente);
	click(btnSiguiente);
	Thread.sleep(6000);
	click(btnNuevoLocal);
	click(btnSiguiente);
	Thread.sleep(9000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosMovil);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteNuevoLocalPosMovil

public void VenderPresencialPermanenteLocalExistentePosFijo(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnPermanente);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnLocalExistente);
	click(btnLocalCarmen1);
	click(btnLocalCarmen2);
	click(btnSiguiente);
	Thread.sleep(5000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosFijo);
	click(btnTipoPosFijo1);
	click(btnCableInternet);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteLocalExistentePosFijo

public void VenderPresencialPermanenteLocalExistentePosMovil(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnPermanente);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnLocalExistente);
	click(btnLocalCarmen1);
	click(btnLocalCarmen2);
	click(btnSiguiente);
	Thread.sleep(5000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosMovil);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteLocalExistentePosMovil


public void VenderPresencialTemporalLocalExistente(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnTemporal);
	Thread.sleep(1000);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnLocalExistente);
	click(btnLocalCarmen1);
	click(btnLocalCarmen2);
	click(btnSiguiente);
	Thread.sleep(5000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosTemporal);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteLocalExistentePosMovil

public void VenderPresencialTemporalNuevoLocal(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(20000);
	click(btnPresencial);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnTemporal);
	Thread.sleep(1000);
	click(btnSiguiente);
	Thread.sleep(4000);
	click(btnNuevoLocal);
	click(btnSiguiente);
	Thread.sleep(5000);
	click(btnCerrar);
	String Valor = obtenerTexto(textoProductosRecomendados);
	Assert.assertEquals("Productos recomendados", Valor);
	agregarTexto("1", txtPosTemporal);
	click(btnGuardarYContinuar4);
}//fin VenderPresencialPermanenteLocalExistentePosMovil

    
    
}// fin PageSeleccionarProductoPresencial

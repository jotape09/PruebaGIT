package Pages;

import javax.swing.SwingUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

import Utilidades.ClaseBase;

public class PagePortal extends ClaseBase{

	WebDriverWait wait;
	
	public PagePortal(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//*********Provocan ERROR
   // By btnContratarProducto = By.xpath("//*[@id='contratarNuevo']/p");
    By btnSiguiente = By.xpath("//*[@id='siguientePregunta']/p");
    By btnGuardarYContinuar = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-productos-web/app-wizard-master/div[3]/div[3]/div[2]/button/span");
    
       /*
    //*********Datos Local y Solicitante (Presencial)
    By textoDatosSolicitante = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[1]/h4");
    
    By txtNombreFantasia = By.xpath("//*[@id='inputNombreFantasia']");
    By txtCalle = By.xpath("//*[@id='calleLocal']");
    By txtNumero = By.xpath("//*[@id='numeroCalleLocal']");
    By txtOficina = By.xpath("//*[@id='oficinaCalleLocal']");
    By btnRegion1 = By.xpath("//*[@id='selectRegion']/div/span");
    By btnRegion2 = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[2]/app-datos-direccion-nuevo-local/form/div/div[2]/div[7]/label/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
    By btnCiudad1 = By.xpath("//*[@id='selectCiudad']/div/span");
    By btnCiudad2 = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[2]/app-datos-direccion-nuevo-local/form/div/div[2]/div[8]/label/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
    By btnComuna1 = By.xpath("//*[@id='selectComuna']/div/span");
    By btnComuna2 = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[2]/app-datos-direccion-nuevo-local/form/div/div[2]/div[9]/label/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
    //By btnConfirmaDatosSolicitante = By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[3]/app-datos-solicitante-nuevo-local/div[2]/div/form/div/div[5]/label/span[1]");
    By btnConfirmaDatosSolicitante = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[3]/app-datos-solicitante-nuevo-local/div[2]/div/form/div/div[5]/label/span[2]");
    By btnConfirmaDatosSolicitanteJessi = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[3]/app-datos-solicitante-nuevo-local/div[2]/div/form/div/div[5]/label/span[2]");
    By btnConfirmaDatosSolicitanteLocalExistente = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-datos-local/app-wizard-master/div[3]/div[3]/app-datos-solicitante-local-existente/div[2]/form/div/div[5]/label/span[1]");
    By btnGuardaryContinuar = By.xpath("//*[@id='siguientePaso']/span");
    */
    //************Agenda la Instalacion de tu Equipo (Presencial)
    By textoAgendarInstalacion = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-agendamiento/app-wizard-master/app-agend-pos-temporal-ad/div/div[1]/h4");
    By textoSolicitudEnviada = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-success/div[1]/div[1]/div[1]/div[2]/span[1]");
    By btnUtilizarDatosSolicitante = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-agendamiento/app-wizard-master/app-agend-normal-ad/div/div[2]/div[2]/app-datos-recepcion/p/label/span[1]");
    By btnUtilizarDatosSolicitanteTemporal = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-agendamiento/app-wizard-master/app-agend-pos-temporal-ad/div/div[2]/div[2]/app-datos-recepcion/p/label/input");
    By btnSiguentePaso = By.xpath("//*[@id='siguientePaso']/span");
    //By btnNombreAgendamiento = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-agendamiento/app-wizard-master/app-agend-pos-temporal-ad/div/div[2]/div[2]/app-datos-recepcion/form/div[1]/label/input");
    //By btnApellidosAgendamiento = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-agendamiento/app-wizard-master/app-agend-pos-temporal-ad/div/div[2]/div[2]/app-datos-recepcion/form/div[2]/label/input");
    //By btnCorreoAgendamiento = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-agendamiento/app-wizard-master/app-agend-pos-temporal-ad/div/div[2]/div[2]/app-datos-recepcion/form/div[3]/label/input");
    //By btnTelefonoAgendamiento = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-agendamiento/app-wizard-master/app-agend-pos-temporal-ad/div/div[2]/div[2]/app-datos-recepcion/form/div[4]/label/span/input");
    
    By btnNombreAgendamiento = By.xpath("//*[@id='nombreReceptor']");
    By btnApellidosAgendamiento = By.xpath("//*[@id='apellidoReceptor']");
    By btnCorreoAgendamiento = By.xpath("//*[@id='emailReceptor']");
    By btnTelefonoAgendamiento = By.xpath("//*[@id='telefonoReceptor']");
    
    

	

	
	
	//***********CONTRATO
	By contrato01 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]");
	By contrato02 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]/div[2]");
	By contrato03 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]/div[3]");
	By contrato04 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]/div[4]");
	By btnHeLeido = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[6]/div/div[1]/label/span[1]");
	By btnFirmar = By.xpath("//*[@id=\"botonFirmar3\"]");
	By txtNumeroDocumento = By.xpath("//*[@id=\'documento\']");
	By txtCorreo = By.xpath("//*[@id=\'correo\']");
	By btnAceptaTerminos = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[5]/div/div/div[2]/div[1]/label/span[1]");
	By txtNotificarYFirmar = By.xpath("//*[@id=\'notificarFirmantes1\']");
	
	/*
public void DatosLocalSolicitante(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(5000);
	String Valor = obtenerTexto(textoDatosSolicitante);
	Assert.assertEquals("Datos de local y solicitante", Valor);
	agregarTexto("TestAutomatizadoJP", txtNombreFantasia);
	agregarTexto("Automatizacion", txtCalle);
	agregarTexto("6", txtNumero);
	agregarTexto("5", txtOficina);
	click(btnRegion1);
	click(btnRegion2);
	Thread.sleep(3000);
	click(btnCiudad1);
	click(btnCiudad2);
	Thread.sleep(3000);
	click(btnComuna1);
	click(btnComuna2);
	Thread.sleep(5000);
	click(btnConfirmaDatosSolicitante);
	Thread.sleep(2000);
	click(btnGuardaryContinuar);
}//CompletarDatosActivacion

public void DatosLocalSolicitanteLocalExistente(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(10000);
	String Valor = obtenerTexto(textoDatosSolicitante);
	Assert.assertEquals("Datos de local y solicitante", Valor);
	click(btnConfirmaDatosSolicitanteLocalExistente);
	Thread.sleep(3000);
	click(btnGuardaryContinuar);
}//CompletarDatosActivacion
*/
public void AgendarInstalacion(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(10000);
	//String Valor = obtenerTexto(textoAgendarInstalacion);
	//Assert.assertEquals("Agenda la entrega de tu equipo", Valor);
	//click(btnUtilizarDatosSolicitante);
	agregarTexto("TestNombre", btnNombreAgendamiento);
	agregarTexto("TestApellido", btnApellidosAgendamiento);
	agregarTexto("test@test.cl", btnCorreoAgendamiento);
	agregarTexto("987654321", btnTelefonoAgendamiento);
	Thread.sleep(1000);
	click(btnSiguentePaso);
	Thread.sleep(15000);
	String Valor2 = obtenerTexto(textoSolicitudEnviada);
	Assert.assertEquals("Tu solicitud ha sido enviada", Valor2);
}//CompletarDatosActivacion

public void AgendarInstalacionTemporal(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(10000);
	//String Valor = obtenerTexto(textoAgendarInstalacion);
	//Assert.assertEquals("Agenda la entrega de tu equipo", Valor);
	agregarTexto("TestNombre", btnNombreAgendamiento);
	agregarTexto("TestApellido", btnApellidosAgendamiento);
	agregarTexto("test@test.cl", btnCorreoAgendamiento);
	agregarTexto("987654321", btnTelefonoAgendamiento);
	Thread.sleep(1000);
	click(btnSiguentePaso);
	Thread.sleep(15000);
	String Valor2 = obtenerTexto(textoSolicitudEnviada);
	Assert.assertEquals("Tu solicitud ha sido enviada", Valor2);
}//CompletarDatosActivacion







/*
//contrato completo
public String Contrato1(WebDriver driver) throws InterruptedException {
	Thread.sleep(20000);
	String contrato1 = null;
	contrato1 = obtenerTexto(contrato01);
	System.out.println(contrato1);
	return contrato1;
}//fin contrato
/*/


// solo el numero de folio
public String Contrato2(WebDriver driver) throws InterruptedException {
	Thread.sleep(20000);
	String contrato2 = null;
	contrato2 = obtenerTexto(contrato02);
	System.out.println(contrato2);
	return contrato2;
}//fin contrato

/*
public void FirmaContratoCarmen() throws InterruptedException {
	click(btnHeLeido);
	Thread.sleep(2000);
	click(btnFirmar);
	Thread.sleep(20000);
}// fin ConirmaDatosSolicitud

public void FirmaContratoBryan() throws InterruptedException {
	agregarTexto("A031849964", txtNumeroDocumento);
	agregarTexto("juan.fuentes.tsoft@gmail.com", txtCorreo);
	click(btnAceptaTerminos);
	Thread.sleep(2000);
	click(txtNotificarYFirmar);
	Thread.sleep(20000);

}// fin ConirmaDatosSolicitud


//numero 1, no se que imprime
public String Contrato3(WebDriver driver) {
	String contrato3 = null;
	contrato3 = obtenerTexto(contrato03);
	System.out.println(contrato3);
	return contrato3;
}//fin contrato


// imprime el contrato por lineal
public String Contrato4(WebDriver driver) {
	String contrato4 = null;
	contrato4 = obtenerTexto(contrato04);
	System.out.println(contrato4);
	return contrato4;
}//fin contrato
*/


/*
public void seleccionarCombobox(WebDriver driver) {

Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id=\'direccionExistente\']/div/div/div[2]")));

drpCountry.selectByVisibleText("39305321");


}// fin metodo
*/

}

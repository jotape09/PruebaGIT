package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilidades.ClaseBase;

public class PageDatosLocalSolicitante extends ClaseBase{

	public PageDatosLocalSolicitante(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	
	//********* OBJETOS
	
	
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
	
    
    
  //********* METODOS
    
    
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
    
    
}// fin PageDatosLocalSolicitante

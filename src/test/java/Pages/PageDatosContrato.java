package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilidades.ClaseBase;

public class PageDatosContrato extends ClaseBase{

	public PageDatosContrato(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} // fin constructor
	
	//*************** OBJETOS
	
	//**********Completa Tus Datos
	By txtRutCarmenGloria = By.xpath("//*[@id=\'numeroDocumento\']");
	By txtCorreoCarmenGloria = By.xpath("//*[@id=\'correo\']");
	By btnContinuarCompletaDatos = By.xpath("//*[@id=\'continuarFlujoFirma1\']");

	
	
	
	//*************** METODOS
	
	public void CompletaDatosCarmen() throws InterruptedException {
		System.out.println("**********************************Entra");
		Thread.sleep(15000);
		agregarTexto("103747733", txtRutCarmenGloria);
		agregarTexto("juan.fuentes.tsoft@gmail.com", txtCorreoCarmenGloria);
		Thread.sleep(2000);
		click(btnContinuarCompletaDatos);	
		System.out.println("**********************************SALE");
	}// fin ConirmaDatosSolicitud

	public void CompletaDatosBryan() throws InterruptedException {
		Thread.sleep(5000);
		click(btnContinuarCompletaDatos);
		//Thread.sleep(10000);
	}// fin ConirmaDatosSolicitud
	
}// fin PageDatosContrato

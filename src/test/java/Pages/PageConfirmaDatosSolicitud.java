package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilidades.ClaseBase;

public class PageConfirmaDatosSolicitud extends ClaseBase{

	WebDriverWait wait;
	
	public PageConfirmaDatosSolicitud(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	//*********************** METODOS *****************
	
	//**********Confirma Datos Solicitud
	By textoConfirmaDatosSolicitud = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-resumen/app-wizard-master/div[3]/div[1]/h4");
	
	By btnConfirmaDatosSolicitud = By.xpath("//*[@id=\'siguientePaso\']/span");
	
	
	
	//*********************** METODOS *****************
	public void ConfirmaDatosSolicitud() throws InterruptedException {
		Thread.sleep(10000);
		click(btnConfirmaDatosSolicitud);
		Thread.sleep(10000);
		
	}// fin ConirmaDatosSolicitud
	
}// fin PageConfirmaDatosSolicitud

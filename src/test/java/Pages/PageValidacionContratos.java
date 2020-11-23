package Pages;

import javax.swing.SwingUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

import Utilidades.ClaseBase;

public class PageValidacionContratos extends ClaseBase {

	public PageValidacionContratos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor
	
	
	//**************** OBJETOS ********
	
	By ContratoCompleto = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]");
	By ContratoCompletoWebPayCL = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]");
	//By ContratoCompletoWebPayCL1 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[1]");
	//By ContratoCompletoWebPayCL2 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]");
	//By ContratoCompletoWebPayCL3 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]/div[1]");
	By contrato02 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]/div[2]");
	By contrato03 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]/div[3]");
	By contrato04 = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[3]/div/pdf-viewer/div/div/div[1]/div[2]/div[4]");
	By btnHeLeido = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[6]/div/div[1]/label/span[1]");
	By btnFirmar = By.xpath("//*[@id=\"botonFirmar3\"]");
	By txtNumeroDocumento = By.xpath("//*[@id=\'documento\']");
	By txtCorreo = By.xpath("//*[@id=\'correo\']");
	By btnAceptaTerminos = By.xpath("/html/body/app-root/app-home/div/div/app-contrato/div/div[2]/div[5]/div/div/div[2]/div[1]/label/span[1]");
	By txtNotificarYFirmar = By.xpath("//*[@id=\'notificarFirmantes1\']");
	By m4p1 = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-contrato/div/div/div/div[2]/p[1]");
	By m4p2 = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-contrato/div/div/div/div[2]/p[2]");
	By m4p3 = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-contrato/div/div/div/div[2]/p[3]");
	By btnm4p = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-contrato/div/div/div/div[2]/p[4]/button");
	//By btnm4p = By.xpath("//*[@id='aceptarModalM4p']");
	
	
	//**************** METODOS ********

	//contrato completo
	public String ContratoPosPermanenteJessi(WebDriver driver) throws InterruptedException {
		Thread.sleep(25000);
		String ValorContratoPresencial = null;
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-contrato/app-wizard-master/iframe")));
		ValorContratoPresencial = obtenerTexto(ContratoCompleto);
		//System.out.println(ValorContratoPresencial);
		//String contrato1Antes = null;
		String contrato1Antes1 = ("POR   EL   PRESENTE   INSTRUMENTO,   EL   ESTABLECIMIENTO   COMERCIAL");
		String contrato1Antes2 = ("INDIVIDUALIZADO MAS ADELANTE, ACEPTA EN TODAS SUS PARTES LA CONTRATACIÓN"); 
		String contrato1Antes3 = ("DE PRODUCTOS O MODIFICACIÓN DE ESTOS QUE SE HA EFECTUADO CON"); 
		String contrato1Antes4 = ("CONTENIDA  PRECEDENTEMENTE,  RELATIVA  A  LA  INCORPORACIÓN  DE  NUEVOS");
		String contrato1Antes5 = ("PRODUCTOS  O  MODIFICACIÓN  DE  PRODUCTOS  PREVIAMENTE  CONTRATADOS,");
		String contrato1Antes6 = ("DETALLADOS EN LOS ANEXOS O FORMULARIOS");
		String contrato1Antes7 = ("MODIFICACIÓN CUOTAS SIN INTERES.");
		String contrato1Antes8 = ("El (los) firmante(s) declaran que los datos del Establecimiento aquí consignados son verídicos,");
		String contrato1Antes9 = ("que lo representa(n) legalmente con las facultades para suscribir este Anexo y que ha(n) leído y");
		String contrato1Antes10 = ("acepta(n) en todas sus partes el texto del Anexo, respecto del cual Transbank le(s) proporcionó");
		String contrato1Antes11 = ("una acabada información.");
		String contrato1Antes12 = ("FIRMA ESTABLECIMIENTO COMERCIAL");
		String contrato1Antes13 = ("FIRMAS TRANSBANK");
		String contrato1Antes14 = ("p.p TRANSBANK S.A.");
		String contrato1Antes15 = ("p.p TRANSBANK S.A.");
		
		//System.out.println("***********************************************************");
		int cont = 0;
		boolean Vcontrato1 = (ValorContratoPresencial.contains(contrato1Antes1));
		if(Vcontrato1 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato2 = (ValorContratoPresencial.contains(contrato1Antes2));
		if(Vcontrato2 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato3 = (ValorContratoPresencial.contains(contrato1Antes3));
		if(Vcontrato3 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato4 = (ValorContratoPresencial.contains(contrato1Antes4));
		if(Vcontrato4 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato5 = (ValorContratoPresencial.contains(contrato1Antes5));
		if(Vcontrato5 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato6 = (ValorContratoPresencial.contains(contrato1Antes6));
		if(Vcontrato6 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato7 = (ValorContratoPresencial.contains(contrato1Antes7));
		if(Vcontrato7 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato8 = (ValorContratoPresencial.contains(contrato1Antes8));
		if(Vcontrato8 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato9 = (ValorContratoPresencial.contains(contrato1Antes9));
		if(Vcontrato9 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato10 = (ValorContratoPresencial.contains(contrato1Antes10));
		if(Vcontrato10 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato11 = (ValorContratoPresencial.contains(contrato1Antes11));
		if(Vcontrato11 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato12 = (ValorContratoPresencial.contains(contrato1Antes12));
		if(Vcontrato12 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato13 = (ValorContratoPresencial.contains(contrato1Antes13));
		if(Vcontrato13 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato14 = (ValorContratoPresencial.contains(contrato1Antes14));
		if(Vcontrato14 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato15 = (ValorContratoPresencial.contains(contrato1Antes15));
		if(Vcontrato15 == false) {
			cont = cont + 1;
		}// fin if

		//System.out.println("***********************************************************");
		if(cont == 0) {
			return "OK";
		}else{
			return "NOK";
		}// fin if
		
	}//fin ContratoPosPermanente
	
	
	//contrato completo
	public String ContratoPosPermanente(WebDriver driver) throws InterruptedException {
		Thread.sleep(25000);
		String ValorContratoPresencial = null;
	    //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-contrato/app-wizard-master/iframe")));
		ValorContratoPresencial = obtenerTexto(ContratoCompleto);
		//System.out.println(contrato1);
		//String contrato1Antes = null;
		String contrato1Antes1 = ("POR   EL   PRESENTE   INSTRUMENTO,   EL   ESTABLECIMIENTO   COMERCIAL");
		String contrato1Antes2 = ("INDIVIDUALIZADO MAS ADELANTE, ACEPTA EN TODAS SUS PARTES LA CONTRATACIÓN"); 
		String contrato1Antes3 = ("DE PRODUCTOS O MODIFICACIÓN DE ESTOS QUE SE HA EFECTUADO CON"); 
		String contrato1Antes4 = ("CONTENIDA  PRECEDENTEMENTE,  RELATIVA  A  LA  INCORPORACIÓN  DE  NUEVOS");
		String contrato1Antes5 = ("PRODUCTOS  O  MODIFICACIÓN  DE  PRODUCTOS  PREVIAMENTE  CONTRATADOS");
		String contrato1Antes6 = ("DETALLADOS  EN  LOS  ANEXOS  O  FORMULARIOS");
		String contrato1Antes7 = ("ANEXO  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes8 = ("COBRO  QR,  CONTRATO  DE  AFILIACIÓN  VERSIÓN  JULIO  DE  2020,  ANEXO  PAGO  EN");
		String contrato1Antes9 = ("CUOTAS CON TARJETAS DE CRÉDITO CONTRATO DE AFILIACIÓN VERSIÓN ABRIL DE");
		String contrato1Antes10 = ("2020.");
		String contrato1Antes11 = ("El (los) firmante(s) declaran que los datos del Establecimiento aquí consignados son verídicos,");
		String contrato1Antes12 = ("que lo representa(n) legalmente con las facultades para suscribir este Anexo y que ha(n) leído y");
		String contrato1Antes13 = ("acepta(n) en todas sus partes el texto del Anexo, respecto del cual Transbank le(s) proporcionó");
		String contrato1Antes14 = ("una acabada información.");
		String contrato1Antes15 = ("FIRMA ESTABLECIMIENTO COMERCIAL");
		String contrato1Antes16 = ("FIRMAS TRANSBANK");
		String contrato1Antes17 = ("p.p TRANSBANK S.A.");
		String contrato1Antes18 = ("p.p TRANSBANK S.A.");
		
		//System.out.println("***********************************************************");
		int cont = 0;
		boolean Vcontrato1 = (ValorContratoPresencial.contains(contrato1Antes1));
		if(Vcontrato1 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato2 = (ValorContratoPresencial.contains(contrato1Antes2));
		if(Vcontrato2 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato3 = (ValorContratoPresencial.contains(contrato1Antes3));
		if(Vcontrato3 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato4 = (ValorContratoPresencial.contains(contrato1Antes4));
		if(Vcontrato4 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato5 = (ValorContratoPresencial.contains(contrato1Antes5));
		if(Vcontrato5 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato6 = (ValorContratoPresencial.contains(contrato1Antes6));
		if(Vcontrato6 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato7 = (ValorContratoPresencial.contains(contrato1Antes7));
		if(Vcontrato7 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato8 = (ValorContratoPresencial.contains(contrato1Antes8));
		if(Vcontrato8 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato9 = (ValorContratoPresencial.contains(contrato1Antes9));
		if(Vcontrato9 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato10 = (ValorContratoPresencial.contains(contrato1Antes10));
		if(Vcontrato10 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato11 = (ValorContratoPresencial.contains(contrato1Antes11));
		if(Vcontrato11 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato12 = (ValorContratoPresencial.contains(contrato1Antes12));
		if(Vcontrato12 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato13 = (ValorContratoPresencial.contains(contrato1Antes13));
		if(Vcontrato13 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato14 = (ValorContratoPresencial.contains(contrato1Antes14));
		if(Vcontrato14 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato15 = (ValorContratoPresencial.contains(contrato1Antes15));
		if(Vcontrato15 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato16 = (ValorContratoPresencial.contains(contrato1Antes16));
		if(Vcontrato16 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato17 = (ValorContratoPresencial.contains(contrato1Antes17));
		if(Vcontrato17 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato18 = (ValorContratoPresencial.contains(contrato1Antes18));
		if(Vcontrato18 == false) {
			cont = cont + 1;
		}// fin if
		//System.out.println("***********************************************************");
		if(cont == 0) {
			return "OK";
		}else{
			return "NOK";
		}// fin if
		
	}//fin ContratoPosPermanente
	
	
	//contrato completo
	public String ContratoPosPermanenteSinM4P(WebDriver driver) throws InterruptedException {
		Thread.sleep(25000);
		String ValorContratoPresencial = null;
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-contrato/app-wizard-master/iframe")));
		ValorContratoPresencial = obtenerTexto(ContratoCompleto);
		//System.out.println(ValorContratoPresencial);
		//String contrato1Antes = null;
		String contrato1Antes1 = ("POR   EL   PRESENTE   INSTRUMENTO,   EL   ESTABLECIMIENTO   COMERCIAL");
		String contrato1Antes2 = ("INDIVIDUALIZADO MAS ADELANTE, ACEPTA EN TODAS SUS PARTES LA CONTRATACIÓN"); 
		String contrato1Antes3 = ("DE PRODUCTOS O MODIFICACIÓN DE ESTOS QUE SE HA EFECTUADO CON"); 
		String contrato1Antes4 = ("CONTENIDA  PRECEDENTEMENTE,  RELATIVA  A  LA  INCORPORACIÓN  DE  NUEVOS");
		String contrato1Antes5 = ("PRODUCTOS  O  MODIFICACIÓN  DE  PRODUCTOS  PREVIAMENTE  CONTRATADOS");
		String contrato1Antes6 = ("DETALLADOS  EN  LOS  ANEXOS  O  FORMULARIOS");
		String contrato1Antes7 = ("ANEXO  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes8 = ("COBRO  QR,  CONTRATO  DE  AFILIACIÓN  VERSIÓN  JULIO  DE  2020,  ANEXO  PAGO  EN");
		String contrato1Antes9 = ("CUOTAS CON TARJETAS DE CRÉDITO CONTRATO DE AFILIACIÓN VERSIÓN ABRIL DE");
		String contrato1Antes10 = ("2020.");
		String contrato1Antes11 = ("El (los) firmante(s) declaran que los datos del Establecimiento aquí consignados son verídicos,");
		String contrato1Antes12 = ("que lo representa(n) legalmente con las facultades para suscribir este Anexo y que ha(n) leído y");
		String contrato1Antes13 = ("acepta(n) en todas sus partes el texto del Anexo, respecto del cual Transbank le(s) proporcionó");
		String contrato1Antes14 = ("una acabada información.");
		String contrato1Antes15 = ("FIRMA ESTABLECIMIENTO COMERCIAL");
		String contrato1Antes16 = ("FIRMAS TRANSBANK");
		String contrato1Antes17 = ("p.p TRANSBANK S.A.");
		String contrato1Antes18 = ("p.p TRANSBANK S.A.");
		
		//System.out.println("***********************************************************");
		int cont = 0;
		boolean Vcontrato1 = (ValorContratoPresencial.contains(contrato1Antes1));
		if(Vcontrato1 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato2 = (ValorContratoPresencial.contains(contrato1Antes2));
		if(Vcontrato2 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato3 = (ValorContratoPresencial.contains(contrato1Antes3));
		if(Vcontrato3 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato4 = (ValorContratoPresencial.contains(contrato1Antes4));
		if(Vcontrato4 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato5 = (ValorContratoPresencial.contains(contrato1Antes5));
		if(Vcontrato5 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato6 = (ValorContratoPresencial.contains(contrato1Antes6));
		if(Vcontrato6 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato7 = (ValorContratoPresencial.contains(contrato1Antes7));
		if(Vcontrato7 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato8 = (ValorContratoPresencial.contains(contrato1Antes8));
		if(Vcontrato8 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato9 = (ValorContratoPresencial.contains(contrato1Antes9));
		if(Vcontrato9 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato10 = (ValorContratoPresencial.contains(contrato1Antes10));
		if(Vcontrato10 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato11 = (ValorContratoPresencial.contains(contrato1Antes11));
		if(Vcontrato11 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato12 = (ValorContratoPresencial.contains(contrato1Antes12));
		if(Vcontrato12 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato13 = (ValorContratoPresencial.contains(contrato1Antes13));
		if(Vcontrato13 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato14 = (ValorContratoPresencial.contains(contrato1Antes14));
		if(Vcontrato14 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato15 = (ValorContratoPresencial.contains(contrato1Antes15));
		if(Vcontrato15 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato16 = (ValorContratoPresencial.contains(contrato1Antes16));
		if(Vcontrato16 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato17 = (ValorContratoPresencial.contains(contrato1Antes17));
		if(Vcontrato17 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato18 = (ValorContratoPresencial.contains(contrato1Antes18));
		if(Vcontrato18 == false) {
			cont = cont + 1;
		}// fin if
		//System.out.println("***********************************************************");
		if(cont == 0) {
			return "OK";
		}else{
			return "NOK";
		}// fin if
		
	}//fin ContratoPosPermanenteSinM4P
	
	
	public String ContratoWebPayCLSinCuotas(WebDriver driver) throws InterruptedException {
		Thread.sleep(30000);
		//System.out.println("Llego al contrato");
		String ValorContratoWebPayCL1 = null;
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-contrato/app-wizard-master/iframe")));
		ValorContratoWebPayCL1 = obtenerTexto(ContratoCompleto);
		//System.out.println(ValorContratoWebPayCL1);
		String contrato1Antes1 = ("POR   EL   PRESENTE   INSTRUMENTO,   EL   ESTABLECIMIENTO   COMERCIAL");
		String contrato1Antes2 = ("INDIVIDUALIZADO MAS ADELANTE, ACEPTA EN TODAS SUS PARTES LA CONTRATACIÓN"); 
		String contrato1Antes3 = ("DE PRODUCTOS O MODIFICACIÓN DE ESTOS QUE SE HA EFECTUADO CON "); 
		String contrato1Antes4 = ("CONTENIDA  PRECEDENTEMENTE,  RELATIVA  A  LA  INCORPORACIÓN  DE  NUEVOS");
		String contrato1Antes5 = ("PRODUCTOS  O  MODIFICACIÓN  DE  PRODUCTOS  PREVIAMENTE  CONTRATADOS,");
		String contrato1Antes6 = ("DETALLADOS  EN  LOS  ANEXOS  O  FORMULARIOS ");
		String contrato1Antes7 = ("ANEXO  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes8 = ("SISTEMAS  DE  TARJETAS  DE  CRÉDITO  Y  DE  TARJETAS  DE  DÉBITO  VENTAS  POR");
		String contrato1Antes9 = ("INTERNET  VERSIÓN  ABRIL  2020,  ANEXO  CONTRATO  AFILIACIÓN  SISTEMAS  DE");
		String contrato1Antes10 = ("TARJETAS DE CRÉDITO Y DE TARJETAS DE DÉBITO INCORPORACIÓN A SISTEMA DE");
		String contrato1Antes11 = ("PAGO POR INTERNET EN MODALIDAD DE DEUDA NO PUBLICADA VERSIÓN ABRIL DE");
		String contrato1Antes12 = ("2020,  ANEXO  CONTRATO  DE  AFILIACIÓN  COBRO  QR,  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes13 = ("VERSIÓN JULIO DE 2020.");
		String contrato1Antes14 = ("El (los) firmante(s) declaran que los datos del Establecimiento aquí consignados son verídicos,");
		String contrato1Antes15 = ("que lo representa(n) legalmente con las facultades para suscribir este Anexo y que ha(n) leído y");
		String contrato1Antes16 = ("acepta(n) en todas sus partes el texto del Anexo, respecto del cual Transbank le(s) proporcionó");
		String contrato1Antes17 = ("una acabada información.");

		
		//System.out.println("***********************************************************");
		int cont = 0;
		boolean Vcontrato1 = (ValorContratoWebPayCL1.contains(contrato1Antes1));
		if(Vcontrato1 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato2 = (ValorContratoWebPayCL1.contains(contrato1Antes2));
		if(Vcontrato2 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato3 = (ValorContratoWebPayCL1.contains(contrato1Antes3));
		if(Vcontrato3 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato4 = (ValorContratoWebPayCL1.contains(contrato1Antes4));
		if(Vcontrato4 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato5 = (ValorContratoWebPayCL1.contains(contrato1Antes5));
		if(Vcontrato5 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato6 = (ValorContratoWebPayCL1.contains(contrato1Antes6));
		if(Vcontrato6 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato7 = (ValorContratoWebPayCL1.contains(contrato1Antes7));
		if(Vcontrato7 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato8 = (ValorContratoWebPayCL1.contains(contrato1Antes8));
		if(Vcontrato8 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato9 = (ValorContratoWebPayCL1.contains(contrato1Antes9));
		if(Vcontrato9 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato10 = (ValorContratoWebPayCL1.contains(contrato1Antes10));
		if(Vcontrato10 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato11 = (ValorContratoWebPayCL1.contains(contrato1Antes11));
		if(Vcontrato11 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato12 = (ValorContratoWebPayCL1.contains(contrato1Antes12));
		if(Vcontrato12 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato13 = (ValorContratoWebPayCL1.contains(contrato1Antes13));
		if(Vcontrato13 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato14 = (ValorContratoWebPayCL1.contains(contrato1Antes14));
		if(Vcontrato14 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato15 = (ValorContratoWebPayCL1.contains(contrato1Antes15));
		if(Vcontrato15 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato16 = (ValorContratoWebPayCL1.contains(contrato1Antes16));
		if(Vcontrato16 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato17 = (ValorContratoWebPayCL1.contains(contrato1Antes17));
		if(Vcontrato17 == false) {
			cont = cont + 1;
		}// fin if
		//System.out.println("***********************************************************");
		if(cont == 0) {
			return "OK";
		}else{
			return "NOK";
		}// fin if
	}//fin ContratoWebPayCL
	
	
	public String ContratoWebPayCLConCuotas(WebDriver driver) throws InterruptedException {
		Thread.sleep(30000);
		//System.out.println("Llego al contrato");
		String ValorContratoWebPayCL1 = null;
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-contrato/app-wizard-master/iframe")));
		ValorContratoWebPayCL1 = obtenerTexto(ContratoCompleto);
		//System.out.println(ValorContratoWebPayCL1);
		String contrato1Antes1 = ("POR   EL   PRESENTE   INSTRUMENTO,   EL   ESTABLECIMIENTO   COMERCIAL");
		String contrato1Antes2 = ("INDIVIDUALIZADO MAS ADELANTE, ACEPTA EN TODAS SUS PARTES LA CONTRATACIÓN"); 
		String contrato1Antes3 = ("DE PRODUCTOS O MODIFICACIÓN DE ESTOS QUE SE HA EFECTUADO CON "); 
		String contrato1Antes4 = ("CONTENIDA  PRECEDENTEMENTE,  RELATIVA  A  LA  INCORPORACIÓN  DE  NUEVOS");
		String contrato1Antes5 = ("PRODUCTOS  O  MODIFICACIÓN  DE  PRODUCTOS  PREVIAMENTE  CONTRATADOS,");
		String contrato1Antes6 = ("DETALLADOS  EN  LOS  ANEXOS  O  FORMULARIOS ");
		String contrato1Antes7 = ("ANEXO  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes8 = ("SISTEMAS  DE  TARJETAS  DE  CRÉDITO  Y  DE  TARJETAS  DE  DÉBITO  VENTAS  POR");
		String contrato1Antes9 = ("INTERNET  VERSIÓN  ABRIL  2020,  ANEXO  CONTRATO  AFILIACIÓN  SISTEMAS  DE");
		String contrato1Antes10 = ("TARJETAS DE CRÉDITO Y DE TARJETAS DE DÉBITO INCORPORACIÓN A SISTEMA DE");
		String contrato1Antes11 = ("PAGO POR INTERNET EN MODALIDAD DE DEUDA NO PUBLICADA VERSIÓN ABRIL DE");
		String contrato1Antes12 = ("2020,  ANEXO  CONTRATO  DE  AFILIACIÓN  COBRO  QR,  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes13 = ("VERSIÓN JULIO DE 2020.");
		String contrato1Antes14 = ("El (los) firmante(s) declaran que los datos del Establecimiento aquí consignados son verídicos,");
		String contrato1Antes15 = ("que lo representa(n) legalmente con las facultades para suscribir este Anexo y que ha(n) leído y");
		String contrato1Antes16 = ("acepta(n) en todas sus partes el texto del Anexo, respecto del cual Transbank le(s) proporcionó");
		String contrato1Antes17 = ("una acabada información.");

		
		//System.out.println("***********************************************************");
		int cont = 0;
		boolean Vcontrato1 = (ValorContratoWebPayCL1.contains(contrato1Antes1));
		if(Vcontrato1 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato2 = (ValorContratoWebPayCL1.contains(contrato1Antes2));
		if(Vcontrato2 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato3 = (ValorContratoWebPayCL1.contains(contrato1Antes3));
		if(Vcontrato3 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato4 = (ValorContratoWebPayCL1.contains(contrato1Antes4));
		if(Vcontrato4 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato5 = (ValorContratoWebPayCL1.contains(contrato1Antes5));
		if(Vcontrato5 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato6 = (ValorContratoWebPayCL1.contains(contrato1Antes6));
		if(Vcontrato6 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato7 = (ValorContratoWebPayCL1.contains(contrato1Antes7));
		if(Vcontrato7 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato8 = (ValorContratoWebPayCL1.contains(contrato1Antes8));
		if(Vcontrato8 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato9 = (ValorContratoWebPayCL1.contains(contrato1Antes9));
		if(Vcontrato9 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato10 = (ValorContratoWebPayCL1.contains(contrato1Antes10));
		if(Vcontrato10 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato11 = (ValorContratoWebPayCL1.contains(contrato1Antes11));
		if(Vcontrato11 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato12 = (ValorContratoWebPayCL1.contains(contrato1Antes12));
		if(Vcontrato12 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato13 = (ValorContratoWebPayCL1.contains(contrato1Antes13));
		if(Vcontrato13 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato14 = (ValorContratoWebPayCL1.contains(contrato1Antes14));
		if(Vcontrato14 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato15 = (ValorContratoWebPayCL1.contains(contrato1Antes15));
		if(Vcontrato15 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato16 = (ValorContratoWebPayCL1.contains(contrato1Antes16));
		if(Vcontrato16 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato17 = (ValorContratoWebPayCL1.contains(contrato1Antes17));
		if(Vcontrato17 == false) {
			cont = cont + 1;
		}// fin if
		//System.out.println("***********************************************************");
		if(cont == 0) {
			return "OK";
		}else{
			return "NOK";
		}// fin if
	}//fin ContratoWebPayCLConCuotas
	
	
	
	public String ContratoWebPayPlusSinCuotas(WebDriver driver) throws InterruptedException {
		Thread.sleep(30000);
		//System.out.println("Llego al contrato");
		String ValorContratoWebPayPlus1 = null;
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-contrato/app-wizard-master/iframe")));
		ValorContratoWebPayPlus1 = obtenerTexto(ContratoCompleto);
		//System.out.println(ValorContratoWebPayPlus1);
		String contrato1Antes1 = ("POR   EL   PRESENTE   INSTRUMENTO,   EL   ESTABLECIMIENTO   COMERCIAL");
		String contrato1Antes2 = ("INDIVIDUALIZADO MAS ADELANTE, ACEPTA EN TODAS SUS PARTES LA CONTRATACIÓN"); 
		String contrato1Antes3 = ("DE PRODUCTOS O MODIFICACIÓN DE ESTOS QUE SE HA EFECTUADO CON "); 
		String contrato1Antes4 = ("CONTENIDA  PRECEDENTEMENTE,  RELATIVA  A  LA  INCORPORACIÓN  DE  NUEVOS");
		String contrato1Antes5 = ("PRODUCTOS  O  MODIFICACIÓN  DE  PRODUCTOS  PREVIAMENTE  CONTRATADOS,");
		String contrato1Antes6 = ("DETALLADOS  EN  LOS  ANEXOS  O  FORMULARIOS ");
		String contrato1Antes7 = ("ANEXO  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes8 = ("SISTEMAS  DE  TARJETAS  DE  CRÉDITO  Y  DE  TARJETAS  DE  DÉBITO  VENTAS  POR");
		String contrato1Antes9 = ("INTERNET  VERSIÓN  ABRIL  2020,  SUB  ANEXO  CONTRATO  DE  AFILIACIÓN  SERVICIO");
		String contrato1Antes10 = ("VENTAS POR INTERNET WEBPAY - Webservices VERSIÓN JUNIO 2020, ANEXO CONTRATO");
		String contrato1Antes11 = ("DE AFILIACIÓN COBRO QR, CONTRATO DE AFILIACIÓN VERSIÓN JULIO DE 2020.");
		String contrato1Antes12 = ("El (los) firmante(s) declaran que los datos del Establecimiento aquí consignados son verídicos,");
		String contrato1Antes13 = ("que lo representa(n) legalmente con las facultades para suscribir este Anexo y que ha(n) leído y");
		String contrato1Antes14 = ("acepta(n) en todas sus partes el texto del Anexo, respecto del cual Transbank le(s) proporcionó");
		String contrato1Antes15 = ("una acabada información.");
		String contrato1Antes16 = ("FIRMA ESTABLECIMIENTO COMERCIAL");
		String contrato1Antes17 = ("FIRMAS TRANSBANK");

		
		//System.out.println("***********************************************************");
		int cont = 0;
		boolean Vcontrato1 = (ValorContratoWebPayPlus1.contains(contrato1Antes1));
		if(Vcontrato1 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato2 = (ValorContratoWebPayPlus1.contains(contrato1Antes2));
		if(Vcontrato2 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato3 = (ValorContratoWebPayPlus1.contains(contrato1Antes3));
		if(Vcontrato3 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato4 = (ValorContratoWebPayPlus1.contains(contrato1Antes4));
		if(Vcontrato4 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato5 = (ValorContratoWebPayPlus1.contains(contrato1Antes5));
		if(Vcontrato5 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato6 = (ValorContratoWebPayPlus1.contains(contrato1Antes6));
		if(Vcontrato6 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato7 = (ValorContratoWebPayPlus1.contains(contrato1Antes7));
		if(Vcontrato7 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato8 = (ValorContratoWebPayPlus1.contains(contrato1Antes8));
		if(Vcontrato8 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato9 = (ValorContratoWebPayPlus1.contains(contrato1Antes9));
		if(Vcontrato9 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato10 = (ValorContratoWebPayPlus1.contains(contrato1Antes10));
		if(Vcontrato10 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato11 = (ValorContratoWebPayPlus1.contains(contrato1Antes11));
		if(Vcontrato11 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato12 = (ValorContratoWebPayPlus1.contains(contrato1Antes12));
		if(Vcontrato12 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato13 = (ValorContratoWebPayPlus1.contains(contrato1Antes13));
		if(Vcontrato13 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato14 = (ValorContratoWebPayPlus1.contains(contrato1Antes14));
		if(Vcontrato14 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato15 = (ValorContratoWebPayPlus1.contains(contrato1Antes15));
		if(Vcontrato15 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato16 = (ValorContratoWebPayPlus1.contains(contrato1Antes16));
		if(Vcontrato16 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato17 = (ValorContratoWebPayPlus1.contains(contrato1Antes17));
		if(Vcontrato17 == false) {
			cont = cont + 1;
		}// fin if
		//System.out.println("***********************************************************");
		if(cont == 0) {
			return "OK";
		}else{
			return "NOK";
		}// fin if
	}//fin ContratoWebPayCL
	
	public String ContratoWebPayPlusConCuotas(WebDriver driver) throws InterruptedException {
		Thread.sleep(30000);
		//System.out.println("Llego al contrato");
		String ValorContratoWebPayPlus1 = null;
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content-wrapper']/div/app-root/app-agregar-producto/app-contrato/app-wizard-master/iframe")));
		ValorContratoWebPayPlus1 = obtenerTexto(ContratoCompleto);
		//System.out.println(ValorContratoWebPayPlus1);
		String contrato1Antes1 = ("POR   EL   PRESENTE   INSTRUMENTO,   EL   ESTABLECIMIENTO   COMERCIAL");
		String contrato1Antes2 = ("INDIVIDUALIZADO MAS ADELANTE, ACEPTA EN TODAS SUS PARTES LA CONTRATACIÓN"); 
		String contrato1Antes3 = ("DE PRODUCTOS O MODIFICACIÓN DE ESTOS QUE SE HA EFECTUADO CON "); 
		String contrato1Antes4 = ("CONTENIDA  PRECEDENTEMENTE,  RELATIVA  A  LA  INCORPORACIÓN  DE  NUEVOS");
		String contrato1Antes5 = ("PRODUCTOS  O  MODIFICACIÓN  DE  PRODUCTOS  PREVIAMENTE  CONTRATADOS,");
		String contrato1Antes6 = ("DETALLADOS  EN  LOS  ANEXOS  O  FORMULARIOS ");
		String contrato1Antes7 = ("ANEXO  CONTRATO  DE  AFILIACIÓN");
		String contrato1Antes8 = ("SISTEMAS  DE  TARJETAS  DE  CRÉDITO  Y  DE  TARJETAS  DE  DÉBITO  VENTAS  POR");
		String contrato1Antes9 = ("INTERNET  VERSIÓN  ABRIL  2020,  SUB  ANEXO  CONTRATO  DE  AFILIACIÓN  SERVICIO");
		String contrato1Antes10 = ("VENTAS POR INTERNET WEBPAY - Webservices VERSIÓN JUNIO 2020, ANEXO CONTRATO");
		String contrato1Antes11 = ("DE AFILIACIÓN COBRO QR, CONTRATO DE AFILIACIÓN VERSIÓN JULIO DE 2020, ANEXO");
		String contrato1Antes12 = ("PAGO EN CUOTAS CON TARJETAS DE CRÉDITO CONTRATO DE AFILIACIÓN VERSIÓN");
		String contrato1Antes13 = ("ABRIL DE 2020.");
		String contrato1Antes14 = ("El (los) firmante(s) declaran que los datos del Establecimiento aquí consignados son verídicos,");
		String contrato1Antes15 = ("que lo representa(n) legalmente con las facultades para suscribir este Anexo y que ha(n) leído y");
		String contrato1Antes16 = ("acepta(n) en todas sus partes el texto del Anexo, respecto del cual Transbank le(s) proporcionó");
		String contrato1Antes17 = ("una acabada información.");

		
		//System.out.println("***********************************************************");
		int cont = 0;
		boolean Vcontrato1 = (ValorContratoWebPayPlus1.contains(contrato1Antes1));
		if(Vcontrato1 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato2 = (ValorContratoWebPayPlus1.contains(contrato1Antes2));
		if(Vcontrato2 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato3 = (ValorContratoWebPayPlus1.contains(contrato1Antes3));
		if(Vcontrato3 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato4 = (ValorContratoWebPayPlus1.contains(contrato1Antes4));
		if(Vcontrato4 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato5 = (ValorContratoWebPayPlus1.contains(contrato1Antes5));
		if(Vcontrato5 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato6 = (ValorContratoWebPayPlus1.contains(contrato1Antes6));
		if(Vcontrato6 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato7 = (ValorContratoWebPayPlus1.contains(contrato1Antes7));
		if(Vcontrato7 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato8 = (ValorContratoWebPayPlus1.contains(contrato1Antes8));
		if(Vcontrato8 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato9 = (ValorContratoWebPayPlus1.contains(contrato1Antes9));
		if(Vcontrato9 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato10 = (ValorContratoWebPayPlus1.contains(contrato1Antes10));
		if(Vcontrato10 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato11 = (ValorContratoWebPayPlus1.contains(contrato1Antes11));
		if(Vcontrato11 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato12 = (ValorContratoWebPayPlus1.contains(contrato1Antes12));
		if(Vcontrato12 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato13 = (ValorContratoWebPayPlus1.contains(contrato1Antes13));
		if(Vcontrato13 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato14 = (ValorContratoWebPayPlus1.contains(contrato1Antes14));
		if(Vcontrato14 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato15 = (ValorContratoWebPayPlus1.contains(contrato1Antes15));
		if(Vcontrato15 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato16 = (ValorContratoWebPayPlus1.contains(contrato1Antes16));
		if(Vcontrato16 == false) {
			cont = cont + 1;
		}// fin if
		boolean Vcontrato17 = (ValorContratoWebPayPlus1.contains(contrato1Antes17));
		if(Vcontrato17 == false) {
			cont = cont + 1;
		}// fin if
		//System.out.println("***********************************************************");
		if(cont == 0) {
			return "OK";
		}else{
			return "NOK";
		}// fin if
	}//fin ContratoWebPayCL
} //Fin PageValidacionContratos

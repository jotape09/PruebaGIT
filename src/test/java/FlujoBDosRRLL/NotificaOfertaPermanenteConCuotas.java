package FlujoBDosRRLL;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.PageConfirmaDatosSolicitud;
import Pages.PageContratarProducto;
import Pages.PageDatosContrato;
import Pages.PageDatosLocalSolicitante;
import Pages.PagePortal;
import Pages.PagePortalCaracteristicasCuotas;
import Pages.PagePortalLogin;
import Pages.PageRequiereFirmaDigital;
import Pages.PageSeleccionarProductoPresencial;
import Pages.PageSeleccionarRubro;

public class NotificaOfertaPermanenteConCuotas {
	private WebDriver driver;
	PagePortal pagePortal; 
	PagePortalLogin pagePortalLogin;
	PageContratarProducto pageContratarProducto;
	PageSeleccionarRubro pageSeleccionarRubro;
	PageSeleccionarProductoPresencial pageSeleccionarProductoPresencial;
	PagePortalCaracteristicasCuotas pagePortalCaracteristicasCuotas;
	PageConfirmaDatosSolicitud pageConfirmaDatosSolicitud;
	PageRequiereFirmaDigital pageRequiereFirmaDigital;
	PageDatosContrato pageDatosContrato;
	PageDatosLocalSolicitante pageDatosLocalSolicitante;
	
	@BeforeTest
	public void before() {

		 //pagePortal = new PagePortal(driver);
		 //driver = pagePortal.ConexionChromeDriver();
		 //pagePortal.visitarSitio("https://publicoqa.transbank.cl/");

	}//fin before
	
	  @Test
	  public void PresencialPosFijoNuevoLocalConNuevasCuotas() throws IOException, InterruptedException{
		  pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
			 pagePortalLogin.LoginBryan(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarRubro = new PageSeleccionarRubro(driver);
		  pageSeleccionarRubro.SeleccionaRubroBryan(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialPermanenteNuevoLocalPosFijo(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasBryan(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitante(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageRequiereFirmaDigital = new PageRequiereFirmaDigital(driver);
		  pageRequiereFirmaDigital.RequiereFirmaDigital(driver);
		  pageDatosContrato = new PageDatosContrato(driver);
		  pageDatosContrato.CompletaDatosBryan();
		  //pagePortal.Contrato1(driver);
		  String numFolio = pagePortal.Contrato2(driver);
		  //pagePortal.Contrato3(driver);
		  //pagePortal.Contrato4(driver);
		  int contador1;
		  contador1 = pagePortal.rowcounts();
		  //String numFolio = "447";
		  String data;
		  for(int i = 0; i<contador1; i++) {
			  data = String.valueOf(pagePortal.Buscardata(i));
			  System.out.println(data);
			  if (data == "0") {
				  pagePortal.EscribeFolio(i, numFolio);
				  i = contador1;
			  }//fin if
		  }//fin for
		  //pagePortal.FirmaContratoCarmen();
		  driver.close();
	  }// fin PresencialPosFijoNuevoLocalConNuevasCuotas
	  
	  @Test
	  public void PresencialPosFijoLocalExistenteConNuevasCuotas() throws IOException, InterruptedException{
		  pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
			 pagePortalLogin.LoginBryan(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarRubro = new PageSeleccionarRubro(driver);
		  pageSeleccionarRubro.SeleccionaRubroBryan(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialPermanenteLocalExistentePosFijo(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasBryan(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitanteLocalExistente(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageRequiereFirmaDigital = new PageRequiereFirmaDigital(driver);
		  pageRequiereFirmaDigital.RequiereFirmaDigital(driver);
		  pageDatosContrato = new PageDatosContrato(driver);
		  pageDatosContrato.CompletaDatosBryan();
		  //pagePortal.Contrato1(driver);
		  String numFolio = pagePortal.Contrato2(driver);
		  //pagePortal.Contrato3(driver);
		  //pagePortal.Contrato4(driver);
		  int contador1;
		  contador1 = pagePortal.rowcounts();
		  //String numFolio = "447";
		  String data;
		  for(int i = 0; i<contador1; i++) {
			  data = String.valueOf(pagePortal.Buscardata(i));
			  System.out.println(data);
			  if (data == "0") {
				  pagePortal.EscribeFolio(i, numFolio);
				  i = contador1;
			  }//fin if
		  }//fin for
		  //pagePortal.FirmaContratoCarmen();
		  driver.close();
	  }// fin PresencialPosFijoNuevoLocalConNuevasCuotas
	  
	  @Test
	  public void PresencialPosMovilNuevoLocalConNuevasCuotas() throws IOException, InterruptedException{
		  pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
			 pagePortalLogin.LoginBryan(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarRubro = new PageSeleccionarRubro(driver);
		  pageSeleccionarRubro.SeleccionaRubroBryan(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialPermanenteNuevoLocalPosMovil(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasBryan(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitante(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageRequiereFirmaDigital = new PageRequiereFirmaDigital(driver);
		  pageRequiereFirmaDigital.RequiereFirmaDigital(driver);
		  pageDatosContrato = new PageDatosContrato(driver);
		  pageDatosContrato.CompletaDatosBryan();
		  //pagePortal.Contrato1(driver);
		  String numFolio = pagePortal.Contrato2(driver);
		  //pagePortal.Contrato3(driver);
		  //pagePortal.Contrato4(driver);
		  int contador1;
		  contador1 = pagePortal.rowcounts();
		  //String numFolio = "447";
		  String data;
		  for(int i = 0; i<contador1; i++) {
			  data = String.valueOf(pagePortal.Buscardata(i));
			  System.out.println(data);
			  if (data == "0") {
				  pagePortal.EscribeFolio(i, numFolio);
				  i = contador1;
			  }//fin if
		  }//fin for
		 // pagePortal.FirmaContratoCarmen();
		  driver.close();
	  }// fin PresencialPosFijoNuevoLocalConNuevasCuotas
	 
	  @Test
	  public void PresencialPosMovilLocalExistenteConNuevasCuotas() throws IOException, InterruptedException{
		  pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
			 pagePortalLogin.LoginBryan(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarRubro = new PageSeleccionarRubro(driver);
		  pageSeleccionarRubro.SeleccionaRubroBryan(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialPermanenteLocalExistentePosMovil(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasBryan(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitanteLocalExistente(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageRequiereFirmaDigital = new PageRequiereFirmaDigital(driver);
		  pageRequiereFirmaDigital.RequiereFirmaDigital(driver);
		  pageDatosContrato = new PageDatosContrato(driver);
		  pageDatosContrato.CompletaDatosBryan();
		  //pagePortal.Contrato1(driver);
		  String numFolio = pagePortal.Contrato2(driver);
		  //pagePortal.Contrato3(driver);
		  //pagePortal.Contrato4(driver);
		  int contador1;
		  contador1 = pagePortal.rowcounts();
		  //String numFolio = "447";
		  String data;
		  for(int i = 0; i<contador1; i++) {
			  data = String.valueOf(pagePortal.Buscardata(i));
			  System.out.println(data);
			  if (data == "0") {
				  pagePortal.EscribeFolio(i, numFolio);
				  i = contador1;
			  }//fin if
		  }//fin for
		 // pagePortal.FirmaContratoCarmen();
		  driver.close();
	  }// fin PresencialPosFijoNuevoLocalConNuevasCuotas

	 
	@AfterTest
	public void after() {
		//driver.close();
	}// fin after
  
	
	
}// fin NotificaOfertaPermanenteConCuotas

package ValidacionContratos;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.PageBorraProductos;
import Pages.PageConfirmaDatosSolicitud;
import Pages.PageContratarProducto;
import Pages.PageDatosLocalSolicitante;
import Pages.PagePortal;
import Pages.PagePortalCaracteristicasCuotas;
import Pages.PagePortalLogin;
import Pages.PageRequiereFirmaDigital;
import Pages.PageSeleccionarProductoPresencial;
import Pages.PageValidacionContratos;

public class ConM4PPosMovil {
	private WebDriver driver;
	PagePortal pagePortal; 
	PagePortalLogin pagePortalLogin;
	PagePortalCaracteristicasCuotas pagePortalCaracteristicasCuotas;
	PageContratarProducto pageContratarProducto;
	PageValidacionContratos pageValidacionContratos;
	PageSeleccionarProductoPresencial pageSeleccionarProductoPresencial;
	PageConfirmaDatosSolicitud pageConfirmaDatosSolicitud;
	PageRequiereFirmaDigital pageRequiereFirmaDigital;
	PageDatosLocalSolicitante pageDatosLocalSolicitante;
	PageBorraProductos pageBorraProductos;
	
	  @Test
	  public void borrarPosMovilNuevoLocal() throws InterruptedException, IOException {
	  	  pagePortalLogin = new PagePortalLogin(driver);
	  	  driver = pagePortalLogin.ConexionChromeDriver();
	  	  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
	  	  pagePortalLogin.LoginJP(driver);
	  	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  	  js.executeScript("window.scroll(0,0)", "");
	  	  pageBorraProductos = new PageBorraProductos(driver);
	  	  pageBorraProductos.borraSiExite(driver);
	  	  //driver.close();
	  }// fin borrarPosFijoNuevoLocal
	
	  @Test
	  public void PosMovilNuevoLocal() throws InterruptedException, IOException {
		  pagePortalLogin = new PagePortalLogin(driver);
		  driver = pagePortalLogin.ConexionChromeDriver();
		  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
		  pagePortalLogin.LoginJP(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialPermanenteNuevoLocalPosMovil(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasJP(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitante(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageRequiereFirmaDigital = new PageRequiereFirmaDigital(driver);
		  pageRequiereFirmaDigital.RequiereFirmaDigital(driver);
		  pageValidacionContratos = new PageValidacionContratos(driver);
		  //pageValidacionContratos.ValidaMensajeM4PFijo(driver);
		  String validacion = pageValidacionContratos.ContratoPosPermanente(driver);
		  Assert.assertEquals(validacion, "OK");
		  driver.close();
	  }// fin PosFijoNuevoLocal

	  @Test
	  public void borrarPosMovilLocalExistente() throws InterruptedException, IOException {
	  	  pagePortalLogin = new PagePortalLogin(driver);
	  	  driver = pagePortalLogin.ConexionChromeDriver();
	  	  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
	  	  pagePortalLogin.LoginJP(driver);
	  	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  	  js.executeScript("window.scroll(0,0)", "");
	  	  pageBorraProductos = new PageBorraProductos(driver);
	  	  pageBorraProductos.borraSiExite(driver);
	  	  //driver.close();
	  }// fin borrarPosFijoNuevoLocal
	  
	  @Test
	  public void PosMovilLocalExistente() throws InterruptedException, IOException {
		  pagePortalLogin = new PagePortalLogin(driver);
		  driver = pagePortalLogin.ConexionChromeDriver();
		  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
		  pagePortalLogin.LoginJP(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialPermanenteLocalExistentePosMovil(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasJP(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitanteLocalExistente(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageRequiereFirmaDigital = new PageRequiereFirmaDigital(driver);
		  pageRequiereFirmaDigital.RequiereFirmaDigital(driver);
		  pageValidacionContratos = new PageValidacionContratos(driver);
		  //pageValidacionContratos.ValidaMensajeM4PFijo(driver);
		  String validacion = pageValidacionContratos.ContratoPosPermanente(driver);
		  Assert.assertEquals(validacion, "OK");
		  driver.close();
	}// fin PosFijoLocalExistente
	
}// fin ConM4PPosMovil

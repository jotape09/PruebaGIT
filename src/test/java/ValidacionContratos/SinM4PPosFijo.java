package ValidacionContratos;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.PageBorraProductos;
import Pages.PageConfirmaDatosSolicitud;
import Pages.PageContratarProducto;
import Pages.PageDatosLocalSolicitante;
import Pages.PagePortal;
import Pages.PagePortalCaracteristicasCuotas;
import Pages.PagePortalLogin;
import Pages.PageSeleccionarProductoPresencial;
import Pages.PageSeleccionarRubro;
import Pages.PageValidacionContratos;

public class SinM4PPosFijo {
	private WebDriver driver;
	PagePortal pagePortal; 
	PagePortalLogin pagePortalLogin;
	PagePortalCaracteristicasCuotas pagePortalCaracteristicasCuotas;
	PageContratarProducto pageContratarProducto;
	PageValidacionContratos pageValidacionContratos;
	PageSeleccionarRubro pageSeleccionarRubro;
	PageSeleccionarProductoPresencial pageSeleccionarProductoPresencial;
	PageConfirmaDatosSolicitud pageConfirmaDatosSolicitud;
	PageDatosLocalSolicitante pageDatosLocalSolicitante;
	PageBorraProductos pageBorraProductos;
	
	@BeforeTest
	public void before() {

		 //pagePortal = new PagePortal(driver);
		 //driver = pagePortal.ConexionChromeDriver();
		 //pagePortal.visitarSitio("https://publicoqa.transbank.cl/");

	}//fin before
	
	/*
	@Test
	public void Eliminar() throws InterruptedException {
		  pagePortalLogin = new PagePortalLogin(driver);
		  driver = pagePortalLogin.ConexionChromeDriver();
		  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
		  pagePortalLogin.LoginJP(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageBorraProductos = new PageBorraProductos(driver);
		  pageBorraProductos.borraSiExite(driver);
	}// fin eliminar 
	*/
	
@Test
public void borrarPosFijoNuevoLocal() throws InterruptedException, IOException {
	  pagePortalLogin = new PagePortalLogin(driver);
	  driver = pagePortalLogin.ConexionChromeDriver();
	  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
	  pagePortalLogin.LoginJessi(driver);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scroll(0,0)", "");
	  pageBorraProductos = new PageBorraProductos(driver);
	  pageBorraProductos.borraSiExite(driver);
	  //driver.close();
	
	
}// fin borrarPosFijoNuevoLocal
	
/*
  @Test
  public void PosFijoNuevoLocal() throws InterruptedException, IOException {
	  pagePortalLogin = new PagePortalLogin(driver);
	  driver = pagePortalLogin.ConexionChromeDriver();
	  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
	  pagePortalLogin.LoginJessi(driver);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scroll(0,0)", "");
	  pageContratarProducto = new PageContratarProducto(driver);
	  pageContratarProducto.ContratarProducto(driver);
	  pageSeleccionarRubro = new PageSeleccionarRubro(driver);
	  pageSeleccionarRubro.SeleccionaRubroJessi(driver);
	  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
	  pageSeleccionarProductoPresencial.VenderPresencialPermanenteNuevoLocalPosFijoJessi(driver);
	  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
	  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasJessi(driver);
	  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
	  pageDatosLocalSolicitante.DatosLocalSolicitante(driver);
	  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
	  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
	  //pagePortal.RequiereFirmaDigital(driver);
	  pageValidacionContratos = new PageValidacionContratos(driver);
	  //pageValidacionContratos.ValidaMensajeM4PFijo(driver);
	  String validacion = pageValidacionContratos.ContratoPosPermanenteJessi(driver);
	  System.out.println(validacion);
	  Assert.assertEquals(validacion, "OK");
	  driver.close();
  }// fin PosFijoNuevoLocal

 

  @Test
  public void PosFijoLocalExistente() throws InterruptedException, IOException {
	  pagePortalLogin = new PagePortalLogin(driver);
	  driver = pagePortalLogin.ConexionChromeDriver();
	  pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
	  pagePortalLogin.LoginJP(driver);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scroll(0,0)", "");
	  pageContratarProducto = new PageContratarProducto(driver);
	  pageContratarProducto.ContratarProducto(driver);
	  pagePortal.VenderPresencialPermanenteLocalExistentePosFijo(driver);
	  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
	  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasJP(driver);
	  pagePortal.DatosLocalSolicitanteLocalExistente(driver);
	  pagePortal.ConfirmaDatosSolicitud();
	  pagePortal.RequiereFirmaDigital(driver);
	  pageValidacionContratos = new PageValidacionContratos(driver);
	  //pageValidacionContratos.ValidaMensajeM4PFijo(driver);
	  String validacion = pageValidacionContratos.ContratoPosPermanente(driver);
	  Assert.assertEquals(validacion, "OK");
	  pageBorrarProductos = new PageBorraProductos(driver);
	  pageBorrarProductos.borraSiExite(driver);
	  driver.close();
}// fin PosFijoLocalExistente
	*/
}//SinM4PPosFijo

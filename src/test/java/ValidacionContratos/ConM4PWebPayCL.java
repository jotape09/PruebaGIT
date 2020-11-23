package ValidacionContratos;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.PageBorraProductos;
import Pages.PageCompletaDatosActivacion;
import Pages.PageConfiguraTuWebPayCL;
import Pages.PageConfirmaDatosSolicitud;
import Pages.PageContratarProducto;
import Pages.PagePortal;
import Pages.PagePortalCaracteristicasCuotas;
import Pages.PagePortalLogin;
import Pages.PageSeleccionarProductoInternet;
import Pages.PageValidacionContratos;

public class ConM4PWebPayCL {
	private WebDriver driver;
	PagePortal pagePortal; 
	PagePortalLogin pagePortalLogin;
	PagePortalCaracteristicasCuotas pagePortalCaracteristicasCuotas;
	PageContratarProducto pageContratarProducto;
	PageValidacionContratos pageValidacionContratos;
	PageSeleccionarProductoInternet pageSeleccionarProductoInternet;
	PageCompletaDatosActivacion pageCompletaDatosActivacion;
	PageConfirmaDatosSolicitud pageConfirmaDatosSolicitud;
	PageConfiguraTuWebPayCL pageConfiguraTuWebPayCL;
	PageBorraProductos pageBorraProductos;
	
	
	
	  @Test
	  public void borrarInternetDeseoVenderSinCuotas() throws InterruptedException, IOException {
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
	  public void InternetDeseoVenderSinCuotas() throws IOException, InterruptedException{
		  pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
			 pagePortalLogin.LoginJP(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarProductoInternet = new PageSeleccionarProductoInternet(driver);
		  pageSeleccionarProductoInternet.VenderInternetDeseo(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoSinCuotasJP(driver);
		  pageCompletaDatosActivacion = new PageCompletaDatosActivacion(driver);
		  pageCompletaDatosActivacion.CompletarDatosActivacion(driver);
		  pageConfiguraTuWebPayCL = new PageConfiguraTuWebPayCL(driver);
		  pageConfiguraTuWebPayCL.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageValidacionContratos = new PageValidacionContratos(driver);
		  //pageValidacionContratos.ContratoWebPayCL(driver);
		  String validacion = pageValidacionContratos.ContratoWebPayCLSinCuotas(driver);
		  Assert.assertEquals(validacion, "OK");
		  //pagePortal.Contrato1(driver);
		  driver.close();
	  }// fin InternetDeseoVenderSinCuotas
	  
	  @Test
	  public void borrarInternetDeseoVenderConCuotas() throws InterruptedException, IOException {
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
	  public void InternetDeseoVenderConCuotas() throws IOException, InterruptedException{
		  pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
			 pagePortalLogin.LoginJP(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarProductoInternet = new PageSeleccionarProductoInternet(driver);
		  pageSeleccionarProductoInternet.VenderInternetDeseo(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasJPFrame(driver);
		  pageCompletaDatosActivacion = new PageCompletaDatosActivacion(driver);
		  pageCompletaDatosActivacion.CompletarDatosActivacion(driver);
		  pageConfiguraTuWebPayCL = new PageConfiguraTuWebPayCL(driver);
		  pageConfiguraTuWebPayCL.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pageValidacionContratos = new PageValidacionContratos(driver);
		  //pageValidacionContratos.ContratoWebPayCL(driver);
		  String validacion = pageValidacionContratos.ContratoWebPayCLConCuotas(driver);
		  Assert.assertEquals(validacion, "OK");
		  //pagePortal.Contrato1(driver);
		  driver.close();
	  }// fin InternetDeseoVenderSinCuotas

}// ConM4PWebPayCL

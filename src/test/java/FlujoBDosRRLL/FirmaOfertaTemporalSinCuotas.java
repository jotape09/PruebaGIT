package FlujoBDosRRLL;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.PageConfirmaDatosSolicitud;
import Pages.PageContratarProducto;
import Pages.PageDatosLocalSolicitante;
import Pages.PagePortal;
import Pages.PagePortalCaracteristicasCuotas;
import Pages.PagePortalLogin;
import Pages.PageSeleccionarProductoPresencial;

public class FirmaOfertaTemporalSinCuotas {
	private WebDriver driver;
	PagePortal pagePortal; 
	PagePortalLogin pagePortalLogin;
	PageContratarProducto pageContratarProducto;
	PageSeleccionarProductoPresencial pageSeleccionarProductoPresencial;
	PagePortalCaracteristicasCuotas pagePortalCaracteristicasCuotas;
	PageConfirmaDatosSolicitud pageConfirmaDatosSolicitud;
	PageDatosLocalSolicitante pageDatosLocalSolicitante;
	
	@BeforeTest
	public void before() {

		 //pagePortal = new PagePortal(driver);
		 //driver = pagePortal.ConexionChromeDriver();
		 //pagePortal.visitarSitio("https://publicoqa.transbank.cl/");

	}//fin before
	  @Test
	  public void PresencialPosFijoNuevoLocalSinCuotas() throws IOException, InterruptedException{
			 pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
		  pagePortalLogin.LoginCarmen(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialTemporalNuevoLocal(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoSinCuotasCarmen(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitante(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pagePortal.AgendarInstalacionTemporal(driver);
		  driver.close();
	  }// fin PresencialPosFijoNuevoLocalConNuevasCuotas
	
	
	  @Test
	  public void PresencialPosFijoLocalExistenteSinCuotas() throws IOException, InterruptedException{
			 pagePortalLogin = new PagePortalLogin(driver);
			 driver = pagePortalLogin.ConexionChromeDriver();
			 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
		  pagePortalLogin.LoginCarmen(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarProductoPresencial = new PageSeleccionarProductoPresencial(driver);
		  pageSeleccionarProductoPresencial.VenderPresencialTemporalLocalExistente(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoSinCuotasCarmen(driver);
		  pageDatosLocalSolicitante = new PageDatosLocalSolicitante(driver);
		  pageDatosLocalSolicitante.DatosLocalSolicitante(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pagePortal.AgendarInstalacionTemporal(driver);
		  driver.close();
	  }// fin PresencialPosFijoNuevoLocalConNuevasCuotas
	  
		@AfterTest
		public void after() {
		//	driver.close();
		}// fin after
	
}// fin FirmaOfertaTemporalSinCuotas

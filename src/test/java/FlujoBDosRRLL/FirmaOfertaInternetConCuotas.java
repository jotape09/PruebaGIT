
	package FlujoBDosRRLL;

	import java.io.IOException;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import Pages.PageCompletaDatosActivacion;
import Pages.PageConfiguraTuWebPayCL;
import Pages.PageConfirmaDatosSolicitud;
import Pages.PageContratarProducto;
import Pages.PageDatosContrato;
import Pages.PagePortal;
import Pages.PagePortalCaracteristicasCuotas;
import Pages.PagePortalLogin;
import Pages.PageRequiereFirmaDigital;
import Pages.PageSeleccionarProductoInternet;

	public class FirmaOfertaInternetConCuotas {
		private WebDriver driver;
		PagePortal pagePortal; 
		PagePortalLogin pagePortalLogin;
		PageContratarProducto pageContratarProducto;
		PageSeleccionarProductoInternet pageSeleccionarProductoInternet;
		PagePortalCaracteristicasCuotas pagePortalCaracteristicasCuotas;
		PageCompletaDatosActivacion pageCompletaDatosActivacion;
		PageConfirmaDatosSolicitud pageConfirmaDatosSolicitud;
		PageConfiguraTuWebPayCL pageConfiguraTuWebPayCL;
		PageRequiereFirmaDigital pageRequiereFirmaDigital;
		PageDatosContrato pageDatosContrato;
		
		@BeforeTest
		public void before() {

			 //pagePortal = new PagePortal(driver);
			 //driver = pagePortal.ConexionChromeDriver();
			 //pagePortal.visitarSitio("https://publicoqa.transbank.cl/");

		}//fin before
		
		  @Test
		  public void InternetYaTengoSitioSinCuotasIntTBK() throws IOException, InterruptedException{
				 pagePortalLogin = new PagePortalLogin(driver);
				 driver = pagePortalLogin.ConexionChromeDriver();
				 pagePortalLogin.visitarSitio("https://web2qa.test.transbank.cl:5443/portal-public/");
			  pagePortalLogin.LoginCarmen(driver);
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("window.scroll(0,0)", "");
			  pageContratarProducto = new PageContratarProducto(driver);
			  pageContratarProducto.ContratarProducto(driver);
			  pageSeleccionarProductoInternet = new PageSeleccionarProductoInternet(driver);
			  pageSeleccionarProductoInternet.VenderInternetYaTengoIntTBK(driver);
			  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
			  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasCarmen(driver);
			  pageCompletaDatosActivacion = new PageCompletaDatosActivacion(driver);
			  pageCompletaDatosActivacion.CompletarDatosActivacion(driver);
			  pageConfiguraTuWebPayCL = new PageConfiguraTuWebPayCL(driver);
			  pageConfiguraTuWebPayCL.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
			  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
			  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
			  pageRequiereFirmaDigital = new PageRequiereFirmaDigital(driver);
			  pageRequiereFirmaDigital.RequiereFirmaDigital(driver);
			  pagePortal = new PagePortal(driver);
			  pageDatosContrato = new PageDatosContrato(driver);
			  pageDatosContrato.CompletaDatosCarmen();
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
		  }
		
		 /*
	  @Test
	  public void InternetYaTengoSitioSinCuotasIntPropia() throws IOException, InterruptedException{
				 pagePortalLogin = new PagePortalLogin(driver);
				 driver = pagePortalLogin.ConexionChromeDriver();
				 pagePortalLogin.visitarSitio("https://publicoqa.transbank.cl/");
			  pagePortalLogin.LoginCarmen(driver);
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("window.scroll(0,0)", "");
			  pagePortal = new PagePortal(driver);
		  pagePortal.ContratarProducto(driver);
		  pagePortal.VenderInternetYaTengoIntPropia(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasCarmen(driver);
		  pagePortal.CompletarDatosActivacion(driver);
		  pagePortal.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
		  pageConfirmaDatosSolicitud = new PageConfirmaDatosSolicitud(driver);
		  pageConfirmaDatosSolicitud.ConfirmaDatosSolicitud();
		  pagePortal.RequiereFirmaDigital(driver);
		  pagePortal.CompletaDatosCarmen();
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
	  }
	
	
	  @Test
	  public void InternetNoTengoSitioSinCuotas() throws IOException, InterruptedException{
				 pagePortalLogin = new PagePortalLogin(driver);
				 driver = pagePortalLogin.ConexionChromeDriver();
				 pagePortalLogin.visitarSitio("https://publicoqa.transbank.cl/");
			  pagePortalLogin.LoginCarmen(driver);
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("window.scroll(0,0)", "");
			  pagePortal = new PagePortal(driver);
		  pagePortal.ContratarProducto(driver);
		  pagePortal.VenderInternetNoTengo(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasCarmen(driver);
		  pagePortal.CompletarDatosActivacion(driver);
		  pagePortal.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
		  pagePortal = new PageConfirmaDatosSolicitud(driver);
		  pagePortal.ConfirmaDatosSolicitud();
		  pagePortal.RequiereFirmaDigital(driver);
		  pagePortal.CompletaDatosCarmen();
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
	  }// fin InternetNoTengoSitioSinCuotas


	  @Test
	  public void InternetDeseoVenderSinCuotas() throws IOException, InterruptedException{
				 pagePortalLogin = new PagePortalLogin(driver);
				 driver = pagePortalLogin.ConexionChromeDriver();
				 pagePortalLogin.visitarSitio("https://publicoqa.transbank.cl/");
			  pagePortalLogin.LoginCarmen(driver);
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("window.scroll(0,0)", "");
			  pagePortal = new PagePortal(driver);
		  pagePortal.ContratarProducto(driver);
		  pagePortal.VenderInternetDeseo(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoConCuotasCarmen(driver);
		  pagePortal.CompletarDatosActivacionDeseo(driver);
		  pagePortal.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
		  pagePortal.ConfirmaDatosSolicitud();
		  pagePortal.RequiereFirmaDigital(driver);
		  pagePortal.CompletaDatosCarmen();
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
		  //pagePortal.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
	  }// fin InternetDeseoVenderSinCuotas

		@AfterTest
		public void after() {
			//driver.close();
		}// fin after
	
*/
	
}// fin FirmaOfertaInternetConCuotas

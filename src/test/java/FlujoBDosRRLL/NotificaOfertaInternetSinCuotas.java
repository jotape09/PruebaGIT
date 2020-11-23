
package FlujoBDosRRLL;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.PageCompletaDatosActivacion;
import Pages.PageConfiguraTuWebPayCL;
import Pages.PageContratarProducto;
import Pages.PageDatosContrato;
import Pages.PagePortal;
import Pages.PagePortalCaracteristicasCuotas;
import Pages.PagePortalLogin;
import Pages.PageRequiereFirmaDigital;
import Pages.PageSeleccionarProductoInternet;
import Pages.PageSeleccionarRubro;

public class NotificaOfertaInternetSinCuotas {
	private WebDriver driver;
	PagePortal pagePortal; 
	PagePortalLogin pagePortalLogin;
	PageContratarProducto pageContratarProducto;
	PageSeleccionarRubro pageSeleccionarRubro;
	PageSeleccionarProductoInternet pageSeleccionarProductoInternet ;
	PagePortalCaracteristicasCuotas pagePortalCaracteristicasCuotas;
	PageCompletaDatosActivacion pageCompletaDatosActivacion;
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
			 pagePortalLogin.LoginBryan(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,0)", "");
		  pageContratarProducto = new PageContratarProducto(driver);
		  pageContratarProducto.ContratarProducto(driver);
		  pageSeleccionarRubro = new PageSeleccionarRubro(driver);
		  pageSeleccionarRubro.SeleccionaRubroBryan(driver);
		  pageSeleccionarProductoInternet = new PageSeleccionarProductoInternet(driver);
		  pageSeleccionarProductoInternet.VenderInternetYaTengoIntTBK(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoSinCuotasBryan(driver);
		  pageCompletaDatosActivacion = new PageCompletaDatosActivacion(driver);
		  pageCompletaDatosActivacion.CompletarDatosActivacion(driver);
		  pageConfiguraTuWebPayCL = new PageConfiguraTuWebPayCL(driver);
		  pageConfiguraTuWebPayCL.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
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
		  //pagePortal.FirmaContratoBryan();
		  driver.close();
	  }// fin InternetDeseoVenderSinCuotas
	
	  
	  @Test
	  public void InternetYaTengoSitioSinCuotasIntPropia() throws IOException, InterruptedException{
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
		  pageSeleccionarProductoInternet = new PageSeleccionarProductoInternet(driver);
		  pageSeleccionarProductoInternet.VenderInternetYaTengoIntPropia(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoSinCuotasBryan(driver);
		  pageCompletaDatosActivacion = new PageCompletaDatosActivacion(driver);
		  pageCompletaDatosActivacion.CompletarDatosActivacion(driver);
		  pageConfiguraTuWebPayCL = new PageConfiguraTuWebPayCL(driver);
		  pageConfiguraTuWebPayCL.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
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
		  //pagePortal.FirmaContratoBryan();
		  driver.close();
	  }// fin InternetDeseoVenderSinCuotas
	  
	  
	
	  @Test
	  public void InternetNoTengoSitioSinCuotas() throws IOException, InterruptedException{
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
		  pageSeleccionarProductoInternet = new PageSeleccionarProductoInternet(driver);
		  pageSeleccionarProductoInternet.VenderInternetNoTengo(driver);
		  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
		  pagePortalCaracteristicasCuotas.CaracteristicasEquipoSinCuotasBryan(driver);
		  pageCompletaDatosActivacion = new PageCompletaDatosActivacion(driver);
		  pageCompletaDatosActivacion.CompletarDatosActivacion(driver);
		  pageConfiguraTuWebPayCL = new PageConfiguraTuWebPayCL(driver);
		  pageConfiguraTuWebPayCL.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
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
		  //pagePortal.FirmaContratoBryan();
		  driver.close();
	  }// fin InternetDeseoVenderSinCuotas
	 
	  
	  
  @Test
  public void InternetDeseoVenderSinCuotas() throws IOException, InterruptedException{
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
	  pageSeleccionarProductoInternet = new PageSeleccionarProductoInternet(driver);
	  pageSeleccionarProductoInternet.VenderInternetDeseo(driver);
	  pagePortalCaracteristicasCuotas = new PagePortalCaracteristicasCuotas(driver);
	  pagePortalCaracteristicasCuotas.CaracteristicasEquipoSinCuotasBryan(driver);
	  pageCompletaDatosActivacion = new PageCompletaDatosActivacion(driver);
	  pageCompletaDatosActivacion.CompletarDatosActivacion(driver);
	  pageConfiguraTuWebPayCL = new PageConfiguraTuWebPayCL(driver);
	  pageConfiguraTuWebPayCL.ConfiguraTuPaginaEnWebpayOtraPersona(driver);
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
	  //pagePortal.FirmaContratoBryan();
	  driver.close();
  }// fin InternetDeseoVenderSinCuotas

	  
	  
	@AfterTest
	public void after() {
	//	driver.close();
	}// fin after
  
}

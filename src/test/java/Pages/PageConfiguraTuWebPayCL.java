package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilidades.ClaseBase;

public class PageConfiguraTuWebPayCL extends ClaseBase{
	WebDriverWait wait;
	
	public PageConfiguraTuWebPayCL(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor
	
	
	//****************   OBJETOS   *******************
	
	
	//**********Configura tu página en webpay.cl
	By txtProducto = By.xpath("//*[@id=\'nombrePago\']");
	By txtDescription = By.xpath("//*[@id=\'descripcionWebpay\']");
	By btnSeleccionarRango = By.xpath("//*[@id=\'selectRangoPago\']/div/div/div[2]");
	By btnRango = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-configuracion/app-wizard-master/div[3]/form/div[2]/div[1]/label[3]/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
	By btnSereYo = By.xpath("/html/body/div[1]/div/div/app-root/app-agregar-producto/app-configuracion/app-wizard-master/div[3]/form/div[2]/div[1]/div[2]/button[1]");
	By btnOtraPersona = By.xpath("//*[@id=\'otraPersona\']");
	By txtNombreOtraPersona = By.xpath("//*[@id=\'nombreRecibePago\']");
	By txtApellidoOtraPersona = By.xpath("//*[@id=\'apellidoRecibePago\']");
	By txtRutOtraPersona = By.xpath("//*[@id=\'rutRecibePago\']");
	By txtTelefonoOtraPersona = By.xpath("//*[@id=\'telefonoRecibePago\']");
	By txtCorreoOtraPersona = By.xpath("//*[@id=\'emailRecibePago\']");
	By btnGuardarDatosOtraPersona = By.xpath("//*[@id=\'guardarDatosRecibePago\']");
	By btnGuardarYContinuar3 = By.xpath("//*[@id=\'siguientePaso\']/span");
	
	
	//****************   METODOS   *******************
	
	
	public void ConfiguraTuPaginaEnWebpaySereYo(WebDriver driver) throws InterruptedException {
		agregarTexto("TEST", txtProducto);
		agregarTexto("TEST", txtDescription);
		click(btnSeleccionarRango);
		click(btnRango);
		Thread.sleep(3000);
		//driver.switchTo().frame(2);
		click(btnSereYo);
		Thread.sleep(3000);
		click(btnGuardarYContinuar3);
	}// fin ConfiguraTuPaginaEnWebpay
		
	public void ConfiguraTuPaginaEnWebpayOtraPersona(WebDriver driver) throws InterruptedException {
		agregarTexto("TEST", txtProducto);
		agregarTexto("TEST", txtDescription);
		click(btnSeleccionarRango);
		click(btnRango);
		Thread.sleep(3000);
		//driver.switchTo().frame(2);
		click(btnOtraPersona);
		Thread.sleep(3000);
		agregarTexto("TEST", txtNombreOtraPersona);
		agregarTexto("TEST", txtApellidoOtraPersona);
		agregarTexto("159730573", txtRutOtraPersona);
		agregarTexto("987654321", txtTelefonoOtraPersona);
		agregarTexto("juan.fuentes.tsoft@gmail.com", txtCorreoOtraPersona);
		click(btnGuardarDatosOtraPersona);
		Thread.sleep(3000);
		click(btnGuardarYContinuar3);
	}// fin ConfiguraTuPaginaEnWebpay
	
}// fin PageConfiguraTuWebPayCL

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilidades.ClaseBase;

public class PageSeleccionarProductoInternet extends ClaseBase{

	WebDriverWait wait;

    public PageSeleccionarProductoInternet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin PageSelecionarProducto

    
  //****************   OBJETOS   *******************
    
    
	//*********Quiero vender de forma
    By textoVenderDeForma = By.xpath("/html/body/div/div/div/app-root/app-inicio-v2/div/div[2]/div[1]/div[1]/div[2]/app-como-vender-question/div/h5/span");
    By btnInternet = By.xpath("//*[@id=\'porInternet\']");    
    By btnSiguiente = By.xpath("//*[@id='siguientePregunta']/p");
    
  //*********Soluciones para ventas por Internet
    By textoSolucionesVentasInternet = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-productos-web/app-wizard-master/div[3]/div[1]/h4");
    
    //Ya tengo sitio web y quiero vender en linea
    By btnClose = By.xpath("//*[@id='cerrarOnboarding']");
    By btnInternetYaTengo = By.xpath("//*[@id='tengoSitio']/div/div[1]");
    By btnQuieroEstoIntTBK = By.xpath("//*[@id='contratarIntegracionTBK']");
    By btnQuieroEstoIntPropia = By.xpath("//*[@id='contratarIntegracionPropia']");
    By btnEstoyDeAcuerdo = By.xpath("//*[@id='aceptarIntegracionTBK']");
    //By btnGuardarYContinuar = By.xpath("//*[@id='siguientePaso']/span");
    By btnGuardarYContinuar = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-productos-web/app-wizard-master/div[3]/div[3]/div[2]/button/span");
    
    //No tengo sitio web y busco ayuda para su creacion
    By btnInternetNoTengo = By.xpath("//*[@id='noTengoSitio']/div/div[1]");
    By btnQuienCrearaSitio = By.xpath("//*[@id='irListaPST']/span");
    By btnJump = By.xpath("//*[@id='seleccionarPST4']/span");
    By btnGuardarSeleccion = By.xpath("//*[@id='guardarSeleccionPST']");
    By btnGuardarYContinuar2 = By.xpath("//*[@id=\'siguientePaso\']");
    
    //Deseo vender por internet sin necesidad de un sitio Web
    By btnDeseoVender = By.xpath("//*[@id='soloVender']/div/div[1]");
    By btnQuieroEsto = By.xpath("//*[@id='seleccionarWebpayCL2']/span");
    //By btnGuaradryContinuar3 = By.xpath("//*[@id='siguientePaso']/span");
    By btnGuaradryContinuar3 = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-selector-productos-web/app-wizard-master/div[3]/div[3]/div[2]/button/span");
    	
	
    
	//****************   METODOS   *******************
	
	
  //Se selecciona la opcion Internet o Presencial
    public void VenderInternetYaTengoIntTBK(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(15000);
    	//driver.switchTo().frame(2);
    	//wait.until(ExpectedConditions.elementToBeClickable(btnInternet));
    	click(btnInternet);
    	click(btnSiguiente);
    	Thread.sleep(5000);
    	click(btnClose);
    	String Valor = obtenerTexto(textoSolucionesVentasInternet);
    	Assert.assertEquals("Soluciones para ventas por Internet", Valor);
    	click(btnInternetYaTengo);
    	Thread.sleep(3000);
    	click(btnQuieroEstoIntTBK);
    	Thread.sleep(3000);
    	click(btnEstoyDeAcuerdo);
    	Thread.sleep(3000);
    	click(btnGuardarYContinuar);
    }//fin VenderDeForma

    public void VenderInternetYaTengoIntPropia(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(15000);
    	//driver.switchTo().frame(2);
    	click(btnInternet);
    	click(btnSiguiente);
    	Thread.sleep(5000);
    	click(btnClose);
    	String Valor = obtenerTexto(textoSolucionesVentasInternet);
    	Assert.assertEquals("Soluciones para ventas por Internet", Valor);
    	click(btnInternetYaTengo);
    	Thread.sleep(3000);
    	click(btnQuieroEstoIntPropia);
    	Thread.sleep(3000);
    	click(btnGuardarYContinuar);
    }//fin VenderDeForma

    public void VenderInternetNoTengo(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(15000);
    	//driver.switchTo().frame(2);
    	click(btnInternet);
    	click(btnSiguiente);
    	Thread.sleep(5000);
    	click(btnClose);
    	String Valor = obtenerTexto(textoSolucionesVentasInternet);
    	Assert.assertEquals("Soluciones para ventas por Internet", Valor);
    	click(btnInternetNoTengo);
    	Thread.sleep(2000);
    	click(btnQuienCrearaSitio);
    	Thread.sleep(3000);
    	click(btnJump);
    	click(btnGuardarSeleccion);
    	click(btnGuardarYContinuar2);
    }//fin VenderDeForma

    public void VenderInternetDeseo(WebDriver driver) throws InterruptedException {
    	esperarElemento();
    	Thread.sleep(15000);
    	wait = new WebDriverWait(driver,30);
    	//driver.switchTo().frame(2);
    	click(btnInternet);
    	click(btnSiguiente);
    	Thread.sleep(5000);
    	click(btnClose);
    	String Valor = obtenerTexto(textoSolucionesVentasInternet);
    	Assert.assertEquals("Soluciones para ventas por Internet", Valor);
    	click(btnDeseoVender);
    	Thread.sleep(3000);
    	wait.until(ExpectedConditions.elementToBeClickable(btnQuieroEsto));
    	click(btnQuieroEsto);
    	Thread.sleep(4000);
    	//click(btnGuaradryContinuar3);
    	click(btnGuardarYContinuar);
    }//fin VenderDeForma
	
	
}// fin PageSeleccionarProducto

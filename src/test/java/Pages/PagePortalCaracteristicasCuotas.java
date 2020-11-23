package Pages;
import javax.swing.SwingUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

import Utilidades.ClaseBase;


public class PagePortalCaracteristicasCuotas extends ClaseBase {
	WebDriverWait wait;
	
	public PagePortalCaracteristicasCuotas(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}//fin constructor
	
	
	//********* OBJETOS
	
	
	//*********Características del equipo
	By textoCaracteristicasEquipo = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/div[1]/h4");
	
    By btnSinCuotas = By.xpath("//*[@id='noQuieroCuotas']");
    By btnConCuotas = By.xpath("//*[@id='quieroCuotas']");
    By btnConCuotasJessi = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[1]/div[2]/button[1]");
    By btnSeleccionarCuotas = By.xpath("//*[@id='selectCantidadCuotas']/div/div/div[2]");
    By btnSeleccionar3Cuotas = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[1]/div[3]/label/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
    By btnSeleccionarCuotasBryan = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[1]/div[3]/label/ng-select/div/span");
    By btnSeleccionar3a6CuotasBryan = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[1]/div[3]/label/ng-select/ng-dropdown-panel/div/div[2]/div[6]/span");
    By btn3CuotasJP = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[1]/div[3]/label/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span");
    By btn3CuotasJessi = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[1]/div[3]/label/ng-select/ng-dropdown-panel/div/div[2]/div[2]/span");
    By btn3a5CuotasJessi = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[1]/div[3]/label/ng-select/ng-dropdown-panel/div/div[2]/div[5]/span");
    By btnSeleccionarCuentaCarmen = By.xpath("//*[@id='selectorCuenta_0']/td[1]/label/span");
    //By btnSeleccionarCuentaCarmen = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[1]/label/input");
    //By btnSeleccionarCuentaBryan = By.xpath("//*[@id=\"selectorCuenta_0\"]/td[1]/label/span");
    //By btnSeleccionarCuentaBryan = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/td[1]/label/span");
    //By btnSeleccionarCuentaBryan = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr[2]/td[1]/label/span");
    By btnSeleccionarCuentaBryan = By.xpath("//*[@id='selectorCuenta_1']");
    By btnSeleccionarCuentaJP = By.xpath("//*[@id='selectorCuenta_0']/td[1]/label/span");
    //By btnSeleccionarCuentaJessi = By.xpath("//*[@id='selectorCuenta_0']/td[1]/label/span");
    //By btnSeleccionarCuentaJessi = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr[2]/td[1]/label/span");
    //By btnSeleccionarCuentaJessi = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/td[1]/label/span");
    By btnSeleccionarCuentaJessi = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr[2]");
    //By btnSeleccionarCuentaJP = By.xpath("//*[@id='seleccionarCuenta_0']");
    //By btnSeleccionarCuentaJP = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[1]/label/span");
    //By btnGuardarYContinuar = By.xpath("//*[@id='siguientePaso']/span");
    By btnGuardarYContinuar = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/div[2]/div[2]/button/span");
    By btnGuardarYContinuarJP = By.xpath("/html/body/div/div/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/div[2]/div[2]/button/span");
 
    
    
  //********* METODOS
    
    
public void CaracteristicasEquipoSinCuotasCarmen(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(15000);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	click(btnSinCuotas);
	click(btnSeleccionarCuentaCarmen);
	Thread.sleep(3000);
	click(btnGuardarYContinuar);
}//fin VenderDeForma

public void CaracteristicasEquipoSinCuotasBryan(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(15000);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	click(btnSinCuotas);
	click(btnSeleccionarCuentaBryan);
	Thread.sleep(3000);
	click(btnGuardarYContinuar);
}//fin VenderDeForma


public void CaracteristicasEquipoConCuotasCarmen(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(15000);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	click(btnConCuotas);
	Thread.sleep(1000);
	click(btnSeleccionarCuotas);
	Thread.sleep(1000);
	click(btnSeleccionar3Cuotas);
	Thread.sleep(6000);
	//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/app-root/app-agregar-producto/app-cuentas/app-wizard-master/div[3]/form/div[2]")));
	click(btnSeleccionarCuentaCarmen);
	click(btnGuardarYContinuar);

}//fin VenderDeForma

public void CaracteristicasEquipoConCuotasBryan(WebDriver driver) throws InterruptedException {
	esperarElemento();
	Thread.sleep(15000);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	click(btnConCuotas);
	Thread.sleep(1000);
	click(btnSeleccionarCuotasBryan);
	Thread.sleep(1000);
	click(btnSeleccionar3a6CuotasBryan);
	Thread.sleep(6000);
	click(btnSeleccionarCuentaBryan);
	Thread.sleep(2000);
	click(btnGuardarYContinuar);
}//fin VenderDeForma

public void CaracteristicasEquipoConCuotasJP(WebDriver driver) throws InterruptedException {
	//esperarElemento();
	//Thread.sleep(15000);
	wait = new WebDriverWait(driver,30);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	wait.until(ExpectedConditions.elementToBeClickable(btnConCuotas));
	click(btnConCuotas);
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionarCuotasBryan));
	click(btnSeleccionarCuotasBryan);
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(btn3CuotasJP));
	click(btn3CuotasJP);
	Thread.sleep(6000);
	//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/div/iframe")));
	wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionarCuentaJP));
	System.out.println("INICIO******************************************************************************");
	click(btnSeleccionarCuentaJP);
	String valor1 = obtenerTexto(btnSeleccionarCuentaJP);
	System.out.println(valor1);
	System.out.println("FINAL******************************************************************************");
	//click(btnSeleccionarCuentaCarmen);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(btnGuardarYContinuar));
	click(btnGuardarYContinuar);
}//fin VenderDeForma

public void CaracteristicasEquipoConCuotasJPFrame(WebDriver driver) throws InterruptedException {
	//esperarElemento();
	//Thread.sleep(15000);
	wait = new WebDriverWait(driver,30);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	wait.until(ExpectedConditions.elementToBeClickable(btnConCuotas));
	click(btnConCuotas);
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionarCuotasBryan));
	click(btnSeleccionarCuotasBryan);
	//Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(btn3CuotasJP));
	click(btn3CuotasJP);
	Thread.sleep(6000);
	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/div/iframe")));
	//wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionarCuentaJP));
	System.out.println("INICIO******************************************************************************");
	click(btnSeleccionarCuentaJP);
	String valor1 = obtenerTexto(btnSeleccionarCuentaJP);
	System.out.println(valor1);
	System.out.println("FINAL******************************************************************************");
	//click(btnSeleccionarCuentaCarmen);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(btnGuardarYContinuar));
	click(btnGuardarYContinuar);
}//fin VenderDeForma
    
public void CaracteristicasEquipoSinCuotasJP(WebDriver driver) throws InterruptedException {
	//esperarElemento();
	//Thread.sleep(15000);
	wait = new WebDriverWait(driver,30);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	wait.until(ExpectedConditions.elementToBeClickable(btnSinCuotas));
	click(btnSinCuotas);
	wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionarCuentaJP));
	click(btnSeleccionarCuentaJP);
	Thread.sleep(4000);
	//wait.until(ExpectedConditions.elementToBeClickable(btnGuardarYContinuar));
	click(btnGuardarYContinuar);
}//fin VenderDeForma

public void CaracteristicasEquipoConCuotasJessi(WebDriver driver) throws InterruptedException {
	//esperarElemento();
	Thread.sleep(15000);
	wait = new WebDriverWait(driver,30);
	String Valor = obtenerTexto(textoCaracteristicasEquipo);
	Assert.assertEquals("Características del equipo", Valor);
	wait.until(ExpectedConditions.elementToBeClickable(btnConCuotasJessi));
	click(btnConCuotasJessi);
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionarCuotasBryan));
	click(btnSeleccionarCuotasBryan);
	Thread.sleep(1000);
	//wait.until(ExpectedConditions.elementToBeClickable(btn3CuotasJP));
	click(btn3a5CuotasJessi);
	Thread.sleep(6000);
	//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/div/iframe")));
	wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionarCuentaJP));
	//System.out.println("INICIO******************************************************************************");
	click(btnSeleccionarCuentaJessi);
	//String valor1 = obtenerTexto(btnSeleccionarCuentaJP);
	//System.out.println(valor1);
	//System.out.println("FINAL******************************************************************************");
	//click(btnSeleccionarCuentaCarmen);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(btnGuardarYContinuar));
	click(btnGuardarYContinuar);
}//fin VenderDeForma



}// fin clase PagePortalCaracteristicasCuotas

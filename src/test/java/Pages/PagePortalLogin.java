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


public class PagePortalLogin extends ClaseBase {

	WebDriverWait wait;
	public PagePortalLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor
	
	
	
	//***********LOGIN*****************
	//txt
	By txtUsuario = By.xpath("//input[@id='UsuarioRut']");
	By txtPass = By.xpath("//input[@id='PasswordClient']");

	By btnAccesoClientes = By.xpath("//a[@id='desktop']");
	By btnIniciarSesion = By.xpath("//button[@class='btn btn-primary'][contains(text(),'Iniciar sesión')]");
	
	By btnSeleccionarOrganizacion = By.xpath("//*[@id='list-companies']");
	By btnSeleccionarOrganizacionJP = By.xpath("//*[@id='list-companies']/option[2]");
	By btnSeleccionarOrganizacionJessi = By.xpath("//*[@id='list-companies']/option[4]");
	
    By btnOrganizacion = By.xpath("//button[@id='btn-companies']");
    By btnEdison = By.xpath("//span[contains(text(),'EDISON')]");
	
	
    //Se ingresa a la pagina y se selecciona la organización, luego se pinca el boton EDISON
    public void LoginCarmen(WebDriver driver)throws InterruptedException {
    	maximizar();
    	wait = new WebDriverWait(driver,30);
		esperarElemento();
		agregarTexto("177897329", txtUsuario);
		agregarTexto("tbk.2020", txtPass);
		click(btnIniciarSesion);
		click(btnOrganizacion);
		esperarElemento();
		click(btnEdison);
    }//fin login carmen
    
    //Se ingresa a la pagina y se selecciona la organización, luego se pinca el boton EDISON
    public void LoginBryan(WebDriver driver)throws InterruptedException {
    	maximizar();
    	wait = new WebDriverWait(driver,30);
		esperarElemento();
		agregarTexto("185324028", txtUsuario);
		agregarTexto("tbk.2019", txtPass);
		click(btnIniciarSesion);
		click(btnOrganizacion);
		esperarElemento();
		click(btnEdison);
    }//fin login Bryan
    
    public void LoginJP(WebDriver driver)throws InterruptedException {
    	maximizar();
    	wait = new WebDriverWait(driver,30);
		//click(btnAccesoClientes);
		//esperarElemento();
		agregarTexto("159730573", txtUsuario);
		agregarTexto("tbk.2020", txtPass);
		wait.until(ExpectedConditions.elementToBeClickable(btnIniciarSesion));
		click(btnIniciarSesion);
		click(btnSeleccionarOrganizacion);
		click(btnSeleccionarOrganizacionJP);
		click(btnOrganizacion);
		esperarElemento();
		click(btnEdison);
    }//fin login JP
    
    public void LoginJessi(WebDriver driver)throws InterruptedException {
    	maximizar();
    	wait = new WebDriverWait(driver,30);
		//click(btnAccesoClientes);
		//esperarElemento();
		agregarTexto("165195531", txtUsuario);
		agregarTexto("tbk.2020", txtPass);
		wait.until(ExpectedConditions.elementToBeClickable(btnIniciarSesion));
		click(btnIniciarSesion);
		Thread.sleep(2000);
		click(btnSeleccionarOrganizacion);
		Thread.sleep(2000);
		click(btnSeleccionarOrganizacionJessi);
		Thread.sleep(2000);
		click(btnOrganizacion);
		esperarElemento();
		click(btnEdison);
    }//fin login Jessi
    
    

}// fin PagePortalLogin

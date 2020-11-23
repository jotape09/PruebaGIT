package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilidades.ClaseBase;

public class PagePortalPublico extends ClaseBase{

	public PagePortalPublico(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By txtRutComercio = By.xpath("//*[@id=\'rutComercio\']");
	By txtRutPersonal = By.xpath("//*[@id=\'rutPersonal\']");
	By txtNumeroDocumento = By.xpath("//*[@id=\'numeroDocumento\']");
	
	By btnIngresar = By.xpath("/html/body/app-root/app-login/div[1]/div[2]/div/div[2]/form/div[5]/button[1]");
	
	public void login() throws InterruptedException {
		maximizar();
		Thread.sleep(2000);
		agregarTexto("126453558", txtRutComercio);
		Thread.sleep(2000);
		agregarTexto("126453558", txtRutPersonal);
		Thread.sleep(2000);
		agregarTexto("101582816", txtNumeroDocumento);
		Thread.sleep(2000);
		click(btnIngresar);
	}//fin login
	
	
}

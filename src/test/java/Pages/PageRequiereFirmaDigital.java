package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilidades.ClaseBase;

public class PageRequiereFirmaDigital extends ClaseBase{

	
	public PageRequiereFirmaDigital(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	
	//******************* OBJETOS *******************
	
	
	//**********Verifica Informacion
	By btnVerificaInformacion = By.xpath("//*[@id='irVerificarInformacion']");
	//By btnVerificaInformacion = By.xpath("/html/body/app-root/app-home/div/div/app-solicitud/div/div/div/solicitud-firmantes/div/div[2]/div[3]/div[2]/button");

	
	
	
	//******************* METODOS *******************
	
	
	public void RequiereFirmaDigital(WebDriver driver) throws InterruptedException {
		Thread.sleep(15000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'/stock-api/firmadigital/firmar')]")));
		click(btnVerificaInformacion);
	}//fin RequiereFirmaDigital
	
	
	
}// fin PageRequiereFirmaDigital

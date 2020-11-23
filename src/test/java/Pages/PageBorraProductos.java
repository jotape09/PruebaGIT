package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilidades.ClaseBase;

public class PageBorraProductos extends ClaseBase{

	public PageBorraProductos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}// fin constructor

	
	
	//******************* OBJETOS
	
	By btnEdison = By.xpath("//span[contains(text(),'EDISON')]");
	By btnEliminar = By.xpath("//*[@id='myTable2']/tbody/tr[*]/td[1]/button/span");
	By txtEliminar = By.xpath("//*[@id='myTable2']/tbody/tr[*]/td[1]/strong");
	//By btnPendientes = By.xpath("//*[@id='tabPendientes']");
	By btnPendientes2 = By.xpath("/html/body/div/div/div/app-root/app-home/div[1]/div[2]/div/ul/li[2]/a");
	By btnPendientes = By.xpath("//*[@id='tabPendientes']/span[1]");
	
	By btnConfirmar = By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]");
	By btnContratar = By.xpath("//*[@id='cardContratar']/div/p[1]");
	
	//By btnPendientes = By.xpath("/html/body/div/div/div/app-root/app-home/div[1]/div[3]/div/ul/li[2]/a");
	//By btnPendientes = By.xpath("//*[@id='tabPendientes']/span[1]");
	//By btnPendientes = By.xpath("/html/body/div/div/div/app-root/app-home/div[1]/div[3]/div/ul/li[2]/a/span[1]");
	
	//******************* METODOS
	

	public void borraSiExite(WebDriver driver) throws InterruptedException {
		Thread.sleep(25000);
		//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe[1]")));
		//click(btnEdison);
		//Thread.sleep(25000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/div/iframe")));
		String ValorPend = obtenerTexto(btnPendientes);
		System.out.println(ValorPend);
		click(btnPendientes);
		String ValorPend2 = obtenerTexto(btnPendientes2);
		click(btnPendientes);
		Thread.sleep(3000);
		/*
		System.out.println("INICIO 1");
		System.out.println(Contratar);
		System.out.println("FIN 1");
		click(btnPendientes);
		Thread.sleep(5000);
		Contratar = obtenerTexto(btnContratar);
		System.out.println("INICIO 2");
		System.out.println(Contratar);
		System.out.println("FIN 2");
		*/
		boolean valor;
		boolean valor2;
		String Contratar;
		do {
			Contratar = obtenerTexto(btnContratar);
			valor = (Contratar.contains("Contratar nuevo producto"));
			valor2 = (Contratar.contains(" "));
			if(valor == false){
				if (valor2 = true){
					click(btnEliminar);
					Thread.sleep(2000);
					click(btnConfirmar);
				}// fin if
			}// fin if
		}while(valor == false);	


	}//borraSiExite
	
	
}// fin PageBorraProductos

package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilidades.ClaseBase;

public class PageBackoffice extends ClaseBase{

	By email = By.name("email");
	By pass = By.name("password");
	By btnInicio = By.xpath("//button[@class='btn btn-danger btn-block btn-flat']"); //boton inicio sesion
	By solicitud = By.id("id");
	By btnFiltrar = By.xpath("//button[@class='form-control btn btn-danger']");
	By lblSolicitud = By.xpath("//*[@id=\"contenido\"]/tr/td[11]/p");
	By btnSyP = By.xpath("//*[@id=\"adminBody\"]/div/aside/section/ul/li[2]/a/span");
	
	public PageBackoffice(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void Login() {
		maximizar();
		agregarTexto("ocornejo@transbank.cl", email);
		agregarTexto("ocornejo2018", pass);
		click(btnInicio);
	}//fin login
	

	
	public void IngresoSyP() {
		click(btnSyP);
	}//fin ingreso solicitud
	
	public void Filtrar(String data) {
		agregarTexto(data, solicitud);
		click(btnFiltrar);
	}//fin filtrar

	public String RescataSS() {
		//System.out.println(obtenerTexto(lblSolicitud));
		return obtenerTexto(lblSolicitud);
	}//fin ingreso detalle


}// fin PageBackoffice

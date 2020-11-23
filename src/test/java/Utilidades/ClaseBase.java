package Utilidades;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Columns;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.property.GetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ClaseBase {

	private WebDriver driver;

	
	public ClaseBase(WebDriver driver) {
		super();
		this.driver = driver;
	}// fin metodo constructor
	
	public WebDriver ConexionChromeDriver() {
		String path = Paths.get(System.getProperty("user.dir"),"src/test/resources/Drivers/chromedriver.exe").toString();
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		return driver;
	}// fin metodo ConexionChromeDriver
	
	public WebElement buscarElementoWeb(By localizador){
			return driver.findElement(localizador);	
	}// fin clase buscar elemento web
	
	
	public List<WebElement> buscarElementosWeb(By localizador){
		return driver.findElements(localizador);
	}// fin list
	
	
	public void cerrarBrowser() {
		try {
		driver.close();
		} catch(Exception e) {
			
		}// fin try catch
	}//Fin cerrar Browser
	
	public String obtenerTexto(By localizador) {
		return driver.findElement(localizador).getText();
	}//fin obtenerTexto
	
	public void agregarTexto(String input, By localizador) {
		try {
			driver.findElement(localizador).sendKeys(input);
		} catch(Exception e) {
			
		}// fin try catch
		
	}// fin agregarTexto
	
	public void click(By localizador){
		try {
			driver.findElement(localizador).click();
		} catch(Exception e) {
			
		}// fin try catch
		
	}// fin click
	
	public boolean estaDesplegado(By localizador){
		try {
			return driver.findElement(localizador).isDisplayed();
		} catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}// fin try catch
	}//fin clase estaDesplegado
	
	public void visitarSitio(String url){
		try {
			driver.get(url);
		} catch(org.openqa.selenium.NoSuchElementException e) {
			
		}// fin try catch
	}// fin visitarSitio
	
	public void esperarElemento() {
		// tiempo impicito desde el driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}// fin esperarElemento
	
	public void maximizar() {
		// tiempo impicito desde el driver
		driver.manage().window().maximize();
	}// fin mazimizar
	
	
	public int rowcounts() throws IOException {
		File src = new File("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\PortalEdisonSelenium\\Data\\DataFolioSS.xlsx");
		
		FileInputStream file = new FileInputStream(src);
		//FileInputStream file = new FileInputStream("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\BuscarSS\\Data\\DataFolioSS.xlsx");
		
		//se instancia un objeto de tipo XXFWorkbook con la ruta del excel
		XSSFWorkbook excel = new XSSFWorkbook(file);
		
		//Se instancia un objeto de tipo XSSFSheet con la hoja encontrada
		XSSFSheet hojaexcel = excel.getSheetAt(0);
		
		int rowcounts = hojaexcel.getLastRowNum();
		rowcounts = rowcounts + 1;
		//String strvalue = String.valueOf(rowcounts);
		return rowcounts;
		
	}//fin cantidad de filas
	
	public String Buscardata(int i) throws IOException {
		
		File src = new File("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\PortalEdisonSelenium\\Data\\DataFolioSS.xlsx");
		
		FileInputStream file = new FileInputStream(src);
		//FileInputStream file = new FileInputStream("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\BuscarSS\\Data\\DataFolioSS.xlsx");
		
		//se instancia un objeto de tipo XXFWorkbook con la ruta del excel
		XSSFWorkbook excel = new XSSFWorkbook(file);
		
		//Se instancia un objeto de tipo XSSFSheet con la hoja encontrada
		XSSFSheet hojaexcel = excel.getSheetAt(0);
		String Buscardata;
		if(hojaexcel.getRow(i).getCell(0).getCellTypeEnum() == CellType.STRING) {
			Buscardata = hojaexcel.getRow(i).getCell(0).getStringCellValue();
			//System.out.println(Buscardata);
		}else {
			Buscardata = NumberToTextConverter.toText(hojaexcel.getRow(i).getCell(0).getNumericCellValue());
		}
		excel.close();
		return Buscardata;
	}//fin recorre columna
	
	public void EscribeColumna(int i, String numSS) throws IOException {
		File src = new File("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\PortalEdisonSelenium\\Data\\DataFolioSS.xlsx");
		
		FileInputStream file = new FileInputStream(src);
		//FileInputStream file = new FileInputStream("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\BuscarSS\\Data\\DataFolioSS.xlsx");
		
		//se instancia un objeto de tipo XXFWorkbook con la ruta del excel
		XSSFWorkbook excel = new XSSFWorkbook(file);
		
		//Se instancia un objeto de tipo XSSFSheet con la hoja encontrada
		XSSFSheet hojaexcel = excel.getSheetAt(0);
		
		int rowcounts = hojaexcel.getLastRowNum();
		rowcounts = rowcounts + 1;
		for(int e= 0; e<rowcounts; e++) {
			hojaexcel.getRow(i).createCell(1).setCellValue(numSS);
			FileOutputStream fout = new FileOutputStream(src);
			excel.write(fout);
		}//fin for
		excel.close();
	}//fin escribe columna
	
	
	public void EscribeFolio(int i, String numFolio) throws IOException {
	File src = new File("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\PortalEdisonSelenium\\Data\\DataFolioSS.xlsx");
		
		FileInputStream file = new FileInputStream(src);
		//FileInputStream file = new FileInputStream("C:\\Users\\Juan.Fuentes\\Desktop\\Aplicaciones Eclipse\\BuscarSS\\Data\\DataFolioSS.xlsx");
		
		//se instancia un objeto de tipo XXFWorkbook con la ruta del excel
		XSSFWorkbook excel = new XSSFWorkbook(file);
		
		//Se instancia un objeto de tipo XSSFSheet con la hoja encontrada
		XSSFSheet hojaexcel = excel.getSheetAt(0);
		
		int rowcounts = hojaexcel.getLastRowNum();
		rowcounts = rowcounts + 1;

		//for(int e= 0; e<rowcounts; e++) {
			hojaexcel.getRow(i).createCell(0).setCellValue(numFolio);
			FileOutputStream fout = new FileOutputStream(src);
			excel.write(fout);
		//}//fin for
		excel.close();
	}//fin escribe columna
	
	

	
}// fin clase base

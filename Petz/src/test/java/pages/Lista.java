package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lista extends PageObject{
	
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[1]/h1[1]")
	private WebElement cabecalhoResultado;

	
	public Lista(WebDriver driver) {
		super(driver);
	}
  
	public void clicarNoProduto(String produto) {
		WebElement produtoDesejado = driver.findElement(By.xpath("//h3[contains(text(),'" + produto + "')]"));
		produtoDesejado.click();
	}
	
	public String lerResultados() {
		return cabecalhoResultado.getText();
	}
	
	
	
}

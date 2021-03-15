package petz;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;

public class ComprarProduto {

	String url;
	WebDriver driver;
	Home home;

	@Before
	public void init() {
		url = "https://www.petz.com.br";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
		home = new Home(driver);
	}

	@After
	public void quit() {
		driver.quit();
	}

	@Given("^que acesso o site Petz$")
	public void que_acesso_o_site_Petz() {
		driver.get(url);
		System.out.println("Passo 1");
	}

	@When("^busco por \"([^\"]*)\" e pressiono Enter$")
	public void busco_por_e_pressiono_Enter(String produto) {
		home.buscarProdutoComEnter(produto);
		System.out.println("Passo 2");
	}

	@Then("^exibe uma lista de produtos relacionados com \"([^\"]*)\"$")
	public void exibe_uma_lista_de_produtos_relacionados_com(String arg1) {
		System.out.println("Passo 3");
	}

	@When("^escolho \"([^\"]*)\"$")
	public void escolho(String arg1) {
		System.out.println("Passo 4");

	}

	@Then("^exibe para o \"([^\"]*)\" o preco de \"([^\"]*)\"$")
	public void exibe_para_o_o_preco_de(String arg1, String arg2) {
		System.out.println("Passo 5");

	}

}

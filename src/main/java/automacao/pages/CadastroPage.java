package automacao.pages;

import org.openqa.selenium.By;

import automacao.core.BasePage;

public class CadastroPage extends BasePage {
	
	public String obterTexto () {
		return obterTexto(By.id("entervehicledata")).getAttribute("name");
	
	}

}

package automacao.core;

import static automacao.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import automacao.core.Propriedades;

public class BasePage {

	public void clicarButton(By by) {
		getDriver().findElement(by).click();
	}

	public WebElement obterTexto(By by) {
		return getDriver().findElement(by);
	}

	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public void limparTexto(By by) {
		getDriver().findElement(by).clear();
	}

	public void esperaSugestivaGenerica(int time, By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	

	/********* Combo ************/

	public void selecionarCombo(By by, String tipo) {
		WebElement elementoSelecionado = getDriver().findElement(by);
		Select combo = new Select(elementoSelecionado);
		combo.selectByVisibleText(tipo);
	}
	

	/************* Upload ****************/
	public void upload(By by, String caminho) {
		getDriver().findElement(by)
		.sendKeys(caminho);
	}
	
	/*******************tabela********************/
	
	public int localizarIndiceColuna(WebElement tabela, String descricaoColuna) {
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		int idColuna = -1;
		for (int i = 0; i < colunas.size(); i++) {
			if(capturaRegistroTabela(colunas, i).equals(descricaoColuna)) {
				idColuna = i + 1;
				break;
			}
		}
		return idColuna;
	}
	
	
	public int localizarIndiceLinha(WebElement tabela, int idColuna, String registro) {
		List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td["+ idColuna +"]"));
		
		int idLinha = -1;
		for (int i = 0; i < linhas.size(); i++) {
			if(capturaRegistroTabela(linhas, i).equals(registro)) {
				idLinha = i + 1;
				break;
			}
		}
		return idLinha;
	}

	private String capturaRegistroTabela(List<WebElement> linhas, int i) {
		return linhas.get(i).getText();
	}
	

	/**************mÃ©todo de validaÃ§Ã£o***************/
	
	public List<String> localizadorListaMensagens(By by) {
		List<WebElement> mensagens = DriverFactory.getDriver().findElements(by);
		List<String> retorno = new ArrayList<String>();
		for (WebElement mensagem : mensagens) {
			retorno.add(mensagem.getText());
		}
		return retorno;
	}
}

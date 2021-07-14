package automacao.core;

import static automacao.core.DriverFactory.getDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModelPage {

	public void clicarButton(By by) {
		esperaSugestivaGenerica(30, by);
		getDriver().findElement(by).click();	
	}
	
	public void uploadArquivo (String path, By by) {
		WebElement uploadElement = getDriver().findElement(by);
		uploadElement.sendKeys(path);
	}

	public WebElement obterTexto(By by) {
		esperaSugestivaGenerica(30, by);
		return getDriver().findElement(by);
	}

	public void escrever(By by, String texto) {
		esperaSugestivaGenerica(30, by);
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public void limparTexto(By by) {
		getDriver().findElement(by).clear();
	}

	public void esperaSugestivaGenerica(int time, By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
	public void selecionarCombo(By by, String tipo) {
		esperaSugestivaGenerica(30, by);
		WebElement elementoSelecionado = getDriver().findElement(by);
		Select combo = new Select(elementoSelecionado);
		combo.selectByVisibleText(tipo);
	}
	
	public void esperarPorTempoFixo(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

package automacao.core;

import static automacao.core.DriverFactory.getDriver;
import static automacao.core.DriverFactory.killDriver;
import static automacao.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import automacao.core.Propriedades;

public class BaseTest {
	
	@Rule
	public TestName testName = new TestName(); 


	public static void acessarTela () {
		getDriver().get(Propriedades.ambientes.toString());
	}
	
	@AfterClass
	public static void fechaBrowser() {
		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
	
	@After
	public void finalizarTestes() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
		File arquivo = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));
	}
}

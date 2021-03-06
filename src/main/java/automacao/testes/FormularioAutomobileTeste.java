package automacao.testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import automacao.core.ModelTest;
import automacao.pages.FormularioAutomobilePage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FormularioAutomobileTeste extends ModelTest{
	
	private FormularioAutomobilePage page = new FormularioAutomobilePage ();
	
	@BeforeClass
	public static void acessaTela () {
		acessarTela();
	}
	
	@Test
	public void t1_verificarCarregamentoPagina () {
		assertEquals("Automobile Insurance", page.obterNomeFormulario());
	}
	
	@Test
	public void t2_validarMensagemPriceOption () {
		page.clicarEtapaPriceOption();
		assertEquals("Please, complete the first three steps to see the price table.",
				page.obterMensagemPriceOption());
	}
	
	@Test
	public void t3_validarMensagemSendQuote () {
		page.clicarEtapaSendQuote();
		assertEquals("Please, select a price option to send the quote.",
				page.obterMensagemSendQuote());
	}
	
	@Test
	public void t4_validarMensagemSucesso () {
		acessarTela();
		//Enter Vehicle Data
		page.selecionarComboMake("Ford");
		page.setEnginePerformance("20");
		page.setDateOfManufacture("07/13/2021");
		page.selecionarComboNumberOfSeats("5");
		page.selecionarComboFuel("Petrol");
		page.setListPrice("600");
		page.setLicensePlateNumber("CAR123");
		page.setAnnualMileage("265");
		page.clicarBotaoNextInsuranceData();
		
		//Enter Insurance Data
		page.setFirstName("Fulano");
		page.setLastName("DeTal");
		page.setDateOfBirth("10/10/1995");
		page.clicarGenderMale();
		page.setStreetAddress("Avenida Brasil, 50");
		page.selecionarComboCountry("Brazil");
		page.setZipCode("41000000");
		page.setCity("Salvador");
		page.selecionarComboOccupation("Employee");
		page.clicarHobbiesSpeeding();
		page.clicarHobbiesBungeeJumpee();
		page.clicarHobbiesCliffDiving();
		page.clicarHobbiesOther();
		page.clicarHobbiesSkydiving();
		page.setWebSite("www.teste.com");
		page.setPicture("/src/main/resources/Teste.PNG");
		page.clicarBotaoNextProductData();
		
		//Enter Product Data
		page.setStartDate("10/15/2021");
		page.setInsuranceSum("7.000.000,00");
		page.setMeritRating("Bonus 5");
		page.setDamageInsurance("No Coverage");
		page.clicarOptionalProductsEuroProtection();
		page.clicarOptionalProductsLegalDefenseInsurance();
		page.setCourtesyCar("Yes");
		page.clicarBotaoNextPriceOption();
		
		//Select Price Option
		page.clicarPrice();
		page.clicarBotaoNextSendQuote();
		
		//Send Quote
		page.setEmail("teste@teste.com");
		page.setPhone("5571988887777");
		page.setUsername("teste");
		page.setPassword("123Abc");
		page.setConfirmPassword("123Abc");
		page.setComments("Nothing to do!");
		page.clicarBotaoSend();
		
		assertEquals("Sending e-mail success!", page.obterMensagemSucesso());
	}
}
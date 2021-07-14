package automacao.pages;

import org.openqa.selenium.By;

import automacao.core.BasePage;

public class CadastroPage extends BasePage {
	
	public void clicarTipoAutomobile () {
		clicarButton(By.id("nav_automobile"));
	}
	
	public String obterNomeFormulario () {
		return obterTexto(By.id("selectedinsurance")).getText();	
	}
	
	public String obterMensagemPriceOption() {
		return obterTexto(By.id("xLoaderPrice")).getText();
	}
	
	public String obterMensagemSendQuote() {
		return obterTexto(By.id("xLoaderQuote")).getText();
	}
	
	public void selecionarComboMake (String opcao) {
		selecionarCombo(By.id("make"), opcao);
	}
	
	public void setEnginePerformance (String valor) {
		escrever(By.id("engineperformance"), valor);
	}
	
	public void setDateOfManufacture (String valor) {
		escrever(By.id("dateofmanufacture"), valor);
	}
	
	public void selecionarComboNumberOfSeats (String opcao) {
		selecionarCombo(By.id("numberofseats"), opcao);
	}
	
	public void selecionarComboFuel (String opcao) {
		selecionarCombo(By.id("fuel"), opcao);
	}
	
	public void setListPrice (String valor) {
		escrever(By.id("listprice"), valor);
	}
	
	public void setLicensePlateNumber (String valor) {
		escrever(By.id("licenseplatenumber"), valor);
	}
	
	public void setAnnualMileage (String valor) {
		escrever(By.id("annualmileage"), valor);
	}
	
	public void clicarBotaoNextInsuranceData () {
		clicarButton(By.id("nextenterinsurantdata"));
	}
	
	public void clicarEtapaPriceOption () {
		clicarButton(By.id("selectpriceoption"));
	}
	
	public void clicarEtapaSendQuote () {
		clicarButton(By.id("sendquote"));
	}
	
	public void setFirstName (String valor) {
		escrever(By.id("firstname"), valor);
	}
	
	public void setLastName (String valor) {
		escrever(By.id("lastname"), valor);
	}
	
	public void setDateOfBirth (String valor) {
		escrever(By.id("birthdate"), valor);
	}
	
	public void clicarGenderMale (){
		clicarButton(By.xpath("//label[normalize-space()='Male']"));
	}
	
	public void clicarGenderFemale (){
		clicarButton(By.xpath("//label[normalize-space()='Female']"));
	}
	
	public void setStreetAddress (String valor) {
		escrever(By.id("streetaddress"), valor);
	}
	
	public void selecionarComboCountry (String opcao) {
		selecionarCombo(By.id("country"), opcao);
	}
	
	public void setZipCode (String valor) {
		escrever(By.id("zipcode"), valor);
	}
	
	public void setCity (String valor) {
		escrever(By.id("city"), valor);
	}
	
	public void selecionarComboOccupation(String opcao) {
		selecionarCombo(By.id("occupation"), opcao);
	}
	
	public void clicarHobbiesSpeeding (){
		clicarButton(By.xpath("//label[normalize-space()='Speeding']"));
	}
	
	public void clicarHobbiesBungeeJumpee (){
		clicarButton(By.xpath("//label[normalize-space()='Bungee Jumping']"));
	}
	
	public void clicarHobbiesCliffDiving(){
		clicarButton(By.xpath("//label[normalize-space()='Cliff Diving']"));
	}
	
	public void clicarHobbiesSkydiving(){
		clicarButton(By.xpath("//label[normalize-space()='Skydiving']"));
	}
	
	public void clicarHobbiesOther(){
		clicarButton(By.xpath("//label[normalize-space()='Other']"));
	}
	
	public void setWebSite (String valor) {
		escrever(By.id("website"), valor);
	}
	
	public void setPicture (String valor) {
		uploadArquivo(valor);
	}
	
	public void clicarBotaoNextProductData () {
		clicarButton(By.id("nextenterproductdata"));
	}
	
	public void setStartDate (String valor) {
		escrever(By.id("startdate"), valor);
	}
	
	public void setInsuranceSum (String opcao) {
		selecionarCombo(By.id("insurancesum"), opcao);
	}
	
	public void setMeritRating (String opcao) {
		selecionarCombo(By.id("meritrating"), opcao);
	}
	
	public void setDamageInsurance (String opcao) {
		selecionarCombo(By.id("damageinsurance"), opcao);
	}
	
	public void clicarOptionalProductsEuroProtection(){
		clicarButton(By.xpath("//label[normalize-space()='Euro Protection']"));
	}
	
	public void clicarOptionalProductsLegalDefenseInsurance(){
		clicarButton(By.xpath("//label[normalize-space()='Legal Defense Insurance']"));
	}

	public void setCourtesyCar (String opcao) {
		selecionarCombo(By.id("courtesycar"), opcao);
	}
	
	public void clicarBotaoNextPriceOption () {
		clicarButton(By.id("nextselectpriceoption"));
	}
	
	public void clicarPrice () {
		clicarButton(By.xpath("//section[@id='pricePlans']//label[1]//span[1]"));
	}
	
	public void clicarBotaoNextSendQuote () {
		esperaSugestivaGenerica(30, By.id("nextsendquote"));
		clicarButton(By.id("nextsendquote"));
	}
	
	public void setEmail (String valor) {
		escrever(By.id("email"), valor);
	}
	
	public void setPhone (String valor) {
		escrever(By.id("phone"), valor);
	}
	
	public void setUsername (String valor) {
		escrever(By.id("username"), valor);
	}
	
	public void setPassword (String valor) {
		escrever(By.id("password"), valor);	
	}
	
	public void setConfirmPassword (String valor) {
		escrever(By.id("confirmpassword"), valor);	
	}
	
	public void setComments (String valor) {
		escrever(By.id("Comments"), valor);
	}
	
	public void clicarBotaoSend () {
		clicarButton(By.id("sendemail"));
	}
	
	public String obterMensagemSucesso () {
		esperaSugestivaGenerica(30, By.xpath("//div[@class='sweet-alert showSweetAlert visible']/h2"));
		return obterTexto(By.xpath("//div[@class='sweet-alert showSweetAlert visible']/h2")).getText();
	}
	
	public void clicarBotaoOk () {
		clicarButton(By.xpath("//button[@class='confirm']"));
	}
}

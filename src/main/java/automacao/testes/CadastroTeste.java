package automacao.testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import automacao.core.BaseTest;
import automacao.pages.CadastroPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroTeste extends BaseTest{
	
	private CadastroPage page = new CadastroPage ();
	
	@BeforeClass
	public static void acessaTela () {
		acessarTela();
	}
	
	@Test
	public void teste1_verificaCarregamentoPagina () {
		assertEquals("Enter Vehicle Data", page.obterTexto());
		System.out.println("Teste");
	}
	
	@Test
	public void test2_validarMake () {

		}
	}


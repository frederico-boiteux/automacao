package automacao.testes;

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
	public void test1 () {
		System.out.println("Teste");
	}

}

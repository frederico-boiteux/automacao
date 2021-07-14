package automacao.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import automacao.testes.CadastroTeste;

@RunWith(Suite.class)
@SuiteClasses({
	CadastroTeste.class
})

public class SuiteTestes {

}

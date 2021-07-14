package automacao.core;

public class Propriedades {

	public static boolean FECHAR_BROWSER = true;

	public static Browsers browser = Browsers.CHROME;
	
	public static Ambientes ambientes = Ambientes.DEFAULT;

	public enum Browsers {
		CHROME, FIREFOX 
	}
	
	public enum Ambientes {
		DEFAULT ("http://sampleapp.tricentis.com/101/index.php");

		private String fields;
		 
		private Ambientes (String fields) {
			this.fields = fields;
		}
 
		@Override
		public String toString() {
			return this.fields;
		}
	}
}

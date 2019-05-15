package questao01;

public class Teste {
	String msg;

	public static void main(String[] args) {
	
		Teste classeJoia = new Teste();
		classeJoia.imprimeAlgoImportante();
	}
	
	void imprimeAlgoImportante() {
		if (!msg.isEmpty())
			System.out.println(msg);
		else
			System.out.println("empty");
	}
}

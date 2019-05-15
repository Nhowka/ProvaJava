package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class B {
	static private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		B.b = b;
	}
}

class Pessoa extends Object {

	private String sobrenome;
	private String nome;

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return nome + " " + sobrenome;
	}

}

interface Aviso {

	void avisar();
}

abstract class Validar implements Aviso {
	private String conteudo = "";

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		if (conteudo == null)
			this.conteudo = "";
		else
			this.conteudo = conteudo;
	}

	public void avisar() {
		mostra();
	}

	void mostra() {
		if (valida())
			System.out.println("O conteúdo (" + conteudo + ") é valido");
		else
			System.out.println("Conteúdo inválido");
	}

	abstract boolean valida();
}

class SiglaEstado extends Validar {

	@Override
	boolean valida() {
		return getConteudo().length() == 2;
	}
}

class Numerico extends Validar {

	@Override
	boolean valida() {
		for (char c : getConteudo().toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

}

class Urgencia implements Aviso {

	@Override
	public void avisar() {
		System.out.println("URGENTE!!!");
	}
}

class Ok implements Aviso {

	@Override
	public void avisar() {
		System.out.println("Suave");
	}

}

class Exemplos implements Aviso {
	public void test(String[] args) {

		List<Aviso> avisos = new ArrayList<>();
		Validar v1 = new Numerico();
		Validar v2 = new Numerico();
		// v1.setConteudo("SP");
		// v2.setConteudo("123");
		// v1.mostra();
		// b.mostra();
		avisos.add(new Ok());
		avisos.add(new Urgencia());
		avisos.add(new Exemplos());
		avisos.add(v1);
		avisos.add(v2);
		avisos.add(new Aviso() {

			@Override
			public void avisar() {
				System.out.println("Modo antigo");

			}
		});
		avisos.add(() -> System.out.println("Lambda"));

		avisos.forEach(a -> a.avisar());

		for (Aviso a : avisos) {
			a.avisar();
		}

	}

	@Override
	public void avisar() {
		System.out.println("Sou o Teste");

	}
	
	static boolean isPrime(int i) {
		if (i < 2)
			return false;
		for (int n = 2; n*n <= i; n++) {
			if (i % n == 0)
				return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String... args) {
		OptionalInt resultado = IntStream
				.range(0, 100)				
				.filter(Exemplos::isPrime)
				.map(i -> {
					System.out.println(i);
					return i;
				})
				.filter(i -> i > 45)
				.findAny();
				/*.reduce(0, (a, b) -> {
			System.out.println("a: " + a + "\nb: " + b);
			return a + b;
		});*/
		
		
		
		System.out.println(resultado);
	}

}

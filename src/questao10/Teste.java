package questao10;

class Teste {

	public static void main(String[] args) {
		String name = "";
		try {
			name.toLowerCase().contains("Teste");
			System.out.println("a");
		} catch (NullPointerException ex) {
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
}


package questao09;

class Teste {
	public static void main(String[] args) {
		String name = null;
		
		try {
			name.toLowerCase();
			System.out.println("a");
		} catch (NullPointerException ex) {
			System.out.println("b");
		}
		System.out.println("c");
	}
}

package questao13;

interface Printer {
	void printMessage();
}

class Teste {

	public static void main(String[] args) {
		 Printer p = null;
		 
		 p = () -> System.out.println("Hello World");
		 
		 p.printMessage();
		}
}

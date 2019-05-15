package questao05;

public class Teste {
	void method(Object o) {
		System.out.println("object");
	}
	
	void method(Integer i) {
		System.out.println("int");
	}

	void method(String s) {
		System.out.println("string");
	}

	public static void main(String[] args) {
		
		new Teste().method((Object) "random"); 
		
		String x = "random";
		Object y = x;
		Integer z = 2;
		
		new Teste().method(z);
		new Teste().method(x); 
		new Teste().method(y); 
	}
}

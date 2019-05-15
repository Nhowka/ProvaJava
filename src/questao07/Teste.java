package questao07;

class A {
	int i = 5;
}

public class Teste extends A {
	int i = 10;

	void run(int i) {
		System.out.println(i); 
		System.out.println(this.i);
		System.out.println(super.i); 
	}

	public static void main(String... args) {
		new Teste().run(3);
	}
}

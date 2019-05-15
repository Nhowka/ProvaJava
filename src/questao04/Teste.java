package questao04;

public class Teste {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 3; i++) {
			switch (i) {

			case 0:
				System.out.println("case: " + i);
				continue;
			case 1:
				System.out.println("case: 1");
				break;
			case 2:
				System.out.println("case: 2");
			default:
				System.out.println("default...");
				break;
			}
		}
	}
}

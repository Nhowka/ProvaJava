package questao08;

abstract class Veiculo {
	public static void main(String[] args) {
		System.out.println("Não Compila ?");
	}
	
	public abstract void harley();
}

abstract class Motocicleta extends Veiculo {
	
	Motocicleta(){
		System.out.println("Ou Compila ? ");
	}
}

class MotocicletaEspecial extends Motocicleta {
	public void harley() {
		System.out.println("Compilou");
	}
}


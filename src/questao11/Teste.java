package questao11;

class Teste {

	public static void main(String[] args) {
		try {
			
			// arquivo não existe no diretorio !
			new java.io.FileInputStream("a.txt");

			System.out.println("Entrou no try !");

		} catch (java.io.IOException e) {
			System.out.println("IOException");

		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		
		} catch (Exception e) {
			System.out.println("Exception");
		
		}finally {
			System.out.println("finally");
		}
	}
}

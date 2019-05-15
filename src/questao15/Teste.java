package questao15;
/*
class TesteI {

	public static void main ([]String args) {}

}
*/
class TesteII {

	public static void main (String... args) {
		System.out.println("TesteII");
	}
	
}

class TesteIII {

	static public void main(String[] args) {
		System.out.println("TesteIII");
	}

}
/*
class TesteIV {

	public static void main (String...  args[]){}

}
*/
class TesteV {

	public static void main (String args[]) {
		System.out.println("TesteV");
	}

}

class Teste{
	public static void main(String[] args) {
		//TesteII.main(args);
		//TesteIII.main(args);
		//TesteV.main(args);
		for(String a : args) {
			System.out.println(a);
		}
	}
	
}




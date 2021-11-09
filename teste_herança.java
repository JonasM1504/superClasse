package superClasse;

public class teste_herança {

	public static void main(String[]args) {
		
		automovel a = new automovel(4, 4, "branco", 2, "JQK5463");
		
		System.out.println(a.getCapacidade() + " pessoas");
		System.out.println(a.getNumRodas() + " rodas");
		System.out.println(a.getCor());
		System.out.println(a.getNumPortas() + " portas - coupé");
		System.out.println(a.getPlaca());
		
		System.out.println("----------------------------");
		
		
		
	}
	
}

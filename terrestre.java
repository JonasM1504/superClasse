package superClasse;

public class terrestre extends transporte {

	private int numRodas;

	public terrestre(int capacidade, int numRodas) {
		super(capacidade);
		this.numRodas = numRodas;
	}

	public int getNumRodas() {
		return numRodas;
	}

	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}
	
	
	
}

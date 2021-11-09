package superClasse;

public class automovel extends terrestre{

	private String cor;
	private int numPortas;
	private String placa;
	
	public automovel(int capacidade, int numRodas, String cor, int numPortas, String placa) {
		super(capacidade, numRodas);
		this.cor = cor;
		this.numPortas = numPortas;
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
}

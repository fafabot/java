package lista24;

public class Carro extends Veiculo{
	private int portas;

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}
	
	public void abrirPortaMalas() {
		System.out.println("O carro de "+portas+" portas está abrindo o porta malas");
	}
	
}

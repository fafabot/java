package lista23;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if (estoque<0) {
			System.out.println("Quantidade Inválida");
		} else {
			this.estoque = estoque;
		}	
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco<0) {
			System.out.println("Valor inválido");
		} else {
			this.preco = preco;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

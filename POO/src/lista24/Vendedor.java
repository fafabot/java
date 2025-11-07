package lista24;

public class Vendedor extends Funcionario{
	private double comissao = 500;

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
        return getSalarioBase() + comissao;
    }
	
	public void vender() {
		System.out.println("O vendedor realizou uma venda e ganhou comissão");
	}

}

package polimorfismo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numero, String titular, double saldo) {
		super(numero, titular, saldo);
		
	}
	@Override
	public void depositar (double valor) {
		double render = valor * 0.01;
		saldo = saldo + valor + render;
		System.out.println("Depósito realizado");
		System.out.println("Novo saldo: "+ saldo);
	}
}
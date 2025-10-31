package encapsulamento;

public class ContaBancariaP {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.setTitular("Marcia");
		conta.depositar(500);
		System.out.println("Titular: "+conta.getTitular());
		System.out.println("Saldo: "+conta.getSaldo());
		conta.sacar(200);
		System.out.println("Saldo: "+conta.getSaldo());
		conta.sacar(400);
		System.out.println("Saldo: "+conta.getSaldo());

	}

}

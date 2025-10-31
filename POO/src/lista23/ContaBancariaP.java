package lista23;

import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Informe o nome do titular da conta: ");
        String titular = sc.nextLine();
        conta.setTitular(titular);

        System.out.println("--------------------");
        System.out.println("Conta criada para " + conta.getTitular());
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        System.out.println("--------------------");

        System.out.print("Informe o valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.println("Saldo após depósito: R$" + conta.getSaldo());
        
        System.out.println("--------------------");

        System.out.print("Informe o valor para saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        System.out.println("Saldo final: R$" + conta.getSaldo());
	}

}

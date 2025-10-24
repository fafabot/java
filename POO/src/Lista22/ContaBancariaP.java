package Lista22;

import java.util.Scanner;

public class ContaBancariaP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();
        System.out.println("Digite o nome do titular da conta:");
        conta.titular = sc.nextLine();

        conta.mostrarSaldo();
        System.out.println("Digite o valor para depósito:");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        conta.mostrarSaldo();

        System.out.println("Digite o valor para saque:");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        conta.mostrarSaldo();
    }
}

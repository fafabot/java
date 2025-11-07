package lista24;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();

        System.out.print("Digite o nome do gerente: ");
        String nomeGerente = sc.next();
        gerente.setNome(nomeGerente);

        System.out.print("Digite o salário base do gerente: ");
        double salarioGerente = sc.nextDouble();
        gerente.setSalarioBase(salarioGerente);

        System.out.print("Digite o departamento do gerente: ");
        String depto = sc.next();
        gerente.setDepartamento(depto);

        System.out.println("\nInformações do Gerente");
        gerente.exibirInfo();
        System.out.println("Salário final: R$ " + gerente.calcularSalario());
        gerente.gerenciar();

        System.out.println("-----------------------------");

        Vendedor vendedor = new Vendedor();

        System.out.print("Digite o nome do vendedor: ");
        String nomeVend = sc.next();
        vendedor.setNome(nomeVend);

        System.out.print("Digite o salário base do vendedor: ");
        double salarioVend = sc.nextDouble();
        vendedor.setSalarioBase(salarioVend);

        System.out.println("\nInformações do Vendedor");
        vendedor.exibirInfo();
        System.out.println("Comissão: R$ " + vendedor.getComissao());
        System.out.println("Salário final: R$ " + vendedor.calcularSalario());
        vendedor.vender();

	}

}

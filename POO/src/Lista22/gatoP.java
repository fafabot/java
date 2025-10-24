package Lista22;

import java.util.Scanner;

public class gatoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Primeiro gato
		gato cat = new gato();
		cat.nome = "Mingau";
		cat.raca = "Persa";
		cat.idade = 3;
		cat.miar();
		cat.comer();
		cat.mostrarInformacoes();

		System.out.println("----------------------");

		// Segundo gato
		gato cat2 = new gato();
		System.out.println("Qual o nome do gato?");
		cat2.nome = sc.next();

		System.out.println("Qual a raça do gato?");
		cat2.raca = sc.next();

		System.out.println("Qual a idade do gato?");
		cat2.idade = sc.nextInt();

		cat2.miar();
		cat2.comer();
		cat2.mostrarInformacoes();
	}
}
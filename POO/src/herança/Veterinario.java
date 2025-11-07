package herança;

import java.util.Scanner;

public class Veterinario {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome do pet? ");
		String nome = sc.next();
		System.out.println("Qual a raça do pet? ");
		String raca = sc.next();
		
		dog.setNome(nome);
		dog.setRaca(raca);
		
		System.out.println("Dados: ");
		dog.info();
		dog.dados();

	}

}

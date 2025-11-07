package lista24;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro car = new Carro();
		
		System.out.print("Digite a marca do carro: ");
		String marca = sc.nextLine();
        car.setMarca(marca);
        
        System.out.println("Digite o ano do carro: ");
        int ano = sc.nextInt();
        car.setAno(ano);
        
        System.out.println("Digite a quantidade de portas do carro: ");
        int portas = sc.nextInt();
        car.setPortas(portas);
        
        System.out.println("\nInformações do Carro");
        car.exibirInfo();
        car.abrirPortaMalas();
		

	}

}

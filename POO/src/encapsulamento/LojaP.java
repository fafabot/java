package encapsulamento;

import java.util.Scanner;

public class LojaP {

	public static void main(String[] args) {
		Loja loja=new Loja();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("Cadastro de produtos");
		System.out.println("--------------------");
		System.out.println("Nome do Produto: ");
		String nome = sc.next();
		System.out.println("Valor do Produto: ");
		double valor = sc.nextDouble();
		System.out.println("--------------------");
		
		loja.setNome(nome);
		loja.setPreco(valor);
		System.out.println("--------------------");
		System.out.println("Relatório do Produto");
		System.out.println("--------------------");
		System.out.println("Nome: "+loja.getNome());
		System.out.println("Valor: "+loja.getPreco());
		System.out.println("--------------------");
	}

}

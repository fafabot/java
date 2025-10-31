package lista23;

import java.util.Scanner;

public class ProdutoP {

	public static void main(String[] args) {
		Produto prod=new Produto();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("Cadastro de produtos");
		System.out.println("--------------------");
		System.out.println("Nome do Produto: ");
		String nome = sc.next();
		System.out.println("Valor do Produto: ");
		double preco = sc.nextDouble();
		System.out.println("Estoque do Produto: ");
		int estoque = sc.nextInt();
		System.out.println("--------------------");
		
		prod.setNome(nome);
		prod.setPreco(preco);
		prod.setEstoque(estoque);
		System.out.println("--------------------");
		System.out.println("Relatório do Produto");
		System.out.println("--------------------");
		System.out.println("Nome: "+prod.getNome());
		System.out.println("Valor: "+prod.getPreco());
		System.out.println("Quantidade: "+prod.getEstoque());
		System.out.println("--------------------");
	}

}

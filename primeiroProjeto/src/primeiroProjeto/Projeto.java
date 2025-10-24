package primeiroProjeto;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // 1. Nome do cliente
		        System.out.print("Digite o nome do cliente: ");
		        String nome = sc.nextLine();
		        System.out.println("Bem-vindo à Loja, " + nome + "!\n");

		        // 2. Produtos da loja
		        String[] produtos = {"Camiseta", "Calça", "Tênis", "Boné", "Jaqueta", "Meia"};
		        int[] estoque = {10, 8, 5, 12, 6, 20};

		        System.out.println("Produtos disponíveis:");
		        for (int i = 0; i < produtos.length; i++) {
		            System.out.println((i + 1) + " - " + produtos[i] + " (Estoque: " + estoque[i] + ")");
		        }

		        // 3. Escolher produto
		        System.out.print("\nEscolha o número do produto: ");
		        int escolha = sc.nextInt();

		        if (escolha < 1 || escolha > produtos.length) {
		            System.out.println("Produto inválido!");
		            return;
		        }

		        String produtoEscolhido = produtos[escolha - 1];
		        int qtdEstoque = estoque[escolha - 1];

		        // 4. Quantidade desejada
		        System.out.print("Informe a quantidade desejada: ");
		        int quantidade = sc.nextInt();

		        if (quantidade <= 0) {
		            System.out.println("Valor incorreto, informe pelo menos um produto!");
		            return;
		        }

		        if (quantidade > qtdEstoque) {
		            System.out.println("Não temos essa quantidade em estoque!");
		            return;
		        }

		        // 5. Valor unitário
		        System.out.print("Informe o valor do produto (R$): ");
		        double valor = sc.nextDouble();

		        double totalBruto = valor * quantidade;
		        double desconto = 0;

		        // 6. Descontos
		        if (totalBruto > 200) {
		            desconto = 0.15;
		        } else if (totalBruto >= 100) {
		            desconto = 0.10;
		        } else {
		            desconto = 0.05;
		        }

		        double totalComDesconto = totalBruto - (totalBruto * desconto);

		        // 7. Parcelamento
		        System.out.print("Deseja parcelar a compra? (S/N): ");
		        char resp = sc.next().toUpperCase().charAt(0);
		        double valorParcela = totalComDesconto;
		        int parcelas = 1;

		        if (resp == 'S') {
		            System.out.print("Em quantas vezes (máximo 5): ");
		            parcelas = sc.nextInt();

		            if (parcelas > 5) {
		                parcelas = 5;
		                System.out.println("Número máximo de parcelas é 5!");
		            }
		            valorParcela = totalComDesconto / parcelas;
		        }

		        // 8. Resumo
		        System.out.println("\n--- RESUMO DA COMPRA ---");
		        System.out.println("Cliente: " + nome);
		        System.out.println("Produto: " + produtoEscolhido);
		        System.out.println("Quantidade: " + quantidade);
		        System.out.printf("Valor original: R$ %.2f%n", totalBruto);
		        System.out.printf("Desconto aplicado: %.0f%%%n", desconto * 100);
		        System.out.printf("Valor final: R$ %.2f%n", totalComDesconto);

		        if (parcelas > 1) {
		            System.out.printf("Parcelado em %d vezes de R$ %.2f%n", parcelas, valorParcela);
		        } else {
		            System.out.println("Pagamento à vista");
		        }


	}

}

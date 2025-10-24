package Lista22;

import java.util.Scanner;

public class produtoP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        produto p1 = new produto();
        p1.nome = "Notebook";
        p1.preco = 3500.00;
        p1.estoque = 5;

        produto p2 = new produto();
        System.out.println("Digite o nome do produto:");
        p2.nome = sc.nextLine();
        System.out.println("Digite o preço:");
        p2.preco = sc.nextDouble();
        System.out.println("Digite o estoque inicial:");
        p2.estoque = sc.nextInt();

        p1.mostrarInformacoes();
        p1.vender(2);
        p1.mostrarInformacoes();

        System.out.println("----------------------");

        p2.mostrarInformacoes();
        System.out.println("Quantas unidades deseja vender?");
        int qtd = sc.nextInt();
        p2.vender(qtd);
        p2.mostrarInformacoes();

    }
}

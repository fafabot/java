package lista24;

import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.print("Digite o nome do livro: ");
        String nomeLivro = sc.nextLine();
        livro.setNome(nomeLivro);

        System.out.print("Digite o preço do livro: ");
        double precoLivro = sc.nextDouble();
        livro.setPreco(precoLivro);

        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextLine();
        livro.setAutor(autor);

        System.out.println("\nInformações do Livro");
        livro.mostrarInfo();
        livro.lerTrecho();

        System.out.println("-----------------------------");

        Filme filme = new Filme();

        System.out.print("Digite o nome do filme: ");
        String nomeFilme = sc.nextLine();
        filme.setNome(nomeFilme);

        System.out.print("Digite o preço do filme: ");
        double precoFilme = sc.nextDouble();
        filme.setPreco(precoFilme);

        System.out.print("Digite o diretor do filme: ");
        String diretor = sc.nextLine();
        filme.setDiretor(diretor);

        System.out.println("\nInformações do Filme");
        filme.mostrarInfo();
        filme.assistir();
    }
}

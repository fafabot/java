package Lista22;

import java.util.Scanner;

public class filmeP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        filme f1 = new filme();
        f1.titulo = "Vingadores: Ultimato";
        f1.genero = "Ação";
        f1.duracao = 180;

        filme f2 = new filme();
        f2.titulo = "Titanic";
        f2.genero = "Romance";
        f2.duracao = 195;

        filme f3 = new filme();
        System.out.println("Digite o título do filme:");
        f3.titulo = sc.nextLine();
        System.out.println("Digite o gênero:");
        f3.genero = sc.nextLine();
        System.out.println("Digite a duração (em minutos):");
        f3.duracao = sc.nextInt();

        f1.assistir();
        f1.mostrarInformacoes();

        System.out.println("----------------------");

        f2.assistir();
        f2.mostrarInformacoes();

        System.out.println("----------------------");

        f3.assistir();
        f3.mostrarInformacoes();
    }
}
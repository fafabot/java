package Lista22;

import java.util.Scanner;

public class musicaP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        musica m1 = new musica();
        m1.titulo = "poison";
        m1.artista = "jaydes";
        m1.duracao = 3.5;

        musica m2 = new musica();
        m2.titulo = "From The Start";
        m2.artista = "Laufey";
        m2.duracao = 4.0;

        musica m3 = new musica();
        System.out.println("Digite o título da música:");
        m3.titulo = sc.nextLine();
        System.out.println("Digite o nome do artista:");
        m3.artista = sc.nextLine();
        System.out.println("Digite a duração (em minutos):");
        m3.duracao = sc.nextDouble();

        System.out.println("----------------------");

        m1.tocar();
        m1.mostrarDetalhes();
        m1.pausar();

        System.out.println("----------------------");

        m2.tocar();
        m2.mostrarDetalhes();
        m2.pausar();

        System.out.println("----------------------");

        m3.tocar();
        m3.mostrarDetalhes();
        m3.pausar();

    }
}
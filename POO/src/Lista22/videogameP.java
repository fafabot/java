package Lista22;

import java.util.Scanner;

public class videogameP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        videogame game = new videogame();

        System.out.println("Qual a marca do videogame?");
        game.marca = sc.next();

        System.out.println("Qual o modelo?");
        game.modelo = sc.next();

        System.out.println("----------------------");
        System.out.println("Videogame: " + game.marca + " " + game.modelo);
        game.verificarStatus();

        System.out.println("----------------------");
        System.out.println("Deseja ligar o console? (true/false)");
        boolean opcao = sc.nextBoolean();

        if (opcao) {
            game.ligar();
        } else {
            System.out.println("O console permanecerá desligado.");
        }

        game.verificarStatus();

        System.out.println("----------------------");
        System.out.println("Deseja desligar o console? (true/false)");
        opcao = sc.nextBoolean();

        if (opcao) {
            game.desligar();
        }

        game.verificarStatus();

	}

}

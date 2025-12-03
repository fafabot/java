package modelo2;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        int opcao;

        do {
            System.out.println("\n--- SFAE - Sistema de Faltas ---");
            System.out.println("1) Login Professor");
            System.out.println("2) Login Aluno");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1 -> MenuProfessor.abrir(sistema);
                case 2 -> MenuAluno.abrir(sistema);
                case 0 -> System.out.println("Sistema encerrado.");
                default -> System.out.println("Opção inválida.");
            }

        } while(opcao != 0);
    }
}
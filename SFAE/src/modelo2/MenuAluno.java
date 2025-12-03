package modelo2;

import java.util.Scanner;

public class MenuAluno {

    static Scanner scanner = new Scanner(System.in);

    public static void abrir(Sistema sistema) {

        System.out.print("\nLogin Aluno (RA): ");
        String ra = scanner.nextLine();

        Aluno aluno = sistema.buscarAluno(ra);

        if (aluno == null) {
            System.out.println("\n RA não encontrado!");
            return;
        }

        int opcao;
        do {
            System.out.println("\n--- Menu Aluno ---");
            System.out.println("Bem-vindo, " + aluno.nome + "!");
            System.out.println("1) Ver faltas");
            System.out.println("2) Enviar justificativa");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1 -> verFaltas(aluno);
                case 2 -> enviarJustificativa(aluno);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while(opcao != 0);
    }

    private static void verFaltas(Aluno aluno) {

        System.out.println("\n--- Suas Faltas ---");

        if (aluno.totalFaltas == 0) {
            System.out.println("Nenhuma falta registrada.");
            return;
        }

        for (int i = 0; i < aluno.totalFaltas; i++) {
            Falta f = aluno.faltas[i];
            System.out.println(f.data + " | Justificada: " + (f.justificada ? "Sim" : "Não"));
        }
    }

    private static void enviarJustificativa(Aluno aluno) {

        System.out.print("\nDigite a data da falta: ");
        String data = scanner.nextLine();

        Falta falta = aluno.buscarFaltaPorData(data);

        if (falta == null) {
            System.out.println("Nenhuma falta encontrada nessa data.");
            return;
        }

        System.out.println("Digite o motivo: ");
        falta.justificada = true;
        falta.justificativa = scanner.nextLine();

        System.out.println("Justificativa enviada!");
    }
}

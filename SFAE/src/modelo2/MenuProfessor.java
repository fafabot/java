package modelo2;

import java.util.Scanner;

public class MenuProfessor {

    static Scanner scanner = new Scanner(System.in);

    public static void abrir(Sistema sistema) {

        System.out.print("\nLogin Professor\nNome: ");
        String nome = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Professor prof = sistema.loginProfessor(nome, senha);

        if (prof == null) {
            System.out.println("\nLogin inválido!");
            return;
        }

        int opcao;
        do {
            System.out.println("\n--- Menu Professor ---");
            System.out.println("1) Registrar Chamada (C/F)");
            System.out.println("2) Ver Justificativas");
            System.out.println("3) Ver Faltas dos Alunos");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1 -> registrarChamada(sistema);
                case 2 -> verJustificativas(sistema);
                case 3 -> verFaltasAlunos(sistema);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while(opcao != 0);
    }


    private static void registrarChamada(Sistema sistema) {

        System.out.print("\nData da aula (dd/mm/aaaa): ");
        String data = scanner.nextLine();

        System.out.print("Matéria: ");
        String materia = scanner.nextLine();

        System.out.println("\nRegistrando chamada para " + data + " | " + materia);
        System.out.println("Digite C = Presente | F = Falta\n");

        for (int i = 0; i < sistema.totalAlunos; i++) {

            Aluno aluno = sistema.alunos[i];

            System.out.print(aluno.nome + " (" + aluno.ra + ") -> ");

            String resposta;
            do {
                resposta = scanner.nextLine().trim().toUpperCase();
            } while(!resposta.equals("C") && !resposta.equals("F"));

            if (resposta.equals("F")) {
                aluno.adicionarFalta(data, materia);
                System.out.println("- Falta registrada!");
            } else {
                System.out.println("- Presente.");
            }
        }

        System.out.println("\nChamada concluída!");
    }


    private static void verJustificativas(Sistema sistema) {

        System.out.println("\n--- Justificativas Enviadas ---");
        boolean encontrou = false;

        for (int i = 0; i < sistema.totalAlunos; i++) {
            Aluno aluno = sistema.alunos[i];

            for (int j = 0; j < aluno.totalFaltas; j++) {

                Falta f = aluno.faltas[j];

                if (f.justificada) {
                    System.out.println("\nAluno: " + aluno.nome);
                    System.out.println("Data: " + f.data);
                    System.out.println("Matéria: " + f.materia);
                    System.out.println("Justificativa: " + f.justificativa);
                    System.out.println("----------------------------------");
                    encontrou = true;
                }
            }
        }

        if (!encontrou) System.out.println("Nenhuma justificativa enviada.");
    }


    private static void verFaltasAlunos(Sistema sistema) {

        System.out.println("\n--- Faltas dos Alunos ---");

        for (int i = 0; i < sistema.totalAlunos; i++) {

            Aluno aluno = sistema.alunos[i];
            System.out.println("\n " + aluno.nome + " (RA: " + aluno.ra + ")\n");

            if (aluno.totalFaltas == 0) {
                System.out.println("- Nenhuma falta registrada.");
                continue;
            }

            for (int j = 0; j < aluno.totalFaltas; j++) {
                Falta f = aluno.faltas[j];
                System.out.print("- " + f.data + " | " + f.materia);

                if (f.justificada) {
                    System.out.print(" | Justificada: Sim | Motivo: " + f.justificativa);
                } else {
                    System.out.print(" | Justificada: Não");
                }

                System.out.println();
            }
        }
    }
}

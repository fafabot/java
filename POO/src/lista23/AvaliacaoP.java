package lista23;

import java.util.Scanner;

public class AvaliacaoP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Avaliacao aluno = new Avaliacao();

        System.out.print("Informe o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Digite a primeira nota: ");
        aluno.setNota1(sc.nextDouble());

        System.out.print("Digite a segunda nota: ");
        aluno.setNota2(sc.nextDouble());

        System.out.println("--------------------");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média final: " + aluno.calcularMedia());
    }
}

package dia1;

import java.util.Scanner;

public class AlunoP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
 
        Falta falta = new Falta();
 

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Turma do aluno: ");
        String turma = sc.nextLine();

        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        a1.setNome(nome);
        a1.setTurma(turma);
        a1.setMatricula(matricula);

        System.out.print("Quantas faltas o aluno tem? ");
        int totalFaltas = 0;

        if (sc.hasNextInt()) {
            totalFaltas = sc.nextInt();
        a1.settotalFaltas(totalFaltas);
            sc.nextLine(); 
        } else {
            System.out.println("Entrada inválida. Considerando 0 faltas.");
            sc.nextLine(); 
        }

      
      falta.criarFalta(totalFaltas);
          //  a1.adicionarFalta(novaFalta);
            
        

        System.out.println("\n-----------------------------");
        a1.mostrarAluno();
        a1.mostrarFaltas();

  
    }
}

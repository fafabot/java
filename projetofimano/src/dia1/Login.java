package dia1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();

        System.out.print("Digite CPF ou Email: ");
        user.setCpfOuEmail(sc.nextLine());
String email = "@gmail.com";
        String senha;
        
        do {
            System.out.print("Digite a senha de acesso: ");
            senha = sc.nextLine();

            if (!senha.equals("senai@2025")) {
                System.out.println("Senha incorreta, tente novamente.");
            }

        } while (!senha.equals("senai@2025"));

        user.setSenha(senha);
        System.out.println("Acesso liberado!");

        System.out.print("Digite o nome do aluno: ");
        user.setNome(sc.nextLine());

        System.out.print("Digite a turma: ");
        user.setTurma(sc.nextLine());

        System.out.print("Digite a data da falta: ");
        user.setDataFalta(sc.nextLine());


        System.out.println("Nome: " + user.getNome());
        System.out.println("Turma: " + user.getTurma());
        System.out.println("Data da falta: " + user.getDataFalta());
        System.out.println("CPF/Email: " + user.getCpfOuEmail());
    }
}

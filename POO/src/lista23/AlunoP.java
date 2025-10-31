package lista23;

import java.util.Scanner;

public class AlunoP {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nome do Aluno: ");
		String nome = sc.next();
		System.out.println("Idade do Aluno: ");
		int idade = sc.nextInt();
		System.out.println("--------------------");
		a1.setNome(nome);
		a1.setIdade(idade);
		System.out.println(a1.getNome() + " tem " + a1.getIdade() + " anos");

	}

}

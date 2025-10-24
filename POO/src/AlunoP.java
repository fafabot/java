import java.util.Scanner;

public class AlunoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.nome = "Fernanda";
		aluno.saudacao(); 
		aluno.nota1 = 8;
		aluno.nota2 = 7;
		aluno.calcularMedia();

	}

}

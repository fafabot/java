package herança;

public class Principal1 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("falixo");
		a1.setIdade(16);
		a1.setCurso("Desenvolvimento de Sistemas");
		
		Professor p1 = new Professor();
		p1.setNome("Juliana");
		p1.setIdade(27);
		p1.setSalario(35000);
		
		System.out.println("Dados do aluno: ");
		a1.mostrarDados();
		a1.estudar();
		System.out.println("Dados do Professor: ");
		p1.mostrarDados();
		p1.ensinar();
	}

}

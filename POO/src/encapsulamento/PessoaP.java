package encapsulamento;

public class PessoaP {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Joana");
		p1.setIdade(3);
		
		System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos");
		
	}

}
